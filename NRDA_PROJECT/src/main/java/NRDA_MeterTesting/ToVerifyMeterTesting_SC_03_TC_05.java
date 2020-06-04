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

public class ToVerifyMeterTesting_SC_03_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application search".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/thead/tr/th/following-sibling::th/span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appsearch;
	
	public void verifyInvalidAppSearch() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(appsearch));
		wait.until(ExpectedConditions.elementToBeClickable(appsearch));
		Assert.assertTrue(appsearch.isDisplayed());
		HighlightOnElement(appsearch);
		Assert.assertTrue(appsearch.isEnabled());
		String app=excel.getExcelData(appsearch,"WaterMeterTesting_Application",0,5);
		Reporter.log("Invalid Application Number -->"+app,true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//tr/td[contains(text(),'No application found')])[1]")
	private WebElement message;
	public void verifyErrorMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		
		String actualMessage="No application found";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Error Message:"+expectedMesage,true);
		waitForSomeTime();
	}
	
}
