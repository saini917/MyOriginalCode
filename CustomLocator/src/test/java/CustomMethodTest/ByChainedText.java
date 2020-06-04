package CustomMethodTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ByChainedText {
	WebDriver driver;
	static String chromeDriverKey = "webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";

	@BeforeMethod
	public void setUp() {
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		// driver.get("file:///C:/Users/deepak.saini/Desktop/demoPurpose.html");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void test3() throws InterruptedException {
		driver.findElement(new ByChained(By.id("fakebox"), By.tagName("input"))).sendKeys("ChereCher Tech");
		Thread.sleep(2000);
	}

	/*
	 * @Test(priority=1) public void test3() throws InterruptedException{
	 * driver.findElement(new ByChained(By.id("div"),
	 * By.tagName("input"))).sendKeys("ChereCher Tech"); Thread.sleep(2000); }
	 */

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
