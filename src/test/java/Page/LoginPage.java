package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.id("login-button");
    By errorMessage = By.tagName("h3");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://www.saucedemo.com");
    }

    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }
    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateErrorAppear(){
        driver.findElement(errorMessage).click();
//        assertTrue(driver.getPageSource().contains(errorMessage));
    }
}
