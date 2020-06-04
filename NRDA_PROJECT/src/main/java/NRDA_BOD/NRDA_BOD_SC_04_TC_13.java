package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_04_TC_13 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Send/Forward".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Send/Forward')]")
	private WebElement sendforward;
	
	public void clickOnSendForward() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(sendforward));
		wait.until(ExpectedConditions.elementToBeClickable(sendforward));
		Assert.assertTrue(sendforward.isDisplayed());
		HighlightOnElement(sendforward);
		Assert.assertTrue(sendforward.isEnabled());
		sendforward.click();
		waitForSomeTime();
	}

}
