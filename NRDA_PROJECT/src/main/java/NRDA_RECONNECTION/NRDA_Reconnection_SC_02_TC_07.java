package NRDA_RECONNECTION;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_Reconnection_SC_02_TC_07 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on create New file".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td/input")
	private WebElement subject;
	
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]")
	private WebElement clickonany;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on create New file".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement filenum;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Type".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Type')]/../following-sibling::td/div/div/span")
	private WebElement type;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "category".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Category')]/../following-sibling::td/div/div/span")
	private WebElement category;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Department".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Department')]/../following-sibling::td/div/div/span")
	private WebElement dept;

	public void verifCreateFile() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(subject));
		Assert.assertTrue(subject.isDisplayed());
		excel.getExcelData(subject, "File Data",4,1);
		clickonany.click();
		waitForSomeTime();

		wait.until(ExpectedConditions.visibilityOf(filenum));
		Assert.assertTrue(filenum.isDisplayed());
		excel.getExcelData(filenum, "File Data",4,0);
		clickonany.click();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(type));
		Assert.assertTrue(type.isDisplayed());
		HighlightOnElement(type);
		Assert.assertTrue(type.isEnabled());
		type.click();
		selectValueFromDropdown("File");
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(category));
		Assert.assertTrue(category.isDisplayed());
		HighlightOnElement(category);
		Assert.assertTrue(category.isEnabled());
		category.click();
		selectValueFromDropdown("Land");
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(dept));
		Assert.assertTrue(dept.isDisplayed());
		HighlightOnElement(dept);
		Assert.assertTrue(dept.isEnabled());
		dept.click();
		selectValueFromDropdown("Public Health and Engineering");
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/center/table/tbody/tr/td/button/span[contains(text(),'Submit')]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		Reporter.log("Click on Submit button",true);
		waitForSomeTime();
		Reporter.log("1. User should be able to submit the info successfully. \n 2. Filled information will be seen in a grid form  \n 3. User should be able to select a record from grid.",true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close pop up".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//form[@id='inboxForm']/span/div/div/a/span)[4]")
	private WebElement closepopup1;

	public void closePopup() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closepopup1));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup1));
		Assert.assertTrue(closepopup1.isDisplayed());
		HighlightOnElement(closepopup1);
		Assert.assertTrue(closepopup1.isEnabled());
		closepopup1.click();
		waitForSomeTime();
	}
}
