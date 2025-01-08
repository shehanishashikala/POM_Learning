package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By Reg_btn_locator = By.linkText("REGISTER");

    public void selectRegisterMenu(){
//        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(Reg_btn_locator).click();

    }
}
