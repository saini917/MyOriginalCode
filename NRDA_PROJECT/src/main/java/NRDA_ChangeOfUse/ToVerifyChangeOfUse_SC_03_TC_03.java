package NRDA_ChangeOfUse;

import java.io.IOException;

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

public class ToVerifyChangeOfUse_SC_03_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select debit card".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']")
	private WebElement creditcard;
	
	public void clickOnCreditCard()
	{
		wait.until(ExpectedConditions.visibilityOf(creditcard));
		Assert.assertTrue(creditcard.isDisplayed());
		HighlightOnElement(creditcard);
		Assert.assertTrue(creditcard.isEnabled());
		creditcard.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter credit card".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']")
	private WebElement creditcardnum;
	
	public void enterCreditCardNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(creditcardnum));
		Assert.assertTrue(creditcardnum.isDisplayed());
		HighlightOnElement(creditcardnum);
		Assert.assertTrue(creditcardnum.isEnabled());
		excel.getExcelData(creditcardnum,"CRAD DETAILS", 2,1);
	}
	
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
	@FindBy(xpath="//div/font[contains(text(),'Please enter a valid card number.')]")
	private WebElement message;
	
	public void verifyErrorMsg() throws InterruptedException
	{
		String actual="Please enter a valid card number.";
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
