package CustomMethodTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ByAllText {
	WebDriver driver;
	static String chromeDriverKey = "webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";

	@BeforeMethod
	public void setUp() {
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/deepak.saini/Desktop/demoPurpose.html");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void test2() throws InterruptedException {
		driver.findElement(new ByAll(By.name("not-exist"), By.id("inner"))).sendKeys("help");
		Thread.sleep(2000);
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
