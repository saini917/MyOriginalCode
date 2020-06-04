package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_02_TC_14  extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Send/Forward".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Send/Forward')]")
	private WebElement send;
	
	public void clickOnSendForward()
	{
		wait.until(ExpectedConditions.visibilityOf(send));
		wait.until(ExpectedConditions.elementToBeClickable(send));
		Assert.assertTrue(send.isDisplayed());
		HighlightOnElement(send);
		Assert.assertTrue(send.isEnabled());
		send.click();
	}

}
