package com.WebDriverCommonds;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class BrowserCommand {
	@Test(priority=0)
	public void ChromeBrowserTest() {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		//String PageControl = driver.getPageSource();
		//System.out.println(PageControl);
		driver.quit();
	}
	
	@Test(priority=2)
	public void FirefoxBrowserTest() {
		FirefoxDriver driver =  new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		
		//String PageControl = driver.getPageSource();
		//System.out.println(PageControl);
		driver.quit();
	}
	
	@Test(priority=1)
	public void EdgeBrowserTest() {
		EdgeDriver driver =  new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		driver.manage().window().maximize();
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		
		String BrowserURL = driver.getCurrentUrl();
		System.out.println(BrowserURL);
		driver.quit();
		
		//String PageControl = driver.getPageSource();
		//System.out.println(PageControl);
	}
	
}
