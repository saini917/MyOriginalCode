package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC011 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select khasra number".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@id='planned_khasraKhasraNo']")
	private WebElement selectkhasrano;

	public void selectKhasraNum() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectkhasrano));
		Assert.assertTrue(selectkhasrano.isDisplayed());
		HighlightOnElement(selectkhasrano);
		Assert.assertTrue(selectkhasrano.isEnabled());
		SelectVisibleText(selectkhasrano,"74");
		waitForSomeTime();
	}

}
