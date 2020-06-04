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

public class NRDA_LandManagement_SC001_TC021 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "district".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'District')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select[@title='District']")
	private WebElement district;
	
	public void selectDistrict() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(district));
		Assert.assertTrue(district.isDisplayed());
		HighlightOnElement(district);
		Assert.assertTrue(district.isEnabled());
		SelectVisibleText(district,"RAIPUR");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "tehsil".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Tehsil')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select[@title='Tehsil']")
	private WebElement tehsil;
	
	public void selectTehsil() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(tehsil));
		Assert.assertTrue(tehsil.isDisplayed());
		HighlightOnElement(tehsil);
		Assert.assertTrue(tehsil.isEnabled());
		SelectVisibleText(tehsil,"ARANG");
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "village".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Village')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select[@title='Village']")
	private WebElement village;
	
	public void selectVillage() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(village));
		Assert.assertTrue(village.isDisplayed());
		HighlightOnElement(village);
		Assert.assertTrue(village.isEnabled());
		SelectVisibleText(village,"KUHERA");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "house number".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'House Number')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement housenum;
	
	public void enterHouseNum() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(housenum));
		Assert.assertTrue(housenum.isDisplayed());
		HighlightOnElement(housenum);
		Assert.assertTrue(housenum.isEnabled());
		excel.getExcelData(housenum,"Land Data",1,38);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "post office".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Post Office')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='Post Office']")
	private WebElement postoffice;
	
	public void enterPostOffice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(postoffice));
		Assert.assertTrue(postoffice.isDisplayed());
		HighlightOnElement(postoffice);
		Assert.assertTrue(postoffice.isEnabled());
		excel.getExcelData(postoffice,"Land Data",1,39);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "pin code".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Pin Code')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement pincode;
	
	public void enterPindCode() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(pincode));
		Assert.assertTrue(pincode.isDisplayed());
		HighlightOnElement(pincode);
		Assert.assertTrue(pincode.isEnabled());
		excel.getExcelData(pincode,"Land Data",1,40);
	}

}
