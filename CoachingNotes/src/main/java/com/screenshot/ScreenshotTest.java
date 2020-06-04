package com.screenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {

	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 1)
	public void loginTest() {
		Assert.assertEquals(false, true);
	}

	@Test(priority = 2)
	public void searchTest() {
		Assert.assertEquals(false, true);
	}

	@Test(priority = 3)
	public void createDealsTest() {
		Assert.assertEquals(false, true);
	}

	@Test(priority = 4)
	public void createContactsTest() {
		Assert.assertEquals(false, true);
	}

	@Test(priority = 5)
	public void HomePageTest() {
		Assert.assertEquals(false, true);
	}
}
