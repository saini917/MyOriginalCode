package HRMS_ERP_UAT_VRS;

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

public class HRsectionNOCPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "section NOC".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Section NOC')]")
	private WebElement sectionNOC;
	
	public void clickOnSectionNOC() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(sectionNOC));
		Assert.assertTrue(sectionNOC.isDisplayed());
		HighlightOnElement(sectionNOC);
		Assert.assertTrue(sectionNOC.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(sectionNOC));
		sectionNOC.click();
		Thread.sleep(15000);
	}
	
	@FindBy(xpath="//span[@class='fa fa-caret-right']")
	private WebElement retriements;
	
	public void clickOnReitrement() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(retriements));
		Assert.assertTrue(retriements.isDisplayed());
		HighlightOnElement(retriements);
		Assert.assertTrue(retriements.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(retriements));
		retriements.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select employee".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//td[contains(text(),'Retirement')])[3]")
	private WebElement retirement;
	
	public void clickOnSelectedEmployee() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(retirement));
		Assert.assertTrue(retirement.isDisplayed());
		HighlightOnElement(retirement);
		Assert.assertTrue(retirement.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(retirement));
		retirement.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Edit".
	 * @author deepak.saini
	 * @since 2018-11-15
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement edit;
	
	public void clickOnEdit(){
		wait.until(ExpectedConditions.visibilityOf(edit));
		Assert.assertTrue(edit.isDisplayed());
		HighlightOnElement(edit);
		Assert.assertTrue(edit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload docs".
	 * @author deepak.saini
	 * @since 2018-11-15
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Upload your file')]")
	private WebElement uploaddocs;
	
	public void uploadDocs() throws AWTException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(uploaddocs));
		Assert.assertTrue(uploaddocs.isDisplayed());
		HighlightOnElement(uploaddocs);
		Assert.assertTrue(uploaddocs.isEnabled());
		uploaddocs.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_IMAGE\\CSVFormat.csv");
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter remarks".
	 * @author deepak.saini
	 * @since 2018-11-15
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@placeholder='Enter Remark']")
	private WebElement remarks;
	
	public void enterRemark() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		exceldata.getExcelData(remarks,"VRS DATA",3,1);
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "No Dues".
	 * @author deepak.saini
	 * @since 2018-11-15
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'No Dues')])[1]")
	private WebElement noDues;
	
	public void clickOnNoDues() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(noDues));
		Assert.assertTrue(noDues.isDisplayed());
		HighlightOnElement(noDues);
		Assert.assertTrue(noDues.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(noDues));
		noDues.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Dues Pending".
	 * @author deepak.saini
	 * @since 2018-11-15
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Dues Pending')])[1]")
	private WebElement duesPending;
	
	public void clickOnDuesPending() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(duesPending));
		Assert.assertTrue(duesPending.isDisplayed());
		HighlightOnElement(duesPending);
		Assert.assertTrue(duesPending.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(duesPending));
		duesPending.click();
		Thread.sleep(15000);
	}

}
