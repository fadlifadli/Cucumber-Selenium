package Step;

import Page.CartItems;
import com.fad.BaseTest;
import Page.RemoveCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RemoveCartStep extends BaseTest {

    RemoveCart removeCart;

    @And("Remove cart backpack")
    public void removeCartBackpack() {
        removeCart = new RemoveCart(driver);
        removeCart.removeCartBackpack();
    }

    @Then("Remove item in cart Jacket")
    public void removeItemInCartJacket() {
        removeCart.removeItemInCartJacket();

    }

    @And("Remove cart T-shirt")
    public void removeCartTShirt() {
        removeCart.removeCartTShirt();
    }

}
