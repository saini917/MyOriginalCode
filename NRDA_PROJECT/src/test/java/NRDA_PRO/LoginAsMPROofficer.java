package NRDA_PRO;

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
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

public class LoginAsMPROofficer extends URLPageWSNRDAScript
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
	@DataProvider(name="M_PRO_Officer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"M_PRO_Officer");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_PRO_SC_02_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify dashboard display",priority=1,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_PRO_SC_02_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_03.class);
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify advertisement and publication",priority=2,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_PRO_SC_02_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=3,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_PRO_SC_02_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_05.class);
		action.clickOnAction();
		action.verifyDisplay();
	}
	
	@Test(description="verify select action",priority=4,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_PRO_SC_02_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_05.class);
		action.clickOnAction();
		
		NRDA_PRO_SC_02_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_06.class);
		user.selectActionForward();
		user.selectm_Admin();
	}

	@Test(description="verify comment",priority=5,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_PRO_SC_02_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_05.class);
		action.clickOnAction();
		
		NRDA_PRO_SC_02_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_07.class);
		comment.enterComment();
	}
	
	@Test(description="verify blank comment",priority=6,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_PRO_SC_02_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_05.class);
		action.clickOnAction();
		
		NRDA_PRO_SC_02_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_06.class);
		user.selectActionForward();
		user.selectm_Admin();
		
		NRDA_PRO_SC_02_TC_08 blankcomment=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_08.class);
		blankcomment.clickOnSubmit();
		blankcomment.verifyErrorMessage();
	}
	
	@Test(description="verify upload document",priority=7,dataProvider="M_PRO_Officer")
	public void NRDA_PRO_SC_02_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		NRDA_PRO_SC_02_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_02_TC_05 action=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_05.class);
		action.clickOnAction();
		
		NRDA_PRO_SC_02_TC_06 user=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_06.class);
		user.selectActionForward();
		user.selectm_Admin();
		
		NRDA_PRO_SC_02_TC_07 comment=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_07.class);
		comment.enterComment();
		
		NRDA_PRO_SC_02_TC_09 submit=PageFactory.initElements(driver,NRDA_PRO_SC_02_TC_09.class);
		submit.uploadDocument();
		submit.verifyMessage();
		submit.clickOnSubmit();
		submit.verifySuccessfulMessage();
	}
	
	/*@Test(description="verify submit without enter comment",priority=8,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_02_Tc_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_02_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_03.class);
		status.clickOnPendingAppLink();
		
		NRDA_Pro_Env_Sc_02_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_02_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_02_Tc_06 subject=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_06.class);
		subject.verifySubject();
		
		NRDA_Pro_Env_Sc_02_Tc_07 file=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_07.class);
		file.verifyFileNumber();
		
		NRDA_Pro_Env_Sc_02_Tc_11 submit=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_11.class);
		submit.clickOnSubmit();
		submit.verifyMessage();
	}
	
	@Test(description="verify close",priority=9,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_02_Tc_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_02_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_03.class);
		status.clickOnPendingAppLink();
		
		NRDA_Pro_Env_Sc_02_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_02_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_02_Tc_06 subject=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_06.class);
		subject.verifySubject();
		
		NRDA_Pro_Env_Sc_02_Tc_07 file=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_07.class);
		file.verifyFileNumber();
		
		NRDA_Pro_Env_Sc_02_Tc_12 close=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_12.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=10,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_02_Tc_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_02_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_03.class);
		status.clickOnPendingAppLink();
		
		NRDA_Pro_Env_Sc_02_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_02_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_02_Tc_06 subject=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_06.class);
		subject.verifySubject();
		
		NRDA_Pro_Env_Sc_02_Tc_07 file=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_07.class);
		file.verifyFileNumber();
		
		NRDA_Pro_Env_Sc_02_Tc_08 comment=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_08.class);
		comment.enterComment();
		
		NRDA_Pro_Env_Sc_02_Tc_09 upload=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_09.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_Pro_Env_Sc_02_Tc_10 submit1=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_02_Tc_10.class);
		submit1.clickOnSubmit();
		submit1.verifyMessage();
	}
	
	
	
	
	
	
					//Manager Pro For Approval
	
	@Test(description="verify dashboard",priority=0,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_01 verifydashboard=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify status",priority=1,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		verifystatus.verifyStatus();
	}
	
	@Test(description="verify action",priority=2,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		action.verifyDisplayLink();
	}
	
	@Test(description="verify advertisement details",priority=3,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_05 advdetails=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_05.class);
		advdetails.clickOnAdvDetails();
		advdetails.verifyDipslayDetails();
	}
	
	@Test(description="verify template",priority=4,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_06 template=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_06.class);
		template.clickOnTemplate();
		template.verifyDipslayDetails();
	}
	
	@Test(description="verify note sheet",priority=5,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_07 sheet=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_07.class);
		sheet.clickOnNoteSheet();
		sheet.verifyDipslayDetails();
	}
	
	@Test(description="verify action",priority=6,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
	}
	
	@Test(description="verify subject",priority=7,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_09 subject=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_09.class);
		subject.verifySubject();
	}
	
	@Test(description="verify file",priority=8,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_10 file=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_10.class);
		file.verifyFileNumber();
	}
	
	@Test(description="verify comments",priority=9,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_11 comment=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_11.class);
		comment.enterComment();
	}
	
	@Test(description="verify upload document",priority=10,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_12 upload=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_12.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify submit without enter comment",priority=11,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_14 verifysubmit=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_14.class);
		verifysubmit.clickOnSubmit();
		verifysubmit.verifyMessage();
	}
	
	@Test(description="verify close",priority=12,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_15 verifyclose=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_15.class);
		verifyclose.clickOnClose();
	}
	
	@Test(description="verify submit with valid data",priority=13,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_04_Tc_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_04_Tc_03 verifystatus=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_03.class);
		verifystatus.clickOnApproveLink();
		
		NRDA_Pro_Env_Sc_04_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_04.class);
		action.enterApplicationNumber();
		action.clickOnSearch();
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_04_Tc_08 verifyaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_08.class);
		verifyaction.selectAction();
		verifyaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_04_Tc_11 comment=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_11.class);
		comment.enterComment();
		
		NRDA_Pro_Env_Sc_04_Tc_12 upload=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_12.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_Pro_Env_Sc_04_Tc_13 submit=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_04_Tc_13.class);
		submit.clickOnSubmit();
		submit.verifyMessage();
	}
	
	
	
	
	
	
	
								//login as Manager Approval
	
	
	@Test(description="verify dashboard",priority=0,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);

		NRDA_Pro_Env_Sc_10_Tc_01 verifydashboard=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify dashboard",priority=1,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		status.verifyStatus();
	}
	
	@Test(description="verify action",priority=2,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		action.verifyDisplayLink();
	}
	
	@Test(description="verify select action",priority=3,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
	}
	
	@Test(description="verify subject",priority=4,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_10_Tc_06 subject= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_06.class);
		subject.verifySubject();
	}
	
	@Test(description="verify file number",priority=5,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_10_Tc_07 file= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_07.class);
		file.verifyFileNumber();
	}
	
	@Test(description="verify comments",priority=6,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_10_Tc_08 verifycomment= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_08.class);
		verifycomment.enterComment();
	}
	
	@Test(description="verify submit without comments",priority=7,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_10_Tc_09 comment=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_09.class);
		comment.clickOnSubmit();
		comment.verifyMessage();
	}
	
	@Test(description="verify close",priority=8,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_10_Tc_11 close=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_11.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit with valid data",priority=9,dataProvider="M_PRO_Officer")
	public void NRDA_Pro_Env_Sc_10_Tc_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsMPROfficer(username, password);
		
		NRDA_Pro_Env_Sc_10_Tc_03 status=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_03.class);
		status.clickOnPendingAppLink();
		status.enterApplicationNumber();
		status.clickOnSearch();
		
		NRDA_Pro_Env_Sc_10_Tc_04 action=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_04.class);
		action.clickOnAction();
		
		NRDA_Pro_Env_Sc_10_Tc_05 selectaction=PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_05.class);
		selectaction.selectAction();
		selectaction.selectOfficer();
		
		NRDA_Pro_Env_Sc_10_Tc_06 subject= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_06.class);
		subject.verifySubject();
		
		NRDA_Pro_Env_Sc_10_Tc_07 file= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_07.class);
		file.verifyFileNumber();
		
		NRDA_Pro_Env_Sc_10_Tc_08 verifycomment= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_08.class);
		verifycomment.enterComment();
		
		NRDA_Pro_Env_Sc_10_Tc_10 submit= PageFactory.initElements(driver,NRDA_Pro_Env_Sc_10_Tc_10.class);
		submit.clickOnSubmit();
		submit.verifyMessage();
	}*/
}
