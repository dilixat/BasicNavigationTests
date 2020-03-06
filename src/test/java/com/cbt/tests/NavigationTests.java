package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {

       // edge();
        chromeTest();
    }

    public static void chromeTest() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://google.com");
    }

    public static void edge() {
        WebDriver driver = BrowserFactory.getDriver("Edge");
        driver.get("https://google.com");
    }
}


