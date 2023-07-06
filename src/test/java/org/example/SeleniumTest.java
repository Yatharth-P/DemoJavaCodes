package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
    }

    @Test
    public void launchWebsite()
    {
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/artifact/io.rest-assured/rest-assured");
    }

    @AfterTest
    public void closeTest()
    {
        driver.quit();
    }
}
