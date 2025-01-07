package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPageUpdated {

    public RegisterPageUpdated(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstName")
    WebElement firstName_ele;

    @FindBy(name="lastName")
    WebElement lastName_ele;

    @FindBy(name = "phone")
    WebElement phone_ele;

    @FindBy(id = "userName")
    WebElement email_ele;

    @FindBy(name = "address1")
    WebElement address1_ele;

    @FindBy(name = "city")
    WebElement city_ele;

    @FindBy(name = "country")
    WebElement country_ele;

    @FindBy(id = "email")
    WebElement userName_ele;

    @FindBy(name = "password")
    WebElement password_ele;

    @FindBy(name = "confirmPassword")
    WebElement confirmPassword_ele;

    @FindBy(name = "submit")
    WebElement submit_ele;



        public void setFirstName (String firstName){
            firstName_ele.sendKeys(firstName);
        }
        public void setLastName (String lastName) {
            lastName_ele.sendKeys(lastName);
        }
        public void setPhone (String phone) {
           phone_ele.sendKeys(phone);
        }
        public void setEmail (String email) {
            email_ele.sendKeys(email);
        }
        public void setAddress (String address) {
            address1_ele.sendKeys(address);
        }
        public void setCity (String city) {
            city_ele.sendKeys(city);
        }
        public void selectCountry () {
            Select dropdown = new Select(country_ele);
            dropdown.selectByIndex(2);
        }
        public void setUsername (String username) {
            userName_ele.sendKeys(username);
        }
        public void setPassword (String password) {
            password_ele.sendKeys(password);
        }
        public void setConfirmPassword (String confirmPassword) {
            confirmPassword_ele.sendKeys(confirmPassword);
        }
        public void clickSubmit () {
            submit_ele.click();
        }

}
