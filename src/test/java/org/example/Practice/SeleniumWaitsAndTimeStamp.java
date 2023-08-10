package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SeleniumWaitsAndTimeStamp {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com/");

        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

        WebElement element = driver.findElement(By.xpath("Anthony"));
        wait.until(ExpectedConditions.visibilityOf(element));


        //Generation of time stamp
        Date now = new Date();
        now.toString();
        System.out.println("Current date and time stamp is " + now);
    }
}
