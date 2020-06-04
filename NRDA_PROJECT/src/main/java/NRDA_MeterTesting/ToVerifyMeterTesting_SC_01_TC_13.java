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

public class ToVerifyMeterTesting_SC_01_TC_13 extends CommonLibrary
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
	
	public void enterCardDetail() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
		excel.getExcelData(cvvnumber,"Card Details",1,3);
		
		/*Actions mon=new Actions(driver);
		mon.click(month).build().perform();*/
		SelectVisibleText(month,"May (5)");
		SelectVisibleText(year,"2020");
		
		wait.until(ExpectedConditions.visibilityOf(paynow));
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();
		Reporter.log("1. User should be able to make the payment successfully. \n 2. A receipt should be visible after making successfull payment",true);
		waitForSomeTime();
		
	}

}