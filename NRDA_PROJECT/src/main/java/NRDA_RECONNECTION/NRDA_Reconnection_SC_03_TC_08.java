package NRDA_RECONNECTION;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_Reconnection_SC_03_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
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
