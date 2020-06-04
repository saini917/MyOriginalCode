package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC006_TC004 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land mutual transfer".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'APPLICATION FOR LAND MUTUAL TRANSFER')]")
	private WebElement landtransfer;
	
	public void clickOnLandMutualTrnasfer() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landtransfer));
		Assert.assertTrue(landtransfer.isDisplayed());
		HighlightOnElement(landtransfer);
		Assert.assertTrue(landtransfer.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landtransfer));
		landtransfer.click();
		waitForPageLoad();
		waitForDomElement();
	}
}
