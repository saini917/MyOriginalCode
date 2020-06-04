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
public class LoginAsCEOOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="CEO User")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"CEO User");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}
	
	@Test(description="verify meeting request",priority=3,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_07_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_04.class);
		request.clickOnNewMeetingRequest();
		request.verifyDisplayLink();
	}
	
	@Test(description="verify navigation",priority=4,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_07_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_07_TC_05 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_05.class);
		navigation.verifyNavigation();
	}
	
	@Test(description="verify action",priority=5,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_07_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_07_TC_06 actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		actionverify.verifyDisplayLink();
	}

	@Test(description="verify select action",priority=6,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_07_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_07_TC_06 actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		
		NRDA_BOD_SC_07_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_07.class);
		acti.clickOnSelectAction();
		acti.nameSelect();
	}
	
	@Test(description="verify enter comment",priority=7,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_07_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_07_TC_06 actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		
		NRDA_BOD_SC_07_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_07.class);
		acti.clickOnSelectAction();
		acti.nameSelect();
		
		NRDA_BOD_SC_07_TC_08 comm=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_08.class);
		comm.enterComment();
	}
	
	@Test(description="verify submit",priority=8,dataProvider="CEO User")
	public void NRDA_BOD_SC_07_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_07_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_07_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_07_TC_06 actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		
		NRDA_BOD_SC_07_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_07.class);
		acti.clickOnSelectAction();
		acti.nameSelect();
		
		NRDA_BOD_SC_07_TC_08 comm=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_08.class);
		comm.enterComment();
		
		NRDA_BOD_SC_07_TC_09 subi=PageFactory.initElements(driver,NRDA_BOD_SC_07_TC_09.class);
		subi.clickOnSubmit();
		subi.verifyMessage();
	}
	
	
								//login as CEO for publish the app
	
	@Test(description="verify dashboard",priority=1,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}
	
	@Test(description="verify meeting request",priority=3,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		request.verifyDisplayLink();
	}
	
	@Test(description="verify navigation",priority=4,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_05 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_05.class);
		navigation.verifyNavigation();
		
	}
	
	@Test(description="verify add invitee",priority=5,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		invitee.verifyDisplayLink();
	}
	
	@Test(description="verify add more attendance",priority=6,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_07 moreattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_07.class);
		moreattendance.clickOnAddMoreAttendence();
		moreattendance.verifyDisplayLink();
	}
	
	@Test(description="verify dept",priority=7,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_07 moreattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_07.class);
		moreattendance.clickOnAddMoreAttendence();
		
		NRDA_BOD_SC_09_TC_08 dept=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_08.class);
		dept.selectDept();
	}
	
	@Test(description="verify user",priority=8,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_07 moreattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_07.class);
		moreattendance.clickOnAddMoreAttendence();
		
		NRDA_BOD_SC_09_TC_08 dept=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_08.class);
		dept.selectDept();
		
		NRDA_BOD_SC_09_TC_09 user=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_09.class);
		user.selectUser();
	}
	
	@Test(description="verify add attendance",priority=9,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_07 moreattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_07.class);
		moreattendance.clickOnAddMoreAttendence();
		
		NRDA_BOD_SC_09_TC_08 dept=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_08.class);
		dept.selectDept();
		
		NRDA_BOD_SC_09_TC_09 user=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_09.class);
		user.selectUser();
		
		NRDA_BOD_SC_09_TC_10 addattendane=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_10.class);
		addattendane.clickOnAddAttendance();
		addattendane.verifyMessage();
	}
	
	@Test(description="verify add other meeting participant",priority=10,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_11 meetingattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_11.class);
		meetingattendance.clickOnAddMeetingParticipant();
		meetingattendance.enterDetails();
	}
	

	@Test(description="verify add attenedance",priority=11,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_11 meetingattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_11.class);
		meetingattendance.clickOnAddMeetingParticipant();
		meetingattendance.enterDetails();
		
		NRDA_BOD_SC_09_TC_12 attendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_12.class);
		attendance.clickOnAddAttendance();
		attendance.verifyMessage();
	}
	
	@Test(description="verify action",priority=12,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		
		NRDA_BOD_SC_09_TC_13 action=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_13.class);
		action.clickOnAction();
		action.verifyDisplayLink();
	}
	
	@Test(description="verify publish",priority=13,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		
		NRDA_BOD_SC_09_TC_13 action=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_13.class);
		action.clickOnAction();
		
		NRDA_BOD_SC_09_TC_14 publish=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_14.class);
		publish.clickOnPublish();
	}
	
	@Test(description="verify select action",priority=14,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		
		NRDA_BOD_SC_09_TC_13 action=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_13.class);
		action.clickOnAction();
		
		NRDA_BOD_SC_09_TC_14 publish=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_14.class);
		publish.clickOnPublish();
		
		NRDA_BOD_SC_09_TC_15 selectaction=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_15.class);
		selectaction.clickOnSelectAction();
		selectaction.nameSelect();
	}
	
	@Test(description="verify comment",priority=15,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		
		NRDA_BOD_SC_09_TC_13 action=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_13.class);
		action.clickOnAction();
		
		NRDA_BOD_SC_09_TC_14 publish=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_14.class);
		publish.clickOnPublish();
		
		NRDA_BOD_SC_09_TC_15 selectaction=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_15.class);
		selectaction.clickOnSelectAction();
		selectaction.nameSelect();
		
		NRDA_BOD_SC_09_TC_16 comment=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_16.class);
		comment.enterComment();
	}
	
	@Test(description="verify submit",priority=16,dataProvider="CEO User")
	public void NRDA_BOD_SC_09_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODCEO(username,password);
		
		NRDA_BOD_SC_09_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_09_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_09_TC_06 invitee=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_06.class);
		invitee.verifyAppSearch();
		invitee.clickOnAddInvitee();
		
		NRDA_BOD_SC_09_TC_11 meetingattendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_11.class);
		meetingattendance.clickOnAddMeetingParticipant();
		meetingattendance.enterDetails();
		
		NRDA_BOD_SC_09_TC_12 attendance=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_12.class);
		attendance.clickOnAddAttendance();
		attendance.verifyMessage();
		
		NRDA_BOD_SC_09_TC_13 action=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_13.class);
		action.clickOnAction();
		
		NRDA_BOD_SC_09_TC_14 publish=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_14.class);
		publish.clickOnPublish();
		
		NRDA_BOD_SC_09_TC_15 selectaction=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_15.class);
		selectaction.clickOnSelectAction();
		selectaction.nameSelect();
		
		NRDA_BOD_SC_09_TC_16 comment=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_16.class);
		comment.enterComment();
		
		NRDA_BOD_SC_09_TC_17 submit=PageFactory.initElements(driver,NRDA_BOD_SC_09_TC_17.class);
		submit.clickOnSubmit();
		submit.verifyMessage();
	}
}
