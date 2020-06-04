package NRDA_RECONNECTION;

import java.awt.AWTException;
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

public class NRDA_Reconnection_SC_06_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select connection installation".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> action;
	
	public void selectActionForwardConnection() throws InterruptedException
	{
		selectValueFromDropdown("Forward for Connection Installation");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on dropdown".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement clickonselectactiondrop;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select user".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	public void selectUser() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		waitForSomeTime();
		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("priyanshu kodape (SUE)"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}
	}
	
	@FindBy(xpath="//label[contains(text(),'Enter Comments')]/../../following-sibling::tr/td/textarea")
	private WebElement comment;
	
	@FindBy(xpath="//label[contains(text(),'Enter Comments')]")
	private WebElement clickonany;
	
	public void enterComment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(comment));
		Assert.assertTrue(comment.isDisplayed());
		HighlightOnElement(comment);
		Assert.assertTrue(comment.isEnabled());
		String comments=excel.getExcelData(comment,"Customer ID",6,8);
		Reporter.log("Expected result:"+comments,true);
		waitForSomeTime();
		clickonany.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload document".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//span[contains(text(),'Upload Document')])[1]/../../following-sibling::tr/td/table/tbody/tr/td/div/div/label")
	private WebElement uploaddocument;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file upload message".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'File uploaded Successfully')]")
	private WebElement fileuploadmessage;

	public void verifyuploadDocument() throws InterruptedException, AWTException
	{
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(fileuploadmessage);
		String Expected=fileuploadmessage.getText();
		String Actual="File uploaded Successfully";
		Assert.assertEquals(Expected,Actual,"Test case pass");
		Reporter.log("Expected result:"+Expected,true);
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Submit".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/center/button/span[contains(text(),'Submit')]")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Data saved successfully.')]")
	private WebElement successfulMsg;

	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Reporter.log("click on Submit button succesfully",true);
		waitForSomeTime();
		waitForSomeTime();

		wait.until(ExpectedConditions.visibilityOf(successfulMsg));
		HighlightOnElement(successfulMsg);
		String Actual="Data saved successfully.";
		String Expected=successfulMsg.getText();
		Assert.assertEquals(Actual,Expected,"Matched");
		Reporter.log("Expected Result:"+Expected,true);
	}


}
