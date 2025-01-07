package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }


        By firstName_loc = By.xpath("//input[@name='firstName']");
        By lastName_loc = By.xpath("//input[@name='lastName']");
        By phone_loc = By.xpath("//input[@name='phone']");
        By UserName_loc = By.xpath("//input[@id='userName']");
        By address_loc = By.xpath("//input[@name='address1']");
        By city_loc = By.xpath("//input[@name='city']");
        By country_loc = By.xpath("//select[@name='country']");
        By email_loc = By.xpath("//input[@id='email']");
        By password_loc = By.xpath("//input[@name='password']");
        By confirmPassword_loc = By.xpath("//input[@name='confirmPassword']");
        By submit_loc = By.xpath("//input[@name='submit']");


        public void setFirstName (String firstName){

            driver.findElement(firstName_loc).sendKeys(firstName);
        }
        public void setLastName (String lastName) {

            driver.findElement(lastName_loc).sendKeys(lastName);
        }
        public void setPhone (String phone) {
            driver.findElement(phone_loc).sendKeys(phone);
        }
        public void setUserName (String userName) {

            driver.findElement(UserName_loc).sendKeys(userName);
        }
        public void setAddress (String address) {

            driver.findElement(address_loc).sendKeys(address);
        }
        public void setCity (String city) {

            driver.findElement(city_loc).sendKeys(city);
        }
        public void selectCountry () {
            WebElement countrySelect_ele =driver.findElement(country_loc);
            Select dropdown = new Select(countrySelect_ele);
            dropdown.selectByIndex(2);
        }
        public void setEmail (String email) {

            driver.findElement(email_loc).sendKeys(email);
        }
        public void setPassword (String password) {

            driver.findElement(password_loc).sendKeys(password);
        }
        public void setConfirmPassword (String confirmPassword) {
            driver.findElement(confirmPassword_loc).sendKeys(confirmPassword);
        }
        public void clickSubmit () {
            driver.findElement(submit_loc).click();
        }



}
