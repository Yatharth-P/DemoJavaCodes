package org.example.Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Dummy {
    public static void main(String[] args) throws IOException {
        //For webdriver waits
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //implicit and pageload timeouts

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //Explicit wait
        WebElement ele = driver.findElement(By.xpath("ENegegh"));
        wait.until(ExpectedConditions.visibilityOf(ele));

        //Screenshot

        //Convert driver to screesnshot variable
        TakesScreenshot screenshot = (TakesScreenshot) driver;

        //Src file
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        //Dest
        File destFile = new File("src/main/resources/screenshot.png");

        //Copy file
        Files.copy(srcFile.toPath(), destFile.toPath());


        //Windows handles
        String parent = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        Iterator itr = windows.iterator();

        while(itr.hasNext())
        {
            String childWindow = (String) itr.next();
            System.out.println(driver.switchTo().window(childWindow).getTitle());
            driver.close();
        }
        driver.switchTo().window(parent);
    }
}
