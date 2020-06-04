package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_13 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Save As Draft".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Save As Draft')]")
	private WebElement draft;

	public void clickOnSaveAsDraft() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(draft));
		wait.until(ExpectedConditions.elementToBeClickable(draft));
		Assert.assertTrue(draft.isDisplayed());
		HighlightOnElement(draft);
		Assert.assertTrue(draft.isEnabled());
		draft.click();
		Reporter.log("Click on Save As Deaft Button",true);
		waitForSomeTime();
	} 
}
