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

public class ToVerifyMeterTesting_SC_01_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Consumer ID".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Consumer ID')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement enterConsumer;
	
	public void enterConsumerID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterConsumer));
		Assert.assertTrue(enterConsumer.isDisplayed());
		HighlightOnElement(enterConsumer);
		Assert.assertTrue(enterConsumer.isEnabled());
		excel.getExcelData(enterConsumer,"Consumer ID",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Search".
	 * @author deepak.saini
	 * @since 2018-03-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Consumer ID')]/../../../../../../following-sibling::td/table/tbody/tr/td/input/../../following-sibling::tr/td/a/img")
	private WebElement search;
	
	public void clickOnSearch() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(search));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		search.click();
		Reporter.log("Click on Search button",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application No".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Application No.')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement enterAppNo;
	
	public void enterApplicationNo() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterAppNo));
		Assert.assertTrue(enterAppNo.isDisplayed());
		HighlightOnElement(enterAppNo);
		Assert.assertTrue(enterAppNo.isEnabled());
		excel.getExcelData(enterAppNo,"Meter Testing App Details",1,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Consumer Name".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Consumer Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement enterconsumername;
	
	public void enterConsumerName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterconsumername));
		Assert.assertTrue(enterconsumername.isDisplayed());
		HighlightOnElement(enterconsumername);
		Assert.assertTrue(enterconsumername.isEnabled());
		excel.getExcelData(enterconsumername,"Meter Testing App Details",1,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Connection type".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Connection Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement connection;
	
	public void selectConnectionType() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(connection));
		Assert.assertTrue(connection.isDisplayed());
		HighlightOnElement(connection);
		Assert.assertTrue(connection.isEnabled());
		SelectVisibleText(connection,"Domestic/घरेलू");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Meter No".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Meter No.')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement entermeterno;
	
	public void enterMeterNo() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(entermeterno));
		Assert.assertTrue(entermeterno.isDisplayed());
		HighlightOnElement(entermeterno);
		Assert.assertTrue(entermeterno.isEnabled());
		excel.getExcelData(entermeterno,"Meter Testing App Details",1,3);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Service Premises Address".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Service Premises Address')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement service;
	
	public void enterService() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(service));
		Assert.assertTrue(service.isDisplayed());
		HighlightOnElement(service);
		Assert.assertTrue(service.isEnabled());
		excel.getExcelData(service,"Meter Testing App Details",1,4);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Mobile No".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Mobile No.')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement entermobileno;
	
	public void enterMobileNo() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(entermobileno));
		Assert.assertTrue(entermobileno.isDisplayed());
		HighlightOnElement(entermobileno);
		Assert.assertTrue(entermobileno.isEnabled());
		excel.getExcelData(entermobileno,"Meter Testing App Details",1,5);
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "reset".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/span/center/table/tbody/tr/td/span/button/following-sibling::button/span[contains(text(),'Reset')]")
	private WebElement reset;

	public void clickOnReset() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reset));
		wait.until(ExpectedConditions.elementToBeClickable(reset));
		Assert.assertTrue(reset.isDisplayed());
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		reset.click();
		Reporter.log("Click on Reset button",true);
		waitForSomeTime();
	}
	
	public void verifyFieldReset() throws InterruptedException
	{
		/*wait.until(ExpectedConditions.visibilityOf(enterConsumer));
		HighlightOnElement(enterConsumer);
		String consumerid=enterConsumer.getAttribute("value");
		Assert.assertEquals(consumerid.isEmpty(),"Input box empty");*/
		
		wait.until(ExpectedConditions.visibilityOf(enterAppNo));
		HighlightOnElement(enterAppNo);
		String appno=enterAppNo.getAttribute("value");
		Assert.assertTrue(appno.isEmpty(),"Input box empty");
		//waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(enterconsumername));
		HighlightOnElement(enterconsumername);
		String consumername=enterconsumername.getAttribute("value");
		Assert.assertTrue(consumername.isEmpty(),"Input box empty");
		//waitForSomeTime();
		
		/*wait.until(ExpectedConditions.visibilityOf(connection));
		HighlightOnElement(connection);
		String conn=connection.getAttribute("value");
		Assert.assertTrue(conn.isEmpty(),"dropdown box empty");
		waitForSomeTime();*/
		
		wait.until(ExpectedConditions.visibilityOf(entermeterno));
		HighlightOnElement(entermeterno);
		String meter=entermeterno.getAttribute("value");
		Assert.assertTrue(meter.isEmpty(),"Input box empty");
		//waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(service));
		HighlightOnElement(service);
		String serv=service.getAttribute("value");
		Assert.assertTrue(serv.isEmpty(),"Input TextArea box empty");
		//waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(entermobileno));
		HighlightOnElement(entermobileno);
		String mobile=entermobileno.getAttribute("value");
		Assert.assertTrue(mobile.isEmpty(),"Input box empty");
		//waitForSomeTime();
		
		Reporter.log("Verify that all the entered fields are left blank",true);
	}

}
