package HRMS_ERP_UAT_DSC;

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

public class HRemarksPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Edit".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_form_input_dropdown']/input")
	private WebElement enquiryoff;
	
	public void selectEnquiryOfficer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(enquiryoff));
		Assert.assertTrue(enquiryoff.isDisplayed());
		HighlightOnElement(enquiryoff);
		Assert.assertTrue(enquiryoff.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(enquiryoff));
		enquiryoff.click();
		Thread.sleep(1000);
		
		exceldata.getExcelData(enquiryoff,"DSC DATA",2,1);
		Thread.sleep(5000);
		enquiryoff.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Edit".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='feedback_remark']")
	private WebElement remark;
	
	public void enterRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		 exceldata.getExcelData(remark,"DSC DATA",1,3);
		 Thread.sleep(2000);
	}
	

}
