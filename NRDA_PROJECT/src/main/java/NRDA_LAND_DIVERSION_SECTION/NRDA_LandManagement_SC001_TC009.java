package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC009 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "view map".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/descendant::span[contains(text(),'View Map')]")
	private WebElement viewmap;
	
	public void clickOnViewMap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(viewmap));
		Assert.assertTrue(viewmap.isDisplayed());
		HighlightOnElement(viewmap);
		Assert.assertTrue(viewmap.isEnabled());
		viewmap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		switchToFrame(frame);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify map".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div/iframe[@id='gisFrameTarget'])[2]")
	private WebElement frame;
	
	public void switchToMap()
	{
		driver.switchTo().frame(frame);
	}
	
	
		/****************************************************************************************************/
		/*
		 * This is the xpath of the WebElement "close map".
		 * @author deepak.saini
		 * @since 2018-05-25
		 */
		/****************************************************************************************************/
		
		@FindBy(xpath="(//span[contains(text(),'PROPERTY MAP')])[2]/following-sibling::a/span")
		private WebElement closemap;
		
		public void closeMapPopUp() throws InterruptedException
		{
			switchFrameToMainWindow();
			wait.until(ExpectedConditions.visibilityOf(closemap));
			Assert.assertTrue(closemap.isDisplayed());
			HighlightOnElement(closemap);
			Assert.assertTrue(closemap.isEnabled());
			closemap.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
		}

}
