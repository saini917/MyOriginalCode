package NRDA_MeterTesting;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_04_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Public Health and Engineering".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;
	
	public void clickOnPublicHealth() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publichealth));
		wait.until(ExpectedConditions.elementToBeClickable(publichealth));
		Assert.assertTrue(publichealth.isDisplayed());
		HighlightOnElement(publichealth);
		Assert.assertTrue(publichealth.isEnabled());

		publichealth.click();
		Reporter.log("Click on Public Health and Engineering",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water Meter Testing".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'WATER METER TESTING')]")
	private WebElement watermetertest;
	
	public void clickOnWatermeterTesting() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(watermetertest));
		wait.until(ExpectedConditions.elementToBeClickable(watermetertest));
		Assert.assertTrue(watermetertest.isDisplayed());
		HighlightOnElement(watermetertest);
		Assert.assertTrue(watermetertest.isEnabled());
		watermetertest.click();
		Reporter.log("Click on Water Meter Testing",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application search".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/thead/tr/th/following-sibling::th/span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appsearch;
	
	public void verifyValidAppSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appsearch));
		wait.until(ExpectedConditions.elementToBeClickable(appsearch));
		Assert.assertTrue(appsearch.isDisplayed());
		HighlightOnElement(appsearch);
		Assert.assertTrue(appsearch.isEnabled());
		String app=excel.getExcelData(appsearch,"WaterMeterTesting_Application",0,1);
		Reporter.log("Valid Application Number -->"+app,true);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//center/a/img")
	private WebElement action;
	
	public void clickOnAction() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		wait.until(ExpectedConditions.elementToBeClickable(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify select action".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement selectaction;
	
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> dropvalue;
	
	
	public void verifySelectAction()
	{
		wait.until(ExpectedConditions.visibilityOf(selectaction));
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		Assert.assertTrue(selectaction.isDisplayed());
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isEnabled());
		selectaction.click();
		
		for(WebElement value:dropvalue)
		{
			String val=value.getText();
			Reporter.log("Select Action Value -->"+val,true);
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display link".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/span")
	private List<WebElement> linkk;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Application Number')]")
	private WebElement link;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a")
	private List<WebElement> displaylink;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/label")
	private List<WebElement> displaylink1;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/span[contains(text(),'Upload Document')]")
	private WebElement link1;
	
	public void verifyDisplayLink()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		Reporter.log("System will show the Following:",true);
		for(WebElement list:linkk)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			String li=list.getText();
			Reporter.log(li,true);
		}
		
		wait.until(ExpectedConditions.visibilityOf(link));
		Assert.assertTrue(link.isDisplayed());
		HighlightOnElement(link);
		String lin=link.getText();
		Reporter.log(lin,true);
		
		for(WebElement list:displaylink)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			String li=list.getText();
			Reporter.log(li,true);
		}
		
		for(WebElement list:displaylink1)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			String li=list.getText();
			Reporter.log(li,true);
		}
		
		wait.until(ExpectedConditions.visibilityOf(link1));
		Assert.assertTrue(link1.isDisplayed());
		HighlightOnElement(link1);
		String lin1=link1.getText();
		Reporter.log(lin1,true);
	}

}
