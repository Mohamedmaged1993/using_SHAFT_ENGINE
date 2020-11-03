package objectModels.gui;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuDynamicLoadingPage {

    private WebDriver driver;
// identify element locators used in Dynamic loading web page

    private String linkXpath_Format = ".//a[contains(text(), 'Example 2: Element rendered after the fact')]";
    private By link_Example2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

//create constructor

    public HerokuDynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    //create method for click on example 2 text
    public HerokuExample2Page clickExample2(){
        ElementActions.click(driver,link_Example2);
        return new HerokuExample2Page(driver);
    }
}
