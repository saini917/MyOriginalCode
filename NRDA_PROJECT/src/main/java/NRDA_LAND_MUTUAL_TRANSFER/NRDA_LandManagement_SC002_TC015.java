package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC015 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Land Details')]")
	private WebElement landdetails;

	public void verifyLandDetails() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(landdetails));
		Assert.assertTrue(landdetails.isDisplayed());
		HighlightOnElement(landdetails);
		Assert.assertTrue(landdetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landdetails));
		landdetails.click();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "survey".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Survey')]")
	private WebElement survey;

	public void clickOnSurvey(){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",survey);
		waitForDomElement();

		wait.until(ExpectedConditions.visibilityOf(survey));
		Assert.assertTrue(survey.isDisplayed());
		HighlightOnElement(survey);
		Assert.assertTrue(survey.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(survey));
		for(int i=0;i<=4;i++)
		{
			try{
				survey.click();
				break;
			}
			catch (Exception e) {
				Reporter.log(e.getMessage());
			}
		}
		
		pageLoadTimeOut();
		waitForDomElement();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "price schedule".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Price Schedule')]")
	private WebElement priceschedule;

	public void verifyPriceSchedule() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(priceschedule));
		Assert.assertTrue(priceschedule.isDisplayed());
		HighlightOnElement(priceschedule);
		Assert.assertTrue(priceschedule.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(priceschedule));
		priceschedule.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/

	@FindBy(xpath="(//button/span[contains(text(),'Close')])[8]")
	private WebElement close;

	public void clickOnClose() throws EncryptedDocumentException, IOException, InterruptedException{
		close(close);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "yes".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Yes')])[3]")
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
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'No')])[2]")
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
