package com.Framework.TestCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.Framework.Pages.BaseClass;
import com.Framework.Pages.LoginPage;

import Utility.ExcelDataReader;

public class LoginEasyCalculation extends BaseClass {
	@Test
	public void loginApp() throws Exception{
		ExcelDataReader excel = new ExcelDataReader();
		excel.getStringData("TestData", 0, 0);
		LoginPage login_EasyCal = PageFactory.initElements(driver, LoginPage.class);
		login_EasyCal.login_EasyCal(excel.getStringData("TestData", 0, 0), excel.getStringData("TestData", 0, 1));
		Thread.sleep(10000);
		
	}
}