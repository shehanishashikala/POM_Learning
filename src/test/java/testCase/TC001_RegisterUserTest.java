package testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.RegisterSuccessPage;

import java.time.Duration;

public class TC001_RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void openPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void TC001() {
        HomePage homePage = new HomePage(driver);

        homePage.selectRegisterMenu();

        RegisterPage registerPage = new RegisterPage(driver);

        registerPage.setFirstName("Shehani");
        registerPage.setLastName("Wijebandara");
        registerPage.setPhone("0112250788");
        registerPage.setEmail("shehani@gmail.com");

        registerPage.setAddress("160/E, Gonahena");
        registerPage.setCity("Kadawatha");
        registerPage.selectCountry();

        registerPage.setUserName("ShehaniW");
        registerPage.setPassword("1234");
        registerPage.setConfirmPassword("1234");

        registerPage.clickSubmit();


        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage(driver);
        String actualText = registerSuccessPage.registerSuccessText();
        Assert.assertTrue(actualText.contains("Thank you for registering"),"Register Attempt Failed");

    }

    @AfterMethod
    public void quit() {
        driver.quit();
    }
}
