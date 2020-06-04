package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC016 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "conversion land type".
	 * @author deepak.saini
	 * @since 2018-05-29
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//label[contains(text(),'Converted Land Type')]/div/div/span")
	private WebElement conversiontype;
	
	public void selectConversionLandType() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(conversiontype));
		Assert.assertTrue(conversiontype.isDisplayed());
		HighlightOnElement(conversiontype);
		Assert.assertTrue(conversiontype.isEnabled());
		conversiontype.click();
		waitForSomeTime();
		SelectVisibleText(conversiontype,"RESIDENTIAL");
	}
	
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[4]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException
	{
		close(close);
	}

}
