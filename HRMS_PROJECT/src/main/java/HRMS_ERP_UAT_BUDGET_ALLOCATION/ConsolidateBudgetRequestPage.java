package HRMS_ERP_UAT_BUDGET_ALLOCATION;

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

public class ConsolidateBudgetRequestPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search'.
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[@title='Advanced Search...']")
	private WebElement search;
	
	public void clickOnSerach() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(search));
		search.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "employee ".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_cp_right']/div[@class='btn-group o_search_options']/div[1]/button/span[@class='caret']")
	private WebElement filter;
	
	@FindBy(xpath="//li[@class='o_add_filter o_closed_menu']/a[contains(text(),'Add Custom Filter')]")
	private WebElement addCustomFilter;
	
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
		}
		
		@FindBy(xpath="//select[@class='o_searchview_extended_prop_field']")
		private WebElement requestNo;
		
		@FindBy(xpath="//span[@class='o_searchview_extended_prop_value']/input")
		private WebElement request;
		
		public void enterRequestNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		SelectVisibleText(requestNo,"Request No.");
		
		wait.until(ExpectedConditions.visibilityOf(request));
		Assert.assertTrue(request.isDisplayed());
		HighlightOnElement(request);
		Assert.assertTrue(request.isEnabled());
		exceldata.getExcelData(request,"Finance Data",15,1);
		}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Apply ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//button[contains(text(),'Apply')]")
		private WebElement apply;
		
		public void clickOnApply() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(apply));
		Assert.assertTrue(apply.isDisplayed());
		HighlightOnElement(apply);
		Assert.assertTrue(apply.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(apply));
		apply.click();
		Thread.sleep(5000);
	}
		
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "waiting for account approval ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting Accounts Approval')]")
		private WebElement status;
		
		public void clickOnAccountWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(status));
		Assert.assertTrue(status.isDisplayed());
		HighlightOnElement(status);
		Assert.assertTrue(status.isEnabled());
//		wait.until(ExpectedConditions.elementToBeClickable(status));
//		status.click();
		Thread.sleep(5000);
	}

}
