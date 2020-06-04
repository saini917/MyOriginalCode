package NRDA_LAND_DIVERSION_SECTION;

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
	public void NRDA_LandManagement_SC005_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
		
	}
	
	@Test(description="verify land section",priority=1,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
	}
	
	@Test(description="verify land encroachment process",priority=2,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
	}
	
	@Test(description="verify application number",priority=3,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC005 searchbox=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC005.class);
		searchbox.verifyApplicationInputBox();
	}
	
	@Test(description="verify invalid app num",priority=4,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC006.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid app num",priority=5,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify display",priority=6,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC008 displays=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC008.class);
		displays.verifyDisplayList();
	}
	
	@Test(description="verify pagination",priority=7,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action",priority=8,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=9,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC011.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=10,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC012 print=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC012.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=11,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC013 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC013.class);
		requesdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=12,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC013 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC013.class);
		requesdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC005_TC014 map=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC014.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify land request",priority=13,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
	}
	
	@Test(description="verify land view",priority=14,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 view=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		view.clickOnView();
	}
	
	@Test(description="verify land close",priority=15,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 view=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		view.clickOnView();
		
		NRDA_LandManagement_SC005_TC017 viewclose=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC017.class);
		viewclose.clickOnClose();
	}
	
	@Test(description="verify add",priority=16,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC018 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC018.class);
		landdetailadd.verifyAdd();
	}
	
	@Test(description="verify case no",priority=17,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		landdetailadd.selectCaseNo();
	}
	
	@Test(description="verify case yes",priority=18,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC005_TC020 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		caseyes.selectCaseYes();
	}
	
	@Test(description="verify case yes all field value",priority=19,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC005_TC020 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC021 values=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC021.class);
		values.enterCaseNo();
		values.enterCaseDate();
		values.selectCourtName();
		values.enterRespondent();
		values.enterNextHearingDate();
		values.enterAppilantName();
		values.enterLegalRemarks();
		values.uploadValidDocument();
	}
	
	@Test(description="verify case yes invalid upload document",priority=20,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC005_TC020 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC022 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC022.class);
		invalid.uploadInvalidDocument();
	}
	

	@Test(description="verify close",priority=21,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC005_TC020 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC023 close=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC023.class);
		close.clickOnClose();
	}
	
	@Test(description="verify update",priority=22,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC005_TC020 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC021 values=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC021.class);
		values.enterCaseNo();
		values.enterCaseDate();
		values.selectCourtName();
		values.enterRespondent();
		values.enterNextHearingDate();
		values.enterAppilantName();
		values.enterLegalRemarks();
		values.uploadValidDocument();
		
		NRDA_LandManagement_SC005_TC024 update=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC024.class);
		update.clickOnUpdate();
	}
	
	@Test(description="verify forward",priority=23,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
	}
	
	@Test(description="verify land manager",priority=24,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC026 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		landmanager.selectLandSection();
	}
	
	@Test(description="verify user",priority=25,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC026 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC027 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		user.selectLandManager();
	}
	
	@Test(description="verify blank comment",priority=26,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC026 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC027 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC005_TC028 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC028.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=27,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC026 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC027 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC005_TC029 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC029.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid document",priority=28,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC030 invalidocs=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC030.class);
		invalidocs.uploadInvalidDocument();
		invalidocs.verifyErrorMsg();
	}
	
	@Test(description="verify valid docs",priority=29,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC026 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC027 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC005_TC029 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC029.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC005_TC031 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC031.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=30,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC032 close=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC032.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=31,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 request=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		request.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC019 landdetailadd=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		landdetailadd.clickOnAdd();
		
		NRDA_LandManagement_SC005_TC020 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC021 values=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC021.class);
		values.enterCaseNo();
		values.enterCaseDate();
		values.selectCourtName();
		values.enterRespondent();
		values.enterNextHearingDate();
		values.enterAppilantName();
		values.enterLegalRemarks();
		values.uploadValidDocument();
		
		NRDA_LandManagement_SC005_TC024 update=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC024.class);
		update.clickOnUpdate();
		
		NRDA_LandManagement_SC005_TC025 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC026 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC027 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC005_TC029 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC029.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC005_TC031 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC031.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
		
		NRDA_LandManagement_SC005_TC033 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC033.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
	
}
