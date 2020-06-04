package NRDA_MeterTesting;

import java.awt.AWTException;
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

public class ToVerifyMeterTesting_SC_02_TC_23 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	/*@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/select")
	private WebElement action;*/
	
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement action;
	
	public void selectAction() throws InterruptedException
	{
		/*wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		SelectVisibleText(action,"Forward");
		Reporter.log("select FORWARD from the Action",true);
		waitForSomeTime();*/
		
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		selectValueFromDropdown("Forward");
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select officer".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement officer;
	
	public void selectOfficer() throws InterruptedException
	{
		/*wait.until(ExpectedConditions.visibilityOf(officer));
		Assert.assertTrue(officer.isDisplayed());
		HighlightOnElement(officer);
		Assert.assertTrue(officer.isEnabled());
		SelectVisibleText(officer,"priyanshu kodape (SUE)");
		waitForSomeTime();
		Reporter.log("On selecting the forward other box is easily get selected as CEO",true);*/
		
		wait.until(ExpectedConditions.visibilityOf(officer));
		Assert.assertTrue(officer.isDisplayed());
		HighlightOnElement(officer);
		Assert.assertTrue(officer.isEnabled());
		officer.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Comments".
	 * @author deepak.saini
	 * @since 2018-03-23
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
		String comment=excel.getExcelData(comments,"PRO DATA",1,4);
		Reporter.log("Enter Comment:"+comment,true);
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/span[contains(text(),'Upload Document')]/../following-sibling::td/table/tbody/tr/td/div/div/label")
	private WebElement upload;

	public void uploadDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'File uploaded Successfully')]")
	private WebElement message;
	public void verifyMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		
		String actualMessage="File uploaded Successfully";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Successful Message:"+expectedMesage,true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-03-23
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
	}



}
