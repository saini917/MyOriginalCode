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

public class ToVerifyMeterTesting_SC_01_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save as draft".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div/span/center/table/tbody/tr/td/span/button/following-sibling::button/span[contains(text(),'Save As Draft')]")
	private WebElement saveasdraft;

	public void clickOnSaveAsDraft() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(saveasdraft));
		wait.until(ExpectedConditions.elementToBeClickable(saveasdraft));
		Assert.assertTrue(saveasdraft.isDisplayed());
		HighlightOnElement(saveasdraft);
		Assert.assertTrue(saveasdraft.isEnabled());
		saveasdraft.click();
		Reporter.log("Click on Save as Draft  button",true);
		waitForSomeTime();
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Temporary number".
	 * @author deepak.saini
	 * @since 2018-03-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Your application has been saved successfully')]")
	private WebElement tempno;
	
	public void getMeterTestingTempMsg() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		wait.until(ExpectedConditions.visibilityOf( tempno));
		waitForSomeTime();
		Assert.assertTrue( tempno.isDisplayed());
		HighlightOnElement( tempno);
		String tempnum= tempno.getText();
		String temporyno=tempnum.substring(51,69);
		Reporter.log("Water Meter Testing:"+temporyno,true);
		excel.updateWaterMeterTesting(temporyno);//To Store Change of use Temporary Number
		waitForSomeTime();
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicstion status".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Application Status/आवेदन की स्थिति')]")
	private WebElement appstatus;
	
	public void clickOnAppStatus() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appstatus));
		wait.until(ExpectedConditions.elementToBeClickable(appstatus));
		Assert.assertTrue(appstatus.isDisplayed());
		HighlightOnElement(appstatus);
		Assert.assertTrue(appstatus.isEnabled());
		appstatus.click();
		Reporter.log("Click on Application Status/आवेदन की स्थिति  link",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Application number".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement enterappnum;
	
	public void enterApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterappnum));
		Assert.assertTrue(enterappnum.isDisplayed());
		HighlightOnElement(enterappnum);
		Assert.assertTrue(enterappnum.isEnabled());
		excel.getExcelData(enterappnum,"Water Meter Testing",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Search".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Enter Application Number :')]/../following-sibling::td/button/span[contains(text(),'Search')]")
	private WebElement search;
	
	public void clickOnSearch() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		search.click();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Draft application".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Drafted Applications')]/preceding-sibling::span")
	private WebElement draftapp;
	
	public void clickOnDraftApp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(draftapp));
		wait.until(ExpectedConditions.elementToBeClickable(draftapp));
		Assert.assertTrue(draftapp.isDisplayed());
		HighlightOnElement(draftapp);
		Assert.assertTrue(draftapp.isEnabled());
		draftapp.click();
		Reporter.log("Click on Drafted Applications",true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water meter testing".
	 * @author deepak.saini
	 * @since 2017-01-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER METER TESTING')]/preceding-sibling::span")
	private WebElement metertest;
	
	public void clickOnWaterMeterTesting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(metertest));
		wait.until(ExpectedConditions.elementToBeClickable(metertest));
		Assert.assertTrue(metertest.isDisplayed());
		HighlightOnElement(metertest);
		Assert.assertTrue(metertest.isEnabled());
		metertest.click();
		Reporter.log("Click on Water Meter Testing",true);
	}
	
	@FindBy(xpath="//a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER METER TESTING')]/preceding-sibling::span/../following-sibling::div/div/div/div/table/tbody/tr/td[4]/span")
	private WebElement tempnos;
	
	public void getTempNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(tempnos));
		wait.until(ExpectedConditions.elementToBeClickable(tempnos));
		Assert.assertTrue(tempnos.isDisplayed());
		HighlightOnElement(tempnos);
		String temp=tempnos.getText();
		Reporter.log("Temp Num "+temp,true);
	}
	
}
