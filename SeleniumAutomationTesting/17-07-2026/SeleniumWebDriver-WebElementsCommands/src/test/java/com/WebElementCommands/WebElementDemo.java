package com.WebElementCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementDemo {

    public static void main(String[] args) throws InterruptedException {

        // Setup ChromeDriver
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open Website
        driver.get("https://www.easycalculation.com/");

        // isDisplayed()

        WebElement searchBox = driver.findElement(By.name("q"));

        System.out.println("Search Box Displayed : " + searchBox.isDisplayed());

        // Open BMI Calculator
        driver.findElement(By.linkText("BMI Calculator")).click();

        Thread.sleep(2000);

        // Locate Elements

        WebElement height = driver.findElement(By.name("heights"));
        WebElement weight = driver.findElement(By.name("weights"));
        WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));

        // sendKeys()

        height.sendKeys("170");
        weight.sendKeys("65");

        Thread.sleep(2000);

        // clear()

        height.clear();
        weight.clear();

        Thread.sleep(1000);

        // Enter values again
        height.sendKeys("175");
        weight.sendKeys("70");

        // isEnabled()


        System.out.println("Height Textbox Enabled : " + height.isEnabled());

        // isSelected()

        gender.click();

        System.out.println("Male Radio Button Selected : " + gender.isSelected());

        // getTagName()

        System.out.println("Height Tag Name : " + height.getTagName());

        // getAttribute()
       
        System.out.println("Height Name Attribute : "
                + height.getAttribute("name"));

        System.out.println("Weight Name Attribute : "
                + weight.getAttribute("name"));

        // Close Browser
        Thread.sleep(3000);
        driver.quit();
    }
}