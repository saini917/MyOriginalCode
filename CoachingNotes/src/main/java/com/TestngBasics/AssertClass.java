package com.TestngBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertClass {

	public WebDriver driver = null;
	public WebDriverManager manager = null;

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void setUp() {
		/*manager.chromedriver().setup();
		driver = new ChromeDriver();*/
		
		manager.firefoxdriver().arch64().version("0.23.0").setup();
		driver = new FirefoxDriver();
		
		/*manager.iedriver().arch32().version("3.150").setup();
		driver = new InternetExplorerDriver();*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google", "Title is not matched");
	}
	
	@Test
	public void googleLogoTest(){
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(b);
		Assert.assertEquals(b, true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
