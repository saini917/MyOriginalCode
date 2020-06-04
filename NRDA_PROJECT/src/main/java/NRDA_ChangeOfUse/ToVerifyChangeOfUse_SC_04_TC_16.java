package NRDA_ChangeOfUse;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_04_TC_16 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save as draft".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Save as draft')]")
	private WebElement saveasdraft;
	
	public void clickOnSaveAsDraft() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		wait.until(ExpectedConditions.visibilityOf(saveasdraft));
		Assert.assertTrue(saveasdraft.isDisplayed());
		HighlightOnElement(saveasdraft);
		Assert.assertTrue(saveasdraft.isEnabled());
		saveasdraft.click();
		waitForSomeTime();
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'Drafted note save successfully !')]")
	private WebElement msg;

	public void verifyMsg() throws InterruptedException
	{
		String actual="Drafted note save successfully !";
		wait.until(ExpectedConditions.elementToBeClickable(msg));
		HighlightOnElement(msg);
		Assert.assertTrue(msg.isDisplayed());
		Assert.assertTrue(msg.isEnabled());
		String expected=msg.getText();
		Reporter.log("Error Message :"+expected,true);
		Assert.assertEquals(actual,expected,"Test case pass");
		HighlightOnElement(msg);
	}
}
