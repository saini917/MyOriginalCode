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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsSubEngineerOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="Officer_PRO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Officer_PRO");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify E-Governance display list",priority=1,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		display.verifyDisplaylink();
	}
	
	@Test(description="verify Advertisement and publication display list",priority=2,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		displaylist.verifyDisplay();
		
	}
	
	@Test(description="verify proceed",priority=3,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);
		
		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
	}
	
	@Test(description="verify publication start date",priority=4,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_06 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_06.class);
		startdate.verifyPublicationStartDate();
	}
	
	@Test(description="verify publication start date error message",priority=5,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);
		
		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_07 error=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_07.class);
		error.clickOnSubmit();
		error.verifyErrorMessage();
	}
	
	@Test(description="verify publication start date",priority=6,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_10 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_10.class);
		startdate.verifyPublicationStartDate();
	}
	
	
	
	@Test(description="verify close",priority=7,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_11 close=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_11.class);
		close.clickOnClose();
		close.clickONNo();
		close.clickOnClose();
		close.clickONYes();
	}

	@Test(description="verify reset",priority=8,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);
		
		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		
		NRDA_PRO_SC_01_TC_12 reset=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_12.class);
		reset.clickOnReset();
	}

	@Test(description="verify save as draft",priority=9,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);
		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		
		NRDA_PRO_SC_01_TC_13 draft=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_13.class);
		draft.clickOnSaveAsDraft();
	}
	
	@Test(description="verify publication start date",priority=10,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		startdate.getApplicationNumber();
	}
	
	@Test(description="verify notesheet",priority=11,dataProvider="Officer_PRO")
	public void NRDA_Pro_Env_Sc_01_Tc_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_15 notesheet=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_15.class);
		notesheet.clickOnNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify select action",priority=12,dataProvider="Officer_PRO")
	public void NRDA_Pro_Env_Sc_01_Tc_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
	}
	
	@Test(description="verify search",priority=13,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
		
		NRDA_PRO_SC_01_TC_17 search=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_17.class);
		search.clickOnSearch();
		search.verifyDisplayList();
		search.verifyClosePopUpWindow();
	}
	
	@Test(description="verify create new file",priority=14,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_18(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
		
		NRDA_PRO_SC_01_TC_17 search=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_17.class);
		search.clickOnSearch();
		
		NRDA_PRO_SC_01_TC_18 createfile=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_18.class);
		createfile.clickOnCreateNewFile();
		createfile.clickOnSubmit();
		createfile.selectSubjectClickOnSearch();
		createfile.verifyDisplayList();
		createfile.verifyClosePopUpWindow();
	}
	
	@Test(description="verify fill in form",priority=15,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_19(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
		
		NRDA_PRO_SC_01_TC_17 search=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_17.class);
		search.clickOnSearch();
		
		NRDA_PRO_SC_01_TC_18 createfile=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_18.class);
		createfile.selectSubjectClickOnSearch();
		
		NRDA_PRO_SC_01_TC_19 fillinform=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_19.class);
		fillinform.clickOnFillInForm();
	}
	
	@Test(description="verify comment",priority=16,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_20(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
		
		NRDA_PRO_SC_01_TC_20 comment=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_20.class);
		comment.enterComment();
	}
	
	@Test(description="verify error message",priority=17,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_22(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
		
		NRDA_PRO_SC_01_TC_22 errormsg=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_22.class);
		errormsg.clickOnSubmit();
		errormsg.verifyErrorMessage();
	}
	
	@Test(description="verify submit",priority=18,dataProvider="Officer_PRO")
	public void NRDA_PRO_SC_01_TC_21(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsPROfficer(username, password);

		NRDA_PRO_SC_01_TC_03 display=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_03.class);
		display.clickOnEGovernment();
		
		NRDA_PRO_SC_01_TC_04 displaylist=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_04.class);
		displaylist.clickOnApplicationForm();
		displaylist.clickOnPubRelationOffice();
		displaylist.clickOnAdvAndPublication();
		
		NRDA_PRO_SC_01_TC_05 proceed=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_05.class);
		proceed.clickOnProceed();
		
		NRDA_PRO_SC_01_TC_14 startdate=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_14.class);
		startdate.selectPublicationStartDate();
		startdate.clickOnSubmit();
		startdate.getApplicationNumber();
		
		NRDA_PRO_SC_01_TC_16 action=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_16.class);
		action.clickOnSelectAction();
		action.selectForward();
		action.clickOnSelectUser();
		action.selectUser();
		
		NRDA_PRO_SC_01_TC_17 search=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_17.class);
		search.clickOnSearch();
		
		NRDA_PRO_SC_01_TC_18 createfile=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_18.class);
		createfile.selectSubjectClickOnSearch();
		
		NRDA_PRO_SC_01_TC_19 fillinform=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_19.class);
		fillinform.clickOnFillInForm();
		
		NRDA_PRO_SC_01_TC_20 comment=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_20.class);
		comment.enterComment();
		
		NRDA_PRO_SC_01_TC_21 submit=PageFactory.initElements(driver,NRDA_PRO_SC_01_TC_21.class);
		submit.uploadDocument();
		submit.verifyMessage();
		submit.clickOnSubmit();
		submit.verifySuccessfulMessage();
	}
	
	

}
