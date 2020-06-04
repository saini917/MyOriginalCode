package NRDA_NewConnection;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_07_TC_11 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pending for Payment"
	 * @author deepak saini
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='leftCol']/span/div/div/div/ul/li/a[contains(text(),'Pending For Payment/भुगतान हेतु अपूर्ण')]")
	private WebElement pendingforpayment;

	public void clickOnPendingPayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pendingforpayment));
		wait.until(ExpectedConditions.elementToBeClickable(pendingforpayment));
		HighlightOnElement(pendingforpayment);
		pendingforpayment.click();
		Reporter.log("Click on 'Pending for payment' menu shown in application menu 'Payment",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search Input box"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement searchinputbox;
	
	public void enterCustomerID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(searchinputbox));
		Assert.assertTrue(searchinputbox.isDisplayed());
		HighlightOnElement(searchinputbox);
		Assert.assertTrue(searchinputbox.isEnabled());
		excel.getExcelData(searchinputbox,"Customer ID",0,1);
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search button"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input/../following-sibling::td/button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	public void clickOnSearchBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(searchbtn));
		wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
		Assert.assertTrue(searchbtn.isDisplayed());
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled());
		searchbtn.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on Water And Sewerage connection"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span")
	private WebElement waterandsewerage;
	
	public void verifyWaterAndSewerageConnExist()
	{
		wait.until(ExpectedConditions.visibilityOf(waterandsewerage));
		wait.until(ExpectedConditions.elementToBeClickable(waterandsewerage));
		Assert.assertTrue(waterandsewerage.isDisplayed());
		HighlightOnElement(waterandsewerage);
		Assert.assertTrue(waterandsewerage.isEnabled());
		Actions act=new Actions(driver);
		act.click(waterandsewerage).build().perform();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Proceed to payment"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span/../following-sibling::div/div/div/table/thead/tr/th/span/../../../following-sibling::tbody/tr/td/button/span[contains(text(),'Proceed to Payment')]")
	private WebElement proceedtopay;
	
	public void clickOnProceedToPayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceedtopay));
		wait.until(ExpectedConditions.elementToBeClickable(proceedtopay));
		Assert.assertTrue(proceedtopay.isDisplayed());
		HighlightOnElement(proceedtopay);
		Assert.assertTrue(proceedtopay.isEnabled());
		proceedtopay.click();
		Reporter.log("Click on 'Proceed to Payment'",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Payment gateway".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Gateway')]/../following-sibling::td/span/table/tbody/tr[3]/td/img/../preceding-sibling::td/div")
	private WebElement gateway;
	
	public void selectPaymentGateway() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(gateway));
		Assert.assertTrue(gateway.isDisplayed());
		HighlightOnElement(gateway);
		Assert.assertTrue(gateway.isEnabled());
		gateway.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Online mode".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Mode')]/../following-sibling::td/table/tbody/tr/td[1]/div")
	private WebElement onlinemode;
	
	public void selectPaymentMode() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(onlinemode));
		Assert.assertTrue(onlinemode.isDisplayed());
		HighlightOnElement(onlinemode);
		Assert.assertTrue(onlinemode.isEnabled());
		onlinemode.click();
		waitForSomeTime();
	}
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
	/*
	 * This is the xpath of the WebElement "enter credit card".
	 * @author deepak.saini
	 * @since 2018-04-12
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
		excel.getExcelData(creditcardnum,"CRAD DETAILS", 1,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select month".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccMonth']")
	private WebElement selectmonth;
	
	public void selectValidMonth() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectmonth));
		Assert.assertTrue(selectmonth.isDisplayed());
		HighlightOnElement(selectmonth);
		Assert.assertTrue(selectmonth.isEnabled());
		SelectVisibleText(selectmonth,"12");
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select year".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccYear']")
	private WebElement selectyear;
	
	public void selectValidYear() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectyear));
		Assert.assertTrue(selectyear.isDisplayed());
		HighlightOnElement(selectyear);
		Assert.assertTrue(selectyear.isEnabled());
		SelectVisibleText(selectyear,"2025");
	}
	
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
		excel.getExcelData(cvv,"CRAD DETAILS",1,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of card holder".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccYear']/following-sibling::input[@id='ccCcv']/following-sibling::input[@id='ccCardName']")
	private WebElement nameofcardholder;
	
	public void enterCardNameHolder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(nameofcardholder));
		Assert.assertTrue(nameofcardholder.isDisplayed());
		HighlightOnElement(nameofcardholder);
		Assert.assertTrue(nameofcardholder.isEnabled());
		excel.getExcelData(nameofcardholder,"CRAD DETAILS", 1,3);
		
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
	 * This is the xpath of the WebElement "Simulate transaction".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@value='Simulate Transaction']")
	private WebElement simulate;
	
	public void clickOnSimulate()
	{
		wait.until(ExpectedConditions.visibilityOf(simulate));
		Assert.assertTrue(simulate.isDisplayed());
		HighlightOnElement(simulate);
		Assert.assertTrue(simulate.isEnabled());
		simulate.click();
		acceptAlert();
		acceptAlert();
	}
}
