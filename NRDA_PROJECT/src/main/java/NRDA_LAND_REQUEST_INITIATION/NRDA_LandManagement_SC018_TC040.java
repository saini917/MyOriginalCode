package NRDA_LAND_REQUEST_INITIATION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC040 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Update')])[2]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		update.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
