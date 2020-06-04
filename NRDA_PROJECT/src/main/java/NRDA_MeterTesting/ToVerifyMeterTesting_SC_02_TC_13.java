package NRDA_MeterTesting;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_02_TC_13 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "clear".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Clear')]")
	private WebElement clear;
	
	public void clickOnClearBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clear));
		Assert.assertTrue(clear.isDisplayed());
		HighlightOnElement(clear);
		Assert.assertTrue(clear.isEnabled());
		clear.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td/input")
	private WebElement subject;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file no".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]/../following-sibling::td/table/tbody/tr/td/input")
	private WebElement fileno;
	
	public void verifyFieldClear()
	{
		String textinsideinputbox=subject.getAttribute("value");
		Assert.assertTrue(textinsideinputbox.isEmpty(),"test case pass");
		HighlightOnElement(subject);
		
		String textinsideinputbox1=fileno.getAttribute("value");
		Assert.assertTrue(textinsideinputbox1.isEmpty(),"test case pass");
		HighlightOnElement(fileno);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-02-15
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/a/span")
	private WebElement closewindow;
	
	public void verifyClosePopUpWindow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow));
		Assert.assertTrue(closewindow.isDisplayed());
		HighlightOnElement(closewindow);
		Assert.assertTrue(closewindow.isEnabled());
		closewindow.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-02-15
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
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


