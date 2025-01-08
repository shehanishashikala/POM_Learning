package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePageUpdated {

    public HomePageUpdated(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//    1st way
//    @FindBy(how = How.LINK_TEXT, using = "REGISTER")
//    public WebElement Reg_btn_ele;

//    2nd way
    @FindBy(linkText = "REGISTER")
    public WebElement Reg_btn_ele;

    public void selectRegisterMenu(){
        Reg_btn_ele.click();
    }
}
