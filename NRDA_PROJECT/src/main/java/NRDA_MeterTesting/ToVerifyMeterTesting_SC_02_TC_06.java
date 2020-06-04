package NRDA_MeterTesting;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_02_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "alert".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[8]/center/a")
	private WebElement alert;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "alert text msg".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td/textarea")
	private WebElement alertmsg;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "send".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Send')]")
	private WebElement send;
	
	public void clickAlert() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(alert));
		wait.until(ExpectedConditions.elementToBeClickable(alert));
		Assert.assertTrue(alert.isDisplayed());
		HighlightOnElement(alert);
		Assert.assertTrue(alert.isEnabled());
		alert.click();
		Reporter.log("Click on 'Alert' link seen in any one of the application -->"+alert.getText(),true);
		
		wait.until(ExpectedConditions.visibilityOf(alertmsg));
		wait.until(ExpectedConditions.elementToBeClickable(alertmsg));
		Assert.assertTrue(alertmsg.isDisplayed());
		HighlightOnElement(alertmsg);
		excel.getExcelData(alertmsg,"WaterMeterTesting_Application",0,8);
		
		wait.until(ExpectedConditions.visibilityOf(send));
		wait.until(ExpectedConditions.elementToBeClickable(send));
		Assert.assertTrue(send.isDisplayed());
		HighlightOnElement(send);
		Assert.assertTrue(send.isEnabled());
		send.click();
		Reporter.log("click on send button",true);
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error Message".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Alert send successfully !')]")
	private WebElement message;
	
	public void getSuccessfulMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		wait.until(ExpectedConditions.elementToBeClickable(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		String Actual="Alert send successfully !";
		String Expected=message.getText();
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Successful Message -->"+Expected,true);
	}
}
