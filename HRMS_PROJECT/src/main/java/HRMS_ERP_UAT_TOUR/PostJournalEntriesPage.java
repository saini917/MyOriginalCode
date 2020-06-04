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

public class PostJournalEntriesPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "in reimbursement".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[contains(text(),'In Reimbursement')]")
	private WebElement reimburse;
	
	public void clickOnInReimbursement() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(reimburse));
		Assert.assertTrue(reimburse.isDisplayed());
		HighlightOnElement(reimburse);
		Assert.assertTrue(reimburse.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(reimburse));
		reimburse.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "post journal entries".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Post Journal Entries')]")
	private WebElement journalEntries;
	
	public void clickOnPostJournalEntries() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(journalEntries));
		Assert.assertTrue(journalEntries.isDisplayed());
		HighlightOnElement(journalEntries);
		Assert.assertTrue(journalEntries.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(journalEntries));
		journalEntries.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Amt to disburse".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Amount To Disburse')]/../following-sibling::td/input")
	private WebElement amtToDisburse;
	
	public void enterAmtToDisburse() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(amtToDisburse));
		Assert.assertTrue(amtToDisburse.isDisplayed());
		HighlightOnElement(amtToDisburse);
		Assert.assertTrue(amtToDisburse.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(amtToDisburse));
		amtToDisburse.clear();
		Thread.sleep(1000);
		exceldata.getExcelData(amtToDisburse,"TOUR DATA",8,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Amt to disburse".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Bank Journal')]/../following-sibling::td/div/div/input")
	private WebElement bankjournal;
	
	public void selectBankJournal() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(bankjournal));
		Assert.assertTrue(bankjournal.isDisplayed());
		HighlightOnElement(bankjournal);
		Assert.assertTrue(bankjournal.isEnabled());
		Thread.sleep(2000);
		exceldata.getExcelData(bankjournal,"TOUR DATA",9,1);
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Post".
	 * @author deepak.saini
	 * @since 2018-11-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Post')])[2]")
	private WebElement post;
	
	public void clickOnPost() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(post));
		Assert.assertTrue(post.isDisplayed());
		HighlightOnElement(post);
//		Assert.assertTrue(post.isEnabled());
//		Thread.sleep(2000);
//		post.click();
//		Thread.sleep(5000);
		
	}
	

}
