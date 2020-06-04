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

public class EmployeeHomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "self service".
	 * @author deepak.saini
	 * @since 2018-11-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Self Service')])[2]")
	private WebElement selfService;
	
	public void clickOnSelfService() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(selfService));
		Assert.assertTrue(selfService.isDisplayed());
		HighlightOnElement(selfService);
		Assert.assertTrue(selfService.isEnabled());
		selfService.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "common service".
	 * @author deepak.saini
	 * @since 2018-11-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Common Services')]")
	private WebElement commonService;
	
	public void clickOnCommonService() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(commonService));
		Assert.assertTrue(commonService.isDisplayed());
		HighlightOnElement(commonService);
		Assert.assertTrue(commonService.isEnabled());
		commonService.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "payslip".
	 * @author deepak.saini
	 * @since 2018-11-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Common Services')]/following-sibling::ul/li/a/span[contains(text(),'Payslip')]")
	private WebElement paySlip;
	
	public void clickOnPaySlip() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(paySlip));
		Assert.assertTrue(paySlip.isDisplayed());
		HighlightOnElement(paySlip);
		Assert.assertTrue(paySlip.isEnabled());
		paySlip.click();
		Thread.sleep(2000);
	}

}
