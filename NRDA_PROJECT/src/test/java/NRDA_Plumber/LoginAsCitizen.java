package NRDA_Plumber;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsCitizen  extends URLPageWSNRDAScript
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		wait1.until(ExpectedConditions.visibilityOf( web1));
		action.moveToElement(web1).build().perform();
		waitForSomeTime();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}
	@DataProvider(name="citizen")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen");
	}


	@Test(description="verify login",priority=1,dataProvider="citizen")
	public void NRDA_Plumber_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyPlumberRegistration_SC_01_TC_01 dashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_01.class);
		dashboard.toVerifyOptions();
		dashboard.toVerifyOption();
	}
	
	@Test(description="verify various module",priority=2,dataProvider="citizen")
	public void NRDA_Plumber_SC_01_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		verifydashboard.toVerifyOptions01();
	}
	
	@Test(description="verify online offline form",priority=3,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_01 onoffline=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_01.class);
		onoffline.verifyOnOffLineForm();
	}
	
	@Test(description="read pdf content",priority=4,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_02 readpdf=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_02.class);
		readpdf.readPDFfile();
	}
	
	@Test(description="click on Online form ",priority=4,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		onlineform.verifyPlumberType();
		onlineform.verifyElement();
	}
	
	@Test(description="verify registration service",priority=5,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		service.verifyDisplayLink();
	}
	
	@Test(description="click on Applicant details tab",priority=6,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_05 applicant=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_05.class);
		applicant.clickOnApplicantDetails();
		applicant.verifyApplicantDetails();
	}
	
	@Test(description="verify Mandatory field",priority=7,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_05 applicant=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_05.class);
		applicant.clickOnApplicantDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_06 mandatory=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_06.class);
		mandatory.clickOnApplicantNext();
		mandatory.selectNameOfCourse();
		mandatory.enterTotalYearExperience();
		mandatory.clickOnEducationNext();
		mandatory.clickOnSubmit();
		mandatory.getErrorMsg();
		
	}
	
	@Test(description="verify Mandatory field",priority=8,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		message.enterMobileNumber();
		message.clickOnApplicantNext();
	}
	
	@Test(description="verify Mandatory field",priority=9,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_08 message1=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_08.class);
		message1.enterMobileNumber();
		message1.clickOnApplicantNext();
	}
	
	@Test(description="verify Mandatory field",priority=10,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_09 message1=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_09.class);
		message1.enterMobileNumber();
		message1.clickOnApplicantNext();
	}
	
	@Test(description="verify Mandatory field",priority=11,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_10 message1=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_10.class);
		message1.enterName();
		message1.clickOnApplicantNext();
	}
	
	@Test(description="verify Mandatory field",priority=12,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_11 message1=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_11.class);
		message1.enterAadharNo();
		message1.clickOnApplicantNext();
		message1.enterAadharNo1();
		message1.clickOnApplicantNext();
		message1.enterAadharNo2();
		message1.clickOnApplicantNext();
	}
	
	@Test(description="verify Mandatory field",priority=13,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_12 message1=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_12.class);
		message1.enterPanCardNo();
		message1.clickOnApplicantNext();
		message1.enterPanCardNo1();
		message1.clickOnApplicantNext();
		message1.enterPanCardNo2();
		message1.clickOnApplicantNext();
	}
	
	@Test(description="verify valid data",priority=14,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		//valid.clickOnApplicantNext();
	}
	
	@Test(description="verify Education details",priority=15,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		details.verifyEducationDetails();
	}
	
	@Test(description="invalid total experience data",priority=16,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_15 invaliddata=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_15.class);
		invaliddata.enterTotalOfYearExperience();
		invaliddata.clickOnEducationNext();
		invaliddata.enterTotalOfYearExperience1();
		invaliddata.clickOnEducationNext();
		invaliddata.enterTotalOfYearExperience2();
		invaliddata.clickOnEducationNext();
	}
	
	@Test(description="blank name of course",priority=17,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_16 blank=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_16.class);
		blank.enterTotalOfYearExperience();
		blank.clickOnEducationNext();
	}
	
	@Test(description="valid details",priority=18,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		validdetails.clickOnEducationNext();
	}
	
	@Test(description="Registration date",priority=17,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_18(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		
		ToVerifyPlumberRegistration_SC_02_TC_18 date=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_18.class);
		date.clickOnRegistrationDate();
		date.verifyDisplayLink();
	}
	
	@Test(description="current date",priority=18,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_19(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		
		ToVerifyPlumberRegistration_SC_02_TC_18 date=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_18.class);
		date.clickOnRegistrationDate();
		
		ToVerifyPlumberRegistration_SC_02_TC_19 currentdate=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_19.class);
		currentdate.getCurrentDate();
<<<<<<< .mine
||||||| .r699
		currentdate.verifyFutureDate();
=======
		//currentdate.verifyFutureDate();
>>>>>>> .r734
	}
	
	@Test(description="verify back button",priority=19,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_21(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		
		ToVerifyPlumberRegistration_SC_02_TC_18 date=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_18.class);
		date.clickOnRegistrationDate();
		
		ToVerifyPlumberRegistration_SC_02_TC_21 back=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_21.class);
		back.clickOnBackBtn();
		back.verifyPreviousTab();
	}
	
	@Test(description="verify save As Draft button",priority=20,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_22(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		
		ToVerifyPlumberRegistration_SC_02_TC_18 date=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_18.class);
		date.clickOnRegistrationDate();
		
		ToVerifyPlumberRegistration_SC_02_TC_22 saveasdraft=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_22.class);
		saveasdraft.clickOnSaveAsDraft();
		saveasdraft.getPlumberTempNumber();
		saveasdraft.clickOnApplicationStatus();
		saveasdraft.enterPlumberID();
		saveasdraft.clickOnSearchBtn();
		saveasdraft.clickOnDraftedApplication();
		saveasdraft.clickOnPlumberReg();
	}
	
	@Test(description="verify reset button",priority=21,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_23(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		
		ToVerifyPlumberRegistration_SC_02_TC_18 date=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_18.class);
		date.clickOnRegistrationDate();
		
		ToVerifyPlumberRegistration_SC_02_TC_23 reset=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_23.class);
		reset.clickOnReset();
	}
	
	@Test(description="verify next button",priority=22,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_24(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_24 next=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_24.class);
		next.clickOnApplicantNext();
	}
	
	@Test(description="verify submit button",priority=23,dataProvider="citizen")
	public void NRDA_Plumber_SC_02_TC_25(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_02_TC_04 service=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_04.class);
		service.selectRegistrationType();
		service.clickOnProceed();
		
		ToVerifyPlumberRegistration_SC_02_TC_07 message=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_07.class);
		message.clickOnProceedBtn();
		
		ToVerifyPlumberRegistration_SC_02_TC_13 valid=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_13.class);
		valid.clickOnApplicantReset();
		valid.enterAadharNo();
		valid.enterName();
		valid.enterMobileNumber();
		
		ToVerifyPlumberRegistration_SC_02_TC_14 details=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_14.class);
		details.clickOnEducationDetails();
		
		ToVerifyPlumberRegistration_SC_02_TC_17 validdetails=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_17.class);
		validdetails.selectNameOfCourse();
		validdetails.enterTotalOfYearExperience();
		
		ToVerifyPlumberRegistration_SC_02_TC_18 date=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_18.class);
		date.clickOnRegistrationDate();
		
		ToVerifyPlumberRegistration_SC_02_TC_25 submit=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_25.class);
		submit.clickOnSubmit();
		submit.clickOnDownloadReceipt();
	}
	
	@Test(description="verify renewal",priority=23,dataProvider="citizen")
	public void NRDA_Plumber_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyPlumberRegistration_SC_01_TC_02 verifydashboard=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_01_TC_02.class);
		verifydashboard.clickOnWaterAndSewerageConnection();
		
		ToVerifyPlumberRegistration_SC_02_TC_03 onlineform=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_02_TC_03.class);
		onlineform.clickOnOnlineForm();
		
		ToVerifyPlumberRegistration_SC_03_TC_01 renewel=PageFactory.initElements(driver,ToVerifyPlumberRegistration_SC_03_TC_01.class);
		renewel.selectRegistrationType();
		renewel.clickOnProceed();
		renewel.clickOnProceedBtn();
		renewel.verifyDisplayList();
	}
	
}
