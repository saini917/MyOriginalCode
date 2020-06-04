package NRDA_LAND_MUTUAL_TRANSFER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC050 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[5]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	//@FindBy(xpath="(//button/span[contains(text(),'Close')])[1]")
	private WebElement closewindow1;
	
	public void verifyClosePopUpWindow1() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(closewindow1));
		Assert.assertTrue(closewindow1.isDisplayed());
		HighlightOnElement(closewindow1);
		Assert.assertTrue(closewindow1.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(closewindow1));
		closewindow1.click();
		waitForSomeTime();
	}


}
