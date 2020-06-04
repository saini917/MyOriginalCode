package com.CustomXpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {
	static WebDriver driver;
	static WebDriverManager manager;

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws InterruptedException {

		manager.firefoxdriver().arch64().version("0.23.0").setup();
		driver = new FirefoxDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
		driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("java");
		
		//absolute xpath has some problem:
		//1) performance issue
		//2) not reliable
		//3) can be changed at any time in future
		
		//dynamic id: input
		//id - test_123
		//By.id("test_123")
		
		//starts-with
		//id - test_12345
		//id - test_987
		driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("java");
		
		//starts-with
		//id - test_ test_453_test
		driver.findElement(By.xpath("//input[contains(@id,'test_ test_')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[starts-with(@id,'test_ test_')]")).sendKeys("java");
		
		//ends-with
		//id - 434_test_t
		//id - 4343243_test_t
		//id - 43465_test_t
		driver.findElement(By.xpath("//input[contains(@id,'_test_t')]")).sendKeys("java");
		driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("java");
	}

}
