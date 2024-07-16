package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartItems {
    WebDriver driver;

    By backpackcart = By.id("add-to-cart-sauce-labs-backpack");
    By bikecart = By.id("add-to-cart-sauce-labs-bike-light");
    By tshirtcart = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    By jacketcart = By.id("add-to-cart-sauce-labs-fleece-jacket");


    public CartItems(WebDriver driver){
        this.driver = driver;
    }

    public void cartbackpack(){
        driver.findElement(backpackcart).click();
    }

    public void cartbike(){
        driver.findElement(bikecart).click();
    }
    public void carttshirt(){
        driver.findElement(tshirtcart).click();
    }
    public void cartjacket(){
        driver.findElement(jacketcart).click();
    }
}
