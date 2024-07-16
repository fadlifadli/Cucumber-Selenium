package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage {

    WebDriver driver;

//    Item list
    By backPackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By productbike = By.id("item_0_title_link");
    By jacket = By.id ("item_5_title_link");
    By Tshirt = By.id ("item_1_title_link");

//    Page list
    By pageproduct = By.xpath("//span[contains(text(),'Products')]");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validateBackPackDisplayed() {
        WebElement productElement = driver.findElement(backPackItem);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
        assertTrue(driver.findElement(backPackItem).isDisplayed());
    }

    public void validatePageHome() {
        WebElement pageHome = driver.findElement(pageproduct);
        assertTrue(pageHome.isDisplayed());
    }

    public void verifikasiProduct1(){
        WebElement productElement = driver.findElement(backPackItem);
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void verifikasiProduct2(){
        assertEquals("Sauce Labs Fleece Jacket", driver.findElement(jacket).getText());
    }

    public void verifikasiProduct3(){
        assertEquals("Sauce Labs Bolt T-Shirt", driver.findElement(Tshirt).getText());
    }

    public void verifikasiProduct4(){
        assertTrue("shopping_cart_link",true);
    }

    public void verifikasiProduct5(){
        assertEquals("Sauce Labs Bike Light", driver.findElement(productbike).getText());
    }
}
