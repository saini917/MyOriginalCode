package HRMS_ERP_UAT_TECHNICAL_SECTION;

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
		private WebElement proposalNo;
		
		@FindBy(xpath="//span[@class='o_searchview_extended_prop_value']/input")
		private WebElement proposal;
		
		public void enterProposalNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		SelectVisibleText(proposalNo,"Proposal No.");
		
		wait.until(ExpectedConditions.visibilityOf(proposal));
		Assert.assertTrue(proposal.isDisplayed());
		HighlightOnElement(proposal);
		Assert.assertTrue(proposal.isEnabled());
		exceldata.getExcelData(proposal,"Finance Data",12,4);
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
		 * This is the xpath of the WebElement "Apply ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Draft')]")
		private WebElement draft;
		
		public void clickOnDraft() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(draft));
		Assert.assertTrue(draft.isDisplayed());
		HighlightOnElement(draft);
		Assert.assertTrue(draft.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(draft));
		draft.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "submit ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//span[contains(text(),'Submit')]")
		private WebElement submit;
		
		public void clickOnSubmit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "HOD Approval status ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting Hod Approval')]")
		private WebElement hodApproval;
		
		public void clickOnHODApprovalStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(hodApproval));
		Assert.assertTrue(hodApproval.isDisplayed());
		HighlightOnElement(hodApproval);
		Assert.assertTrue(hodApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(hodApproval));
		hodApproval.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "FM Waiting Approval status ".
		 * @author deepak.saini
		 * @since 2018-12-04
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting Accounts Approval')]")
		private WebElement fmWaitingApproval;
		
		public void clickOnFMWaitingAccountsStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fmWaitingApproval));
		Assert.assertTrue(fmWaitingApproval.isDisplayed());
		HighlightOnElement(fmWaitingApproval);
		Assert.assertTrue(fmWaitingApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fmWaitingApproval));
		fmWaitingApproval.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "CEO Waiting Approval status ".
		 * @author deepak.saini
		 * @since 2018-12-04
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting CEO Approval')]")
		private WebElement ceoWaitingApproval;
		
		public void clickOnCEOWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(ceoWaitingApproval));
		Assert.assertTrue(ceoWaitingApproval.isDisplayed());
		HighlightOnElement(ceoWaitingApproval);
		Assert.assertTrue(ceoWaitingApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(ceoWaitingApproval));
		ceoWaitingApproval.click();
		Thread.sleep(5000);
	}
		
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "BOD Waiting Approval status ".
		 * @author deepak.saini
		 * @since 2018-12-04
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//td[contains(text(),'Waiting BOD Approval')]")
		private WebElement bodWaitingApproval;
		
		public void clickOnBODWaitingStatus() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(bodWaitingApproval));
		Assert.assertTrue(bodWaitingApproval.isDisplayed());
		HighlightOnElement(bodWaitingApproval);
		Assert.assertTrue(bodWaitingApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(bodWaitingApproval));
		bodWaitingApproval.click();
		Thread.sleep(5000);
	}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Approve ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		//@FindBy(xpath="(//span[contains(text(),'Approve')])[5]")
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
		 * This is the xpath of the WebElement "remark ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//textarea[@name='remark']")
		private WebElement remark;
		
		public void enterHODRemark() throws EncryptedDocumentException, InvalidFormatException, IOException{
			wait.until(ExpectedConditions.visibilityOf(remark));
			Assert.assertTrue(remark.isDisplayed());
			HighlightOnElement(remark);
			Assert.assertTrue(remark.isEnabled());
			exceldata.getExcelData(remark,"Finance Data",13,1);
		}
		
		public void enterFMRemark() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(remark));
			Assert.assertTrue(remark.isDisplayed());
			HighlightOnElement(remark);
			Assert.assertTrue(remark.isEnabled());
			remark.click();
			Thread.sleep(3000);
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
		
		public void enterBODRemark() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(remark));
			Assert.assertTrue(remark.isDisplayed());
			HighlightOnElement(remark);
			Assert.assertTrue(remark.isEnabled());
			remark.click();
			Thread.sleep(3000);
			exceldata.getExcelData(remark,"Finance Data",13,4);
		}
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Approve ".
		 * @author deepak.saini
		 * @since 2018-11-23
		 */
		/****************************************************************************************************/
		//@FindBy(xpath="(//span[contains(text(),'Approve')])[7]")
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
		
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "Assigned to ".
		 * @author deepak.saini
		 * @since 2018-12-04
		 */
		/****************************************************************************************************/
		@FindBy(xpath="//div[@class='o_form_input_dropdown']/input")
		private WebElement assigned;
		
		@FindBy(xpath="//li/a[contains(text(),'Rajat Kumar')]")
		private WebElement value;
		
		@FindBy(xpath="//li/a[contains(text(),'Abhinav Gupta')]")
		private WebElement values;
		
		public void selectCEO() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(assigned));
			Assert.assertTrue(assigned.isDisplayed());
			HighlightOnElement(assigned);
			Assert.assertTrue(assigned.isEnabled());
			assigned.click();
			Thread.sleep(1000);
			value.click();
			Thread.sleep(1000);
		}
		
		public void selectBOD() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
			wait.until(ExpectedConditions.visibilityOf(assigned));
			Assert.assertTrue(assigned.isDisplayed());
			HighlightOnElement(assigned);
			Assert.assertTrue(assigned.isEnabled());
			assigned.click();
			Thread.sleep(1000);
			values.click();
			Thread.sleep(1000);
		}

}
