package HRMS_ERP_UAT_GRANT_MANAGEMENT;

import java.awt.AWTException;
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

public class CreatePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create".
	 * @author deepak.saini
	 * @since 2018-12-19
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
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "project".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Project')]/../following-sibling::td/div/div/input")
	private WebElement project;
	
	@FindBy(xpath="//li/a[contains(text(),'Road Repair')]")
	private WebElement value;
	
	public void selectProjectName() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(project));
		Assert.assertTrue(project.isDisplayed());
		HighlightOnElement(project);
		Assert.assertTrue(project.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(project));
		project.click();
		Thread.sleep(1000);
		value.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter receipt number".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Money Reciept No.')]/../following-sibling::td/input")
	private WebElement recieptno;
	
	public void enterReceiptNum() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(recieptno));
		Assert.assertTrue(recieptno.isDisplayed());
		HighlightOnElement(recieptno);
		Assert.assertTrue(recieptno.isEnabled());
		exceldata.getExcelData(recieptno,"Grant Mgmt data",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter grant letter number".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Grant Letter No')]/../following-sibling::td/input")
	private WebElement grantno;
	
	public void enterGrantNum() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(grantno));
		Assert.assertTrue(grantno.isDisplayed());
		HighlightOnElement(grantno);
		Assert.assertTrue(grantno.isEnabled());
		exceldata.getExcelData(grantno,"Grant Mgmt data",1,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "uoload file".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Upload your file')]")
	private WebElement uploadFile;
	
	public void uploadFile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(uploadFile));
		Assert.assertTrue(uploadFile.isDisplayed());
		HighlightOnElement(uploadFile);
		Assert.assertTrue(uploadFile.isEnabled());
		uploadFile.click();
		Thread.sleep(2000);
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_IMAGE\\ExcelFormat.xlsx");
		Thread.sleep(2000);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Add an item')]")
	private WebElement item;
	
	public void clickOnAddItem() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(item));
		Assert.assertTrue(item.isDisplayed());
		HighlightOnElement(item);
		Assert.assertTrue(item.isEnabled());
		item.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agency".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@data-fieldname='agency_id']/div/input")
	private WebElement agency;
	
	@FindBy(xpath="//li/a[contains(text(),'NRDA')]")
	private WebElement values;
	
	public void selectAgency() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(agency));
		Assert.assertTrue(agency.isDisplayed());
		HighlightOnElement(agency);
		Assert.assertTrue(agency.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(agency));
		agency.click();
		Thread.sleep(1000);
		values.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter grant letter number".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='requested_amount']")
	private WebElement amtreq;
	
	public void enterAmtRequested() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(amtreq));
		Assert.assertTrue(amtreq.isDisplayed());
		HighlightOnElement(amtreq);
		Assert.assertTrue(amtreq.isEnabled());
		amtreq.clear();
		Thread.sleep(1000);
		exceldata.getExcelData(amtreq,"Grant Mgmt data",2,1);
	}
}
