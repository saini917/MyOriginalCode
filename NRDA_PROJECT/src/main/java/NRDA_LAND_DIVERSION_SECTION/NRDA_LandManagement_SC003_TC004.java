package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC004 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land Diversion request".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'LAND DIVERSION REQUEST')]")
	private WebElement landdiversion;
	
	public void clickOnLandDiversion() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landdiversion));
		Assert.assertTrue(landdiversion.isDisplayed());
		HighlightOnElement(landdiversion);
		Assert.assertTrue(landdiversion.isEnabled());
		landdiversion.click();
		waitForSomeTime();
	}
	

}
