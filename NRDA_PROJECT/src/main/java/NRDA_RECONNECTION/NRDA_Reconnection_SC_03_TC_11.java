package NRDA_RECONNECTION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_Reconnection_SC_03_TC_11 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remove draft".
	 * @author deepak saini
	 * @since 2017-05-03
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/center/button/span[contains(text(),'Remove draft')]")
	private WebElement removedraft;

	public void clickOnRemoveDraft() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(removedraft));
		wait.until(ExpectedConditions.elementToBeClickable(removedraft));
		removedraft.click();
		Reporter.log("click on Remove draft button succesfully",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Drafted note deleted successfully !')]")
	private WebElement successfulMsg;

	public void verifyMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(successfulMsg));
		HighlightOnElement(successfulMsg);
		String Actual="Drafted note deleted successfully !";
		String Expected=successfulMsg.getText();
		Assert.assertEquals(Actual,Expected,"Matched");
		Reporter.log("Successful message:"+Expected,true);
	}


}
