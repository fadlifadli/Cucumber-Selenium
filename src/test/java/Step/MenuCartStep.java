package Step;

import Page.MenuCart;
import com.fad.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MenuCartStep extends BaseTest {

    MenuCart menucart;

    @Then("view item in cart")
    public void viewItemInCart() {
        menucart = new MenuCart(driver);
        menucart.logocart();
    }

    @And("verifikasi page cart")
    public void verifikasiPageCart() {
        menucart.pagecart();
    }
}
