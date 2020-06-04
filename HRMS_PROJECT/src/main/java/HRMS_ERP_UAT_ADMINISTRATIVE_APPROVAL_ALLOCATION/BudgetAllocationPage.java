package HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION;

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

public class BudgetAllocationPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Budget allocation".
	 * @author deepak.saini
	 * @since 2018-11-29
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Budget Allocation')])[2]")
	private WebElement budgetAllocation;
	
	public void clickOnBudgetAllocation() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(budgetAllocation));
		Assert.assertTrue(budgetAllocation.isDisplayed());
		HighlightOnElement(budgetAllocation);
		Assert.assertTrue(budgetAllocation.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(budgetAllocation));
		budgetAllocation.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Budget initiator".
	 * @author deepak.saini
	 * @since 2018-11-29
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Budget Initiator')]")
	private WebElement budgetInitiator;
	
	public void clickOnBudgetInitiator() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(budgetInitiator));
		Assert.assertTrue(budgetInitiator.isDisplayed());
		HighlightOnElement(budgetInitiator);
		Assert.assertTrue(budgetInitiator.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(budgetInitiator));
		budgetInitiator.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "year".
	 * @author deepak.saini
	 * @since 2018-11-29
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_form_input_dropdown']/input")
	private WebElement year;
	
	public void selectYear() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(year));
		Assert.assertTrue(year.isDisplayed());
		HighlightOnElement(year);
		Assert.assertTrue(year.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(year));
		year.click();
		exceldata.getExcelData(year,"Finance Data",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "initiator".
	 * @author deepak.saini
	 * @since 2018-11-29
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Initiate')]")
	private WebElement initiator;
	
	public void clickOnInitiator() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(initiator));
		Assert.assertTrue(initiator.isDisplayed());
		HighlightOnElement(initiator);
		Assert.assertTrue(initiator.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(initiator));
		initiator.click();
		Thread.sleep(10000);
	}

}
