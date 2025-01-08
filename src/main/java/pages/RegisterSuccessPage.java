package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {

    WebDriver driver;
    public RegisterSuccessPage(WebDriver driver) {
        this.driver = driver;
    }

    By reg_SuccessText_loc =By.xpath("//font[contains(text(),'Thank you for registering.')]");

    public String registerSuccessText(){
        String successText = driver.findElement(reg_SuccessText_loc).getText();
        return successText;

    }

}
