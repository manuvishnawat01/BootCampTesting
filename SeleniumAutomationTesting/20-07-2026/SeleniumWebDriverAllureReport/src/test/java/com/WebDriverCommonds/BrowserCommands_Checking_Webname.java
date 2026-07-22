package com.WebDriverCommonds;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserCommands_Checking_Webname {

    @Test
    public void ChromeBrowserTest() {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();

        String expectedTitle = "Selenium";
        String actualTitle = driver.getTitle();

        String expectedURL = "https://www.selenium.dev/";
        String actualURL = driver.getCurrentUrl();

        if (expectedTitle.equals(actualTitle) && expectedURL.equals(actualURL)) {
            System.out.println("Chrome Browser Test Passed");
            System.out.println("Title : " + actualTitle);
            System.out.println("URL   : " + actualURL);
        } else {
            System.out.println("Chrome Browser Test Failed");

            System.out.println("Expected Title : " + expectedTitle);
            System.out.println("Actual Title   : " + actualTitle);

            System.out.println("Expected URL   : " + expectedURL);
            System.out.println("Actual URL     : " + actualURL);
        }

        driver.quit();
    }

    @Test
    public void FirefoxBrowserTest() {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://testng.org/#_testng_documentation");
        driver.manage().window().maximize();

        String expectedTitle = "TestNG Documentation";
        String actualTitle = driver.getTitle();

        String expectedURL = "https://testng.org/#_testng_documentation";
        String actualURL = driver.getCurrentUrl();

        if (expectedTitle.equals(actualTitle) && expectedURL.equals(actualURL)) {
            System.out.println("Firefox Browser Test Passed");
            System.out.println("Title : " + actualTitle);
            System.out.println("URL   : " + actualURL);
        } else {
            System.out.println("Firefox Browser Test Failed");

            System.out.println("Expected Title : " + expectedTitle);
            System.out.println("Actual Title   : " + actualTitle);

            System.out.println("Expected URL   : " + expectedURL);
            System.out.println("Actual URL     : " + actualURL);
        }

        driver.quit();
    }

    @Test
    public void EdgeBrowserTest() {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://excel.cloud.microsoft/");
        driver.manage().window().maximize();

        String expectedTitle = "Microsoft Excel";
        String actualTitle = driver.getTitle();

        String expectedURL = "https://excel.cloud.microsoft/";
        String actualURL = driver.getCurrentUrl();

        if (expectedTitle.equals(actualTitle) && expectedURL.equals(actualURL)) {
            System.out.println("Edge Browser Test Passed");
            System.out.println("Title : " + actualTitle);
            System.out.println("URL   : " + actualURL);
        } else {
            System.out.println("Edge Browser Test Failed");

            System.out.println("Expected Title : " + expectedTitle);
            System.out.println("Actual Title   : " + actualTitle);

            System.out.println("Expected URL   : " + expectedURL);
            System.out.println("Actual URL     : " + actualURL);
        }

        driver.quit();
    }
}