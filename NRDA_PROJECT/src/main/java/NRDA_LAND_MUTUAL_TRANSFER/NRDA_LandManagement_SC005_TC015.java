package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC015 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	@FindBy(xpath="(//li/descendant::a[contains(text(),'Land Details')])[1]")
	private WebElement landdetails;
	
	public void clickOnLandDetails(){
		wait.until(ExpectedConditions.visibilityOf(landdetails));
		Assert.assertTrue(landdetails.isDisplayed());
		HighlightOnElement(landdetails);
		Assert.assertTrue(landdetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landdetails));
		landdetails.click();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land view details".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'View')][1]")
	private WebElement view;

	public void clickOnView() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",view);
		
		wait.until(ExpectedConditions.visibilityOf(view));
		Assert.assertTrue(view.isDisplayed());
		HighlightOnElement(view);
		Assert.assertTrue(view.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(view));
		view.click();
		waitForPageLoad();
		waitForDomElement();
	}

}
