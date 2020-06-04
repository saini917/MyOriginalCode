package NRDA_LAND_REQUEST_INITIATION;

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
public class loginAsLegalSectionManager extends URLPageWSNRDAScript
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
	@DataProvider(name="LEGAL SECTION MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Legal_Section_Manager");
	}
	
	@Test(description="verify dashboard",priority=0,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
		
	}
	
	@Test(description="verify land section",priority=1,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
	}
	
	@Test(description="verify land request initaition",priority=2,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
	}
	
	@Test(description="verify pagination",priority=3,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC005 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC005.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action date",priority=4,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC006 actiodate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC006.class);
		actiodate.verifyActionDate();
	}
	
	@Test(description="verify action by",priority=5,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC007 actioby=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC007.class);
		actioby.verifyAcyionBy();
	}
	
	@Test(description="verify app num",priority=6,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC008 appnum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC008.class);
		appnum.verifyApplicationNum();
	}
	
	@Test(description="verify marked to",priority=7,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC009 markedto=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC009.class);
		markedto.verifyMarkedTo();
	}
	
	@Test(description="verify pending days",priority=8,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC010 pendingdays=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC010.class);
		pendingdays.verifyPendingDays();
	}

	@Test(description="verify input box",priority=9,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC011 inputbox=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC011.class);
		inputbox.verifyDisplay();
	}
	
	@Test(description="verify invalid app num",priority=10,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC012 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC012.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid app num",priority=11,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=12,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=13,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC015 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC015.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=14,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC016 print=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC016.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=15,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC017 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC017.class);
		requesdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=16,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC017 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC017.class);
		requesdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC018_TC018 map=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC018.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify map close",priority=17,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC017 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC017.class);
		requesdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC018_TC018 map=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC018.class);
		map.clickOnOpenMap();
		
		NRDA_LandManagement_SC018_TC025 closemap=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC025.class);
		closemap.closePopUp();
	}
	
	@Test(description="verify land details",priority=18,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
	}
	
	@Test(description="verify add",priority=19,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
	}
	
	@Test(description="verify select case no",priority=20,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC028 caseno=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC028.class);
		caseno.selectCaseNo();
	}
	
	@Test(description="verify select case yes",priority=21,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
	}
	
	@Test(description="verify enter case number",priority=22,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
	}
	
	@Test(description="verify enter case date",priority=23,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
	}
	
	@Test(description="verify select court",priority=24,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
	}

	@Test(description="verify respondent",priority=25,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
	}
	
	@Test(description="verify next hearing date",priority=26,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
	}
	
	@Test(description="verify appilant",priority=27,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC035(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
		
		NRDA_LandManagement_SC018_TC035 appilantdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC035.class);
		appilantdate.enterAppilantName();
	}
	
	@Test(description="verify legal remarks",priority=28,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC036(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
		
		NRDA_LandManagement_SC018_TC035 appilantdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC035.class);
		appilantdate.enterAppilantName();
		
		NRDA_LandManagement_SC018_TC036 legalremarks=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC036.class);
		legalremarks.enterLegalRemarks();
	}
	
	@Test(description="verify invalid upload",priority=29,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC037(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
		
		NRDA_LandManagement_SC018_TC035 appilantdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC035.class);
		appilantdate.enterAppilantName();
		
		NRDA_LandManagement_SC018_TC036 legalremarks=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC036.class);
		legalremarks.enterLegalRemarks();
		
		NRDA_LandManagement_SC018_TC037 invalids=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC037.class);
		invalids.UploadInvalidDocument();
		invalids.verifyErrorMsg();
	}
	
	@Test(description="verify valid upload",priority=29,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC038(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
		
		NRDA_LandManagement_SC018_TC035 appilantdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC035.class);
		appilantdate.enterAppilantName();
		
		NRDA_LandManagement_SC018_TC036 legalremarks=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC036.class);
		legalremarks.enterLegalRemarks();
		
		NRDA_LandManagement_SC018_TC038 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC038.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=30,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC039(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
		
		NRDA_LandManagement_SC018_TC035 appilantdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC035.class);
		appilantdate.enterAppilantName();
		
		NRDA_LandManagement_SC018_TC036 legalremarks=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC036.class);
		legalremarks.enterLegalRemarks();
		
		NRDA_LandManagement_SC018_TC038 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC038.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
		
		NRDA_LandManagement_SC018_TC039 close=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC039.class);
		close.clickOnClose();
	}
	
	@Test(description="verify update",priority=31,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC040(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC027 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC027.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC018_TC029 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC029.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC018_TC030 casenum=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC030.class);
		casenum.enterCaseNo();
		
		NRDA_LandManagement_SC018_TC031 casedate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC031.class);
		casedate.enterCaseDate();
		
		NRDA_LandManagement_SC018_TC032 court=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC032.class);
		court.selectCourtName();
		
		NRDA_LandManagement_SC018_TC033 respondent=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC033.class);
		respondent.enterRespondent();
		
		NRDA_LandManagement_SC018_TC034 hearingdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC034.class);
		hearingdate.enterNextHearingDate();
		
		NRDA_LandManagement_SC018_TC035 appilantdate=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC035.class);
		appilantdate.enterAppilantName();
		
		NRDA_LandManagement_SC018_TC036 legalremarks=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC036.class);
		legalremarks.enterLegalRemarks();
		
		NRDA_LandManagement_SC018_TC038 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC038.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
		
		NRDA_LandManagement_SC018_TC040 update=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC040.class);
		update.clickOnUpdate();
	}
	
	@Test(description="verify update remarks",priority=32,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC041(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC041 updateremarks=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC041.class);
		updateremarks.clickOnUpdate();
		updateremarks.enterUpdateRemarks();
		updateremarks.clickOnUpdatePop();
	}
	
	@Test(description="verify view",priority=33,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC042(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC018_TC042 view=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC042.class);
		view.clickOnView();
	}
	
	@Test(description="verify select forward",priority=34,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC043(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
	}
	
	@Test(description="verify select account and finance",priority=35,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC044(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
	}
	
	@Test(description="verify select user",priority=36,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC045(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
		
		NRDA_LandManagement_SC018_TC045 user=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC045.class);
		user.selectLandManager();
	}
	
	@Test(description="verify blank comment",priority=37,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC046(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
		
		NRDA_LandManagement_SC018_TC045 user=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC045.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC018_TC046 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC046.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=38,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC047(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
		
		NRDA_LandManagement_SC018_TC045 user=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC045.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC018_TC047 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC047.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid upload",priority=39,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC048(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
		
		NRDA_LandManagement_SC018_TC045 user=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC045.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC018_TC047 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC047.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC018_TC048 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC048.class);
		invalid.UploadInvalidDocument();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid upload",priority=40,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC049(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
		
		NRDA_LandManagement_SC018_TC045 user=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC045.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC018_TC047 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC047.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC018_TC049 validupload=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC049.class);
		validupload.uploadValidDocument();
		validupload.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=41,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC050(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC050 close=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC050.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=42,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC018_TC051(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC018_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC018_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC018_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC018_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC018_TC043 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC043.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC018_TC044 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC044.class);
		dept.selectLandSection();
		
		NRDA_LandManagement_SC018_TC045 user=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC045.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC018_TC047 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC047.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC018_TC049 validupload=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC049.class);
		validupload.uploadValidDocument();
		//validupload.verifyUploadMsg();
		
		NRDA_LandManagement_SC018_TC051 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC018_TC051.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}

}


















