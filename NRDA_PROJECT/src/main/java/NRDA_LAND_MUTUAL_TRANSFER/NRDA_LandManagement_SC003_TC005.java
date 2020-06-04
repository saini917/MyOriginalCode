package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC005 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application inputbox".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appinputbox;
	
	public void verifyApplicationInputBox() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(appinputbox));
		HighlightOnElement(appinputbox);
		Assert.assertTrue(appinputbox.isDisplayed());
	}

}
