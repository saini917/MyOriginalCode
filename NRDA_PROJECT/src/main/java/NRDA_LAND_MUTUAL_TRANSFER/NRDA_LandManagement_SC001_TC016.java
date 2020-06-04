package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC016 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save khasra geometry icon".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[2]")
	private WebElement save;
	
	public void clickOnSave() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "ok".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'ok')]")
	private WebElement ok;
	
	public void clickOnOk() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(ok));
		Assert.assertTrue(ok.isDisplayed());
		HighlightOnElement(ok);
		Assert.assertTrue(ok.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(ok));
		ok.click();
		waitForPageLoad();
		waitForDomElement();
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
