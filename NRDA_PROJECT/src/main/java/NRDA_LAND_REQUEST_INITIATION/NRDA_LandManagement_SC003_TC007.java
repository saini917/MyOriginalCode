package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC007 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "map".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'View Map')]")
	private WebElement map;
	
	public void clickOnViewMap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(map));
		Assert.assertTrue(map.isDisplayed());
		HighlightOnElement(map);
		Assert.assertTrue(map.isEnabled());
		map.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:propertyMapLand']/div/a/span")
	private WebElement closemap;
	
	public void closeMapPopUp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closemap));
		Assert.assertTrue(closemap.isDisplayed());
		HighlightOnElement(closemap);
		Assert.assertTrue(closemap.isEnabled());
		closemap.click();
		waitForSomeTime();
	}

}
