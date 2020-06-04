package HRMS_ERP_UAT_BUDGET_REVISION;

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

public class ApprovePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approve".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Approve')]")
	private WebElement approve;
	
	public void clickOnApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approve));
		Assert.assertTrue(approve.isDisplayed());
		HighlightOnElement(approve);
		Assert.assertTrue(approve.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approve));
		approve.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Assigned to".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Assigned To')])[2]/../following-sibling::td/div/div/input")
	private WebElement assignedTo;
	
	@FindBy(xpath="//li/a[contains(text(),'Abhinav Gupta')]")
	private WebElement name;
	
	public void enterAssignedTo() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(assignedTo));
		Assert.assertTrue(assignedTo.isDisplayed());
		HighlightOnElement(assignedTo);
		Assert.assertTrue(assignedTo.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(assignedTo));
		assignedTo.click();
		Thread.sleep(3000);
		name.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remark".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='remark']")
	private WebElement remark;
	
	public void enterHODRemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"Finance Data",13,1);
	}
	
	public void enterFMRemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"Finance Data",13,2);
	}
	
	public void enterCEORemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"Finance Data",13,3);
	}
	
	public void enterBODRemark() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"Finance Data",13,4);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approves".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Approve')])[2]")
	private WebElement approves;
	
	public void clickOnApproves() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approves));
		Assert.assertTrue(approves.isDisplayed());
		HighlightOnElement(approves);
		Assert.assertTrue(approves.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approves));
		approves.click();
		Thread.sleep(5000);
	}

}
