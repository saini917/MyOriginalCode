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

public class ToVerifyMeterTesting_SC_02_TC_26 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "other".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/div/div/div[@class='con-section']/div[2]/div[@class='right-part']/span/a)[3]")
	private WebElement other;
	
	public void clickOnOther() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(other));
		Assert.assertTrue(other.isDisplayed());
		HighlightOnElement(other);
		Assert.assertTrue(other.isEnabled());
		other.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application search".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/span/div/div/div/div/div/div/table/thead/tr/th/following-sibling::th/span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appsearch;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application no".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td/a")
	private WebElement appno;
	
	public void verifyAppSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appsearch));
		wait.until(ExpectedConditions.elementToBeClickable(appsearch));
		Assert.assertTrue(appsearch.isDisplayed());
		HighlightOnElement(appsearch);
		Assert.assertTrue(appsearch.isEnabled());
		String app=excel.getExcelData(appsearch,"WaterMeterTesting_Application",0,1);
		Reporter.log("Valid Application Number -->"+app,true);
		waitForSomeTime();
		
		String appnum=appno.getText();
		Assert.assertEquals(app,appnum,"Test case pass");
		Reporter.log("User should be able to view the applications that has been trnasfered to FE --> "+appnum,true);
	
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close pop up".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:showStatusApplication']/div/a/span")
	private WebElement closewindow;
	
	public void clickOnClosePopUp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow));
		Assert.assertTrue(closewindow.isDisplayed());
		HighlightOnElement(closewindow);
		Assert.assertTrue(closewindow.isEnabled());
		closewindow.click();
		waitForSomeTime();
	}

}
