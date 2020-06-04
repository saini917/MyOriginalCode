package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC021 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land update details".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//button/span[contains(text(),'Update')])[2]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException{	
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(update));
		update.click();
		waitForPageLoad();
		waitForDomElement();
	}

}
