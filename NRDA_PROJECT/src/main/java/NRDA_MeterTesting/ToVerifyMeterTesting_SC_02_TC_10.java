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

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_02_TC_10 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file no".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement fileno;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on any".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]")
	private WebElement clickonAny;

	public void verifyFileNo() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(fileno));
		Assert.assertTrue(fileno.isDisplayed());
		HighlightOnElement(fileno);
		Assert.assertTrue(fileno.isEnabled());
		excel.getExcelData(fileno,"PRO DATA",2,3);
		clickonAny.click();
		acceptAlert();
		waitForSomeTime();
		excel.getExcelData(fileno,"PRO DATA",1,3);
		clickonAny.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/a/span")
	private WebElement closewindow;
	
	public void verifyClosePopUpWindow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow));
		Assert.assertTrue(closewindow.isDisplayed());
		HighlightOnElement(closewindow);
		Assert.assertTrue(closewindow.isEnabled());
		closewindow.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	private WebElement closewindow1;
	
	public void verifyClosePopUpWindow1() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow1));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow1));
		Assert.assertTrue(closewindow1.isDisplayed());
		HighlightOnElement(closewindow1);
		Assert.assertTrue(closewindow1.isEnabled());
		closewindow1.click();
		waitForSomeTime();
	}
}
