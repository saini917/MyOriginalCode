import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Highlighter {

	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://125.19.63.165:8082/GeneralpageWithTemplate.aspx?key=HOMEKEY0001");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//driver.findElement(By.id("ctl00_PublicMainHeader_LinkButton1")).click();
	}

	
	@Test()
	public void LoginPage()
	{
		WebElement loginbtn=driver.findElement(By.id("ctl00_PublicMainHeader_LinkButton1"));
		Utility.highLightElement(driver, loginbtn);
		//loginbtn.click();
		((JavascriptExecutor)driver).executeScript("document.getElementById('ctl00_PublicMainHeader_LinkButton1').click();");
		
		
		WebElement username=driver.findElement(By.id("txtUserName"));
		Utility.highLightElement(driver, username);
		//username.sendKeys("deepaksaini");
		((JavascriptExecutor)driver).executeScript("document.getElementById('txtUserName').value='deepaksaini';");
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		Utility.highLightElement(driver, password);
		//password.sendKeys("12345@Testing");
		((JavascriptExecutor)driver).executeScript("document.getElementById('txtPassword').value='12345@Testing';");
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}


}
