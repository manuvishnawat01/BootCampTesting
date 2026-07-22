package com.SeleniumWebdriver.ChromeDriverTesr;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
	}

}
