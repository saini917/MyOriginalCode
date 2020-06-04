package HRMS_ERP_UAT_TOUR;

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

public class RemarksPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='name']")
	private WebElement remark;
	
	public void enterRemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"TOUR DATA",7,1);
	}
	
	public void enterCEORemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"TOUR DATA",7,2);
	}
	
	public void enterFMRemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"TOUR DATA",7,3);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Submit')])[2]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approve".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Approve')])[4]")
	private WebElement approve;
	
	public void clickOnApprove() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(approve));
		Assert.assertTrue(approve.isDisplayed());
		HighlightOnElement(approve);
		Assert.assertTrue(approve.isEnabled());
		approve.click();
		Thread.sleep(10000);
	}
	

}
