package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class HomePage {

    WebDriver driver;

    By backPackItem = By.xpath("//*[@id=\"item_4_title_link\"]/div");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validateBackPackDisplayed() {
        WebElement productElement = driver.findElement(backPackItem);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
//        assertTrue(driver.findElement(backPackItem).isDisplayed());
    }
}
