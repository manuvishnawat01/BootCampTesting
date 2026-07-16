package com.Selenium_webDriver.EdgeBrowser;

import org.openqa.selenium.edge.EdgeDriver; 

public class EdgeBrowserTest {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver(); 
		
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		
	}
} 
