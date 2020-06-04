package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC006 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land diversion".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[@class='c1']/span[contains(text(),'LAND DIVERSION REQUEST')]/../following-sibling::td/span/a/img")
	private WebElement land_diversion;
	
	public void clickOnLandDiversion() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(land_diversion));
		Assert.assertTrue(land_diversion.isDisplayed());
		HighlightOnElement(land_diversion);
		Assert.assertTrue(land_diversion.isEnabled());
		land_diversion.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "proceed button".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public void verifyProceedBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
	}

}
