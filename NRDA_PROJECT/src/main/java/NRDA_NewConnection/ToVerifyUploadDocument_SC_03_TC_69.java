package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyUploadDocument_SC_03_TC_69 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Delete".
	 * @author deepak.saini
	 * @since 2018-04-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Delete')])[11]")
	private WebElement delete;
	
	public void clickOnDelete() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(delete));
		Assert.assertTrue(delete.isDisplayed());
		HighlightOnElement(delete);
		Assert.assertTrue(delete.isEnabled());
		delete.click();
		waitForSomeTime();
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "error message".
	 * @author deepak.saini
	 * @since 2018-04-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Record has been deleted')]")
	private WebElement errormsg;
	
	public void getErrorMsg()
	{
		String actual="Record has been deleted";
		wait.until(ExpectedConditions.visibilityOf(errormsg));
		Assert.assertTrue(errormsg.isDisplayed());
		HighlightOnElement(errormsg);
		String expected=errormsg.getText();
		Assert.assertEquals(actual,expected,"Test case pass");
		Reporter.log("Error Message: "+expected,true);
	}

}
