package com.visibility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVisiblityTest {
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

		boolean b1 = driver.findElement(By.xpath("//input[@value='Search']")).isDisplayed();
		System.out.println(b1);
		
		boolean b2 = driver.findElement(By.xpath("//input[@value='Search']")).isEnabled();
		System.out.println(b2);
	}
}
