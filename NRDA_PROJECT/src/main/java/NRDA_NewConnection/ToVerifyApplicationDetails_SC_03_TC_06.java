package NRDA_NewConnection;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyApplicationDetails_SC_03_TC_06 extends CommonLibrary
{
	WebDriverWait wait = new WebDriverWait(driver,50);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "BUILDING DETAILS NEXT".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/span/center/table/tbody/tr/td/span/button/span[contains(text(),'Next')])[2]")
	private WebElement nextbtn;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CONNECTION DETAILS NEXT".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/span/center/table/tbody/tr/td/span/button/span[contains(text(),'Next')])[3]")
	private WebElement nextbtnn;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "SUBMIT".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/span/center/table/tbody/tr/td/span/button/span[contains(text(),'Submit')]")
	private WebElement submitbtn;

	public void clickOnBuildingDetailsNextButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(nextbtn));
		Assert.assertTrue(nextbtn.isEnabled());
		HighlightOnElement(nextbtn);
		nextbtn.click();
		waitForSomeTime();
	}
	
	public void clickOnConnectionDetailsNextButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(nextbtnn));
		Assert.assertTrue(nextbtnn.isEnabled());
		HighlightOnElement(nextbtnn);
		nextbtnn.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	public void clickOnSubmitButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(submitbtn));
		Assert.assertTrue(submitbtn.isEnabled());
		HighlightOnElement(submitbtn);
		submitbtn.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@class='ui-growl-message']/span")
	private List<WebElement> errormeg;
	
	public void getErrorMsg() throws InterruptedException
	{
		for(WebElement error:errormeg)
		{
			HighlightOnElement(error);
			Assert.assertTrue(error.isDisplayed());
			waitForSomeTime();
		}
	}
}
