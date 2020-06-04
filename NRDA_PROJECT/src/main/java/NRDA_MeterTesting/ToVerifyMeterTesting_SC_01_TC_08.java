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

public class ToVerifyMeterTesting_SC_01_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error Message".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Mandatory Field : Consumer ID')]")
	private WebElement message;
	
	public void getSuccessfulMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		wait.until(ExpectedConditions.elementToBeClickable(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		String Actual="Mandatory Field : Consumer ID";
		String Expected=message.getText();
		Assert.assertEquals(Actual, Expected);
		Reporter.log("Successful Message -->"+Expected,true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Select payment gateway".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath=".//*[@id='form0:val_1']/div[2]")
	private WebElement payu;
	
	public void clickOnPaymentGateWay() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(payu));
		wait.until(ExpectedConditions.elementToBeClickable(payu));
		Assert.assertTrue(payu.isDisplayed());
		HighlightOnElement(payu);
		Assert.assertTrue(payu.isEnabled());
		payu.click();
		Reporter.log("Able to view 'Select Payment Gateway' i.e PayU , HDFC , Indusland Bank",true);
		Reporter.log("select PayU gateway",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Select online".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath=".//*[@id='form0:paymentMode']/tbody/tr/td[2]/label")
	private WebElement online;
	
	public void verifypaymentMode()
	{
		wait.until(ExpectedConditions.visibilityOf(online));
		wait.until(ExpectedConditions.elementToBeClickable(online));
		Assert.assertTrue(online.isDisplayed());
		HighlightOnElement(online);
		Reporter.log("payment mode -->" +online.getText(),true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Select make payemt".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement payment;
	
	public void verifymakePayment()
	{
		wait.until(ExpectedConditions.visibilityOf(payment));
		wait.until(ExpectedConditions.elementToBeClickable(payment));
		Assert.assertTrue(payment.isDisplayed());
		HighlightOnElement(payment);
		Reporter.log("User should be able to view -->"+payment.getText(),true);
	}

}
