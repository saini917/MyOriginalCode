package NRDA_NewConnection;

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

public class ToVerifyConnectionDetailsTab_SC_04_TC_06 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cvv number".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccYear']/following-sibling::input[@id='ccCcv']")
	private WebElement cvv;
	
	public void enterCVVNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cvv));
		Assert.assertTrue(cvv.isDisplayed());
		HighlightOnElement(cvv);
		Assert.assertTrue(cvv.isEnabled());
		excel.getExcelData(cvv,"CRAD DETAILS",2,2);
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pay now".
	 * @author deepak.saini
	 * @since 2018-04-12
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
	 * This is the xpath of the WebElement "error message".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//font[contains(text(),'Please enter a valid cvv number.')]")
	private WebElement errormsg;
	
	public void getErrorMsg()
	{
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		Assert.assertTrue(errormsg.isDisplayed());
		String actual="Please enter a valid cvv number.";
		String expected=errormsg.getText();
		Assert.assertEquals(actual,expected,"Test case passs");
		HighlightOnElement(errormsg);
		Reporter.log("Error Message:"+expected,true);
	}
	
}
