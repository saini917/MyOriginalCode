package CustomMethodTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ByIDorNameTest {
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
	public void test2() throws InterruptedException {
		driver.findElement(new ByIdOrName("namep")).click();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
