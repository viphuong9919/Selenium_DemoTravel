package test;

import bases.BaseSetup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
public class LoginTest extends BaseSetup {
    private WebDriver driver;
    public HomePage homePage;
    public LoginPage loginPage;
    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }
    @Test(priority = 0)
    public void verifyLogin() throws Exception {
//        System.out.println(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        loginPage.loginSuccessful("user@phptravels.com", "demouser");
        homePage.verifyLoginSuccessful("Hi, Krishna Welcome Back");
    }
    @Test(priority = 1)
    public void verifyRemember() throws Exception {
        driver.get("https://www.google.com/");
        // Opens a new window and switches to new window
        driver.switchTo().newWindow(WindowType.WINDOW);
        // Opens Travel homepage in the newly opened tab
        driver.navigate().to("https://www.phptravels.net/login");

        loginPage = new LoginPage(driver);

        loginPage.verifyPlaceholder();
        loginPage.verifyRememberMe();
    }
}

