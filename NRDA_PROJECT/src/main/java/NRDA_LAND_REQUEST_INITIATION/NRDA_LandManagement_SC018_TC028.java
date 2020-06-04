package NRDA_LAND_REQUEST_INITIATION;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC028 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select case No".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	
	@FindBy(xpath="//label[contains(text(),'Case Registered')]/../following-sibling::td/div/div/span")
	private WebElement selectcaseno;
	
	public void selectCaseNo() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(selectcaseno));
		Assert.assertTrue(selectcaseno.isDisplayed());
		HighlightOnElement(selectcaseno);
		Assert.assertTrue(selectcaseno.isEnabled());
		selectcaseno.click();
		waitForSomeTime();
		selectValueFromDropdown("NO");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[7]")
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
