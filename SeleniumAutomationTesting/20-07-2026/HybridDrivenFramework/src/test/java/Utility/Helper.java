package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Helper {
    	public static void captureScreenShot(WebDriver driver, String screenShotName) {
    		
            try {
    			TakesScreenshot ts = (TakesScreenshot) driver;
    			File source = ts.getScreenshotAs(OutputType.FILE);
    			FileUtils.copyFile(source, new File("./ScreenShots/EasyCalculation_"+ getCurrentDateTime() +".png"));
    			System.out.println("Capture ScreenShot - on failed");
    		} catch (Exception e) {
    			System.out.println("Exception While Taking ScreenShot"+e.getMessage());
    			
    		}
    }
		public static String getCurrentDateTime() {
			DateFormat customformat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
			Date currentdate = new Date();
			return customformat.format(currentdate);
		}
}