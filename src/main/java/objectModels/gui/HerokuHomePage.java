package objectModels.gui;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuHomePage {
    private WebDriver driver;

    //heroku Home Page element locators

    private By fileUploadLink = By.linkText("File Upload");
    private By dynamicloadingLink = By.linkText("Dynamic Loading");


    //create constructor
    public HerokuHomePage(WebDriver driver) {
        this.driver = driver;
    }

    //access to click on file upload link text
    public HerokuFileUploadPage clickOnFileUpload() {
   ElementActions.click(driver,fileUploadLink);
        return new HerokuFileUploadPage(driver);
    }
    //access to click on Dynaminc loading link text

    public HerokuDynamicLoadingPage clickDynamicLoading(){
        ElementActions.click(driver,dynamicloadingLink);
        return new HerokuDynamicLoadingPage(driver);
    }
}
