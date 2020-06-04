package CustomMethodTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import CustomMethod.ByButtonText;

public class ByButtonTextTest {
	WebDriver driver;
	static String chromeDriverKey = "webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";

	@BeforeMethod
	public void setUp() {
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/java/custom-locators-selenium-webdriver");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void test() throws InterruptedException {
		int noOfButtons = driver.findElements(ByButtonText.buttonText("Alert Me")).size();
		System.out.println("No. of Button : " + noOfButtons);
		Thread.sleep(2000);
		driver.findElement(ByButtonText.buttonText("Alert Me")).click();
	}

	@Test(priority = 2)
	public void test1() throws InterruptedException {
		int noOfButtons = driver.findElements(ByButtonText.buttonTitle("author")).size();
		System.out.println("No. of Button : " + noOfButtons);
		Thread.sleep(2000);
		driver.findElement(ByButtonText.buttonTitle("author")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
