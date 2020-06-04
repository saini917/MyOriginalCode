package com.freecrm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HashMapinSelenium extends HashMapUtility{
	static WebDriver driver;
	static WebDriverManager manager;
	

	@SuppressWarnings("static-access")
	@BeforeMethod
	public void setUp() {
		// E-commerce example
		// Role based --- permission based use case
		// category manager user --> go to the app --> add all the products
		// customer user --> go to the app --> buy a product/place the order
		// admin user -->.go to the app --> can see all the orders
		// Seller user --> go to the app --> see only those orders which are relevant
		// Distributer user --> go to the app --> can see the respective order
		// Delivery boy user --> go to the app --> can see the order and deliver the product
		// Customer care user --> go to the app --> will solve all the problem of customer

		manager.chromedriver().version("2.26").setup();
		driver =new ChromeDriver();
		/*manager.firefoxdriver().arch64().version("0.23.0").setup();
		driver = new FirefoxDriver();*/
		// driver.get("https://www.crmpro.com/");
		driver.get("https://ui.freecrm.com/");
	}

	@Test(priority=1)
	public void loginWithCustomertest() throws InterruptedException {

		driver.findElement(By.name("email")).sendKeys(getUserName("customer"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("customer"));
		Thread.sleep(2000);
	}

	@Test(priority=2)
	public void loginWithAdmintest() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(getUserName("admin"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("admin"));
		Thread.sleep(2000);
	}

	@Test(priority=3)
	public void loginWithSellertest() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(getUserName("seller"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("seller"));
		Thread.sleep(2000);
	}

	@Test(priority=4)
	public void loginWithDistributertest() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(getUserName("Distributer"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("Distributer"));
		Thread.sleep(2000);
	}

	@Test(priority=5)
	public void loginWithDeliveryBoytest() throws InterruptedException {

		driver.findElement(By.name("email")).sendKeys(getUserName("Deliveryboy"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("Deliveryboy"));
		Thread.sleep(2000);
	}

	@Test(priority=6)
	public void loginWithCustomerCaretest() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(getUserName("customercare"));
		driver.findElement(By.name("password")).sendKeys(getUserPassword("customercare"));
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
