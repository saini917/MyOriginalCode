package NRDA_NewConnection;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyApplicationDetails_SC_03_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Aadhar number in text box".
	 * @author deepak.saini
	 * @since 2017-08-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Aadhar Number')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement aadhar_number;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicant photo".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Applicant Photo')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/div/div/label/input")
	private WebElement applicant_photo;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Middle name".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Middle Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement middle_name;
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Mother name".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Mother Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement mother_name;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name(Organization/Trust/Society)".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name (Organization/Society/Trust')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement orgainzation;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "PAN".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'PAN')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement pan;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "GSTIN".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'GSTIN')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement gstin;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CIN".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'CIN')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement cin;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "registered office address".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office Address')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement reg_office_address;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "registered office phone".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office Phone')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement reg_office_phone;
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "registered office state".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office State')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement reg_office_state;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "registered office state".
	 * @author deepak.saini
	 * @since 2017-01-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office District')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement reg_office_dist;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "NEXT".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-tabs-panels']/div/span/center/table/tbody/tr/td/span/button/span[contains(text(),'Next')])[1]")
	private WebElement nextbtn;

	public void verifyApplicantValidData() throws InterruptedException, AWTException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		try
		{
			wait.until(ExpectedConditions.visibilityOf(aadhar_number));
			Assert.assertTrue(aadhar_number.isDisplayed());
			HighlightOnElement(aadhar_number);
			//aadhar_number.sendKeys(Keys.CONTROL+ "a");
			//aadhar_number.sendKeys(Keys.DELETE);
			excel.getExcelData(aadhar_number, "Applicant Details",2,3);//fetch aadhar number

			Assert.assertTrue(applicant_photo.isEnabled());
			HighlightOnElement(applicant_photo);
			applicant_photo.click();//click on applicant photo icon
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			Assert.assertTrue(middle_name.isEnabled());
			Assert.assertTrue(middle_name.isDisplayed());
			HighlightOnElement(middle_name);
			middle_name.sendKeys(Keys.CONTROL+ "a");
			middle_name.sendKeys(Keys.DELETE);
			excel.getExcelData(middle_name, "Applicant Details",1,8);
			
			Assert.assertTrue(mother_name.isEnabled());
			Assert.assertTrue(mother_name.isDisplayed());
			HighlightOnElement(mother_name);
			mother_name.sendKeys(Keys.CONTROL+ "a");
			mother_name.sendKeys(Keys.DELETE);
			excel.getExcelData(mother_name, "Applicant Details",1,15);
			
			/*wait.until(ExpectedConditions.visibilityOf(orgainzation));
			Assert.assertTrue(orgainzation.isDisplayed());
			HighlightOnElement(orgainzation);
			Assert.assertTrue(orgainzation.isEnabled());
			excel.getExcelData(orgainzation,"Applicant Details",1,9);
			
			wait.until(ExpectedConditions.visibilityOf(pan));
			Assert.assertTrue(pan.isDisplayed());
			HighlightOnElement(pan);
			Assert.assertTrue(pan.isEnabled());
			excel.getExcelData(pan,"Applicant Details",1,10);
			
			wait.until(ExpectedConditions.visibilityOf(gstin));
			Assert.assertTrue(gstin.isDisplayed());
			HighlightOnElement(gstin);
			Assert.assertTrue(gstin.isEnabled());
			excel.getExcelData(gstin,"Applicant Details",1,11);
			
			wait.until(ExpectedConditions.visibilityOf(cin));
			Assert.assertTrue(cin.isDisplayed());
			HighlightOnElement(cin);
			Assert.assertTrue(cin.isEnabled());
			excel.getExcelData(cin,"Applicant Details",1,12);
			
			wait.until(ExpectedConditions.visibilityOf(reg_office_address));
			Assert.assertTrue(reg_office_address.isDisplayed());
			HighlightOnElement(reg_office_address);
			Assert.assertTrue(reg_office_address.isEnabled());
			excel.getExcelData(reg_office_address,"Applicant Details",1,13);
			
			wait.until(ExpectedConditions.visibilityOf(reg_office_phone));
			Assert.assertTrue(reg_office_phone.isDisplayed());
			HighlightOnElement(reg_office_phone);
			Assert.assertTrue(reg_office_phone.isEnabled());
			excel.getExcelData(reg_office_phone,"Applicant Details",1,14);
			
			SelectVisibleText(reg_office_state,"CHHATTISGARH");
			waitForSomeTime();
			
			SelectVisibleText(reg_office_dist,"BILASPUR");
			waitForSomeTime();
			waitForSomeTime();*/
}
		catch (Exception e){}
	}

	public void clickOnNextButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(nextbtn));
		Assert.assertTrue(nextbtn.isEnabled());
		HighlightOnElement(nextbtn);
		nextbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
