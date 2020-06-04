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

public class NRDA_BOD_SC_01_TC_21 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "next button".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Next')])[2]")
	private WebElement next;
	
	public void clickOnNextBtn() throws InterruptedException
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
	 * This is the xpath of the WebElement "meeting schedule".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a[contains(text(),'Meeting Schedule')]")
	private WebElement meetingschedule;
	
	public void verifyMeetingScheduleTab()
	{
		wait.until(ExpectedConditions.visibilityOf(meetingschedule));
		Assert.assertTrue(meetingschedule.isDisplayed());
		HighlightOnElement(meetingschedule);
	}

}
