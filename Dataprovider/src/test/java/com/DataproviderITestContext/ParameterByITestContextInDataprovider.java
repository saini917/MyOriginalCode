package com.DataproviderITestContext;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterByITestContextInDataprovider {
	WebDriver driver;
	
	@BeforeTest(groups={"A","B"})
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com");
	}
	
	@Test(dataProvider="SearchProvider",dataProviderClass=dataproviderByITestContext.class,groups="A")
	
	public void testMethodA(String author,String searchKey) throws InterruptedException{
		//search google textbox
		WebElement searchText = driver.findElement(By.name("q"));
		
		//search a value on it
		searchText.sendKeys(searchKey);
		System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
		Thread.sleep(3000);
		
		String testValue = searchText.getAttribute("value");
		System.out.println(testValue +"::::"+searchKey);
		searchText.clear();
		
		//verify correct value in searchbox
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}
	
@Test(dataProvider="SearchProvider",dataProviderClass=dataproviderByITestContext.class,groups="B")
	
	public void testMethodB(String searchKey) throws InterruptedException{
		//search google textbox
		WebElement searchText = driver.findElement(By.name("q"));
		
		//search a value on it
		searchText.sendKeys(searchKey);
		System.out.println("Welcome ->Unknown user Your search key is->"+searchKey);
		Thread.sleep(3000);
		
		String testValue = searchText.getAttribute("value");
		System.out.println(testValue +"::::"+searchKey);
		searchText.clear();
		
		//verify correct value in searchbox
		Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
	}
	
	
	@AfterTest
	public void tearDown(){
		driver.close();
	}

}
