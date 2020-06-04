package NRDA_Registration;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
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

public class ToVerifyRegistrationPage_SC_01_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	Logger log=Logger.getLogger("devpinoyLogger");


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Aadhar Number".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span[contains(text(),'Aadhaar No.')]/../following-sibling::td/span/input")
	private WebElement aadhar_no;

	public void enterAadharNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(aadhar_no);
		String aadharno=excel.getExcelData(aadhar_no,"Registration Details",1,6);
		Reporter.log("Enter Aadhar number:"+aadharno,true);
		log.info("To verify Aadhar number entered successfully");

	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload image".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span[contains(text(),'Upload Profile Image')]/../following-sibling::td/table/tbody/tr/td/div/div/label")
	private WebElement uploadimage;

	public void uploadProfileImage() throws AWTException, InterruptedException
	{
		HighlightOnElement(uploadimage);
		uploadimage.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleJPGImage_500kbmb.jpg");
		Reporter.log("To verify Image upload successfully",true);
		log.info("To verify Image upload successfully");
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pan Number".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span[contains(text(),'Pan No.')]/../following-sibling::td/input[@id='regForm:tabView:panNumber']")
	private WebElement pan_no;

	public void enterPanNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(pan_no);
		String panno=excel.getExcelData(pan_no,"Registration Details",1,7);
		Reporter.log("Enter Pan number:"+panno,true);
		log.info("To verify Pan number entered successfully");

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Email id".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'E-mail ID')]/../../following-sibling::td/input[@id='regForm:tabView:emailId']")
	private WebElement emailid;

	public void enterEmailID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(emailid);
		String email_id=excel.getExcelData(emailid,"Registration Details",1,8);
		Reporter.log("Enter Email ID:"+email_id,true);
		log.info("To verify Email ID entered successfully");

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Mobile number".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Mobile No')]/../../following-sibling::td/input")
	private WebElement mobilenum;

	public void enterMobileNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(mobilenum);
		String mob=excel.getExcelData(mobilenum,"Registration Details",1,9);
		Reporter.log("Enter Mobile number:"+mob,true);
		log.info("To verify Mobile number entered successfully");

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of Company/Organization/Trust/Society/Firm".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Name of Company/Organization/Trust/Society/Firm')]/../../following-sibling::td/input[@id='regForm:tabView:firmName']")
	private WebElement trust;

	public void enterTrustName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(trust);
		String cmpny=excel.getExcelData(trust,"Registration Details",1,10);
		Reporter.log("Enter Name of Company/Organization/Trust/Society/Firm: "+cmpny,true);
		log.info("To verify Name of Company/Organization/Trust/Society/Firm entered successfully");

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Contact Person Name".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Contact Person Name')]/../../following-sibling::td/input[@id='regForm:tabView:contactPersonName']")
	private WebElement contactname;

	public void enterContactPersonName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(contactname);
		String cname=excel.getExcelData(contactname,"Registration Details",1,11);
		Reporter.log("Enter Contact Person Name: "+cname,true);
		log.info("To verify Contact Person Name entered successfully");

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Address of Company/Organization/Trust/Society/Firm".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span[contains(text(),'Address of Company/Organization/Trust/Society/Firm')]/../following-sibling::td/input")
	private WebElement trustaddress;

	public void enterTrustAddress() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(trustaddress);
		String taddress=excel.getExcelData(trustaddress,"Registration Details",1,12);
		Reporter.log("Enter Address of Company/Organization/Trust/Society/Firm: "+taddress,true);
		log.info("To verify Address of Company/Organization/Trust/Society/Firm entered successfully");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Address details".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Address Detail')]")
	private WebElement addressdetails;
	public void clickOnAddressDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addressdetails));
		Assert.assertTrue(addressdetails.isDisplayed());
		HighlightOnElement(addressdetails);
		Assert.assertTrue(addressdetails.isEnabled());
		addressdetails.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Nationality".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='regForm:tabView:address']/span/table/tbody/tr/td/span/span[contains(text(),'Nationality')]/../../following-sibling::td/select[@id='regForm:tabView:nationality']")
	private WebElement nationality;

	public void selectNationality() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(nationality));
		Assert.assertTrue(nationality.isDisplayed());
		HighlightOnElement(nationality);
		Assert.assertTrue(nationality.isEnabled());
		SelectVisibleText(nationality,"Indian");
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "state".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@id='regForm:tabView:address']/span/table/tbody/tr/td/span/span[contains(text(),'State')])[1]/../../following-sibling::td/select")
	private WebElement state;

	public void selectState() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(state));
		Assert.assertTrue(state.isDisplayed());
		HighlightOnElement(state);
		Assert.assertTrue(state.isEnabled());
		SelectVisibleText(state,"CHHATTISGARH/छत्तीसगढ़");
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "District".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@id='regForm:tabView:address']/span/table/tbody/tr/td/span/span[contains(text(),'District')])[1]/../../following-sibling::td/select")
	private WebElement district;

	public void selectDistrict() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(district));
		Assert.assertTrue(district.isDisplayed());
		HighlightOnElement(district);
		Assert.assertTrue(district.isEnabled());
		SelectVisibleText(district,"BASTAR/बस्तर");
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Address".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@id='regForm:tabView:address']/span/table/tbody/tr/td/span/span[contains(text(),'District')])[1]/../../following-sibling::td/textarea")
	private WebElement address;

	public void enterAddress() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		HighlightOnElement(address);
		String addres=excel.getExcelData(address,"Registration Details",1,26);
		Reporter.log("Enter Address: "+addres,true);
		log.info("To verify Address entered successfully");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "pin code".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div[@id='regForm:tabView:address']/span/table/tbody/tr/td/span/span[contains(text(),'Pin Code')])[1]/../../following-sibling::td/input")
	private WebElement pincode;

	public void enterPinCode() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		pincode.click();
		waitForSomeTime();
		HighlightOnElement(pincode);
		String code=excel.getExcelData(pincode,"Registration Details",1,25);
		Reporter.log("Enter pincode: "+code,true);
		log.info("To verify pincode entered successfully");
		waitForSomeTime();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Save As Above".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//tr[@class='ui-widget-content']/td/div/div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")
	private WebElement sameasabove;

	public void clickOnSaveAsAbove() throws InterruptedException
	{
		Assert.assertTrue(sameasabove.isDisplayed());
		HighlightOnElement(sameasabove);
		Assert.assertTrue(sameasabove.isEnabled());
		sameasabove.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Register".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Register')]")
	private WebElement register;
	
	public void clickOnRegister() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(register));
		Assert.assertTrue(register.isDisplayed());
		HighlightOnElement(register);
		Assert.assertTrue(register.isEnabled());
		register.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div/center/label")
	private List<WebElement> display;
	
	public void verifyDisplay()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Click Here To Login".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Click Here To Login')]")
	private WebElement loginbutton;
	
	public void clickOnHereToLogin() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		Assert.assertTrue(loginbutton.isDisplayed());
		HighlightOnElement(loginbutton);
		Assert.assertTrue(loginbutton.isEnabled());
		loginbutton.click();
		waitForSomeTime();
	}
}
