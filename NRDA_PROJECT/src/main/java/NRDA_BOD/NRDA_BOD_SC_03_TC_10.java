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

public class NRDA_BOD_SC_03_TC_10 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Add Agenda')])[2]")
	private WebElement addagenda1;
	
	public void clickOnAddAgenda1()
	{
		wait.until(ExpectedConditions.visibilityOf(addagenda1));
		wait.until(ExpectedConditions.elementToBeClickable(addagenda1));
		Assert.assertTrue(addagenda1.isDisplayed());
		HighlightOnElement(addagenda1);
		Assert.assertTrue(addagenda1.isEnabled());
		addagenda1.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-04-04
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
