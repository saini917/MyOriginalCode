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

public class BudgetDetailsPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Add an item')])[1]")
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
	 * This is the xpath of the WebElement "project name ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Project')]/../following-sibling::td/div/div/input")
	private WebElement project;
	
	@FindBy(xpath="//ul/li/a[contains(text(),'Conservation and Development of Jhanjh Lake at Naya Raipur(Phase-II)')]")
	private WebElement pro;
	
	public void enterProjectName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(project));
		Assert.assertTrue(project.isDisplayed());
		HighlightOnElement(project);
		Assert.assertTrue(project.isEnabled());
		project.click();
		//exceldata.getExcelData(project,"Finance Data",1,3);
		Thread.sleep(2000);
		pro.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Requested amount ".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@data-field='requested_amount']")
	private WebElement reqAmounts;
	
	@FindBy(xpath="//input[@data-fieldname='requested_amount']")
	private WebElement reqAmount;
	
	public void enterAmountRequest() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		reqAmounts.click();
		//reqAmounts.clear();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(reqAmount));
		Assert.assertTrue(reqAmount.isDisplayed());
		HighlightOnElement(reqAmount);
		Assert.assertTrue(reqAmount.isEnabled());
		//exceldata.getExcelData(reqAmount,"Finance Data",16,1);
		reqAmount.sendKeys("20000");
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save and close".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Save  & Close')]")
	private WebElement save;
	
	public void clickOnSaveAndClose() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(2000);
	}

}
