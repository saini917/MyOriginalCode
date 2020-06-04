package NRDA_LAND_REQUEST_INITIATION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC009_TC020 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Fill In Form')]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		fillinform.click();
		waitForSomeTime();
	}

}
