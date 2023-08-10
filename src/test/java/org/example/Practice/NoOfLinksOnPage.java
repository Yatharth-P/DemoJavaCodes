package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NoOfLinksOnPage {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Links on page " + links.size());

        for(int i = 0; i < links.size(); i++)
        {
            System.out.println("Name of links : " + i + " " + links.get(i).getText());
        }
    }
}
