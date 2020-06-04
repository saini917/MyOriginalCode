package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC020_TC056 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "download khasra pdf".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Download Khasra Pdf')]")
	private WebElement downloadkhasrapdf;
	
	public void clickOnDownloadKhasraPdf() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(downloadkhasrapdf));
		Assert.assertTrue(downloadkhasrapdf.isDisplayed());
		HighlightOnElement(downloadkhasrapdf);
		Assert.assertTrue(downloadkhasrapdf.isEnabled());
		downloadkhasrapdf.click();
		waitForSomeTime();
		waitForSomeTime();
	}


}
