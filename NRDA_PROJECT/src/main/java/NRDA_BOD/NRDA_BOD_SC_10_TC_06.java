package NRDA_BOD;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_10_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	String readPDF="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile";
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify application search".
	 * @author deepak.saini
	 * @since 2018-04-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//th/span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appsearch;
	
	public void verifyAppSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appsearch));
		wait.until(ExpectedConditions.elementToBeClickable(appsearch));
		Assert.assertTrue(appsearch.isDisplayed());
		HighlightOnElement(appsearch);
		Assert.assertTrue(appsearch.isEnabled());
		excel.getExcelData(appsearch,"BOD Temp Id",0,1);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Navigation".
	 * @author deepak.saini
	 * @since 2018-04-10
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//button/span[contains(text(),'Meeting Notice')]")
	private WebElement meetingnotice;
	
	public void clickOnMeetinNotice() throws InterruptedException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(meetingnotice));
		wait.until(ExpectedConditions.elementToBeClickable(meetingnotice));
		Assert.assertTrue(meetingnotice.isDisplayed());
		HighlightOnElement(meetingnotice);
		Assert.assertTrue(meetingnotice.isEnabled());
		meetingnotice.click();
		waitForSomeTime();
	}

}
