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

public class NRDA_BOD_SC_01_TC_27 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "forward to section".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a[contains(text(),'Forward to Section')]")
	private WebElement forwardtosection;
	
	public void clickOnForwardToSectionTab()
	{
		wait.until(ExpectedConditions.visibilityOf(forwardtosection));
		Assert.assertTrue(forwardtosection.isDisplayed());
		HighlightOnElement(forwardtosection);
		forwardtosection.click();
		Reporter.log("click on Forward to section",true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify link".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private WebElement verifylink;
	
	public void verifyDisplayLink()
	{
		wait.until(ExpectedConditions.visibilityOf(verifylink));
		Assert.assertTrue(verifylink.isDisplayed());
		HighlightOnElement(verifylink);
		Reporter.log("system will display the following: \n section name drop down box",true);
	}
	

}
