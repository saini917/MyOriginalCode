package NRDA_LAND_DIVERSION_SECTION;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC017 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,60);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Close')]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException
	{
		close(close);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close pop up".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:confirmDlg']/div/a/span")
	private WebElement closepopup;
	
	public void clickOnClosePopUp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		Assert.assertTrue(closepopup.isDisplayed());
		HighlightOnElement(closepopup);
		Assert.assertTrue(closepopup.isEnabled());
		closepopup.click();
	    waitForSomeTime();
	}
}
