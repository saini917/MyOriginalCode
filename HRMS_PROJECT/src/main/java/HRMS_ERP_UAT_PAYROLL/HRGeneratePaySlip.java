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

public class HRGeneratePaySlip extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add An Item".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Add an item')]")
	private WebElement additem;
	
	public void clickOnAddAnItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(additem));
		Assert.assertTrue(additem.isDisplayed());
		HighlightOnElement(additem);
		Assert.assertTrue(additem.isEnabled());
		additem.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select all employee".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//th[contains(text(),'Full Name')])[2]/preceding-sibling::th/div")
	private WebElement fullnamecheckbox;
	
	public void checkAllEmployee() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(fullnamecheckbox));
		Assert.assertTrue(fullnamecheckbox.isDisplayed());
		HighlightOnElement(fullnamecheckbox);
		Assert.assertTrue(fullnamecheckbox.isEnabled());
		fullnamecheckbox.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select all employee".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Select')]")
	private WebElement select;
	
	public void clickOnSelect() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(select));
		Assert.assertTrue(select.isDisplayed());
		HighlightOnElement(select);
		Assert.assertTrue(select.isEnabled());
		select.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Generate".
	 * @author deepak.saini
	 * @since 2018-11-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Generate')])[3]")
	private WebElement generate;
	
	public void clickOnGenerate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(generate));
		Assert.assertTrue(generate.isDisplayed());
		HighlightOnElement(generate);
		Assert.assertTrue(generate.isEnabled());
		generate.click();
		Thread.sleep(10000);
	}

}
