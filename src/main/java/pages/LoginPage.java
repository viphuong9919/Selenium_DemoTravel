package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;
    private By inputEmail = By.xpath("(//input[@placeholder='Email'])[1]");
    private By inputPassword = By.xpath("(//input[@placeholder='Password'])[1]");
    private By btnLogin = By.xpath("(//button[@type='submit'])[1]");
    private By btnRemember = By.xpath("//input[@type='checkbox']");
    private By btnLanguage = By.xpath("//button[@id='languages']");
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void loginSuccessful(String email, String password) {
        WebElement chooseLanguage = driver.findElement(btnLanguage);
        chooseLanguage.isDisplayed();
        String language = "ENGLISH";
        Assert.assertEquals(language, chooseLanguage.getText());

        WebElement sendkeyEmail = driver.findElement(inputEmail);
        sendkeyEmail.isDisplayed();
            sendkeyEmail.click();
            sendkeyEmail.sendKeys(email);

        WebElement sendkeyPassword = driver.findElement(inputPassword);
        sendkeyPassword.isDisplayed();
            sendkeyPassword.click();
                sendkeyPassword.sendKeys(password);
        WebElement clickLogin = driver.findElement(btnLogin);
        clickLogin.isDisplayed();
            clickLogin.click();
    }
    public void verifyPlaceholder() {
        WebElement txtplhEmail = driver.findElement(inputEmail);
        txtplhEmail.isDisplayed();
        WebElement txtplhPass = driver.findElement(inputPassword);
        txtplhPass.isDisplayed();
    }
    public void verifyRememberMe() {
        WebElement btnCheckboxInput = driver.findElement(btnRemember);
        System.out.println("before: " + btnCheckboxInput.isSelected());
        btnCheckboxLabel.click();
        System.out.println("after: " + btnCheckboxInput.isSelected());
    }
}
