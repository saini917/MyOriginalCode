package LoggerClass;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoLogger {

	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";
	public WebDriver driver;

	Logger logger=Logger.getLogger("Log");

	@BeforeMethod
	public void setUp()
	{
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		logger.info("Open Brwoser");
		driver.manage().window().maximize();
		logger.info("Maximize Brwoser");
		driver.get("http://125.19.63.165:8082/GeneralpageWithTemplate.aspx?key=HOMEKEY0001");
		logger.info("Enter Application URL");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.id("ctl00_PublicMainHeader_LinkButton1")).click();
	}


	@Test(priority=1)
	public void LoginPage()
	{
		PropertyConfigurator.configure("Log4j.properties");
		driver.findElement(By.id("ctl00_PublicMainHeader_LinkButton1")).click();
		logger.info("click on Login button");
		driver.findElement(By.id("txtUserName")).sendKeys("deepaksaini");
		logger.info("Enter username");
		driver.findElement(By.id("txtPassword")).sendKeys("12345@Testing");
		logger.info("Enter password");
	}

	@AfterMethod
	public void tearDown()
	{
		PropertyConfigurator.configure("Log4j.properties");
		driver.quit();
		logger.info("close browser");
	}

}


