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

public class NRDA_BOD_SC_09_TC_12 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Attendance".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Add Attendee')])[1]")
	private WebElement addattendence;
	
	public void clickOnAddAttendance() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addattendence));
		wait.until(ExpectedConditions.elementToBeClickable(addattendence));
		Assert.assertTrue(addattendence.isDisplayed());
		HighlightOnElement(addattendence);
		Assert.assertTrue(addattendence.isEnabled());
		addattendence.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Data saved successfully!')]")
	private WebElement message;
	public void verifyMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);
		
		String actualMessage="Data saved successfully!";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Successful Message:"+expectedMesage,true);
		waitForSomeTime();
	}


}
