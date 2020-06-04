package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPlumberRegistration_SC_03_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "element".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "element".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> element;

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/center/table/tbody/tr/td/span/div/div/span")
	private WebElement clickonplumbertype;
	
	public void selectRegistrationType() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonplumbertype));
		wait.until(ExpectedConditions.elementToBeClickable(clickonplumbertype));
		Assert.assertTrue(clickonplumbertype.isDisplayed());
		HighlightOnElement(clickonplumbertype);
		Assert.assertTrue(clickonplumbertype.isEnabled());
		Actions act=new Actions(driver);
		act.click(clickonplumbertype).build().perform();
		Reporter.log("Click on Plumber Registeration Online form",true);

		for(int i=1;i<element.size();i++)
		{
			String value=element.get(i).getText();
			if(value.equalsIgnoreCase("RENEWAL"))
			{
				element.get(i).click();
				Reporter.log(value,true);
				Reporter.log("Select 'Renewal'",true);
			}
		}
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Proceed".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/center/table/tbody/tr/td/span/center/button/span[contains(text(),'Proceed')]")
	private WebElement proceed;

	public void clickOnProceed() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf( proceed));
		wait.until(ExpectedConditions.elementToBeClickable( proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
		Assert.assertTrue(proceed.isEnabled());
		proceed.click();
		Reporter.log("click on Proceed button",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on next".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:confirmDlg']/div/div/div/div/div/table/tbody/tr/td/button/span[contains(text(),'Proceed')]")
	private WebElement popupproceed;

	public void clickOnProceedBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(popupproceed));
		wait.until(ExpectedConditions.elementToBeClickable(popupproceed));
		Assert.assertTrue(popupproceed.isDisplayed());
		HighlightOnElement(popupproceed);
		Assert.assertTrue(popupproceed.isEnabled());
		popupproceed.click();
		waitForSomeTime();
	}
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/ul/li/a")
	private List<WebElement> displaylink;
	
	public void verifyDisplayList() throws InterruptedException
	{
		Reporter.log("User will tabs named as :-",true);
		for(WebElement list:displaylink)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
			waitForSomeTime();
		}
	}

}
