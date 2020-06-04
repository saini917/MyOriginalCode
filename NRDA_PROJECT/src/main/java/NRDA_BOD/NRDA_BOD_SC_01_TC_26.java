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

public class NRDA_BOD_SC_01_TC_26 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "next button".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Next')])[3]")
	private WebElement next;
	
	
	public void clickOnNextBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(next));
		wait.until(ExpectedConditions.elementToBeClickable(next));
		Assert.assertTrue(next.isDisplayed());
		HighlightOnElement(next);
		Assert.assertTrue(next.isEnabled());
		next.click();
		Reporter.log("click on Next button",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "forward to section".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a[contains(text(),'Forward to Section')]")
	private WebElement forwardtosection;
	
	public void verifyForwardToSectionTab()
	{
		wait.until(ExpectedConditions.visibilityOf(forwardtosection));
		Assert.assertTrue(forwardtosection.isDisplayed());
		HighlightOnElement(forwardtosection);
	}

}
