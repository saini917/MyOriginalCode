package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC019 extends CommonLibrary
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
	private WebElement add;
	
	public void clickOnAdd() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",add);
		waitForSomeTime();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(add));
		Assert.assertTrue(add.isDisplayed());
		HighlightOnElement(add);
		Assert.assertTrue(add.isEnabled());
		add.click();
		waitForSomeTime();
	}
	
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

}
