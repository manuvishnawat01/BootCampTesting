package Utility;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class BrowserFactory {

	    public static WebDriver BrowserOptions(WebDriver driver,String browserName,String AppUrl) {

	        if(browserName.equalsIgnoreCase("Chrome")) {
	            driver = new ChromeDriver();
	        } 
	        else if(browserName.equalsIgnoreCase("Edge")) {
	            driver = new EdgeDriver();
	        } 
	        else if(browserName.equalsIgnoreCase("FireFox")) {
	            driver = new FirefoxDriver();
	        } 
	        else{
	            System.out.println("Sorry we do not support this browser");
	        }
	        driver.manage().window().maximize();
	        driver.get(AppUrl);
	        return driver;
	    }

	    public static void closeBrowser(WebDriver driver) {
	        driver.quit();
	    }

}