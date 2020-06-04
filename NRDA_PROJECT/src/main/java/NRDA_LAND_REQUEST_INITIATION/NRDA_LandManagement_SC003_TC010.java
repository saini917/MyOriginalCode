package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC010 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select village".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@id='planned_khasraVillageList']")
	private WebElement selectvillage;

	public void selectVillage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectvillage));
		Assert.assertTrue(selectvillage.isDisplayed());
		HighlightOnElement(selectvillage);
		Assert.assertTrue(selectvillage.isEnabled());
		SelectVisibleText(selectvillage,"कुहेरा");
		waitForSomeTime();
		waitForSomeTime();
	}

}
