package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_02_TC_21 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Back".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[3]/center/table/tbody/tr/td/span/button/span[contains(text(),'Back')]")
	private WebElement back;

	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> educationdetails;

	public void clickOnBackBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(back));
		wait.until(ExpectedConditions.elementToBeClickable(back));
		Assert.assertTrue(back.isDisplayed());
		HighlightOnElement(back);
		Assert.assertTrue(back.isEnabled());
		back.click();
		Reporter.log("Click on back button",true);
		waitForSomeTime();
	}
	public void verifyPreviousTab()
	{
		Reporter.log("User should be able to move to previous tab",true);
		Reporter.log("1. User should be able to view following fields i.e",true);
		for(WebElement list:educationdetails)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
	}

}
