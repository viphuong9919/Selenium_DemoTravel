package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;

public class HomePage {
    private WebDriver driver;
    private By txtUsername = By.xpath("(//div[@class='section-heading']//h2)[1]");
    private By spanUsername = By.xpath("(//div[@class='section-heading']//h2//span)[1]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyLoginSuccessful() {
        WebElement getTextUsername = driver.findElement(txtUsername);
        WebElement getUsername = driver.findElement(spanUsername);
        String textUsername = null;
        String name = null;
            getTextUsername.isDisplayed();
            textUsername = getTextUsername.getText();
            name = getUsername.getText();
            System.out.println(textUsername);
        System.out.println(name);
        if (textUsername.contains("Hi,"+name)){
            System.out.println("Expected text is obtained");
        }
        else{

            System.out.println("Expected text is not obtained");

        }
    }
}

