package org.example.Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class ScreenShot {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //Screenshot

        //Comvert webdriver object to TakeScreenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        //Call screenshot method to create img file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        //Move image file to new location
        File destFile = new File(System.getProperty("usr.dir"));

        //FileUtils.copy(srcFile, destFile);
    }
}
