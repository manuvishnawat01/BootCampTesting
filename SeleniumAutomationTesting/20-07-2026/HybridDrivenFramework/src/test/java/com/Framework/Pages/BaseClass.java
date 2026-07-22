package com.Framework.Pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import Utility.BrowserFactory;
import Utility.ConfigDataProvider;
import Utility.ExcelDataReader;
import Utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ExcelDataReader excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void SetUp() {
		excel = new ExcelDataReader();
		config = new ConfigDataProvider();
	}
	@BeforeClass
	public void BrowserTest() {
		driver = BrowserFactory.BrowserOptions(driver, config.getBrowser(), config.getAppURL());
	}
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE);
		Helper.captureScreenShot(driver,null);
	}
}