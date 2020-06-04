package NRDA_NewConnection;

import java.util.List;

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

public class ToVerifyConnectionDetailsTab_SC_08_TC_13 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on dropdown".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement clickonselectactiondrop;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select value".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	public void selectUserBlankComment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		waitForSomeTime();
		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("priyanshu kodape (SUE)"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Submit".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/center/button/span[contains(text(),'Submit')]")
	private WebElement submit;

	public void clickOnSubmit() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Reporter.log("click on Submit button succesfully",true);
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Error message".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Comments is required !')]")
	private WebElement errormessage1;
	
	public void getErrorMsg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(errormessage1));
		HighlightOnElement(errormessage1);
		String expected=errormessage1.getText();
		String actual="Comments is required !";
		Assert.assertEquals(actual, expected);
		Reporter.log("Error Message:"+expected,true);
		waitForSomeTime();
	}
}
