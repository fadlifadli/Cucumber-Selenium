package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveCart {

    WebDriver driver;


    By Rebackpack = By.cssSelector("#remove-sauce-labs-backpack");
    By Retshirt = By.cssSelector("#remove-sauce-labs-bolt-t-shirt");
    By Rejacket = By.cssSelector("#remove-sauce-labs-fleece-jacket");

    public RemoveCart(WebDriver driver){
        this.driver = driver;
    }

    public void removeCartBackpack(){
        driver.findElement(Rebackpack).click();
    }

    public void removeItemInCartJacket(){
        driver.findElement(Retshirt).click();
    }

    public void removeCartTShirt(){
        driver.findElement(Rejacket).click();
    }

}
