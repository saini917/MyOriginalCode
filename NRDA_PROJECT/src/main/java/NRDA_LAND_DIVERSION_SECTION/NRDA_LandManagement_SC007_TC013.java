package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC007_TC013 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "request details".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Request Details')]")
	private WebElement requestdetails;
	
	public void clickOnRequestDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(requestdetails));
		Assert.assertTrue(requestdetails.isDisplayed());
		HighlightOnElement(requestdetails);
		Assert.assertTrue(requestdetails.isEnabled());
		requestdetails.click();
		waitForSomeTime();
	}

}
