package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC004 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land mutual transfer".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'APPLICATION FOR LAND MUTUAL TRANSFER')]")
	private WebElement landmutualtransfer;
	
	public void clickOnLandMutualTransfer() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landmutualtransfer));
		Assert.assertTrue(landmutualtransfer.isDisplayed());
		HighlightOnElement(landmutualtransfer);
		Assert.assertTrue(landmutualtransfer.isEnabled());
		landmutualtransfer.click();
		waitForPageLoad();
		waitForDomElement();
	}
	

}
