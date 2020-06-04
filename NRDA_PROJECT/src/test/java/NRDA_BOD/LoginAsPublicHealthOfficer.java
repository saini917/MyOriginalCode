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
public class LoginAsPublicHealthOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="Junior Engineer Credentials")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Junior Engineer Credentials");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}
	
	@Test(description="verify navigation",priority=3,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		navigation.verifyNavigation();
	}
	
	@Test(description="verify action",priority=4,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		action.verifyDisplayLink();
	}
	
	@Test(description="verify Add/Update Agenda",priority=5,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		updateagenda.verifyDisplayLink();
	}
	
	@Test(description="verify Add/Update Agenda details",priority=6,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
	}
	
	@Test(description="verify submit Agenda details",priority=7,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		submitdetails.verifySubmitAgenda();
	}
	
	@Test(description="verify Forward Agenda details",priority=8,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		
		NRDA_BOD_SC_02_TC_09 forwradagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_09.class);
		/*forwradagenda.clickOnSubmitAgenda();
		forwradagenda.enterComment();
		forwradagenda.uploadDocument();
		forwradagenda.clickOnForwardAgenda();*/
		forwradagenda.selectAction();
		forwradagenda.selectSectionUser();
	}
	
	@Test(description="verify File number",priority=9,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_10 filenum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_10.class);
		filenum.verifyFileNum();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		
		NRDA_BOD_SC_02_TC_09 forwradagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_09.class);
		/*forwradagenda.clickOnSubmitAgenda();
		forwradagenda.enterComment();
		forwradagenda.uploadDocument();
		forwradagenda.clickOnForwardAgenda();*/
		forwradagenda.selectAction();
		forwradagenda.selectSectionUser();
	}
	
	@Test(description="verify Subject number",priority=10,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_10 filenum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_10.class);
		filenum.verifyFileNum();
		
		NRDA_BOD_SC_02_TC_11 subnum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_11.class);
		subnum.verifySubjectNo();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		
		NRDA_BOD_SC_02_TC_09 forwradagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_09.class);
		/*forwradagenda.clickOnSubmitAgenda();
		forwradagenda.enterComment();
		forwradagenda.uploadDocument();
		forwradagenda.clickOnForwardAgenda();*/
		forwradagenda.selectAction();
		forwradagenda.selectSectionUser();
	}
	
	@Test(description="verify Comment",priority=11,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_10 filenum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_10.class);
		filenum.verifyFileNum();
		
		NRDA_BOD_SC_02_TC_11 subnum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_11.class);
		subnum.verifySubjectNo();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		
		NRDA_BOD_SC_02_TC_09 forwradagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_09.class);
		/*forwradagenda.clickOnSubmitAgenda();
		forwradagenda.enterComment();
		forwradagenda.uploadDocument();
		forwradagenda.clickOnForwardAgenda();*/
		forwradagenda.selectAction();
		forwradagenda.selectSectionUser();
		
		NRDA_BOD_SC_02_TC_12 comment=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_12.class);
		comment.enterComment();
	}
	
	@Test(description="verify Upload dcoument",priority=12,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_02_TC_10 filenum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_10.class);
		filenum.verifyFileNum();
		
		NRDA_BOD_SC_02_TC_11 subnum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_11.class);
		subnum.verifySubjectNo();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		
		NRDA_BOD_SC_02_TC_09 forwradagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_09.class);
		/*forwradagenda.clickOnSubmitAgenda();
		forwradagenda.enterComment();
		forwradagenda.uploadDocument();
		forwradagenda.clickOnForwardAgenda();*/
		forwradagenda.selectAction();
		forwradagenda.selectSectionUser();
		
		NRDA_BOD_SC_02_TC_12 comment=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_12.class);
		comment.enterComment();
		
		NRDA_BOD_SC_02_TC_13 upload=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_13.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify Send/Forward",priority=13,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_02_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_02_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_02_TC_04 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_04.class);
		navigation.clickOnNewMeetingReq();
		
		NRDA_BOD_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_05.class);
		action.verifyAppSearch();
		action.clickOnAction();
		

		NRDA_BOD_SC_02_TC_10 filenum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_10.class);
		filenum.verifyFileNum();
		
		NRDA_BOD_SC_02_TC_11 subnum=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_11.class);
		subnum.verifySubjectNo();
		
		NRDA_BOD_SC_02_TC_06 updateagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_06.class);
		updateagenda.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_02_TC_07 updateagendadetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_07.class);
		updateagendadetails.clickOnAddAgenda();
		updateagendadetails.verifyAddAgenda();
		updateagendadetails.clickOnAddAgenda1();
		updateagendadetails.verifyMessage();
		
		NRDA_BOD_SC_02_TC_08 submitdetails=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_08.class);
		submitdetails.clickOnAgendaDetails();
		
		NRDA_BOD_SC_02_TC_09 forwradagenda=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_09.class);
		/*forwradagenda.clickOnSubmitAgenda();
		forwradagenda.enterComment();
		forwradagenda.uploadDocument();
		forwradagenda.clickOnForwardAgenda();*/
		forwradagenda.selectAction();
		forwradagenda.selectSectionUser();
		
		NRDA_BOD_SC_02_TC_12 comment=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_12.class);
		comment.enterComment();
		
		NRDA_BOD_SC_02_TC_13 upload=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_13.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_BOD_SC_02_TC_14 send=PageFactory.initElements(driver,NRDA_BOD_SC_02_TC_14.class);
		send.clickOnSendForward();
	}
	
	
	
	
	
	
	
					// Again login as Public Health and Engineering
	
	
	@Test(description="verify dashboard",priority=1,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();
		section.verifyDisplayList();
	}

	@Test(description="verify action",priority=3,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		action.verifyDisplayLink();
	}
	
	@Test(description="verify add/update agenda",priority=4,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		addupdate.verifyDisplayLink();
	}
	
	@Test(description="verify add agenda details",priority=5,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
	}
	
	@Test(description="verify checkbox",priority=6,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
	}
	
	@Test(description="verify submit agenda",priority=7,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
		
		NRDA_BOD_SC_04_TC_08 submagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_08.class);
		submagenda.clickOnSubmitAgenda();
		submagenda.verifyDisplayLink();
	}
	
	@Test(description="verify other section agenda details",priority=8,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
		
		NRDA_BOD_SC_04_TC_09 sectionagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_09.class);
		sectionagenda.clickOnSectionAgendaDetails();
		sectionagenda.verifyDisplayList();
	}
	
	@Test(description="verify select action",priority=9,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
		
		NRDA_BOD_SC_04_TC_09 sectionagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_09.class);
		sectionagenda.clickOnSectionAgendaDetails();
		
		NRDA_BOD_SC_04_TC_10 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_10.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
	}
	
	@Test(description="verify enter comment",priority=10,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
		
		NRDA_BOD_SC_04_TC_09 sectionagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_09.class);
		sectionagenda.clickOnSectionAgendaDetails();
		
		NRDA_BOD_SC_04_TC_10 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_10.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
		
		NRDA_BOD_SC_04_TC_11 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_11.class);
		entcomment.enterComment();
	}
	
	@Test(description="verify upload document",priority=11,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
		
		NRDA_BOD_SC_04_TC_09 sectionagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_09.class);
		sectionagenda.clickOnSectionAgendaDetails();
		
		NRDA_BOD_SC_04_TC_10 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_10.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
		
		NRDA_BOD_SC_04_TC_11 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_11.class);
		entcomment.enterComment();
		
		NRDA_BOD_SC_04_TC_12 upload=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_12.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify send/forward",priority=12,dataProvider="Junior Engineer Credentials")
	public void NRDA_BOD_SC_04_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsJE(username, password);

		NRDA_BOD_SC_04_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_03.class);
		section.clickOnAdminSectionLink();
		section.clickOnNewMeetingReq();

		NRDA_BOD_SC_04_TC_04 action=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_04.class);
		action.verifyAppSearch();
		action.clickOnAction();
		
		NRDA_BOD_SC_04_TC_05 addupdate=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_05.class);
		addupdate.clickOnAddUpdateAgenda();
		
		NRDA_BOD_SC_04_TC_06 addagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_06.class);
		addagenda.clickOnAddAgenda();
		addagenda.enterAgendaName();
		addagenda.enterAgendaNote();
		addagenda.selectAgenda();
		addagenda.enterPreviousCompliances();
		addagenda.clickOnAddAgenda1();
		addagenda.verifyMessage();
		
		NRDA_BOD_SC_04_TC_07 checkbox=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_07.class);
		checkbox.clickOnAgendaDetails();
		checkbox.clickOnCheckbox();
		
		NRDA_BOD_SC_04_TC_09 sectionagenda=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_09.class);
		sectionagenda.clickOnSectionAgendaDetails();
		
		NRDA_BOD_SC_04_TC_10 selaction=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_10.class);
		selaction.clickOnSelectAction();
		selaction.nameSelect();
		
		NRDA_BOD_SC_04_TC_11 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_11.class);
		entcomment.enterComment();
		
		NRDA_BOD_SC_04_TC_12 upload=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_12.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_BOD_SC_04_TC_13 sendforward=PageFactory.initElements(driver,NRDA_BOD_SC_04_TC_13.class);
		sendforward.clickOnSendForward();
	}

}
