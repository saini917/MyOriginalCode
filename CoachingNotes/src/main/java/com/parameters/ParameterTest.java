package com.parameters;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest {
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
	}

	@Test
	@Parameters({ "url", "emailid" })
	public void yahooLoginTest(String url, String emailid) {
		driver.get(url);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys(emailid);
		driver.findElement(By.name("signin")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
