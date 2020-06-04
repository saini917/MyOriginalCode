package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_02_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "element".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/center/table/tbody/tr/td/span/div/div/span")
	private WebElement clickonplumbertype;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "element".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> element;

	/**
	 * @throws InterruptedException **************************************************************************************************/

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
			if(value.equalsIgnoreCase("REGISTRATION"))
			{
				element.get(i).click();
				Reporter.log(value,true);
				Reporter.log("Select 'Registeration'",true);
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
	 * This is the xpath of the WebElement "Display Element".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/ul/li/a")
	private List<WebElement> displaylink;

	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span)[2]/button/span")
	private List<WebElement> displaylink1;

	public void verifyDisplayLink() throws InterruptedException
	{
		Reporter.log("User should be able to view 3 Tabs with different fields i.e ",true);
		for(WebElement list:displaylink)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
			//waitForSomeTime();
		}

		for(WebElement list1:displaylink1)
		{
			HighlightOnElement(list1);
			Assert.assertNotNull(list1.isDisplayed());
			//Reporter.log(list1.getText(),true);
			//waitForSomeTime();
		}
		Reporter.log("Along with 'Save as Draft' , 'Reset', 'Close', 'Next' , 'Back' button",true);
	}

}
