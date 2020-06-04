package NRDA_LAND_REQUEST_INITIATION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC009_TC019 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on radio button".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/div/div/table/tbody/tr/td/div")
	private WebElement selectrecord;
	
	public void selectRecord() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectrecord));
		Assert.assertTrue(selectrecord.isDisplayed());
		HighlightOnElement(selectrecord);
		Assert.assertTrue(selectrecord.isEnabled());
		Actions act=new Actions(driver);
		act.click(selectrecord).build().perform();
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
