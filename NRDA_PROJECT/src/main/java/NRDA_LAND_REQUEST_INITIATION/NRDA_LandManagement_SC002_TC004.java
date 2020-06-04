package NRDA_LAND_REQUEST_INITIATION;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC004 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land Section".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]/preceding-sibling::span")
	private WebElement landsection;
	
	public void clickOnLandSection() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landsection));
		Assert.assertTrue(landsection.isDisplayed());
		HighlightOnElement(landsection);
		Assert.assertTrue(landsection.isEnabled());
		Actions lsection=new Actions(driver);
		lsection.click(landsection).build().perform();
		waitForSomeTime();
	}
}
