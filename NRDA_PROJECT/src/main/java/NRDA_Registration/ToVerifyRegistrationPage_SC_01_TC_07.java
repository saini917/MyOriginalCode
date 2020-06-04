package NRDA_Registration;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyRegistrationPage_SC_01_TC_07 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	Logger log=Logger.getLogger("devpinoyLogger");


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Home".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Home')])[2]")
	private WebElement home;
	
	public void clickOnHome() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(home));
		Assert.assertTrue(home.isDisplayed());
		HighlightOnElement(home);
		Assert.assertTrue(home.isEnabled());
		String currenturl=driver.getCurrentUrl();
		home.click();
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Assert.assertNotEquals(currenturl,previousurl,"Test case pass");
		
	}

}
