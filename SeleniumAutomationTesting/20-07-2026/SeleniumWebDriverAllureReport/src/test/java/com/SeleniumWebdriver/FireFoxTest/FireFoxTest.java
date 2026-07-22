package com.SeleniumWebdriver.FireFoxTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
	}

}
