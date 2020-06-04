package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC003 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application form link".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div[1]/div/ul/li/a/span[contains(text(),'Application Form')]")
	private WebElement appformlink;

	public void clickOnApplicationFormLink() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appformlink));
		Assert.assertTrue(appformlink.isDisplayed());
		HighlightOnElement(appformlink);
		Assert.assertTrue(appformlink.isEnabled());
		appformlink.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land section".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]")
	private WebElement landsection;
	
	public void verifyLandSection()
	{
	Assert.assertTrue(landsection.isDisplayed());
	HighlightOnElement(landsection);
	}

}
