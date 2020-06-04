package NRDA_Plumber;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPlumberRegistration_SC_02_TC_24 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Next button".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span/center/table/tbody/tr/td/span)[1]/button/span[contains(text(),'Next')]")
	private WebElement clickonnext;

	public void clickOnApplicantNext() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonnext));
		wait.until(ExpectedConditions.elementToBeClickable(clickonnext));
		Assert.assertTrue(clickonnext.isDisplayed());
		HighlightOnElement(clickonnext);
		Assert.assertTrue(clickonnext.isEnabled());
		clickonnext.click();
		Reporter.log("Click on Next button",true);
		waitForSomeTime();
	}

}
