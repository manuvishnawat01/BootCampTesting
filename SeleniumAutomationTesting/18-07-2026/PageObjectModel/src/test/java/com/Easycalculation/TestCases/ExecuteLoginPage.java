package com.Easycalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Easycalculation.Pages.LoginEasyCal;

import Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void CheckValidUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome", 
				"https://www.login.hiox.com/login?referrer=easycalculation.com");
		LoginEasyCal loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		
		loginPageEasyCal.login_EasyCal("7500010305" , "manu@123");
		
	}
}
  