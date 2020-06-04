package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC012 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "view map".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/descendant::span[contains(text(),'View Map')]")
	private WebElement viewmap;

	@FindBy(xpath="//div/iframe[@id='gisFrameTarget']")
	private WebElement frame;

	public void clickOnViewMap() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(viewmap));
		Assert.assertTrue(viewmap.isDisplayed());
		HighlightOnElement(viewmap);
		Assert.assertTrue(viewmap.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(viewmap));
		viewmap.click();
		waitForPageLoad();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		switchToFrame(frame);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/

	@FindBy(xpath="(//span[contains(text(),'PROPERTY MAP')])[2]/following-sibling::a/span")
	private WebElement close;

	public void closeMapPopUp() throws InterruptedException{
		switchFrameToMainWindow();
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(close));
		for(int i=0;i<=4;i++)
		{
			try{
				close.click();
				break;
			}
			catch (Exception e) {
				Reporter.log(e.getMessage());
			}
		}
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();

	}
}
