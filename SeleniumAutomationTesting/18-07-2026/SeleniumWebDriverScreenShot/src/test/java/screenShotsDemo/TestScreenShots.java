package screenShotsDemo;

import java.io.File;
import java.io.IOException; // Added explicit import for best practice

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestScreenShots {
	
	@Test
	public void captureBrowserScreenshot() throws Exception { 	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(source, new File("./ScreenShots/GoogleHomepage.png"));
		System.out.println("Captured ScreenShot");
		
		driver.quit();
	}
}