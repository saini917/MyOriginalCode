package NRDA_LAND_DIVERSION_SECTION;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC007_TC032 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land diversion request".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'LAND DIVERSION REQUEST')]")
	private WebElement diversionreq;
	
	public void clickOnLandDiversionRequest() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(diversionreq));
		HighlightOnElement(diversionreq);
		Assert.assertTrue(diversionreq.isDisplayed());
		Assert.assertTrue(diversionreq.isEnabled());
		diversionreq.click();
		waitForSomeTime();
	}

}
