package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropDown {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement ele = driver.findElement(By.linkText("Anthony"));

        Select select = new Select(ele);
        select.selectByIndex(1);
        select.selectByVisibleText("Angry");
        select.selectByValue("nqw");
    }
}
