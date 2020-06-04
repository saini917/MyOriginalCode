package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC021 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,60);
	
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		submit(submit);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "reset".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Please Select minimum one record')]")
	private WebElement errormsg;
	
	public void getErrormMsg() throws InterruptedException
	{
		String actual="Please Select minimum one record";
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		Assert.assertTrue(errormsg.isDisplayed());
		HighlightOnElement(errormsg);
		Assert.assertTrue(errormsg.isEnabled());
		String expected=errormsg.getText();
		Assert.assertEquals(actual,expected,"Test case pass");
		Reporter.log("Error message:"+expected,true);
	}

}
