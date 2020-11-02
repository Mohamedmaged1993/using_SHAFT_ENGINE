package objectModels.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;

public class GoogleHomePage {
    //create object for webdriver

    private WebDriver driver;

    //identify element locators for google homepage

    private By searchbox_text = By.name("q");

    //create constructor with same name of class

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    // create generic method for search on query

    public void searchForQuery(String query) {
        new ElementActions(driver).type(searchbox_text, query).keyPress(searchbox_text, Keys.ENTER);
    }

}
