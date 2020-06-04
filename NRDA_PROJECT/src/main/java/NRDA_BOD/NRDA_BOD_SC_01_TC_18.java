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

public class NRDA_BOD_SC_01_TC_18 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "back button".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Back')])[2]")
	private WebElement back;
	
	public void clickOnBackBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(back));
		Assert.assertTrue(back.isDisplayed());
		HighlightOnElement(back);
		Assert.assertTrue(back.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current Url:"+currenturl,true);
		
		back.click();
		waitForSomeTime();
		
		String previousurl=driver.getCurrentUrl();
		Reporter.log("Redirect Page Url:"+previousurl,true);
		
		Assert.assertEquals(currenturl,previousurl);
		Reporter.log("On Clicking on Back Button Meeting Notice Tab should be open",true);
	}
}
