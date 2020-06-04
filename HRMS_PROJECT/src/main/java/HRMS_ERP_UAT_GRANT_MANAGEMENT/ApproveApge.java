package HRMS_ERP_UAT_GRANT_MANAGEMENT;

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

public class ApproveApge extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approve ".
	 * @author deepak.saini
	 * @since 2018-11-23
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
	 * This is the xpath of the WebElement "Assigned to CEO ".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_form_input_dropdown']/input")
	private WebElement assigned;
	
	@FindBy(xpath="//li/a[contains(text(),'Rajat Kumar')]")
	private WebElement value;
	
	public void selectAssignedToCEO() throws InterruptedException{
	wait.until(ExpectedConditions.visibilityOf(assigned));
	Assert.assertTrue(assigned.isDisplayed());
	HighlightOnElement(assigned);
	Assert.assertTrue(assigned.isEnabled());
	wait.until(ExpectedConditions.elementToBeClickable(assigned));
	assigned.click();
	Thread.sleep(1000);
	value.click();
	Thread.sleep(1000);
}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Assigned to BOD ".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//li/a[contains(text(),'Abhinav Gupta')]")
	private WebElement values;
	
	public void selectAssignedToBOD() throws InterruptedException{
	wait.until(ExpectedConditions.visibilityOf(assigned));
	Assert.assertTrue(assigned.isDisplayed());
	HighlightOnElement(assigned);
	Assert.assertTrue(assigned.isEnabled());
	wait.until(ExpectedConditions.elementToBeClickable(assigned));
	assigned.click();
	Thread.sleep(1000);
	values.click();
	Thread.sleep(1000);
}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remark ".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='remark']")
	private WebElement remark;
	
	public void enterFMRemark() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		exceldata.getExcelData(remark,"Finance Data",13,2);
	}
	
	public void enterCEORemark() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		remark.click();
		Thread.sleep(3000);
		exceldata.getExcelData(remark,"Finance Data",13,3);
	}
	
	public void enterAMRemark() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(remark));
		Assert.assertTrue(remark.isDisplayed());
		HighlightOnElement(remark);
		Assert.assertTrue(remark.isEnabled());
		remark.click();
		Thread.sleep(3000);
		exceldata.getExcelData(remark,"Finance Data",13,5);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approve ".
	 * @author deepak.saini
	 * @since 2018-11-23
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
