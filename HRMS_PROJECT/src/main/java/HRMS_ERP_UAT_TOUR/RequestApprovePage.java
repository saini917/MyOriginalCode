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

public class RequestApprovePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Request to Approve".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Request to Approve')]")
	private WebElement requestToApprove;
	
	public void verifyRequestToApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(requestToApprove));
		Assert.assertTrue(requestToApprove.isDisplayed());
		HighlightOnElement(requestToApprove);
	}
	
	public void clickOnRequestToApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(requestToApprove));
		Assert.assertTrue(requestToApprove.isDisplayed());
		HighlightOnElement(requestToApprove);
		Assert.assertTrue(requestToApprove.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(requestToApprove));
		requestToApprove.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[@title='Advanced Search...']")
	private WebElement search;
	
	public void clickOnSearch(){
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "employee ".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[1]/button/span[@class='caret']")
	private WebElement filter;
	
	@FindBy(xpath="//li[@class='o_add_filter o_closed_menu']/a[contains(text(),'Add Custom Filter')]")
	private WebElement addCustomFilter;
	
	@FindBy(xpath="//select[@class='o_searchview_extended_prop_field']")
	private WebElement employee;
	
	@FindBy(xpath="//span[@class='o_searchview_extended_prop_value']/input")
	private WebElement employeeName;
	
	@FindBy(xpath="//button[contains(text(),'Apply')]")
	private WebElement apply;
	
		public void enterFilterDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(filter));
		Assert.assertTrue(filter.isDisplayed());
		HighlightOnElement(filter);
		Assert.assertTrue(filter.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(filter));
		filter.click();
		
		wait.until(ExpectedConditions.visibilityOf(addCustomFilter));
		Assert.assertTrue(addCustomFilter.isDisplayed());
		HighlightOnElement(addCustomFilter);
		Assert.assertTrue(addCustomFilter.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(addCustomFilter));
		addCustomFilter.click();
		
		SelectVisibleText(employee,"Employee");
		
		wait.until(ExpectedConditions.visibilityOf(employeeName));
		Assert.assertTrue(employeeName.isDisplayed());
		HighlightOnElement(employeeName);
		Assert.assertTrue(employeeName.isEnabled());
		exceldata.getExcelData(employeeName,"PAYROLL DATA",1,1);
		
		wait.until(ExpectedConditions.visibilityOf(apply));
		Assert.assertTrue(apply.isDisplayed());
		HighlightOnElement(apply);
		Assert.assertTrue(apply.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(apply));
		apply.click();
		Thread.sleep(5000);
	}

}
