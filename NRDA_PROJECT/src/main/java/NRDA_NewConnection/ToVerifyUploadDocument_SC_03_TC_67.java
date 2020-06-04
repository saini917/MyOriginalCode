package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyUploadDocument_SC_03_TC_67 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Water connection".
	 * @author deepak.saini
	 * @since 2018-04-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span)[2]")
	private WebElement waterconn;
	
	public void clickOnWaterConnection() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(waterconn));
		Assert.assertTrue(waterconn.isDisplayed());
		HighlightOnElement(waterconn);
		Assert.assertTrue(waterconn.isEnabled());
		waterconn.click();
	}

}
