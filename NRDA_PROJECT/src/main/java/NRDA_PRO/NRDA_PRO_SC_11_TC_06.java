package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_11_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "PRO Bill Information ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'PRO Bill Information')]")
	private WebElement probill;
	
	public void clickOnPROBillInformation() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(probill));
		Assert.assertTrue(probill.isDisplayed());
		HighlightOnElement(probill);
		Assert.assertTrue(probill.isEnabled());
		probill.click();
		waitForSomeTime();
	}


}
