package com.fad;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {
    protected static WebDriver driver;
//    public static WebDriver driver;

    protected void getDriver() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

//        ChromeOptions options =new ChromeOptions();
//        options.addArguments("--headless");
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver(options);

//        driver = WebDriverManager.chromiumdriver().create();
    }

}
