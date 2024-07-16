package Step;

import Page.CartItems;
import com.fad.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepdefs extends BaseTest  {

    CartItems cartItems;


    @When("addcart-backpack")
    public void addcartBackpack() {
        cartItems = new CartItems(driver);
        cartItems.cartbackpack();
    }


    @Then("addcart-bike")
    public void addcartBike() {
        cartItems.cartbike();
    }

    @Then("addcart-jacket")
    public void addcartJacket() {
        cartItems.carttshirt();
    }

    @Then("addcart-tshirt")
    public void addcartTshirt() {
        cartItems.cartjacket();
    }
}
