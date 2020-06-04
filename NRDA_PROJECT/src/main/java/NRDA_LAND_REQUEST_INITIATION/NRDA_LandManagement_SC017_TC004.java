package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC017_TC004 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land request initiation process".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'LAND REQUEST INITIATION PROCESS')]")
	private WebElement landreq;
	
	public void clickOnLandRequestInitiation() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(landreq));
		HighlightOnElement(landreq);
		Assert.assertTrue(landreq.isDisplayed());
		Assert.assertTrue(landreq.isEnabled());
		landreq.click();
		waitForSomeTime();
		waitForSomeTime();
	}


}
