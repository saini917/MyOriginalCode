package HRMS_ERP_UAT_DSC;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HRCreateNotice extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement creates;
	
	public void clickOnCreates() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(creates));
		Assert.assertTrue(creates.isDisplayed());
		HighlightOnElement(creates);
		Assert.assertTrue(creates.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(creates));
		creates.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select employee".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@placeholder='Select employee']")
	private WebElement employee;
	
	public void selectEmployee() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(employee));
		Assert.assertTrue(employee.isDisplayed());
		HighlightOnElement(employee);
		Assert.assertTrue(employee.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(employee));
		employee.click();
		Thread.sleep(1000);
		
		exceldata.getExcelData(employee,"DSC DATA",0,1);
		Thread.sleep(5000);
		employee.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//textarea[@placeholder='Enter Initiator Remark Here....']")
	private WebElement remarks;
	
	public void enterRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		exceldata.getExcelData(remarks,"DSC DATA",1,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	private WebElement save;
	
	public void clickOnSave() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(2000);
	}
	
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
	
	@FindBy(xpath="//select[@class='o_searchview_extended_prop_field']")
	private WebElement employees;
	
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
		
		SelectVisibleText(employees,"Employee");
		
		wait.until(ExpectedConditions.visibilityOf(employeeName));
		Assert.assertTrue(employeeName.isDisplayed());
		HighlightOnElement(employeeName);
		Assert.assertTrue(employeeName.isEnabled());
		exceldata.getExcelData(employeeName,"DSC DATA",0,1);
		
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
		 * This is the xpath of the WebElement "employee status".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'New')]")
		private WebElement status;
		
		public void clickOnEmployeeStatus() throws InterruptedException{
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
		 * This is the xpath of the WebElement "submit notice".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//span[contains(text(),'Submit Notice')]")
		private WebElement submit;
		
		public void clickOnSubmitNotice() throws InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(submit));
			Assert.assertTrue(submit.isDisplayed());
			HighlightOnElement(submit);
			Assert.assertTrue(submit.isEnabled());
			wait.until(ExpectedConditions.elementToBeClickable(submit));
			submit.click();
			Thread.sleep(5000);
		}


}
