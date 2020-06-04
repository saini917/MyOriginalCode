package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC017_TC027 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land details".
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
	
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[2]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		waitForSomeTime();
	}

}
