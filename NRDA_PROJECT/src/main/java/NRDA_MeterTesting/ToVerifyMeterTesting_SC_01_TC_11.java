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

public class ToVerifyMeterTesting_SC_01_TC_11 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);	
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pay now"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/input")
	private WebElement paynow;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Card number error msg"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'Card Number')]/following-sibling::input/following-sibling::label[contains(text(),'Invalid credit card number.')]")
	private WebElement cardnumbererrmsg;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "CVV number error msg"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'CVV Number')]/following-sibling::input/following-sibling::label[contains(text(),'Invalid CVV number.')]")
	private WebElement cvvnumbererrmsg;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Date error msg"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/p/label[contains(text(),'Expiry Date')]/following-sibling::select[@id='cexpiry_date_month']/following-sibling::label[contains(text(),'Please select date')]")
	private WebElement dateerrmsg;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on Back button"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/input/following-sibling::span/a[contains(text(),'Click here to go back')]")
	private WebElement backbtn;
	
	public void enterCardDetail05() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(paynow));
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();
		Reporter.log("1. User should be able to make the payment successfully. \n 2. A receipt should be visible after making successfull payment",true);
		waitForSomeTime();
		
		
		HighlightOnElement(cardnumbererrmsg);
		String Actual="Invalid credit card number.";
		String Expected=cardnumbererrmsg.getText();
		Assert.assertEquals(Actual,Expected,"Matched");
		Reporter.log(Expected,true);
		
		HighlightOnElement(cvvnumbererrmsg);
		String Actual1="Invalid CVV number.";
		String Expected1=cvvnumbererrmsg.getText();
		Assert.assertEquals(Actual1,Expected1,"Matched");
		Reporter.log(Expected1,true);
		
		HighlightOnElement(dateerrmsg);
		String Actual2="Please select date";
		String Expected2=dateerrmsg.getText();
		Assert.assertEquals(Actual2,Expected2,"Matched");
		Reporter.log(Expected2,true);
		
		wait.until(ExpectedConditions.visibilityOf(backbtn));
		wait.until(ExpectedConditions.elementToBeClickable(backbtn));
		Assert.assertTrue(backbtn.isDisplayed());
		HighlightOnElement(backbtn);
		backbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}

}
