package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC014 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "open map".
	 * @author deepak.saini
	 * @since 2018-06-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div/iframe[@id='gisFrameTarget']")
	private WebElement frame;
	
	@FindBy(xpath="(//span[contains(text(),'Open Map')])[3]")
	private WebElement openmap;
	
	public void clickOnOpenMap() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(openmap));
		Assert.assertTrue(openmap.isDisplayed());
		HighlightOnElement(openmap);
		Assert.assertTrue(openmap.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(openmap));
		openmap.click();
		waitForPageLoad();
		waitForDomElement();
		waitForDomElement();
		switchToFrame(frame);
	}
	
	@FindBy(xpath="//div[@id='inboxForm:Dlg']/div/a/span")
	private WebElement close;
	
	public void closePopUp() throws InterruptedException{
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
			waitForDomElement();
		}
	}

}
