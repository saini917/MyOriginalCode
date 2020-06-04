package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC019 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land add details".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Add')]")
	private WebElement scrolladd;
	
	public void clickOnAdd() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",scrolladd);
		waitForSomeTime();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(scrolladd));
		Assert.assertTrue(scrolladd.isDisplayed());
		HighlightOnElement(scrolladd);
		Assert.assertTrue(scrolladd.isEnabled());
		scrolladd.click();
		waitForSomeTime();
	}
}
