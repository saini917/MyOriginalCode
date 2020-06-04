package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC015 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update conversion".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/descendant::div/a/span[contains(text(),'Update Conversion')]")
	private WebElement updateconversion;
	
	public void clickOnUpdateConversion() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(updateconversion));
		Assert.assertTrue(updateconversion.isDisplayed());
		HighlightOnElement(updateconversion);
		Assert.assertTrue(updateconversion.isEnabled());
		updateconversion.click();
		waitForSomeTime();
	}

}
