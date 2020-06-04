package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC035 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land section".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Land Section')]/preceding-sibling::span")
	private WebElement landsection;
	
	public void clickOnLandSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landsection));
		Assert.assertTrue(landsection.isDisplayed());
		HighlightOnElement(landsection);
		Assert.assertTrue(landsection.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landsection));
		landsection.click();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "APPLICATION FOR LAND MUTUAL TRANSFER".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'APPLICATION FOR LAND MUTUAL TRANSFER')]")
	private WebElement landtransfer;
	
	public void clickOnLandMutualTransfer() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landtransfer));
		Assert.assertTrue(landtransfer.isDisplayed());
		HighlightOnElement(landtransfer);
		Assert.assertTrue(landtransfer.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landtransfer));
		landtransfer.click();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application number".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement applicationsarchbox;
	
	public void enterApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(applicationsarchbox));
		Assert.assertTrue(applicationsarchbox.isDisplayed());
		HighlightOnElement(applicationsarchbox);
		Assert.assertTrue(applicationsarchbox.isEnabled());
		excel.getExcelData(applicationsarchbox,"Land_Mutual_Transfer_AppNum",0,1);
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action image".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-datatable-tablewrapper']/table/tbody/tr/td/center/a/img")
	private WebElement action;
	
	public void clickOnAction() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(action));
		action.click();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Note Sheet".
	 * @author deepak.saini
	 * @since 2018-05-31
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Note Sheet')]")
	private WebElement notesheet;
	
	public void verifyNoteSheet() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(notesheet));
		Assert.assertTrue(notesheet.isDisplayed());
		HighlightOnElement(notesheet);
	}

}
