package org.example.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandles {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        //Code for windows handle
        String parent = driver.getWindowHandle();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> itr = windows.iterator();

        while (itr.hasNext())
        {
            String childWindow = itr.next();

            if(!childWindow.equals(parent))
            {
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow).getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parent);
    }
}
