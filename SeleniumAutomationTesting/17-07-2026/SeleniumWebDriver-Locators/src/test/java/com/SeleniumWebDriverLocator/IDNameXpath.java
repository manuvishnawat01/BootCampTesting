package com.SeleniumWebDriverLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class IDNameXpath {
	WebDriver driver;
	String baseURL = "https://practicetestautomation.com/practice-test-login/";
	@Test
	public void IDLovator() {
		driver = new ChromeDriver();
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
  
        
		String expectedTitle = "Logged In Successfully | Practice Test Automation";
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
            System.out.println("Same title ");
        }
		else {
			System.out.println("Not correct output ");
		}
		
	}
}