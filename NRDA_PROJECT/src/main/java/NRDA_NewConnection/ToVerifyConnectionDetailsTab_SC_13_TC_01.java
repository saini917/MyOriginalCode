package NRDA_NewConnection;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_13_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "My Account".
	 * @author deepak saini
	 * @since 2018-01-09
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/span/div/div/div/ul/li/a[contains(text(),'My Account/मेरा खाता')]")
	private WebElement myaccount;
	
	public void clickOnMyAccount() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(myaccount));
		wait.until(ExpectedConditions.elementToBeClickable(myaccount));
		Assert.assertTrue(myaccount.isDisplayed());
		HighlightOnElement(myaccount);
		Assert.assertTrue(myaccount.isEnabled());
		myaccount.click();
		Reporter.log("Click on 'My Account' link shown in Citizen Dashboard",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr/td[2]/center/span")
	private WebElement consumerid;
	
	public void getConsumerId() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(consumerid));
		wait.until(ExpectedConditions.elementToBeClickable(consumerid));
		Assert.assertTrue(consumerid.isDisplayed());
		HighlightOnElement(consumerid);
		String consumer=consumerid.getText();
		Reporter.log("Consumer ID: "+consumer,true);
		excel.updateConsumerId(consumer);
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/thead/tr/th/span")
	private List<WebElement> displaylist;
	
	public void displayList() throws InterruptedException
	{
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
			waitForSomeTime();
		}
	}

}
