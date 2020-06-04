import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {

	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";
	public WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeTest
	public void setExtent()
	{
		extent= new ExtentReports(System.getProperty("user.dir")+ "/test-output/ExtentReport.html",true);
		extent.addSystemInfo("Host Name","Deepak Development");
		extent.addSystemInfo("User Name","Deepak Saini");
		extent.addSystemInfo("Enviornment","QA");
		extent.addSystemInfo("Java version","1.8");
		extent.addSystemInfo("OS","Window10");

	}

	@AfterTest
	public void endExtent()
	{
		extent.flush();
		extent.close();
	}


	@BeforeMethod
	public void setUp()
	{
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://125.19.63.165:8082/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.id("ctl00_PublicMainHeader_LinkButton1")).click();
	}

	@Test(priority=1)
	public void verifyTitle()
	{
		extentTest= extent.startTest("verifyTitle");
		String actual ="Integrated Horticulture Sector Management System (IHSMS)";
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, actual);
	}
	
	@Test(priority=2)
	public void LoginPage()
	{
		extentTest= extent.startTest("LoginPage");
		driver.findElement(By.xpath("//a[@id='Header_btnLogin']/span")).click();
		driver.findElement(By.cssSelector("#txtUserName")).sendKeys("deepaksaini");
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("12345@Testing");
	}


	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{

		if(ITestResult.FAILURE==result.getStatus())
		{
			extentTest.log(LogStatus.FAIL,"TEST CASE FAILED IS" +result.getName()); // to add name in extent report
			extentTest.log(LogStatus.FAIL,"TEST CASE FAILED IS" +result.getThrowable()); // to add error/exception in extent report

			String Screenshotpath=Utility.captuteScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL,extentTest.addScreenCapture(Screenshotpath)); // to add screenshot in extent report
		}

		else if(ITestResult.SUCCESS==result.getStatus())
		{
			extentTest.log(LogStatus.PASS,"TEST CASE PASSED IS" +result.getName()); // to add name in extent report
			extentTest.log(LogStatus.PASS,"TEST CASE PASSED IS" +result.getThrowable()); // to add error/exception in extent report

			String Screenshotpath=Utility.captuteScreenshot(driver, result.getName());
			extentTest.log(LogStatus.PASS,extentTest.addScreenCapture(Screenshotpath)); // to add screenshot in extent report
		}

		else if(ITestResult.SKIP==result.getStatus())
		{
			extentTest.log(LogStatus.SKIP,"TEST CASE SKIPED IS" +result.getName()); // to add name in extent report
			extentTest.log(LogStatus.SKIP,"TEST CASE SKIPED IS" +result.getThrowable()); // to add error/exception in extent report	
		}

		extent.endTest(extentTest); // ending test and end the current test and prepare the html report

		driver.quit();
	}

}
