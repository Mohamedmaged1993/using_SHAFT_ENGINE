package tests.gui;

import base.BaseClass;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.validation.Assertions;
import objectModels.gui.GoogleHomePage;
import objectModels.gui.GoogleSearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class GoogleTestRuns {
    //create objects to related test run classes

    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private GoogleSearchResultsPage googleSearchResultsPage;
   private BaseClass baseClass;

//create test method to run google search result and assert that test case failed
    @Test
    public void searchForQueryAndAssertThirdResultTextIsCorrect() {
        googleHomePage.searchForQuery(baseClass.getProperty("validSearchInput"));
        Assertions.assertEquals(baseClass.getProperty("successResult"), googleSearchResultsPage.getSearchResultText(2));
    }

// create before class method to run before every test case
    @BeforeClass
    public void beforeClass() {
	driver = BrowserFactory.getBrowser();
	googleHomePage = new GoogleHomePage(driver);
	googleSearchResultsPage = new GoogleSearchResultsPage(driver);
	baseClass = new BaseClass();
    }

    @BeforeMethod
    public void beforeMethod() {
	driver.navigate().to("https://www.google.com/ncr");
    }

    @AfterClass
    public void afterClass() {
        BrowserActions.closeCurrentWindow(driver);
    }
}
