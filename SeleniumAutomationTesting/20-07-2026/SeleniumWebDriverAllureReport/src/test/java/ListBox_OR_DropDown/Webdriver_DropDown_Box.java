package ListBox_OR_DropDown;

	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Webdriver_DropDown_Box {

	    WebDriver driver;
	    String url = "https://testautomationpractice.blogspot.com/";

	    @BeforeTest
	    public void setup() {

	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.navigate().to(url);
	    }

	    @Test
	    public void dropDownList() throws Exception {
	        WebElement countryDropdown = driver.findElement(By.id("country"));
	        Select countryList = new Select(countryDropdown);

	        countryList.selectByIndex(3);
	        Thread.sleep(2000);

	        countryList.selectByVisibleText("India");
	        Thread.sleep(2000);

	        WebElement option = countryList.getFirstSelectedOption();
	        String selectedCountry = option.getText();
	        System.out.println("Selected Country : " + selectedCountry);

	        List<WebElement> countryOptions = countryList.getOptions();
	        int totalCountries = countryOptions.size();
	        System.out.println("Total Countries : " + totalCountries);

	        System.out.println("Country Names:");

	        for (WebElement ele : countryOptions) {
	            System.out.println(ele.getText());
	        }
	    }
	}