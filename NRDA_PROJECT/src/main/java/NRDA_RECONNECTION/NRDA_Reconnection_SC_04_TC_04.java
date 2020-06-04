package NRDA_RECONNECTION;

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

public class NRDA_Reconnection_SC_04_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	@FindBy(xpath="(//center)[2]/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement actionclick;
	
	public void clickOnSelectAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionclick));
		HighlightOnElement(actionclick);
		Assert.assertTrue(actionclick.isDisplayed());
		Assert.assertTrue(actionclick.isEnabled());
		actionclick.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action forward".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> action;
	
	public void selectActionForward() throws InterruptedException
	{
		selectValueFromDropdown("Forward");
		waitForSomeTime();
	}
	
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
	 * This is the xpath of the WebElement "select user".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	public void selectUser() throws InterruptedException
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
			if(value.equalsIgnoreCase("Shivendra Nath (SE)"))
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
