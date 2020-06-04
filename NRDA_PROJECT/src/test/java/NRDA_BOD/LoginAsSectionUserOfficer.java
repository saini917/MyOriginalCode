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
public class LoginAsSectionUserOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="Section User")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Section User");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}
	
	@Test(description="verify meeting request",priority=3,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		request.verifyDisplayList();
	}

	@Test(description="verify action",priority=4,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		action.verifyDisplayLink();
	}
	
	@Test(description="verify Add/Update Agenda",priority=5,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		addagenda.verifyDisplayLink();
	}
	
	@Test(description="verify Add/Update Agenda display list",priority=6,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		display.verifyDisplayList();
	}
	
	@Test(description="verify Agenda Name",priority=7,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();
	}
	
	@Test(description="verify Agenda Note",priority=8,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();
		
		NRDA_BOD_SC_03_TC_08 agendanote=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_08.class);
		agendanote.enterAgendaNote();
	}
	
	@Test(description="verify Previous Compliances meeting",priority=9,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();

		NRDA_BOD_SC_03_TC_08 agendanote=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_08.class);
		agendanote.enterAgendaNote();
		
		NRDA_BOD_SC_03_TC_09 compliances=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_09.class);
		compliances.enterPreviousCompliances();
	}
	
	@Test(description="verify Add Agenda",priority=10,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();

		NRDA_BOD_SC_03_TC_08 agendanote=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_08.class);
		agendanote.enterAgendaNote();
		
		NRDA_BOD_SC_03_TC_09 compliances=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_09.class);
		compliances.enterPreviousCompliances();
		
		NRDA_BOD_SC_03_TC_10 agenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_10.class);
		agenda.clickOnAddAgenda1();
		agenda.verifyMessage();
	}
	
	@Test(description="verify enter comment",priority=11,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();

		NRDA_BOD_SC_03_TC_08 agendanote=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_08.class);
		agendanote.enterAgendaNote();
		
		NRDA_BOD_SC_03_TC_09 compliances=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_09.class);
		compliances.enterPreviousCompliances();
		
		NRDA_BOD_SC_03_TC_10 agenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_10.class);
		agenda.clickOnAddAgenda1();
		agenda.verifyMessage();
		
		NRDA_BOD_SC_03_TC_11 comment=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_11.class);
		comment.enterComment();
	}
	
	@Test(description="verify submit without comment",priority=12,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();

		NRDA_BOD_SC_03_TC_08 agendanote=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_08.class);
		agendanote.enterAgendaNote();
		
		NRDA_BOD_SC_03_TC_09 compliances=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_09.class);
		compliances.enterPreviousCompliances();
		
		NRDA_BOD_SC_03_TC_10 agenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_10.class);
		agenda.clickOnAddAgenda1();
		agenda.verifyMessage();
		
		NRDA_BOD_SC_03_TC_13 submit=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_13.class);
		submit.clickOnSubmit();
		submit.verifyErrorMessage();
	}
	
	@Test(description="verify submit",priority=13,dataProvider="Section User")
	public void NRDA_BOD_SC_03_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODSectionUserOfficer(username, password);
		
		NRDA_BOD_SC_03_TC_02 section=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_02.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_03_TC_03 request=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_03.class);
		request.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_03_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_03_TC_05 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_05.class);
		addagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_03_TC_06 display=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_06.class);
		display.clickOnAddAgenda();
		
		NRDA_BOD_SC_03_TC_07 agendaname=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_07.class);
		agendaname.enterAgendaName();

		NRDA_BOD_SC_03_TC_08 agendanote=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_08.class);
		agendanote.enterAgendaNote();
		
		NRDA_BOD_SC_03_TC_09 compliances=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_09.class);
		compliances.enterPreviousCompliances();
		
		NRDA_BOD_SC_03_TC_10 agenda=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_10.class);
		agenda.clickOnAddAgenda1();
		agenda.verifyMessage();
		
		NRDA_BOD_SC_03_TC_11 comment=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_11.class);
		comment.enterComment();
		
		NRDA_BOD_SC_03_TC_13 submit=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_13.class);
		submit.clickOnSubmit();
		
		NRDA_BOD_SC_03_TC_12 message=PageFactory.initElements(driver,NRDA_BOD_SC_03_TC_12.class);
		message.verifyMessage();
	}
}
