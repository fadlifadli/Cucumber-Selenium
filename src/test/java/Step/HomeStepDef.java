package Step;

import Page.HomePage;
import com.fad.BaseTest;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackPackDisplayed();
    }
}
