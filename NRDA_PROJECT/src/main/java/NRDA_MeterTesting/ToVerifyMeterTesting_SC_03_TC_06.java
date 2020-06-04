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

public class ToVerifyMeterTesting_SC_03_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

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
	 * This is the xpath of the WebElement "verify meter status".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/div/div/span")
	private WebElement meterstatus;
	
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[2]/li")
	private List<WebElement> dropvalue1;
	
	
	public void verifyMeterStatus()
	{
		wait.until(ExpectedConditions.visibilityOf(meterstatus));
		wait.until(ExpectedConditions.elementToBeClickable(meterstatus));
		Assert.assertTrue(meterstatus.isDisplayed());
		HighlightOnElement(meterstatus);
		Assert.assertTrue(meterstatus.isEnabled());
		meterstatus.click();
		
		for(WebElement value:dropvalue1)
		{
			String val=value.getText();
			Reporter.log("Select Meter Value -->"+val,true);
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
