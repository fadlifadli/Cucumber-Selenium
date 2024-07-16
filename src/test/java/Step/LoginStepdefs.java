package Step;


import Page.LoginPage;
import com.fad.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class LoginStepdefs extends BaseTest {

//    public static WebDriver driver;
     LoginPage loginPage;

//    @Before
//    public void beforeTest(){
//        System.out.println("Before");
////        driver = WebDriverManager.chromedriver().create();
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//
//    }
//
//    @After
//    public void AfterTest(){
//        System.out.println("After");
//        driver.quit();
//    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
//        driver.get("https://www.saucedemo.com");
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
//        By usernameInputText = By.cssSelector("input#user-name");
//        driver.findElement(usernameInputText).sendKeys(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
//        By passwordInputText = By.xpath("//*[@id=\"password\"]");
//        driver.findElement(passwordInputText).sendKeys(password);

    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
//        By loginButton = By.id("login-button");
//        driver.findElement(loginButton).click();
    }

    @Then("user able to see error message")
    public void userAbleToSeeErrorMessage() {
        loginPage.validateErrorAppear();
    }

    @Then("User clik button menu")
    public void userClikButtonMenu() {
        loginPage.userBttnMenu();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    @Then("user Click textlink Logout")
    public void userClickTextlinkLogout() {
        loginPage.TextlinkLogout();
    }


    @When("verifikasi page Login")
    public void verifikasiPageLogin() {
        loginPage.LoginButton();
    }
}
