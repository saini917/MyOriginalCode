package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC014_TC003 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land details".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//a[contains(text(),'Land Details')])[1]")
	private WebElement landdetails;
	
	public void clickOnLandDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landdetails));
		Assert.assertTrue(landdetails.isDisplayed());
		HighlightOnElement(landdetails);
		Assert.assertTrue(landdetails.isEnabled());
		landdetails.click();
		waitForSomeTime();
	}

}
