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

public class ToVerifyMeterTesting_SC_01_TC_12 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "card number"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'Card Number')]/following-sibling::input")
	private WebElement cardnumber;
	
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Name on card"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'Name on Card')]/following-sibling::input")
	private WebElement nameoncard;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "CVV Number"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'CVV Number')]/following-sibling::input")
	private WebElement cvvnumber;
	
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'Card Number')]")
	private WebElement clickonany;
	

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Expiry Date"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/p/label[contains(text(),'Expiry Date')]/following-sibling::select[@id='cexpiry_date_month']")
	private WebElement month;
	
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/p/label[contains(text(),'Expiry Date')]/following-sibling::select[@id='cexpiry_date_year']")
	private WebElement year;
	
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
	 * This is the xpath of the WebElement "CVV number error msg"
	 * @author sarvesh.nellore
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label[contains(text(),'CVV Number')]/following-sibling::input/following-sibling::label[contains(text(),'Invalid CVV number.')]")
	private WebElement cvvnumbererrmsg;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on Back button"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/input/following-sibling::span/a[contains(text(),'Click here to go back')]")
	private WebElement backbtn;
	
	public void enterCardDetail06() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(cardnumber));
		HighlightOnElement(cardnumber);
		Assert.assertTrue(cardnumber.isEnabled());
		excel.getExcelData(cardnumber,"Card Details",1,1);
		
		wait.until(ExpectedConditions.visibilityOf(nameoncard));
		HighlightOnElement(nameoncard);
		Assert.assertTrue(nameoncard.isEnabled());
		excel.getExcelData(nameoncard,"Card Details",1,2);
		
		wait.until(ExpectedConditions.visibilityOf(cvvnumber));
		HighlightOnElement(cvvnumber);
		Assert.assertTrue(cvvnumber.isEnabled());
		excel.getExcelData(cvvnumber,"Card Details",2,3);
		clickonany.click();
		waitForSomeTime();
		
		HighlightOnElement(cvvnumbererrmsg);
		String Actual="Invalid CVV number.";
		String Expected=cvvnumbererrmsg.getText();
		Assert.assertEquals(Actual,Expected,"Matched");
		Reporter.log(Expected,true);
		
		SelectVisibleText(month,"May (5)");
		SelectVisibleText(year,"2019");
		
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
