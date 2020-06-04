package NRDA_LAND_DIVERSION_SECTION;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC035 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td[2]/input")
	private WebElement subjectname;
	
	public void enterValidSubject() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(subjectname));
		Assert.assertTrue(subjectname.isDisplayed());
		HighlightOnElement(subjectname);
		Assert.assertTrue(subjectname.isEnabled());
		excel.getExcelData(subjectname,"Land Data",1,15);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File No.')]/../following-sibling::td[2]/input")
	private WebElement filenum;
	
	public void enterValidFileNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(filenum));
		Assert.assertTrue(filenum.isDisplayed());
		HighlightOnElement(filenum);
		Assert.assertTrue(filenum.isEnabled());
		excel.getExcelData(filenum,"Land Data",1,16);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[2]")
	private WebElement search;
	
	public void clickOnSearch() throws InterruptedException
	{		
		wait.until(ExpectedConditions.visibilityOf(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		search.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	//@FindBy(xpath="(//button/span[contains(text(),'Close')])[1]")
	private WebElement closewindow1;
	
	public void verifyClosePopUpWindow1() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow1));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow1));
		Assert.assertTrue(closewindow1.isDisplayed());
		HighlightOnElement(closewindow1);
		Assert.assertTrue(closewindow1.isEnabled());
		closewindow1.click();
		waitForSomeTime();
	}

}
