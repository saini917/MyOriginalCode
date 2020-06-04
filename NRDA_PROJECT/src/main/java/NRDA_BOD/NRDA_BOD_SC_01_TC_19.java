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

public class NRDA_BOD_SC_01_TC_19  extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close button".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[2]")
	private WebElement close;
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close button".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:confirmDlg']/div/div/div/center/table/tbody/tr/td/button/span[contains(text(),'Yes')]")
	private WebElement yes;
	
	public void clickOnCloseBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		wait.until(ExpectedConditions.elementToBeClickable(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		Reporter.log("Click on close button  pop-up is open.",true);
		waitForSomeTime();
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current Page URL:"+currenturl,true);
		
		wait.until(ExpectedConditions.visibilityOf(yes));
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		yes.click();
		
		waitForSomeTime();
		String previousurl=driver.getCurrentUrl();
		Reporter.log("Redirect Page URL:"+previousurl,true);
		
		Assert.assertNotEquals(currenturl,previousurl);
		Reporter.log("Click on 'Yes'.Home Page is Redirect",true);
	}
}
