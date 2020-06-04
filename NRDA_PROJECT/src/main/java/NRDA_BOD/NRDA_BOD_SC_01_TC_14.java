package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_14 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Next".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Next')])[1]")
	private WebElement next;
	
	public void clickOnNext() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(next));
		wait.until(ExpectedConditions.elementToBeClickable(next));
		Assert.assertTrue(next.isDisplayed());
		HighlightOnElement(next);
		Assert.assertTrue(next.isEnabled());
		next.click();
		Reporter.log("Click on Next Button",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CHAIRMAN Detials".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Chairperson Details')]")
	private WebElement chairperson;
	
	public void verifyChairpersonDetailsTab()
	{
		wait.until(ExpectedConditions.visibilityOf(chairperson));
		wait.until(ExpectedConditions.elementToBeClickable(chairperson));
		Assert.assertTrue(chairperson.isDisplayed());
		HighlightOnElement(chairperson);
		Assert.assertTrue(chairperson.isEnabled());
	}

}
