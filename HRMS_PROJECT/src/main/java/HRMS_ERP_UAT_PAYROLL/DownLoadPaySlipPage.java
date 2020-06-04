package HRMS_ERP_UAT_PAYROLL;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class DownLoadPaySlipPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Month name".
	 * @author deepak.saini
	 * @since 2018-11-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@name='month_name']")
	private WebElement month;
	
	public void selectMonth() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(month));
		Assert.assertTrue(month.isDisplayed());
		HighlightOnElement(month);
		Assert.assertTrue(month.isEnabled());
		SelectVisibleText(month,"November");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "download".
	 * @author deepak.saini
	 * @since 2018-11-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Download')]")
	private WebElement download;
	
	public void clickOnDownload() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(download));
		Assert.assertTrue(download.isDisplayed());
		HighlightOnElement(download);
		Assert.assertTrue(download.isEnabled());
		download.click();
		Thread.sleep(4000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cancel".
	 * @author deepak.saini
	 * @since 2018-11-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Cancel')]")
	private WebElement cancel;
	
	public void clickOnCancel() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(cancel));
		Assert.assertTrue(cancel.isDisplayed());
		HighlightOnElement(cancel);
		Assert.assertTrue(cancel.isEnabled());
		cancel.click();
		Thread.sleep(2000);
	}

}
