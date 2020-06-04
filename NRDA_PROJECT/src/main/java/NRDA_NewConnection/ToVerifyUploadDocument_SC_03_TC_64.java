package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyUploadDocument_SC_03_TC_64 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Close".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[4]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Yes".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;
	
	public void clickOnYes() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current URL: "+currenturl,true);
		yes.click();
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Reporter.log("Previous URL: "+previousurl,true);
		Assert.assertNotEquals(currenturl,previousurl,"Test case pass");
	}

}
