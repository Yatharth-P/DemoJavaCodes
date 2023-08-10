package org.example.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowser {
        WebDriver driver;

        @BeforeTest
        @Parameters("browser")
        public void setUp(String browser)
        {
            if(browser.equalsIgnoreCase("Chrome"))
            {
                {
                    driver = new ChromeDriver();
                }
            }
        }
        //In TestNG file
        /*
            <suite name ="CrossBrowserSuit" thread-count="2" parallel="tests">
                <test name="ChromeTest">
                <parameter name ="browser" value = "chrome" />
                    <classes>
                        <class name = "paralletTest.CrossbrowserTest" />
                        </class>
                    </classes>
                </test>
        */

}
