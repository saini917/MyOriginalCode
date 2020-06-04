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

public class RequestTypePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select VRS Request".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@name='request_type']")
	private WebElement requestType;
	
	public void selectRequestType() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(requestType));
		Assert.assertTrue(requestType.isDisplayed());
		HighlightOnElement(requestType);
		Assert.assertTrue(requestType.isEnabled());
		SelectVisibleText(requestType,"VRS");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter remarks".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@name='remark']")
	private WebElement remarks;
	
	public void enterRemark() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		exceldata.getExcelData(remarks,"VRS DATA",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "discard".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Discard')]")
	private WebElement discard;
	
	public void clickOnDiscard(){
		wait.until(ExpectedConditions.visibilityOf(discard));
		Assert.assertTrue(discard.isDisplayed());
		HighlightOnElement(discard);
		Assert.assertTrue(discard.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(discard));
		discard.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit request".
	 * @author deepak.saini
	 * @since 2018-11-01
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit Request')]")
	private WebElement submitRequest;
	
	public void clickOnSubmitRequest(){
		wait.until(ExpectedConditions.visibilityOf(submitRequest));
		Assert.assertTrue(submitRequest.isDisplayed());
		HighlightOnElement(submitRequest);
		Assert.assertTrue(submitRequest.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submitRequest));
		submitRequest.click();
		waitForPageLoad();
		waitForDomElement();
	}

}
