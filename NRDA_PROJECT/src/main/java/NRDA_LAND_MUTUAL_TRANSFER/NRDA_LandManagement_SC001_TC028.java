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

public class NRDA_LandManagement_SC001_TC028 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "residence".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Residence of')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement residence;
	
	public void enterResidenceOf() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(residence));
		Assert.assertTrue(residence.isDisplayed());
		HighlightOnElement(residence);
		Assert.assertTrue(residence.isEnabled());
		excel.getExcelData(residence,"Land Data",1,43);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "tehsil".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Tehsil')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='Tehsil']")
	private WebElement tehsil;
	
	public void enterTehsil() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(tehsil));
		Assert.assertTrue(tehsil.isDisplayed());
		HighlightOnElement(tehsil);
		Assert.assertTrue(tehsil.isEnabled());
		excel.getExcelData(tehsil,"Land Data",1,45);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "district".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'District')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input)[2]")
	private WebElement district;
	
	public void enterDistrict() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(district));
		Assert.assertTrue(district.isDisplayed());
		HighlightOnElement(district);
		Assert.assertTrue(district.isEnabled());
		excel.getExcelData(district,"Land Data",1,44);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "ownership radio button".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'ownership')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/div")
	private WebElement radio;
	
	public void clickOnOwnership() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(radio));
		Assert.assertTrue(radio.isDisplayed());
		HighlightOnElement(radio);
		Assert.assertTrue(radio.isEnabled());
		radio.click();
		waitForDomElement();
	}

}
