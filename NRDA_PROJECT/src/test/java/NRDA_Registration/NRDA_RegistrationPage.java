package NRDA_Registration;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageRegistration.ToVerifyRegistrationPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RegistrationPage extends URLPageWSNRDAScript
{
	@AfterMethod  
	public void logoutWS() throws InterruptedException
	{
		waitForSomeTime();
		driver.close();
	}
	
	@Test(description="select register as company", priority=1)
	public void NRDA_Registration_SC_01_TC_01() throws InterruptedException
	{
		ToVerifyRegistrationPage_SC_01_TC_01 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_01.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsComapany();
		newregistartionlink.verifDisplayList();
		newregistartionlink.clickOnAddressDetails();
		newregistartionlink.verifAddressDetailsList();
	}

	@Test(description="select register as Architect", priority=2)
	public void NRDA_Registration_SC_01_TC_02() throws InterruptedException
	{
		ToVerifyRegistrationPage_SC_01_TC_02 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_02.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsArchitect();
		newregistartionlink.verifDisplayList();
		newregistartionlink.clickOnAddressDetails();
		newregistartionlink.verifAddressDetailsList();
	}
	
	@Test(description="select register as company and enter details", priority=3)
	public void NRDA_Registration_SC_01_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ToVerifyRegistrationPage_SC_01_TC_01 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_01.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsComapany();
		
		ToVerifyRegistrationPage_SC_01_TC_03 cmpnydetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_03.class);
		cmpnydetails.enterAadharNumber();
		cmpnydetails.uploadProfileImage();
		cmpnydetails.enterPanNumber();
		cmpnydetails.enterEmailID();
		cmpnydetails.enterMobileNumber();
		cmpnydetails.enterTrustName();
		cmpnydetails.enterContactPersonName();
		cmpnydetails.enterTrustAddress();
		cmpnydetails.clickOnAddressDetails();
		cmpnydetails.selectNationality();
		cmpnydetails.selectState();
		cmpnydetails.selectDistrict();
		cmpnydetails.enterAddress();
		cmpnydetails.enterPinCode();
		cmpnydetails.clickOnSaveAsAbove();
		cmpnydetails.clickOnRegister();
		cmpnydetails.verifyDisplay();
		cmpnydetails.clickOnHereToLogin();
	}

	@Test(description="select register as architect and enter invalid details", priority=4)
	public void NRDA_Registration_SC_01_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ToVerifyRegistrationPage_SC_01_TC_01 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_01.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsArchitect();
		
		ToVerifyRegistrationPage_SC_01_TC_03 cmpnydetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_03.class);
		cmpnydetails.enterAadharNumber();
		cmpnydetails.uploadProfileImage();
		cmpnydetails.enterPanNumber();
		cmpnydetails.enterEmailID();
		cmpnydetails.enterMobileNumber();
		cmpnydetails.enterTrustName();
		cmpnydetails.enterTrustAddress();
		
		ToVerifyRegistrationPage_SC_01_TC_04 appdetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_04.class);
		appdetails.selectTitle();
		appdetails.enterAppMiddleName();
		appdetails.selectRelationshipType();
		appdetails.enterFatherName();
		appdetails.selectDateOfBirth();
		appdetails.selectGender();
		appdetails.selectArchitectType();
		appdetails.enterRegistrationPlace();
		appdetails.enterRegisteredWith();
		appdetails.enterRegistrationNumber();
		appdetails.uploadScannedCertificate();
		cmpnydetails.clickOnAddressDetails();
		cmpnydetails.clickOnRegister();

	}
	
	@Test(description="select register as architect and enter invalid Address details", priority=5)
	public void NRDA_Registration_SC_01_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ToVerifyRegistrationPage_SC_01_TC_01 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_01.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsArchitect();
		
		ToVerifyRegistrationPage_SC_01_TC_03 cmpnydetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_03.class);
		cmpnydetails.enterAadharNumber();
		cmpnydetails.uploadProfileImage();
		cmpnydetails.enterPanNumber();
		cmpnydetails.enterEmailID();
		cmpnydetails.enterMobileNumber();
		cmpnydetails.enterTrustName();
		cmpnydetails.enterTrustAddress();
		
		ToVerifyRegistrationPage_SC_01_TC_04 appdetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_04.class);
		appdetails.selectTitle();
		appdetails.enterAppMiddleName();
		appdetails.selectRelationshipType();
		appdetails.enterFatherName();
		appdetails.selectDateOfBirth();
		appdetails.selectGender();
		appdetails.selectArchitectType();
		appdetails.enterRegistrationPlace();
		appdetails.enterRegisteredWith();
		appdetails.enterRegistrationNumber();
		appdetails.uploadScannedCertificate();
		
		
		ToVerifyRegistrationPage_SC_01_TC_05 adddetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_05.class);
		adddetails.enterApplicantFirstName();
		adddetails.enterApplicantLastName();
		adddetails.selectRegistrationDate();
		
		cmpnydetails.clickOnAddressDetails();
		cmpnydetails.selectNationality();
		cmpnydetails.selectState();
		cmpnydetails.selectDistrict();
		cmpnydetails.clickOnRegister();
	}
	
	@Test(description="clear", priority=6)
	public void NRDA_Registration_SC_01_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ToVerifyRegistrationPage_SC_01_TC_01 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_01.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsArchitect();
		
		ToVerifyRegistrationPage_SC_01_TC_03 cmpnydetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_03.class);
		cmpnydetails.enterAadharNumber();
		cmpnydetails.uploadProfileImage();
		cmpnydetails.enterPanNumber();
		cmpnydetails.enterEmailID();
		cmpnydetails.enterMobileNumber();
		cmpnydetails.enterTrustName();
		cmpnydetails.enterTrustAddress();
		
		ToVerifyRegistrationPage_SC_01_TC_04 appdetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_04.class);
		appdetails.selectTitle();
		appdetails.enterAppMiddleName();
		appdetails.selectRelationshipType();
		appdetails.enterFatherName();
		appdetails.selectDateOfBirth();
		appdetails.selectGender();
		appdetails.selectArchitectType();
		appdetails.enterRegistrationPlace();
		appdetails.enterRegisteredWith();
		appdetails.enterRegistrationNumber();
		appdetails.uploadScannedCertificate();
		
		
		ToVerifyRegistrationPage_SC_01_TC_05 adddetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_05.class);
		adddetails.enterApplicantFirstName();
		adddetails.enterApplicantLastName();
		adddetails.selectRegistrationDate();
		
		cmpnydetails.clickOnAddressDetails();
		cmpnydetails.selectNationality();
		cmpnydetails.selectState();
		cmpnydetails.selectDistrict();
		
		ToVerifyRegistrationPage_SC_01_TC_06 clear=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_06.class);
		clear.clickOnClear();
	}


	@Test(description="Home", priority=7)
	public void NRDA_Registration_SC_01_TC_07() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		ToVerifyRegistrationPage_SC_01_TC_01 newregistartionlink=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_01.class);
		newregistartionlink.clickOnNewRegistrationField();
		newregistartionlink.selectRegisterAsArchitect();
		
		ToVerifyRegistrationPage_SC_01_TC_03 cmpnydetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_03.class);
		cmpnydetails.enterAadharNumber();
		cmpnydetails.uploadProfileImage();
		cmpnydetails.enterPanNumber();
		cmpnydetails.enterEmailID();
		cmpnydetails.enterMobileNumber();
		cmpnydetails.enterTrustName();
		cmpnydetails.enterTrustAddress();
		
		ToVerifyRegistrationPage_SC_01_TC_04 appdetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_04.class);
		appdetails.selectTitle();
		appdetails.enterAppMiddleName();
		appdetails.selectRelationshipType();
		appdetails.enterFatherName();
		appdetails.selectDateOfBirth();
		appdetails.selectGender();
		appdetails.selectArchitectType();
		appdetails.enterRegistrationPlace();
		appdetails.enterRegisteredWith();
		appdetails.enterRegistrationNumber();
		appdetails.uploadScannedCertificate();
		
		
		ToVerifyRegistrationPage_SC_01_TC_05 adddetails=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_05.class);
		adddetails.enterApplicantFirstName();
		adddetails.enterApplicantLastName();
		adddetails.selectRegistrationDate();
		
		cmpnydetails.clickOnAddressDetails();
		cmpnydetails.selectNationality();
		cmpnydetails.selectState();
		cmpnydetails.selectDistrict();
		
		ToVerifyRegistrationPage_SC_01_TC_07 home=PageFactory.initElements(driver,ToVerifyRegistrationPage_SC_01_TC_07.class);
		home.clickOnHome();
	}
}
