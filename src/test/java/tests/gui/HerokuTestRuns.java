package tests.gui;

import base.BaseClass;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.validation.Assertions;
import objectModels.gui.HerokuFileUploadPage;
import objectModels.gui.HerokuHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HerokuTestRuns {


    private WebDriver driver;
    private HerokuFileUploadPage herokuFileUploadPage;
    private HerokuHomePage herokuHomePage;

    private BaseClass baseClass;

    @Test
    public void fileUpload() {
          herokuHomePage.clickOnFileUpload();
        herokuFileUploadPage.uploadFile(baseClass.getProperty("filepath"));
        Assertions.assertEquals(baseClass.getProperty("filename"), herokuFileUploadPage.getFileName());


    }

    @BeforeClass
    public void beforeClass() {
        driver = BrowserFactory.getBrowser();
        herokuFileUploadPage = new HerokuFileUploadPage(driver);
        herokuHomePage = new HerokuHomePage(driver);
        baseClass = new BaseClass();
    }

    @BeforeMethod
    public void beforeMethod() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @AfterMethod
    public void afterMethod() {
    driver.close();
    }
}
