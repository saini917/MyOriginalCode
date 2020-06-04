package com.DynamicXpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxHeadless {
	public static WebDriver driver;
	public static WebDriverManager manager;

	@SuppressWarnings("static-access")
	
	@Test(priority=1)
	public void test() {
		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");
		manager.firefoxdriver().arch64().version("0.23.0").setup();
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxBinary);
		driver = new FirefoxDriver(fo);
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	@SuppressWarnings("static-access")
	@Test(priority=2)
	public void test1() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver(options);
		driver.get("http://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);

	}

}
