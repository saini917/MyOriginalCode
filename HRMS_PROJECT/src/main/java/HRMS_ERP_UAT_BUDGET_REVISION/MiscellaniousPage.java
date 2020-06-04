package HRMS_ERP_UAT_BUDGET_REVISION;

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

public class MiscellaniousPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Miscellaneous".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Miscellaneous')]")
	private WebElement misc;
	
	public void clickOnMiscellaneous() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(misc));
		Assert.assertTrue(misc.isDisplayed());
		HighlightOnElement(misc);
		Assert.assertTrue(misc.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(misc));
		misc.click();
		Thread.sleep(2000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add item".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Add an item')])[2]")
	private WebElement item;
	
	public void clickOnAddItem() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(item));
		Assert.assertTrue(item.isDisplayed());
		HighlightOnElement(item);
		Assert.assertTrue(item.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		Thread.sleep(2000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Budget Head".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_list_editable o-editing']/div/div/div/input")
	private WebElement budgetHead;
	
	@FindBy(xpath="//ul/li/a[contains(text(),'Salary Expenses')]")
	private WebElement sal;
	
	public void clickOnBudgetHead() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(budgetHead));
		Assert.assertTrue(budgetHead.isDisplayed());
		HighlightOnElement(budgetHead);
		Assert.assertTrue(budgetHead.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(item));
		budgetHead.click();
		Thread.sleep(2000);
		//exceldata.getExcelData(budgetHead,"Finance Data",17,1);
		sal.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Amount Request".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='requested_amount']")
	private WebElement amtReq;
	
	public void enterAmountRequest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(amtReq));
		Assert.assertTrue(amtReq.isDisplayed());
		HighlightOnElement(amtReq);
		Assert.assertTrue(amtReq.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(amtReq));
		amtReq.clear();
		Thread.sleep(1000);
		amtReq.sendKeys("20000");
		Thread.sleep(5000);
		//exceldata.getExcelData(amtReq,"Finance Data",16,1);
	}

}
