package com.LoginTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Pages.LoginPage;
import com.utility.BrowserLaunching;
import com.utility.GlobalVariable;

@Listeners(com.utility.Screenshot.class)
public class HomeTest extends BrowserLaunching {

	/*****************************************************************************************************************/
	/**
	 * BeforeMethod annotation is used to open Url of application
	 * @author deepak.saini
	 * @throws InterruptedException
	 * @since 2017-08-03
	 */
	/****************************************************************************************************************/
	@BeforeMethod
	public void openBrowser() {
		BrowserLaunching.getBrowser(GlobalVariable.browser).navigate().to(GlobalVariable.url);
	}

	/*****************************************************************************************************************/
	/**
	 * loginTest() Method annotation is used to enter the value in the text box
	 * @author deepak.saini
	 * @since 2020-02-26
	 */
	/****************************************************************************************************************/
	@Test
	public void loginTest() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterString();
	}

	/*****************************************************************************************************************/
	/**
	 * verifyOutput() Method annotation is used to cature the value
	 * @author deepak.saini
	 * @since 2020-02-26
	 */
	/****************************************************************************************************************/
	@Test
	public void verifyOutput() {
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.captureOutput();
	}

	/*****************************************************************************************************************/
	/**
	 * logout() Method annotation is used to close the current browser instance
	 * 
	 * @author deepak.saini
	 * @since 2020-02-26
	 */
	/****************************************************************************************************************/
	@AfterMethod
	public void logout() throws InterruptedException {
		driver.close();
	}

}
