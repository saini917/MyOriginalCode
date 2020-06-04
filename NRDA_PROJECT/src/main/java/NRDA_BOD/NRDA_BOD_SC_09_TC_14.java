package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_09_TC_14 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify publish".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Publish')]")
	private WebElement publish;
	
	public void clickOnPublish() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publish));
		wait.until(ExpectedConditions.elementToBeClickable(publish));
		Assert.assertTrue(publish.isDisplayed());
		HighlightOnElement(publish);
		Assert.assertTrue(publish.isEnabled());
		publish.click();
		waitForSomeTime();
	}

}
