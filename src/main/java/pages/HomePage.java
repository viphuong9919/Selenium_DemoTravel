package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

;

public class HomePage {
    private WebDriver driver;
    private By txtUsername = By.xpath("(//div[@class='section-heading']//h2)[1]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyLoginSuccessful(String username) {
        WebElement getTextUsername = driver.findElement(txtUsername);
        String textUsername = null;
            getTextUsername.isDisplayed();
            textUsername = getTextUsername.getText();
            System.out.println(textUsername);
        if(textUsername.equals(username)){
            System.out.println("pass");
        } else {System.out.println("fail");}
    }
}

