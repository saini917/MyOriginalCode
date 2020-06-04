package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC043 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);


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
	 * This is the xpath of the WebElement "total sum".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Total Sum')]/ancestor::td/following-sibling::td/input")
	private WebElement totalsum;
	
	public void verifyTotalAmount(){
		//for non-editable field
		wait.until(ExpectedConditions.visibilityOf(totalsum));
		Assert.assertTrue(totalsum.isDisplayed());
		HighlightOnElement(totalsum);
		String readonly=totalsum.getAttribute("readonly");
		Assert.assertNotNull(readonly);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter remarks".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Enter Remarks')]/ancestor::td/following-sibling::td/textarea")
	private WebElement remarks;
	
	public void enterRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		remarks.clear();
		excel.getExcelData(remarks,"Land Data",1,46);
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
