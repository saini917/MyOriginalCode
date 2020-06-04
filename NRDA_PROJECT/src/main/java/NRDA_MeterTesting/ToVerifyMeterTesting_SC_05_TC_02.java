package NRDA_MeterTesting;

import java.io.IOException;
import java.util.List;

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

public class ToVerifyMeterTesting_SC_05_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
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
	
	
	public void SelectAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectaction));
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		Assert.assertTrue(selectaction.isDisplayed());
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isEnabled());
		selectaction.click();
		selectValueFromDropdown("Verify");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Meter Status".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/div/div/span")
	private WebElement meterstatus;
	
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[2]/li")
	private List<WebElement> dropvalue1;
	
	
	public void selectMeterStatus() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(meterstatus));
		wait.until(ExpectedConditions.elementToBeClickable(meterstatus));
		Assert.assertTrue(meterstatus.isDisplayed());
		HighlightOnElement(meterstatus);
		Assert.assertTrue(meterstatus.isEnabled());
		meterstatus.click();
		selectValueFromDropdown("Replaced");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Comments".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Enter Comments')]/../following-sibling::td/textarea")
	private WebElement comments;

	public void enterComment() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(comments));
		Assert.assertTrue(comments.isDisplayed());
		HighlightOnElement(comments);
		Assert.assertTrue(comments.isEnabled());
		String comment=excel.getExcelData(comments,"Meter Testin data",4,0);
		Reporter.log("Enter Comment:"+comment,true);
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[3]")
	private WebElement submit;
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Your application submitted successfully.')]")
	private WebElement message;
	public void verifyMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);

		String actualMessage="Your application submitted successfully.";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Successful Message:"+expectedMesage,true);
		waitForSomeTime();
	}


}
