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
    @Test()
    public void verifyLogin() throws Exception {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        loginPage.loginSuccessful("user@phptravels.com", "demouser");
        homePage.verifyLoginSuccessful();
        driver.close();
    }
    @Test()
    public void verifyRemember() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.phptravels.net/login");

        loginPage = new LoginPage(driver);

        loginPage.verifyPlaceholder();
        loginPage.verifyRememberMe();
        driver.close();
    }
}

