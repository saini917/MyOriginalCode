package com.datadriven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookClass {
	public WebDriver driver = null;
	public WebDriverManager manager = null;

	@SuppressWarnings("static-access")
	@BeforeMethod
	@Parameters({"browser"})
	public void setUp(String browser) {

		if (browser.equals("chrome")) {
			manager.chromedriver().version("2.26").setup();
			driver =new ChromeDriver();
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

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testData = TestUtil.getDataFromExcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void halfEbayRegPageTest(String Firstname, String Lastname, String EmailAddress, String Password) {

		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys(Firstname);

		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys(Lastname);

		driver.findElement(By.name("reg_email__")).clear();
		driver.findElement(By.name("reg_email__")).sendKeys(EmailAddress);

		driver.findElement(By.name("reg_passwd__")).clear();
		driver.findElement(By.name("reg_passwd__")).sendKeys(Password);

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
