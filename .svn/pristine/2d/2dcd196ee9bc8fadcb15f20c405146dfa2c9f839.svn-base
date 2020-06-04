package NRDA_NewConnection;

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

public class ToVerifyConnectionDetailsTab_SC_11_TC_03 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on dropdown".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement clickonselectactiondrop1;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select value".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> selectdropdownvalue1;


	public void selectUserActionReject() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop1));
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop1));
		Assert.assertTrue(clickonselectactiondrop1.isDisplayed());
		HighlightOnElement(clickonselectactiondrop1);
		Assert.assertTrue(clickonselectactiondrop1.isEnabled());
		clickonselectactiondrop1.click();
		waitForSomeTime();
		for(int i=0;i<selectdropdownvalue1.size();i++)
		{
			String value=selectdropdownvalue1.get(i).getText();
			if(value.equalsIgnoreCase("Reject"))
			{
				selectdropdownvalue1.get(i).click();
				waitForSomeTime();
			}
		}
		Reporter.log("Click on Action 'Reject' link",true);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "comment".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Enter Comments')]/../following-sibling::td/textarea")
	private WebElement comment;

	public void enterComment() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(comment));
		HighlightOnElement(comment);
		excel.getExcelData(comment,"Customer ID",5,8);
		Reporter.log("Enter comments .",true);
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload document".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/span)[3]/../following-sibling::td/table/tbody/tr/td/div/div/label/input")
	private WebElement uploaddocument;

	public void uploadDocument() throws InterruptedException, AWTException
	{
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		Reporter.log("Upload any document",true);
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

	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Reporter.log("click on Submit button succesfully",true);
		Reporter.log(". Rejected Application should be viewed under 'Approved / Rejected Application' in Citizen Dashboard",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Your application rejected successfully.')]")
	private WebElement successmessage;

	public void getRejectedMsg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(successmessage));
		HighlightOnElement(successmessage);
		String expected=successmessage.getText();
		String actual="Your application rejected successfully.";
		Assert.assertEquals(actual, expected);
		Reporter.log("Rejected Message:"+expected,true);
		waitForSomeTime();
	}

}
