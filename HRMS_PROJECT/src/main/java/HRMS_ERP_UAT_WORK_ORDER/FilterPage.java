package HRMS_ERP_UAT_WORK_ORDER;

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

public class FilterPage extends WebdriverCommonDriverLibrary{
	
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
		private WebElement tsNo;
		
		@FindBy(xpath="//span[@class='o_searchview_extended_prop_value']/input")
		private WebElement request;
		
		public void enterTSNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		SelectVisibleText(tsNo,"TS No.");
		
		wait.until(ExpectedConditions.visibilityOf(request));
		Assert.assertTrue(request.isDisplayed());
		HighlightOnElement(request);
		Assert.assertTrue(request.isEnabled());
		exceldata.getExcelData(request,"Finance Data",20,1);
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
		 * This is the xpath of the WebElement "draft".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Draft')]")
		private WebElement status;
		
		public void clickOnDraft() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(status));
		Assert.assertTrue(status.isDisplayed());
		HighlightOnElement(status);
		Assert.assertTrue(status.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(status));
		status.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "HOD Waiting Approval Status".
		 * @author deepak.saini
		 * @since 2018-12-06
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting Hod Approval')]")
		private WebElement hodStatus;
		
		public void clickOnHODWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(hodStatus));
		Assert.assertTrue(hodStatus.isDisplayed());
		HighlightOnElement(hodStatus);
		Assert.assertTrue(hodStatus.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(hodStatus));
		hodStatus.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Waiting Accounts Approval".
		 * @author deepak.saini
		 * @since 2018-12-06
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting Accounts Approval')]")
		private WebElement accountStatus;
		
		public void clickOnFMWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(accountStatus));
		Assert.assertTrue(accountStatus.isDisplayed());
		HighlightOnElement(accountStatus);
		Assert.assertTrue(accountStatus.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(accountStatus));
		accountStatus.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Waiting CEO Approval".
		 * @author deepak.saini
		 * @since 2018-12-06
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting CEO Approval')]")
		private WebElement ceoStatus;
		
		public void clickOnCEOWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(ceoStatus));
		Assert.assertTrue(ceoStatus.isDisplayed());
		HighlightOnElement(ceoStatus);
		Assert.assertTrue(ceoStatus.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(ceoStatus));
		ceoStatus.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Waiting BOD Approval".
		 * @author deepak.saini
		 * @since 2018-12-06
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting BOD Approval')]")
		private WebElement bodStatus;
		
		public void clickOnBODWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(bodStatus));
		Assert.assertTrue(bodStatus.isDisplayed());
		HighlightOnElement(bodStatus);
		Assert.assertTrue(bodStatus.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(bodStatus));
		bodStatus.click();
		Thread.sleep(5000);
	}


}
