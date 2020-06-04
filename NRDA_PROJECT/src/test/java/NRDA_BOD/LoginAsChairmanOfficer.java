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
public class LoginAsChairmanOfficer extends URLPageWSNRDAScript
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
	@DataProvider(name="Chairman User")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Chairman User");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify administrator section",priority=2,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
		section.verifyDisplaylink();
	}

	@Test(description="verify meeting request",priority=3,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
	
		NRDA_BOD_SC_08_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_04.class);
		request.clickOnNewMeetingRequest();
		request.verifyDisplayLink();
	}
	
	@Test(description="verify navigation",priority=4,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
	
		NRDA_BOD_SC_08_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_08_TC_05 navigation=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_05.class);
		navigation.verifyNavigation();	
	}
	
	@Test(description="verify action",priority=5,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
	
		NRDA_BOD_SC_08_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_08_TC_06  actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		actionverify.verifyDisplayLink();
		
	}
	
	@Test(description="verify select action",priority=6,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
	
		NRDA_BOD_SC_08_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_08_TC_06  actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		
		NRDA_BOD_SC_08_TC_07  selaction=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_07.class);
		selaction.clickOnSelectAction();
	}
	
	@Test(description="verify enter comment",priority=7,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
	
		NRDA_BOD_SC_08_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_08_TC_06  actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		
		NRDA_BOD_SC_08_TC_07  selaction=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_07.class);
		selaction.clickOnSelectAction();
		
		NRDA_BOD_SC_08_TC_08 comment=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_08.class);
		comment.enterComment();
	}
	
	@Test(description="verify submit",priority=8,dataProvider="Chairman User")
	public void NRDA_BOD_SC_08_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsBODChairman(username,password);
		
		NRDA_BOD_SC_08_TC_03 section=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_03.class);
		section.clickOnAdminSectionLink();
	
		NRDA_BOD_SC_08_TC_04 request=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_04.class);
		request.clickOnNewMeetingRequest();
		
		NRDA_BOD_SC_08_TC_06  actionverify=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_06.class);
		actionverify.verifyAppSearch();
		actionverify.clickOnAction();
		
		NRDA_BOD_SC_08_TC_07  selaction=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_07.class);
		selaction.clickOnSelectAction();
		
		NRDA_BOD_SC_08_TC_08 comment=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_08.class);
		comment.enterComment();
		
		NRDA_BOD_SC_08_TC_09 submit=PageFactory.initElements(driver,NRDA_BOD_SC_08_TC_09.class);
		submit.clickOnSubmit();
		submit.verifyMessage();
	}
}
