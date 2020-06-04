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

public class HRCreateNewPayslipBatches extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "payslip batch name".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_form_sheet']/h1/input")
	private WebElement name;
	
	public void enterPaySlipBatchName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(name));
		Assert.assertTrue(name.isDisplayed());
		HighlightOnElement(name);
		Assert.assertTrue(name.isEnabled());
		exceldata.getExcelData(name,"PAYROLL DATA",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	private WebElement save;
	
	public void clickOnSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "employee draft".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//td[contains(text(),'Draft')])[1]")
	private WebElement draft;
	
	public void clickOnDraft(){
		wait.until(ExpectedConditions.visibilityOf(draft));
		Assert.assertTrue(draft.isDisplayed());
		HighlightOnElement(draft);
		Assert.assertTrue(draft.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(draft));
		draft.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Generate Payslips')]")
	private WebElement genpaySlip;
	
	public void clickOnGeneratePaySlip() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(genpaySlip));
		Assert.assertTrue(genpaySlip.isDisplayed());
		HighlightOnElement(genpaySlip);
		Assert.assertTrue(genpaySlip.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(genpaySlip));
		genpaySlip.click();
		Thread.sleep(2000);
	}
	
	

}
