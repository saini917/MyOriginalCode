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

public class SubmitPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Employee draft".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Draft')]")
	private WebElement draft;
	
	public void clickOnEmployeDraft() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(draft));
		Assert.assertTrue(draft.isDisplayed());
		HighlightOnElement(draft);
		Assert.assertTrue(draft.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(draft));
		draft.click();
		Thread.sleep(10000);
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit to HOD')]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "HOD approval".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'HOD Approval')]")
	private WebElement hodapproval;
	
	public void clickOnHODApproval() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(hodapproval));
		Assert.assertTrue(hodapproval.isDisplayed());
		HighlightOnElement(hodapproval);
		Assert.assertTrue(hodapproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(hodapproval));
		hodapproval.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit to HR".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit To HR')]")
	private WebElement submitToHR;
	
	public void clickOnSubmitToHR() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submitToHR));
		Assert.assertTrue(submitToHR.isDisplayed());
		HighlightOnElement(submitToHR);
		Assert.assertTrue(submitToHR.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submitToHR));
		submitToHR.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "GM approval".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'GM Approval')]")
	private WebElement gmapproval;
	
	public void clickOnGMApproval() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(gmapproval));
		Assert.assertTrue(gmapproval.isDisplayed());
		HighlightOnElement(gmapproval);
		Assert.assertTrue(gmapproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(gmapproval));
		gmapproval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "FM approval".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'Finance Approval')]")
	private WebElement fmApproval;
	
	public void clickOnFMApproval() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fmApproval));
		Assert.assertTrue(fmApproval.isDisplayed());
		HighlightOnElement(fmApproval);
		Assert.assertTrue(fmApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fmApproval));
		fmApproval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CEO approval".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'CEO Approval')]")
	private WebElement ceoApproval;
	
	public void clickOnCEOApproval() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(ceoApproval));
		Assert.assertTrue(ceoApproval.isDisplayed());
		HighlightOnElement(ceoApproval);
		Assert.assertTrue(ceoApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(ceoApproval));
		ceoApproval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "HR approval".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'HR Approval')]")
	private WebElement hrapproval;
	
	public void clickOnHRApproval() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(hrapproval));
		Assert.assertTrue(hrapproval.isDisplayed());
		HighlightOnElement(hrapproval);
		Assert.assertTrue(hrapproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(hrapproval));
		hrapproval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit to CEO".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit To CEO')]")
	private WebElement submitToCEO;
	
	public void clickOnSubmitToCEO() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submitToCEO));
		Assert.assertTrue(submitToCEO.isDisplayed());
		HighlightOnElement(submitToCEO);
		Assert.assertTrue(submitToCEO.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submitToCEO));
		submitToCEO.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "send to CEO".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Send to CEO')]")
	private WebElement sendToCEO;
	
	public void clickOnSendToCEO() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(sendToCEO));
		Assert.assertTrue(sendToCEO.isDisplayed());
		HighlightOnElement(sendToCEO);
		Assert.assertTrue(sendToCEO.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(sendToCEO));
		sendToCEO.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit to CEO".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Approval By CEO')]")
	private WebElement approvedbyCEO;
	
	public void clickOnApprovedByCEO() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approvedbyCEO));
		Assert.assertTrue(approvedbyCEO.isDisplayed());
		HighlightOnElement(approvedbyCEO);
		Assert.assertTrue(approvedbyCEO.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approvedbyCEO));
		approvedbyCEO.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Done".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//td[contains(text(),'Done')])[1]")
	private WebElement done;
	
	public void clickOnEmployeeDoneStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(done));
		Assert.assertTrue(done.isDisplayed());
		HighlightOnElement(done);
		Assert.assertTrue(done.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(done));
		done.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Employee Log Expenses".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Log Expense')]")
	private WebElement logExpenses;
	
	public void clickOnEmployeeLogExpenses() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(logExpenses));
		Assert.assertTrue(logExpenses.isDisplayed());
		HighlightOnElement(logExpenses);
		Assert.assertTrue(logExpenses.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(logExpenses));
		logExpenses.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Add an item')]")
	private WebElement additem;
	
	public void clickOnAddItem() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(additem));
		Assert.assertTrue(additem.isDisplayed());
		HighlightOnElement(additem);
		Assert.assertTrue(additem.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(additem));
		additem.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "expense".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@name='product_id']")
	private WebElement expense;
	
	public void selectExpense() throws InterruptedException{
		SelectVisibleText(expense,"LUNCH");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "add an item".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='name']")
	private WebElement expenseDesc;
	
	public void enterExpenseDesc() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(expenseDesc));
		Assert.assertTrue(expenseDesc.isDisplayed());
		HighlightOnElement(expenseDesc);
		Assert.assertTrue(expenseDesc.isEnabled());
		exceldata.getExcelData(expenseDesc,"TOUR DATA",4,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "city".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='o_list_editable o-editing']/div/div/div/input)[1]")
	private WebElement city;
	
	public void selectCity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(city));
		Assert.assertTrue(city.isDisplayed());
		HighlightOnElement(city);
		Assert.assertTrue(city.isEnabled());
		city.click();
		exceldata.getExcelData(city,"TOUR DATA",1,1);
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "unit amt".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='unit_amount']")
	private WebElement unitcost;
	
	public void enterUnitCost() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(unitcost));
		Assert.assertTrue(unitcost.isDisplayed());
		HighlightOnElement(unitcost);
		Assert.assertTrue(unitcost.isEnabled());
		unitcost.click();
		exceldata.getExcelData(unitcost,"TOUR DATA",5,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Quantity".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='quantity']")
	private WebElement quantity;
	
	public void enterQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(quantity));
		Assert.assertTrue(quantity.isDisplayed());
		HighlightOnElement(quantity);
		Assert.assertTrue(quantity.isEnabled());
		exceldata.getExcelData(quantity,"TOUR DATA",6,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Expense Description".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//table[@class='o_group o_inner_group'])[2]/tbody/tr/td/input")
	private WebElement desc;
	
	public void expDesc() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(desc));
		Assert.assertTrue(desc.isDisplayed());
		HighlightOnElement(desc);
		Assert.assertTrue(desc.isEnabled());
		exceldata.getExcelData(desc,"TOUR DATA",4,1);
	}
	
	@FindBy(xpath="//a[contains(text(),'Expense Details')]")
	private WebElement clickonany;
	
	public void clickOnAny() throws InterruptedException{
		clickonany.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Employee submit".
	 * @author deepak.saini
	 * @since 2018-11-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit')]")
	private WebElement submits;
	
	public void clickOnEmployeeSubmit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submits));
		Assert.assertTrue(submits.isDisplayed());
		HighlightOnElement(submits);
		Assert.assertTrue(submits.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submits));
		submits.click();
		Thread.sleep(10000);
	}
	
	
}
