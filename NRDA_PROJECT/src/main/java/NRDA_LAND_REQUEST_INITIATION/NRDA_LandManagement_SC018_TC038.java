package NRDA_LAND_REQUEST_INITIATION;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC038 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	@FindBy(xpath="//span[contains(text(),'Upload Document')]/../../following-sibling::tr/td/div/div/label")
	private WebElement upload;
	
	public void uploadValidDocument() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'File uploaded Successfully')]")
	private WebElement sucmsg;
	
	public void verifyUploadMsg() throws InterruptedException
	{
		String actual="File uploaded Successfully";
		wait.until(ExpectedConditions.elementToBeClickable(sucmsg));
		HighlightOnElement(sucmsg);
		Assert.assertTrue(sucmsg.isDisplayed());
		Assert.assertTrue(sucmsg.isEnabled());
		String expected=sucmsg.getText();
		Reporter.log("Uploaded Message :"+expected,true);
		Assert.assertEquals(actual,expected,"Test case pass");
		HighlightOnElement(sucmsg);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[7]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		waitForSomeTime();
	}



}
