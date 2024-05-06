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

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    public static WebDriver driver;
    WebDriverWait wait;

    @BeforeTest
    public void setup()
    {
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void launchWebsite() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(10000);
    }

    @AfterTest
    public void closeTest()
    {
        driver.quit();
    }
}
