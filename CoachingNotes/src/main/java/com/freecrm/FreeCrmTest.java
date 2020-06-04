package com.freecrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCrmTest {

	static WebDriver driver;
	static WebDriverManager manager;
	String credentials;
	String credentialsInfo[];

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void setUp() {
		manager.firefoxdriver().arch64().version("0.23.0").setup();
		driver = new FirefoxDriver();
		driver.get("https://ui.freecrm.com/");

	}
	/*
	 * Enter url login with customer user place the order logout login with
	 * admin uer check the order check all the orders for the day logout
	 */

	@Test(priority = 1)
	public void loginWithAdminUserTest() throws InterruptedException {
		credentials = FreeCrmData.getUserLoginInfo().get("admin");
		credentialsInfo = credentials.split("_");

		driver.findElement(By.name("email")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);

		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(FreeCrmData.monthMap().get(10));
	}

	@Test(priority = 2)
	public void loginWithCustomerUserTest() {
		credentials = FreeCrmData.getUserLoginInfo().get("customer");
		credentialsInfo = credentials.split("_");

		driver.findElement(By.name("email")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
