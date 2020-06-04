package HRMS_ERP_UAT_VRS;

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

public class CEOapprovePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "status".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Waiting CEO Approval')]")
	private WebElement waitingCEOApproval;
	
	public void clickOnCEOStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(waitingCEOApproval));
		Assert.assertTrue(waitingCEOApproval.isDisplayed());
		HighlightOnElement(waitingCEOApproval);
		Assert.assertTrue(waitingCEOApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(waitingCEOApproval));
		waitingCEOApproval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "status".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Approve')])[4]")
	private WebElement approval;
	
	public void clickOnCEOApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approval));
		Assert.assertTrue(approval.isDisplayed());
		HighlightOnElement(approval);
		Assert.assertTrue(approval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approval));
		approval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@placeholder='Please give the Remarks']")
	private WebElement remarks;
	
	public void enterRemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		exceldata.getExcelData(remarks,"VRS DATA",0,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Thread.sleep(10000);
	}

}
