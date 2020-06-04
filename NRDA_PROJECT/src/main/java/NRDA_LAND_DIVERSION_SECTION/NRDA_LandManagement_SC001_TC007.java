package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC007 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "proceed button".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public void clickOnProceedBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
		Assert.assertTrue(proceed.isEnabled());
		proceed.click();
		/*waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();*/
	}

}
