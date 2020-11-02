package tests.gui;

import base.BaseClass;
import com.shaft.gui.browser.BrowserFactory;
import com.shaft.validation.Assertions;
import objectModels.gui.GoogleHomePage;
import objectModels.gui.GoogleSearchResultsPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTestRuns {
    private WebDriver driver;
    private GoogleHomePage googleHomePage;
    private GoogleSearchResultsPage googleSearchResultsPage;
private BaseClass baseClass;

    @Test
    public void searchForQueryAndAssertThirdResultTextIsCorrect() {
        googleHomePage.searchForQuery(baseClass.getProperty("validSearchInput"));
        Assertions.assertEquals(baseClass.getProperty("successResult"), googleSearchResultsPage.getSearchResultText(2));
    }

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

    @AfterMethod
    public void afterMethod() {
	driver.close();
    }
}
