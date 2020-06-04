package NRDA_ChangeOfUse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_03_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pay now".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div/input[@id='paymentProcess']")
	private WebElement paynow;
	
	public void clickOnPayNow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(paynow));
		Assert.assertTrue(paynow.isDisplayed());
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();
		waitForSomeTime();
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "ERROR MESSAGE".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div/font[contains(text(),'Please enter a Credit card number.')]")
	private WebElement message;
	
	public void verifyBlankMsg() throws InterruptedException
	{
		String actual="Please enter a Credit card number.";
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		Assert.assertTrue(message.isEnabled());
		String expectedmsg=message.getText();
		Reporter.log("Error Message :"+expectedmsg,true);
		Assert.assertEquals(actual,expectedmsg,"test case pass");
		HighlightOnElement(message);
		waitForSomeTime();
		
		driver.navigate().back();
	}


}
