package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC007_TC016 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "view".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//span[contains(text(),'View')])[1]")
	private WebElement view;
	
	public void clickOnView() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",view);
		waitForSomeTime();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(view));
		Assert.assertTrue(view.isDisplayed());
		HighlightOnElement(view);
		Assert.assertTrue(view.isEnabled());
		view.click();
		waitForSomeTime();
		waitForSomeTime();
	}

}
