package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC026 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "next".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Next')])[3]")
	private WebElement next;
	
	public void clickOnBankDetailNext() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(next));
		Assert.assertTrue(next.isDisplayed());
		HighlightOnElement(next);
		Assert.assertTrue(next.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(next));
		next.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}

}
