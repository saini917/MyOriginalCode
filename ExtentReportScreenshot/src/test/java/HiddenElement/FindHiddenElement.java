package HiddenElement;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindHiddenElement {
	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty(chromeDriverKey, chromeDriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	
	@Test()
	public void LoginPage()
	{
		int x=driver.findElement(By.id("male")).getLocation().getX();
		int y=driver.findElement(By.id("male")).getLocation().getY();				
		System.out.println("X cord:" +x);
		System.out.println("Y cord:" +y);
		
		
		List<WebElement> radio=driver.findElements(By.id("male"));
		int count=radio.size();
		System.out.println("Total radio buttons :" +count);
		
		for(int i=0;i<count;i++)
		{
			WebElement ele=radio.get(i);
			int X=ele.getLocation().getX();
			
			if(X!=0)
			{
				ele.click();
				break;
			}
		}
		
	}

	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
