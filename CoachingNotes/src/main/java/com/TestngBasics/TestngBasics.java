package com.TestngBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*set up system property for chrome
launch chrome browser
login to app
enter URL
Google Test Image
logout from app
enter URL
Google Test Link
logout from app
enter URL
Google Test Title
logout from app
close the browser
delete all cookies*/

public class TestngBasics {

	// Pre-condition starts always from-------- @before
	@BeforeSuite
	public void steUp() {
		System.out.println("set up system property for chrome");
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}

	@BeforeClass
	public void login() {
		System.out.println("login to app");
	}

	//enter URL
	//Google Test Image
	//logout from app
	
	//enter URL
	//Google Test Link
	//logout from app
	
	//enter URL
	//Google Test Title
	//logout from app
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}

	// Test case always starts from -------- @test
	//test cases always independent to each other
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest() {
		System.out.println("Google Test Title");
	}

	@Test(priority=2,groups="Image")
	public void googleImage() {
		System.out.println("Google Test Image");
	}

	@Test(priority=3,groups="Link")
	public void googleLink() {
		System.out.println("Google Test Link");
	}
	
	@Test(priority=4,groups="TEST")
	public void test() {
		System.out.println("test");
	}
	@Test(priority=5,groups="TEST")
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=6,groups="TEST")
	public void test2() {
		System.out.println("test2");
	}

	// Post-condition starts always from-------- @after
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("close the browser");
	}

	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}

	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate report");
	}
}
