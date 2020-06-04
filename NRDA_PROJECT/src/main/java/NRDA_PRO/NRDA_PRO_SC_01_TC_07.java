package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-05-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify publication start date Error message".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Mandatory Field : Publication Start Date')]")
	private WebElement msg;
	
	public void verifyErrorMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(msg));
		wait.until(ExpectedConditions.elementToBeClickable(msg));
		Assert.assertTrue(msg.isDisplayed());
		HighlightOnElement(msg);
		String actual="Mandatory Field : Publication Start Date";
		String expected=msg.getText();
		Assert.assertEquals(actual,expected,"Test case pass");
		Reporter.log("Error Message:" +expected,true);
	}

}
