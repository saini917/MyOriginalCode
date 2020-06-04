package NRDA_LAND_MUTUAL_TRANSFER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC007_TC031 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "download letter".
	 * @author deepak.saini
	 * @since 2018-06-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//li/descendant::a[contains(text(),'Download Letters')]")
	private WebElement downlaodletter;
	
	public void clickOnDownloadLetter() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(downlaodletter));
		HighlightOnElement(downlaodletter);
		Assert.assertTrue(downlaodletter.isDisplayed());
		Assert.assertTrue(downlaodletter.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(downlaodletter));
		downlaodletter.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify mutual letter".
	 * @author deepak.saini
	 * @since 2018-06-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/descendant::span[contains(text(),'Mutual Letter')]")
	private WebElement display;
	
	public void verifyMutualLetter(){
		wait.until(ExpectedConditions.visibilityOf(display));
		Assert.assertTrue(display.isDisplayed());
		HighlightOnElement(display);
	}

}
