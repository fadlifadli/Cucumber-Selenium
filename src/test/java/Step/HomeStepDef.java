package Step;

import Page.HomePage;
import com.fad.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeStepDef extends BaseTest {

    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateBackPackDisplayed();
    }

    @Then("user at page with {string}")
    public void userAtPageWith(String pageName) {
        homePage.validatePageHome();
    }

    @And("Verifikasi product awal Highlight")
    public void verifikasiProductAwalHighlight() {
        homePage.verifikasiProduct1();
    }

    @And("ver product kedua Highlight")
    public void verProductKeduaHighlight() {
        homePage.verifikasiProduct2();
    }

    @And("Ver product ketiga Highlight")
    public void verProductKetigaHighlight() {
        homePage.verifikasiProduct3();
    }

    @And("able logo shopping")
    public void ableLogoShopping() {
        homePage.verifikasiProduct4();
    }

    @Then("Ver product kelima Highlight")
    public void verProductKelimaHighlight() {
        homePage.verifikasiProduct5();
    }


}
