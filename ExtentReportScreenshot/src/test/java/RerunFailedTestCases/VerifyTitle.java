package RerunFailedTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyTitle {
	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";
	public WebDriver driver;

	// Here we have to specify the class – In our case class name is Retry

	@Test(retryAnalyzer=Retry.class)
	public void verifySeleniumTitle()
	{
	System.setProperty(chromeDriverKey, chromeDriverPath);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://125.19.63.165:8082/GeneralpageWithTemplate.aspx?key=HOMEKEY0001");
	// Here we are verifying that title contains QTP or not. This test will fail because title does not contain QTP
	Assert.assertTrue(driver.getTitle().contains("Home - Himachal Horticulture1"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
