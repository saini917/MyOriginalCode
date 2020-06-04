package com.verbose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//verbose -- to get more detailed information about the testcase on the console
// verbose -- 1 to 10
public class VerboseClass {
	public WebDriver driver = null;
	public WebDriverManager manager = null;

	@SuppressWarnings("static-access")
	@BeforeMethod
	@Parameters({ "browser" })
	public void setUp(String browser) {

		if (browser.equals("chrome")) {
			manager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("ff")) {
			manager.firefoxdriver().arch64().version("0.23.0").setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			manager.iedriver().arch32().version("3.150").setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}

	@Test(priority=1)
	public void FBTitleTest(){
		String title=driver.getTitle();
		System.out.println("title of the page:"+title);
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}
	
	@Test(priority=2)
	public void FBTitleTest1(){
		String title=driver.getTitle();
		System.out.println("title of the page:"+title);
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}
	
	@Test(priority=3)
	public void FBTitleTest2(){
		String title=driver.getTitle();
		System.out.println("title of the page:"+title);
		Assert.assertEquals(title,"Facebook – log in or sign up");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
