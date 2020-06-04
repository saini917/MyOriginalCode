package HRMS_ERP_UAT_PAYROLL;

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

public class HREmployeePaySlip extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Employee pay Slip".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Employee Payslips')])[1]")
	private WebElement employeePaySlip;
	
	public void clickOnEmployeePaySlip() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(employeePaySlip));
		Assert.assertTrue(employeePaySlip.isDisplayed());
		HighlightOnElement(employeePaySlip);
		Assert.assertTrue(employeePaySlip.isEnabled());
		employeePaySlip.click();
		Thread.sleep(5000);
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
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "employee draft".
		 * @author deepak.saini
		 * @since 2018-11-21
		 */
		/****************************************************************************************************/
		@FindBy(xpath="(//td[contains(text(),'Draft')])[1]")
		private WebElement draft;
		
		public void clickOnDraft(){
			wait.until(ExpectedConditions.visibilityOf(draft));
			Assert.assertTrue(draft.isDisplayed());
			HighlightOnElement(draft);
			Assert.assertTrue(draft.isEnabled());
			wait.until(ExpectedConditions.elementToBeClickable(draft));
			draft.click();
		}

}
