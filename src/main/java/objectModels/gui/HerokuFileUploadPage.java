package objectModels.gui;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuFileUploadPage {

    private WebDriver driver;

    //create constructor
    public HerokuFileUploadPage(WebDriver driver) {
        this.driver = driver;

    }

    // identify element locators for file upload page
    public By chooseFile = By.id("file-upload");
    public By uploadButton = By.id("file-submit");
    public By uploadedFiles = By.id("uploaded-files");


    // create method for upload file and call load button method

    public void uploadFile(String absolutePathOfFile) {
        ElementActions.typeFileLocationForUpload(driver, chooseFile, absolutePathOfFile);
        clickUploadButton();
    }


    //create method for upload button

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public String getFileName() {
        return ElementActions.getText(driver, uploadedFiles);
    }

}
