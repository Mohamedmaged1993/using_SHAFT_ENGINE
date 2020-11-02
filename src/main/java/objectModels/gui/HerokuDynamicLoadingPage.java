package objectModels.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuDynamicLoadingPage {
    private WebDriver driver;

    private String linkXpath_Format = ".//a[contains(text(), '%s')]";
    private By link_Example1 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    public HerokuDynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public HerokuExample2Page clickExample1(){
        driver.findElement(link_Example1).click();
        return new HerokuExample2Page(driver);
    }
}
