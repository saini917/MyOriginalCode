package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC019 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,500);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Close')])[1]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException{
		close(close);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "yes".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[2]")
	private WebElement yes;
	
	public void clickOnYes() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(yes));
		Assert.assertTrue(yes.isDisplayed());
		HighlightOnElement(yes);
		Assert.assertTrue(yes.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(yes));
		for(int index=0;index<=4;index++)
		{
			try{
				yes.click();
				break;
			}
			catch(ElementNotVisibleException e)
			{
				Reporter.log(e.getMessage());
			}
		}
		waitForPageLoad();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "No".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'No')]")
	private WebElement no;
	
	public void clickOnNo() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(no));
		Assert.assertTrue(no.isDisplayed());
		HighlightOnElement(no);
		Assert.assertTrue(no.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(no));
		for(int index=0;index<=4;index++)
		{
			try{
				no.click();
				break;
			}
			catch (ElementNotVisibleException  e) {
				Reporter.log(e.getMessage());
			}
		}
		waitForPageLoad();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
	}

}
