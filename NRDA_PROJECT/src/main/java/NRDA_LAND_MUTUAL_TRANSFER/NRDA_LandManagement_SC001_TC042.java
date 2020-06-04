package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC042 extends CommonLibrary{
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

	@FindBy(xpath="//span[contains(text(),'Land Survey')]/following-sibling::a/span")
	private WebElement closepopup;

	public void closePopUp(){
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		Assert.assertTrue(closepopup.isDisplayed());
		HighlightOnElement(closepopup);
		Assert.assertTrue(closepopup.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		for(int i=0;i<=4;i++)
		{
			try{
				closepopup.click();
				break;
			}
			catch (Exception e) {
				Reporter.log(e.getMessage());
			}
			waitForDomElement();
		}
	}

}
