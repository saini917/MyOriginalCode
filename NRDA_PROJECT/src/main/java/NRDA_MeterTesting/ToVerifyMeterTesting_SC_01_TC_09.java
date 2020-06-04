package NRDA_MeterTesting;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_01_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Make Payment"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement makepayment;

	public void clickOnMakePayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(makepayment));
		wait.until(ExpectedConditions.elementToBeClickable(makepayment));
		Assert.assertTrue(makepayment.isDisplayed());
		HighlightOnElement(makepayment);
		Assert.assertTrue(makepayment.isEnabled());
		makepayment.click();
		Reporter.log("Click on 'Make a Payment'",true);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "card label"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/div/label")
	private List<WebElement> cardlabel;

	@FindBy(xpath="//div[@id='credit']/div/fieldset/fieldset/p/label")
	private WebElement expiredate;

	@FindBy(xpath="//div[@id='credit']/div/input")
	private WebElement paynow;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on Back button"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='credit']/div/input/following-sibling::span/a[contains(text(),'Click here to go back')]")
	private WebElement backbtn;

	public void verifyCardLabel() throws InterruptedException
	{
		Reporter.log("User should be view payment gateway page with following details i.e ",true);
		for(WebElement list:cardlabel)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
		wait.until(ExpectedConditions.visibilityOf(expiredate));
		Assert.assertTrue(expiredate.isDisplayed());
		HighlightOnElement(expiredate);
		Reporter.log(expiredate.getText(),true);

		wait.until(ExpectedConditions.visibilityOf(paynow));
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isDisplayed());
		Reporter.log(paynow.getText(),true);
		Reporter.log("User should be redirected to a new web page i.e Payment gateway with details like:- \n Card Number \n Applicant Name \n CVV \n Expiry Date  \n 'Pay now' button",true);
		
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
