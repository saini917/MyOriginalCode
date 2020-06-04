package NRDA_BOD;

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
public class LoginAsAdminOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="Officer_BOD")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Officer_BOD");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}

	@Test(description="verify Application link",priority=1,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();
		applink.verifyDisplaylink();
	}

	@Test(description="verify Application link",priority=2,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();
		meetinglink.verifyApplicationFormlink();
	}

	@Test(description="verify meeting request link",priority=3,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();


		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();
		meetingrequestlink.verifyMeetingRequestlink();
	}

	@Test(description="verify committee name",priority=4,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();
		committeename.verifyProceedButton();
	}

	@Test(description="verify committee title",priority=5,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();
		committeetitle.verifyLink();

	}

	@Test(description="verify committee Name",priority=6,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();
	}

	@Test(description="verify Meeting title",priority=7,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();
	}

	@Test(description="verify Meeting Description",priority=8,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();
	}

	@Test(description="verify reset button",priority=9,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_11 reset=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_11.class);
		reset.clickOnResetBtn();
		reset.verifyFieldReset();
	}

	@Test(description="verify save as draft",priority=10,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_12 draft=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_12.class);
		draft.clickOnSaveAsDraft();
		draft.getBODTempNumber();
	}

	@Test(description="verify close button",priority=11,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();
		close.clickOnCloseBtn();
	}

	@Test(description="verify chairperson details tab",priority=11,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();
		next.verifyChairpersonDetailsTab();
	}

	@Test(description="verify chairperson designation value",priority=11,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();
		detailslink.verifyChairpersonDetails();
	}

	@Test(description="verify chairperson designation",priority=12,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();
	}

	@Test(description="verify back button",priority=13,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();
	}

	@Test(description="verify close button",priority=14,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_18(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();

		NRDA_BOD_SC_01_TC_18 backbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_18.class);
		backbtn.clickOnBackBtn();
	}

	@Test(description="verify reset button",priority=14,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_19(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();

		NRDA_BOD_SC_01_TC_19 closebtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_19.class);
		closebtn.clickOnCloseBtn();
	}

	@Test(description="verify next button",priority=15,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_20(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();

		NRDA_BOD_SC_01_TC_20 resetbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_20.class);
		resetbtn.clickOnResetBtn();
	}

	@Test(description="verify display list",priority=16,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_21(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();
		display1.verifyMeetingScheduleTab();
	}

	@Test(description="verify Meeting Schedule",priority=17,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_22(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();
		schedule.verifyDisplayLink();
	}

	@Test(description="verify Financial year",priority=18,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_23(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();
	}

	@Test(description="verify meeting start date",priority=19,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_24(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();
	}

	@Test(description="verify meeting venue",priority=20,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_25(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();
	}

	@Test(description="verify Forward to section",priority=21,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_26(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();
		section.verifyForwardToSectionTab();
	}

	@Test(description="verify Forward to section",priority=21,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_27(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();
		sectionname.verifyDisplayLink();
	}

	@Test(description="verify Forward to section",priority=22,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_28(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();
	}

	@Test(description="verify Submit",priority=23,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_31(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();
		
		NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();

		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();
		submit.verifyDisplayLink();
	}

	@Test(description="verify Meeting Schedule",priority=24,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_32(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();
		mschedule.verifyDisplayList();
	}

	@Test(description="verify Meeting Schedule time",priority=25,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_33(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();
		scheduletime.verifyDisplayList();
	}

	@Test(description="verify Schedule Meeting time",priority=26,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_34(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();
	}

	@Test(description="verify Add Agenda",priority=27,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_35(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();*/

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
	}

	@Test(description="verify Agenda Details",priority=28,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_36(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();*/

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();
		agendadetails.verifyDisplayList();
	}

	@Test(description="verify Search Details",priority=29,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_37(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();*/

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();
		search.verifyDisplayList();
		search.verifyClosePopUpWindow();
	}

	@Test(description="verify create new file Details",priority=30,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_38(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();*/

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();

		NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();
		createnewfile.verifyDisplayList();
		createnewfile.verifyClosePopUpWindow();
		createnewfile.verifyClosePopUpWindow1();
	}

	@Test(description="verify submit",priority=31,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_39(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();*/

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();

		NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();

		NRDA_BOD_SC_01_TC_39 submitbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_39.class);
		submitbtn.clickOnSubmit();
		submitbtn.clickOnCloseBtn();
	}

	@Test(description="verify radio button",priority=32,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_40(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();
		
		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();*/

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();

		/*NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();

		NRDA_BOD_SC_01_TC_39 submitbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_39.class);
		submitbtn.clickOnSubmit();*/

		NRDA_BOD_SC_01_TC_40 selectrecord=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_40.class);
		selectrecord.selectSubjectClickOnSearch();
		selectrecord.verifyDisplayList();
		selectrecord.clickOnCloseBtn();
	}

	@Test(description="verify fill in form",priority=33,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_41(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		/*NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();*/

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();*/

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();

		/*NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();

		NRDA_BOD_SC_01_TC_39 submitbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_39.class);
		submitbtn.clickOnSubmit();*/

		NRDA_BOD_SC_01_TC_40 selectrecord=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_40.class);
		selectrecord.selectSubjectClickOnSearch();

		NRDA_BOD_SC_01_TC_41 fillinform=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_41.class);
		fillinform.clickOnFillInForm();
	}

	@Test(description="verify comments",priority=34,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_42(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		/*NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();*/

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();

		NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();

		NRDA_BOD_SC_01_TC_39 submitbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_39.class);
		submitbtn.clickOnSubmit();

		NRDA_BOD_SC_01_TC_40 selectrecord=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_40.class);
		selectrecord.selectSubjectClickOnSearch();

		NRDA_BOD_SC_01_TC_41 fillinform=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_41.class);
		fillinform.clickOnFillInForm();*/

		NRDA_BOD_SC_01_TC_42 comment=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_42.class);
		comment.enterComment();
	}

	@Test(description="verify upload",priority=35,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_43(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();

		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		/*NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();*/

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		/*NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();

		NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();

		NRDA_BOD_SC_01_TC_39 submitbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_39.class);
		submitbtn.clickOnSubmit();

		NRDA_BOD_SC_01_TC_40 selectrecord=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_40.class);
		selectrecord.selectSubjectClickOnSearch();

		NRDA_BOD_SC_01_TC_41 fillinform=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_41.class);
		fillinform.clickOnFillInForm();

		NRDA_BOD_SC_01_TC_42 comment=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_42.class);
		comment.enterComment();*/

		NRDA_BOD_SC_01_TC_43 upload=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_43.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}

	@Test(description="verify sumbit the application",priority=36,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_01_TC_44(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_01_TC_03 applink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_03.class);
		applink.clickOneGovernanceLink();

		NRDA_BOD_SC_01_TC_04 meetinglink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_04.class);
		meetinglink.clickOnApplicationFormLink();

		NRDA_BOD_SC_01_TC_05 meetingrequestlink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_05.class);
		meetingrequestlink.clickOnAdministrativeSection();

		NRDA_BOD_SC_01_TC_06 committeename=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_06.class);
		committeename.clickOnMeetingRequest();

		NRDA_BOD_SC_01_TC_07 committeetitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_07.class);
		committeetitle.clickOnProceedButton();
		
		NRDA_BOD_SC_01_TC_08 committee=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_08.class);
		committee.verifyCommitteeName();

		NRDA_BOD_SC_01_TC_09 meetingtitle=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_09.class);
		meetingtitle.verifMeetingTitle();

		NRDA_BOD_SC_01_TC_10 meetingdesc=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_10.class);
		meetingdesc.verifyMeetingDesc();

		/*NRDA_BOD_SC_01_TC_13 close=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_13.class);
		close.clickOnDraftProceed();*/

		NRDA_BOD_SC_01_TC_14 next=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_14.class);
		next.clickOnNext();

		NRDA_BOD_SC_01_TC_15 detailslink=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_15.class);
		detailslink.clickOnChairpersonDetailsTab();

		NRDA_BOD_SC_01_TC_16 chairpersondesignation=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_16.class);
		chairpersondesignation.selectCHAIRMANValue();

		NRDA_BOD_SC_01_TC_17 chairpersonname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_17.class);
		chairpersonname.selectChairpersonName();


		NRDA_BOD_SC_01_TC_21 display1=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_21.class);
		display1.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_22 schedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_22.class);
		schedule.clickOnMeetingSchedule();

		NRDA_BOD_SC_01_TC_23 finyear=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_23.class);
		finyear.selectFinYear();

		NRDA_BOD_SC_01_TC_24 startdate=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_24.class);
		startdate.verifyMeetingStartDate();

		NRDA_BOD_SC_01_TC_25 venue=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_25.class);
		venue.verifyMeetingVenue();

		NRDA_BOD_SC_01_TC_26 section=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_26.class);
		section.clickOnNextBtn();

		NRDA_BOD_SC_01_TC_27 sectionname=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_27.class);
		sectionname.clickOnForwardToSectionTab();

		NRDA_BOD_SC_01_TC_28 name=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_28.class);
		name.clickOnSectionName();

		NRDA_BOD_SC_01_TC_31 submit=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_31.class);
		submit.clickOnSubmitBtn();
		submit.getApplicationNum();

		NRDA_BOD_SC_01_TC_32 mschedule=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_32.class);
		mschedule.clickOMeetingSchedule();

		NRDA_BOD_SC_01_TC_33 scheduletime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_33.class);
		scheduletime.clickOnScheduleTime();

		NRDA_BOD_SC_01_TC_34 meetingtime=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_34.class);
		meetingtime.clickOnScheduleMeetingTime();

		NRDA_BOD_SC_01_TC_35 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_35.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.clickOnAddAgenda();
		addagenda.verifyAddAgenda();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();

		NRDA_BOD_SC_01_TC_36 agendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_36.class);
		agendadetails.clickOnAgendaDetails();

		NRDA_BOD_SC_01_TC_37 search=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_37.class);
		search.clickOnSearch();


		/*NRDA_BOD_SC_01_TC_38 createnewfile=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_38.class);
		createnewfile.clickOnCreateNewFile();
		
		NRDA_BOD_SC_01_TC_39 submitbtn=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_39.class);
		submitbtn.clickOnSubmit();*/

		NRDA_BOD_SC_01_TC_40 selectrecord=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_40.class);
		selectrecord.selectSubjectClickOnSearch();

		NRDA_BOD_SC_01_TC_41 fillinform=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_41.class);
		fillinform.clickOnFillInForm();

		NRDA_BOD_SC_01_TC_42 comment=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_42.class);
		comment.enterComment();

		NRDA_BOD_SC_01_TC_43 upload=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_43.class);
		upload.uploadDocument();
		upload.verifyMessage();

		NRDA_BOD_SC_01_TC_44 submitapp=PageFactory.initElements(driver,NRDA_BOD_SC_01_TC_44.class);
		submitapp.selectAction();
		submitapp.selectName();
		submitapp.clickOnSubmit();
		submitapp.verifyMessage();
	}






	//again login as Admin

	@Test(description="verify dashboard",priority=1,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}

	@Test(description="verify administrative link",priority=2,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();
		adminlink.verifyDisplaylink();
	}

	@Test(description="verify new meeting request",priority=3,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();
		newrequest.verifyDisplayLink();
	}
	@Test(description="verify meeting",priority=4,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_05 meeting=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_05.class);
		//meeting.clickOnMeeting();
		meeting.verifyDisplayLink();
	}

	@Test(description="verify navigation",priority=5,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_06 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_06.class);
		navigation.verifyNavigation();
	}

	@Test(description="verify action",priority=6,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		acti.verifyDisplayLink();
	}

	@Test(description="verify update agenda",priority=7,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();


		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();
		update.clickOnUpdateAgenda();
		update.enterUpdateAgendaNote();
		update.selectConfidentally();
		update.clickOnUpdateAgenda1();
	}

	@Test(description="verify add agenda",priority=8,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();
	}

	@Test(description="verify agenda Details",priority=9,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_10 agedeatils=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_10.class);
		agedeatils.clickOnAgendaDetails();
		agedeatils.verifyDisplayList();
	}

	@Test(description="verify select action",priority=10,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();

		NRDA_BOD_SC_05_TC_11 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_11.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();
	}

	@Test(description="verify enter comment",priority=11,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();

		NRDA_BOD_SC_05_TC_11 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_11.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();

		NRDA_BOD_SC_05_TC_12 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_12.class);
		entcomment.enterComment();
	}

	@Test(description="verify upload document",priority=12,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();

		NRDA_BOD_SC_05_TC_11 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_11.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();

		NRDA_BOD_SC_05_TC_12 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_12.class);
		entcomment.enterComment();

		NRDA_BOD_SC_05_TC_13 uploaddoc=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_13.class);
		uploaddoc.uploadDocument();
		uploaddoc.verifyMessage();
	}

	@Test(description="verify remove upload document",priority=13,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();

		NRDA_BOD_SC_05_TC_11 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_11.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();

		NRDA_BOD_SC_05_TC_12 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_12.class);
		entcomment.enterComment();

		NRDA_BOD_SC_05_TC_13 uploaddoc=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_13.class);
		uploaddoc.uploadDocument();
		uploaddoc.verifyMessage();

		NRDA_BOD_SC_05_TC_14 removeuploaddoc=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_14.class);
		removeuploaddoc.removeUploadDocument();
		//removeuploaddoc.verifyMessage();
	}

	@Test(description="verify submit without enter comments",priority=13,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();

		NRDA_BOD_SC_05_TC_11 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_11.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();

		NRDA_BOD_SC_05_TC_15 submwithotcomm=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_15.class);
		submwithotcomm.clickOnSubmit();
		submwithotcomm.verifyErrorMessage();
	}

	@Test(description="verify submit with enter comments",priority=14,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_05_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_05_TC_03 adminlink=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_03.class);
		adminlink.clickOnAdminSectionLink();

		NRDA_BOD_SC_05_TC_04 newrequest=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_04.class);
		newrequest.clickOnNewMeetingRequest();

		NRDA_BOD_SC_05_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();

		NRDA_BOD_SC_05_TC_08 update=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_08.class);
		update.clickOnAddUpdateAgenda();

		NRDA_BOD_SC_05_TC_09 agendaadd=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_09.class);
		agendaadd.clickOnAddAgenda();
		agendaadd.enterAgendaName();
		agendaadd.enterAgendaNote();
		agendaadd.enterPreviousCompliances();
		agendaadd.clickOnAddAgenda1();
		agendaadd.verifyMessage();

		NRDA_BOD_SC_05_TC_11 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_11.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();

		NRDA_BOD_SC_05_TC_12 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_12.class);
		entcomment.enterComment();

		NRDA_BOD_SC_05_TC_13 uploaddoc=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_13.class);
		uploaddoc.uploadDocument();
		uploaddoc.verifyMessage();

		NRDA_BOD_SC_05_TC_15 submwithotcomm=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_15.class);
		submwithotcomm.clickOnSubmit();

		NRDA_BOD_SC_05_TC_16 submwithcomm=PageFactory.initElements(driver,NRDA_BOD_SC_05_TC_16.class);
		submwithcomm.verifyMessage();
	}





	//login as admin for proceeeding

	@Test(description="verify dashboard",priority=1,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}

	@Test(description="verify administrator section",priority=2,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}

	@Test(description="verify meeting request",priority=3,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();
		request.verifyDisplayLink();

	}

	@Test(description="verify navigation",priority=4,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_05 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_05.class);
		navigation.verifyNavigation();
	}
	
	@Test(description="verify meeting notice download",priority=5,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_06 noticedownload=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_06.class);
		noticedownload.verifyAppSearch();
		noticedownload.clickOnMeetinNotice();
	}
	
	@Test(description="verify action",priority=6,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_06 noticedownload=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_06.class);
		noticedownload.verifyAppSearch();
		noticedownload.clickOnMeetinNotice();
		
		NRDA_BOD_SC_10_TC_07 veriaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_07.class);
		veriaction.clickOnAction();
		veriaction.verifyDisplayLink();
	}

	@Test(description="verify proceeding details",priority=7,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_06 noticedownload=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_06.class);
		noticedownload.verifyAppSearch();
		noticedownload.clickOnMeetinNotice();
		
		NRDA_BOD_SC_10_TC_07 veriaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_07.class);
		veriaction.clickOnAction();
		
		NRDA_BOD_SC_10_TC_08 proceedingdetails=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_08.class);
		proceedingdetails.clickOnProceedingDetails();
		proceedingdetails.verifyDisplayLink();
	}
	
	@Test(description="verify select action",priority=8,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_06 noticedownload=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_06.class);
		noticedownload.verifyAppSearch();
		noticedownload.clickOnMeetinNotice();
		
		NRDA_BOD_SC_10_TC_07 veriaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_07.class);
		veriaction.clickOnAction();
		
		NRDA_BOD_SC_10_TC_08 proceedingdetails=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_08.class);
		proceedingdetails.clickOnProceedingDetails();
		proceedingdetails.verifyDisplayLink();
		
		NRDA_BOD_SC_10_TC_09 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_09.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
	}
	
	@Test(description="verify comments",priority=9,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_06 noticedownload=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_06.class);
		noticedownload.verifyAppSearch();
		noticedownload.clickOnMeetinNotice();
		
		NRDA_BOD_SC_10_TC_07 veriaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_07.class);
		veriaction.clickOnAction();
		
		NRDA_BOD_SC_10_TC_08 proceedingdetails=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_08.class);
		proceedingdetails.clickOnProceedingDetails();
		proceedingdetails.verifyDisplayLink();
		
		NRDA_BOD_SC_10_TC_09 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_09.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
		
		NRDA_BOD_SC_10_TC_10 commentts=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_10.class);
		commentts.enterComment();
	}
	
	@Test(description="verify submit",priority=10,dataProvider="Officer_BOD")
	public void NRDA_BOD_SC_10_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODAdminOfficer(username, password);

		NRDA_BOD_SC_10_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_03.class);
		section.clickOnAdminSectionLink();

		NRDA_BOD_SC_10_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_04.class);
		request.clickOnNewMeetingRequest();

		NRDA_BOD_SC_10_TC_06 noticedownload=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_06.class);
		noticedownload.verifyAppSearch();
		noticedownload.clickOnMeetinNotice();
		
		NRDA_BOD_SC_10_TC_07 veriaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_07.class);
		veriaction.clickOnAction();
		
		NRDA_BOD_SC_10_TC_08 proceedingdetails=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_08.class);
		proceedingdetails.clickOnProceedingDetails();
		proceedingdetails.verifyDisplayLink();
		
		NRDA_BOD_SC_10_TC_09 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_09.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
		
		NRDA_BOD_SC_10_TC_10 commentts=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_10.class);
		commentts.enterComment();
		
		NRDA_BOD_SC_10_TC_11 submittt=PageFactory.initElements(driver,NRDA_BOD_SC_10_TC_11.class);
		submittt.clickOnSubmit();
		submittt.verifyMessage();
	}
}
