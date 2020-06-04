package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_12 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "District".
	 * @author deepak.saini
	 * @since 2018-02-15
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Reset')]")
	private WebElement reset;

	public void clickOnReset() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(reset));
		wait.until(ExpectedConditions.elementToBeClickable(reset));
		Assert.assertTrue(reset.isDisplayed());
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		reset.click();
		Reporter.log("Click on Reset Button",true);
		waitForSomeTime();
	}

}
