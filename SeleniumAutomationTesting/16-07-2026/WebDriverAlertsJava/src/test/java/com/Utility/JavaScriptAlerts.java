package com.Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptAlerts {
	   @Test
	    public void TestPopups() throws Exception {

	        WebDriver driver = HelperClass.startBrowser("Chrome");
	        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	   
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click(); 
	        Alert alert = driver.switchTo().alert();
	        Thread.sleep(8000);
	        alert.accept();
	        String result = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result);
	        Assert.assertEquals("You successfully clicked an alert", result);
	        
	        
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click(); 
	        Alert alert2 = driver.switchTo().alert();
	        Thread.sleep(8000);
	        alert.accept();
	        String result2 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result2);
	        Assert.assertEquals("You successfully clicked an alert", result2);

	   
	        
	        driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	        Alert alert3 = driver.switchTo().alert();
	        Thread.sleep(8000);
	        alert3.accept();
	        String result3 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result3);
	        Assert.assertEquals("You clicked: Ok", result3);
	 
	        
	        driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
	        driver.switchTo().alert().sendKeys("Hello Manu");
	        Thread.sleep(8000);
	        driver.switchTo().alert().accept();
	        String result4 = driver.findElement(By.cssSelector("#result")).getText();
	        System.out.println(result4);
	        Assert.assertEquals("You entered: Hello Manu ", result4);

	        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	        String result5 = driver
	                .findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]"))
	                .getText();
	        Thread.sleep(8000);
	        System.out.println(result5);
	        Assert.assertEquals("Congratulations! You must have the proper credentials.", result5);

	        driver.quit();
	        
	   }
}
