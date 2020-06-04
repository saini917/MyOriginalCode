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

public class EmployeeRetirement extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "employee retirement search".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//span[@title='Advanced Search...']")
	private WebElement search;
	
	public void clickOnEmployeeSearch() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "employee retirement".
	 * @author deepak.saini
	 * @since 2018-11-13
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
	
		public void clickOnEmployee() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
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
		exceldata.getExcelData(employeeName,"VRS DATA",1,2);
		
		wait.until(ExpectedConditions.visibilityOf(apply));
		Assert.assertTrue(apply.isDisplayed());
		HighlightOnElement(apply);
		Assert.assertTrue(apply.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(apply));
		apply.click();
		Thread.sleep(15000);
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "status".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Waiting CO Approval')]")
	private WebElement waitingCOApproval;
	
	public void clickOnStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(waitingCOApproval));
		Assert.assertTrue(waitingCOApproval.isDisplayed());
		HighlightOnElement(waitingCOApproval);
		Assert.assertTrue(waitingCOApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(waitingCOApproval));
		waitingCOApproval.click();
		Thread.sleep(5000);
	}

}
