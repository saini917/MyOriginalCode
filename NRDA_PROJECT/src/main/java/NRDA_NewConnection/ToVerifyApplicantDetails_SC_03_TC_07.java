package NRDA_NewConnection;

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
public class ToVerifyApplicantDetails_SC_03_TC_07 extends CommonLibrary
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
	 * This is the xpath of the WebElement "CONTACT PERSON".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Contact Person Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement contact_person;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "NAME(ORGANIZATION/SOCIETY/TRUST)".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name (Organization/Society/Trust')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement nameoftrust;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "PAN".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'PAN')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement pan;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "GSTIN".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'GSTIN')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement gstin;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CIN".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'CIN')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement cin;
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RESGISTERED OFFICE ADDRESS".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office Address')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement officeaddress;
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RESGISTERED OFFICE PHONE".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office Phone')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement officephone;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RESGISTERED OFFICE STATE".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office State')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement officestate;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RESGISTERED OFFICE DISTRICT".
	 * @author deepak.saini
	 * @since 2017-12-27
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Registered Office District')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement officedistrict;
	
	public void enterValidData() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
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
			
		}
		catch (Exception e){}
	
		/*wait.until(ExpectedConditions.visibilityOf(contact_person));
		HighlightOnElement(contact_person);
		Assert.assertTrue(contact_person.isDisplayed());
		Assert.assertTrue(contact_person.isEnabled());
		excel.getExcelData(contact_person,"Applicant Details",1,17);
		nameoftrust.click();
		acceptAlert();
		contact_person.clear();
		wait.until(ExpectedConditions.visibilityOf(contact_person));
		HighlightOnElement(contact_person);
		Assert.assertTrue(contact_person.isDisplayed());
		Assert.assertTrue(contact_person.isEnabled());
		excel.getExcelData(contact_person,"Applicant Details",2,17);
		
		wait.until(ExpectedConditions.visibilityOf(nameoftrust));
		HighlightOnElement(nameoftrust);
		Assert.assertTrue(nameoftrust.isDisplayed());
		Assert.assertTrue(nameoftrust.isEnabled());
		excel.getExcelData(nameoftrust,"Applicant Details",1,18);
		
		wait.until(ExpectedConditions.visibilityOf(pan));
		HighlightOnElement(pan);
		Assert.assertTrue(pan.isDisplayed());
		Assert.assertTrue(pan.isEnabled());
		excel.getExcelData(pan,"Applicant Details",1,19);
		gstin.click();
		acceptAlert();
		pan.clear();
		wait.until(ExpectedConditions.visibilityOf(pan));
		HighlightOnElement(pan);
		Assert.assertTrue(pan.isDisplayed());
		Assert.assertTrue(pan.isEnabled());
		excel.getExcelData(pan,"Applicant Details",2,19);
		
		wait.until(ExpectedConditions.visibilityOf(gstin));
		HighlightOnElement(gstin);
		Assert.assertTrue(gstin.isDisplayed());
		Assert.assertTrue(gstin.isEnabled());
		excel.getExcelData(gstin,"Applicant Details",1,20);
		cin.click();
		acceptAlert();
		gstin.clear();
		wait.until(ExpectedConditions.visibilityOf(gstin));
		HighlightOnElement(gstin);
		Assert.assertTrue(gstin.isDisplayed());
		Assert.assertTrue(gstin.isEnabled());
		excel.getExcelData(gstin,"Applicant Details",2,20);
		
		wait.until(ExpectedConditions.visibilityOf(cin));
		HighlightOnElement(cin);
		Assert.assertTrue(cin.isDisplayed());
		Assert.assertTrue(cin.isEnabled());
		excel.getExcelData(cin,"Applicant Details",1,21);
		officeaddress.click();
		acceptAlert();
		cin.clear();
		wait.until(ExpectedConditions.visibilityOf(cin));
		HighlightOnElement(cin);
		Assert.assertTrue(cin.isDisplayed());
		Assert.assertTrue(cin.isEnabled());
		excel.getExcelData(cin,"Applicant Details",2,21);
		
		wait.until(ExpectedConditions.visibilityOf(officeaddress));
		HighlightOnElement(officeaddress);
		Assert.assertTrue(officeaddress.isDisplayed());
		Assert.assertTrue(officeaddress.isEnabled());
		excel.getExcelData(officeaddress,"Applicant Details",1,22);
		
		wait.until(ExpectedConditions.visibilityOf(officephone));
		HighlightOnElement(officephone);
		Assert.assertTrue(officephone.isDisplayed());
		Assert.assertTrue(officephone.isEnabled());
		excel.getExcelData(officephone,"Applicant Details",1,23);
		officestate.click();
		acceptAlert();
		officephone.clear();
		wait.until(ExpectedConditions.visibilityOf(officephone));
		HighlightOnElement(officephone);
		Assert.assertTrue(officephone.isDisplayed());
		Assert.assertTrue(officephone.isEnabled());
		excel.getExcelData(officephone,"Applicant Details",2,23);
		
		wait.until(ExpectedConditions.visibilityOf(officestate));
		HighlightOnElement(officestate);
		Assert.assertTrue(officestate.isDisplayed());
		Assert.assertTrue(officestate.isEnabled());
		SelectVisibleText(officestate,"Chhattisgarh/छत्तीसगढ़");
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(officedistrict));
		HighlightOnElement(officedistrict);
		Assert.assertTrue(officedistrict.isDisplayed());
		Assert.assertTrue(officedistrict.isEnabled());
		SelectVisibleText(officedistrict,"BILASPUR/बिलासपुर");*/
	}
}
