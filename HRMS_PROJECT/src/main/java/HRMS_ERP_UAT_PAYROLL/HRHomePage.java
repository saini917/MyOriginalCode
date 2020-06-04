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

public class HRHomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Discuss".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='navbar-header-custom']/a/i")
	private WebElement discussImage;
	
	public void clickOnDiscussImage() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(discussImage));
		Assert.assertTrue(discussImage.isDisplayed());
		HighlightOnElement(discussImage);
		Assert.assertTrue(discussImage.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(discussImage));
		discussImage.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "payroll".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Payroll')])[2]")
	private WebElement payroll;
	
	public void clickOnPayroll() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(payroll));
		Assert.assertTrue(payroll.isDisplayed());
		HighlightOnElement(payroll);
		Assert.assertTrue(payroll.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(payroll));
		payroll.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "payslip batches".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Payslips Batches')]")
	private WebElement payslipbatches;
	
	public void clickOnPaySlipBatches() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(payslipbatches));
		Assert.assertTrue(payslipbatches.isDisplayed());
		HighlightOnElement(payslipbatches);
		Assert.assertTrue(payslipbatches.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(payslipbatches));
		payslipbatches.click();
		Thread.sleep(2000);
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
		
		SelectVisibleText(employee,"Name");
		
		wait.until(ExpectedConditions.visibilityOf(employeeName));
		Assert.assertTrue(employeeName.isDisplayed());
		HighlightOnElement(employeeName);
		Assert.assertTrue(employeeName.isEnabled());
		exceldata.getExcelData(employeeName,"PAYROLL DATA",0,1);
		
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
	 * This is the xpath of the WebElement "create".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement create;
	
	public void clickOnCreate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(create));
		Assert.assertTrue(create.isDisplayed());
		HighlightOnElement(create);
		Assert.assertTrue(create.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		Thread.sleep(2000);
	}

}
