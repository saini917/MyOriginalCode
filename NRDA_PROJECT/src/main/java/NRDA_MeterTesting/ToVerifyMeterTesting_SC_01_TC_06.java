package NRDA_MeterTesting;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_01_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Submit')]")
	private WebElement submit;
	
	public void clickOnSubmitbtn() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		Reporter.log("Click on submit  button",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error Message".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Mandatory Field : Consumer ID')]")
	private WebElement message;
	
	public void getMessage()
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		wait.until(ExpectedConditions.elementToBeClickable(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		String Actual="Mandatory Field : Consumer ID";
		String Expected=message.getText();
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Error Message -->"+Expected,true);
	}

}
