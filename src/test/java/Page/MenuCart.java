package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuCart {

    WebDriver driver;

    By Menucartlogo = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/a[1]");
    By Pagemenu = By.id("checkout");

    public MenuCart(WebDriver driver){
        this.driver = driver;
    }

    public void logocart(){
        driver.findElement(Menucartlogo).click();
    }

    public void pagecart(){
        driver.findElement(Pagemenu).click();
    }
}
