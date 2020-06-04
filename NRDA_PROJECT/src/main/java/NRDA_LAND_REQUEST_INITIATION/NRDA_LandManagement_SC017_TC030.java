package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC017_TC030 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Update')])[2]")
	private WebElement popupupdate;
	
	public void clickOnPopUpdate() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(popupupdate));
		Assert.assertTrue(popupupdate.isDisplayed());
		HighlightOnElement(popupupdate);
		Assert.assertTrue(popupupdate.isEnabled());
		popupupdate.click();
		waitForSomeTime();
	}


}
