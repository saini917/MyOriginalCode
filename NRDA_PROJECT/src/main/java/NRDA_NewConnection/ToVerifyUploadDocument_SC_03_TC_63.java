package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyUploadDocument_SC_03_TC_63 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "reset".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Reset')])[4]")
	private WebElement reset;
	
	public void clickOnReset() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reset));
		Assert.assertTrue(reset.isDisplayed());
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		reset.click();
		waitForSomeTime();
	}

}
