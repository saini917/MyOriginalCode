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
public class LoginAsGMOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="GM User")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"GM User");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}

	@Test(description="verify meeting request",priority=3,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		request.verifyDisplayLink();
	}
	
	@Test(description="verify meeting",priority=4,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_05 meeting=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_05.class);
		//meeting.clickOnMeeting();
		meeting.verifyDisplayLink();
	}
	
	@Test(description="verify navigation",priority=5,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_06 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_06.class);
		navigation.verifyNavigation();
		
	}
	
	@Test(description="verify action",priority=6,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		acti.verifyDisplayLink();
	}
	
	@Test(description="verify select action",priority=7,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		
		NRDA_BOD_SC_06_TC_08 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_08.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();
	}
	
	@Test(description="verify enter text",priority=8,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		
		NRDA_BOD_SC_06_TC_08 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_08.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();
		
		NRDA_BOD_SC_06_TC_09 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_09.class);
		entcomment.enterComment();
	}
	
	@Test(description="verify upload document",priority=9,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		
		NRDA_BOD_SC_06_TC_08 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_08.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();
		
		NRDA_BOD_SC_06_TC_09 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_09.class);
		entcomment.enterComment();
		
		NRDA_BOD_SC_06_TC_10 upload=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_10.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify submit without select action",priority=10,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		
		NRDA_BOD_SC_06_TC_09 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_09.class);
		entcomment.enterComment();
		
		NRDA_BOD_SC_06_TC_10 upload=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_10.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_BOD_SC_06_TC_11 subwithoutaction=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_11.class);
		subwithoutaction.clickOnSubmit();
		subwithoutaction.verifyErrorMessage();
	}
	
	@Test(description="verify submit without comment",priority=11,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		
		NRDA_BOD_SC_06_TC_08 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_08.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();
		
		NRDA_BOD_SC_06_TC_09 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_09.class);
		entcomment.enterComment();
		
		NRDA_BOD_SC_06_TC_10 upload=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_10.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_BOD_SC_06_TC_11 subwithoutcomment=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_11.class);
		subwithoutcomment.clickOnSubmit();
		
		NRDA_BOD_SC_06_TC_12 errmsgg=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_12.class);
		errmsgg.verifyErrorMessage();
	}
	
	@Test(description="verify submit",priority=12,dataProvider="GM User")
	public void NRDA_BOD_SC_06_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODGM(username,password);
		
		NRDA_BOD_SC_06_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_03.class);
		section.clickOnAdminSectionLink();
		
		NRDA_BOD_SC_06_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_06_TC_07 acti=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_07.class);
		acti.verifyAppSearch();
		acti.clickOnAction();
		
		NRDA_BOD_SC_06_TC_08 actselect=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_08.class);
		actselect.clickOnSelectAction();
		actselect.nameSelect();
		
		NRDA_BOD_SC_06_TC_09 entcomment=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_09.class);
		entcomment.enterComment();
		
		NRDA_BOD_SC_06_TC_10 upload=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_10.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_BOD_SC_06_TC_11 subwithdata=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_11.class);
		subwithdata.clickOnSubmit();
		
		NRDA_BOD_SC_06_TC_13 succmsg=PageFactory.initElements(driver,NRDA_BOD_SC_06_TC_13.class);
		succmsg.verifyMessage();
	}
}
