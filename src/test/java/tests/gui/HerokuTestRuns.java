package tests.gui;

import base.BaseClass;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.validation.Assertions;
import objectModels.gui.HerokuDynamicLoadingPage;
import objectModels.gui.HerokuExample2Page;
import objectModels.gui.HerokuFileUploadPage;
import objectModels.gui.HerokuHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class HerokuTestRuns {
    //create objects to related test run classes
    private WebDriver driver;
    private HerokuFileUploadPage herokuFileUploadPage;
    private HerokuHomePage herokuHomePage;
    private HerokuDynamicLoadingPage herokuDynamicLoadingPage;
    private HerokuExample2Page herokuExample2Page;
    private BaseClass baseClass;

    //create test method to run file upload test case
    @Test
    public void fileUpload() {
          herokuHomePage.clickOnFileUpload();
        herokuFileUploadPage.uploadFile(baseClass.getProperty("filepath"));
        Assertions.assertEquals(baseClass.getProperty("filename"), herokuFileUploadPage.getFileName());


    }
// create test method to run Dynamic loading test case
    @Test
    public void tesDynamicLoading() {
            var loadingPage = herokuHomePage.clickDynamicLoading().clickExample2();
            loadingPage.clickStart();
            assertEquals(loadingPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
        }




    @BeforeClass
    public void beforeClass() {
        driver = BrowserFactory.getBrowser();
        herokuFileUploadPage = new HerokuFileUploadPage(driver);
        herokuHomePage = new HerokuHomePage(driver);
        herokuDynamicLoadingPage = new HerokuDynamicLoadingPage(driver);
        herokuExample2Page = new HerokuExample2Page(driver);
        baseClass = new BaseClass();
    }
// configure base url

    @BeforeMethod
    public void beforeMethod() {
        BrowserActions.navigateToURL(driver,"https://the-internet.herokuapp.com/");
    }
// close current url after finish test

    @AfterClass
    public void afterClass() {
        BrowserActions.closeCurrentWindow(driver);
    }
}
