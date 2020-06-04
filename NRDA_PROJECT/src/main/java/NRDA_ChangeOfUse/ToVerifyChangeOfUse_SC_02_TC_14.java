package NRDA_ChangeOfUse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_02_TC_14 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "next".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Next')])[4]")
	private WebElement next;
	
	@FindBy(xpath="//a[contains(text(),'Upload Document')]")
	private WebElement uploaddocument;
	
	public void clickOnNextButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(next));
		Assert.assertTrue(next.isDisplayed());
		HighlightOnElement(next);
		Assert.assertTrue(next.isEnabled());
		next.click();
		waitForSomeTime();
		waitForSomeTime();
		
		if(!uploaddocument.isDisplayed())
		{
			Reporter.log("Test case fail");
		}
		else
		{
			Assert.assertTrue(uploaddocument.isDisplayed(),"Test case pass");
			HighlightOnElement(uploaddocument);
		}
	}


}
