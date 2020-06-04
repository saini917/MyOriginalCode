package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Proceed".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public void clickOnProceed() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
		Assert.assertTrue(proceed.isEnabled());
		proceed.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
