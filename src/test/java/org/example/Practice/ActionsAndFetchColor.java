package org.example.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndFetchColor {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement el = driver.findElement(By.linkText("Anthony"));
        WebElement ele = driver.findElement(By.xpath("//input[@class='action']"));

        Actions actions = new Actions(driver);
        Action action = actions.scrollToElement(ele).moveToElement(ele).build();

        String bgcolor = el.getCssValue("background-color");
        System.out.println("Initial color is : " + bgcolor);

        action.perform();

        bgcolor = el.getCssValue("background-color");
        System.out.println("Post color is : " + bgcolor);

        driver.quit();
    }
}
