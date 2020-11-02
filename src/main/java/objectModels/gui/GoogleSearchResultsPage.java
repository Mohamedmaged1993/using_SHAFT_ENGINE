package objectModels.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.shaft.gui.element.ElementActions;

public class GoogleSearchResultsPage {
    //create object for webdriver

    private WebDriver driver;

    //identify element locators for google homepage

    private String genericSearchResultXPath = "//div[@id='rso']/div[@class='g']//div//a/h3";

    //create constructor with same name of class

    public GoogleSearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }


    //create generic method to get search query result number

    public String getSearchResultText(int resultNumber) {
        return ElementActions.getText(driver, By.xpath("(" + genericSearchResultXPath + ")[" + resultNumber + "]"));
    }
}
