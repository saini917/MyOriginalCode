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
public class LoginAsPlanningSectionManager extends URLPageWSNRDAScript
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
	@DataProvider(name="PLANNING SECTION MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Planning_Section_Manager");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
		
	}
	
	@Test(description="verify land section",priority=1,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
		
	}
	
	@Test(description="verify click on land request initiation",priority=2,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
	}
	
	@Test(description="verify pagination",priority=3,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC005 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC005.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action date",priority=4,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC006 actiondate=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC006.class);
		actiondate.verifyActionDate();
	}
	
	@Test(description="verify action by",priority=5,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC007 actionby=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC007.class);
		actionby.verifyAcyionBy();
	}
	
	@Test(description="verify application num",priority=6,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC008 appnum=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC008.class);
		appnum.verifyApplicationNum();
	}
	
	@Test(description="verify marked to",priority=7,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC009 markedto=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC009.class);
		markedto.verifyMarkedTo();
	}
	
	@Test(description="verify pending days",priority=8,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC010 pendingdays=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC010.class);
		pendingdays.verifyPendingDays();
	}
	
	@Test(description="verify input box",priority=9,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC011 inputbox=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC011.class);
		inputbox.verifyDisplay();
	}
	
	@Test(description="verify invalid app num",priority=10,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC012 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC012.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid app num",priority=11,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=12,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=13,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC015 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC015.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=14,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC016 print=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC016.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=15,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC017 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC017.class);
		requestdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=16,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC017 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC017.class);
		requestdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC017_TC018 map=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC018.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify land details",priority=17,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
	}
	
	@Test(description="verify add",priority=18,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC027 add=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC027.class);
		add.clickOnAdd();
	}
	
	@Test(description="verify remarks",priority=18,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC027 add=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC027.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC017_TC028 remarks=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC028.class);
		remarks.enterRemarks();
	}
	
	@Test(description="verify close",priority=19,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC027 add=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC027.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC017_TC029 close=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC029.class);
		close.clickOnClose();
	}
	
	@Test(description="verify update",priority=20,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC030 update=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC030.class);
		update.clickOnPopUpdate();
	}
	
	@Test(description="verify enter remarks",priority=21,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC031 updatebtn=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC031.class);
		updatebtn.clickOnUpdate();
	}
	
	@Test(description="verify remarks update",priority=22,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC031 updatebtn=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC031.class);
		updatebtn.clickOnUpdate();
		
		NRDA_LandManagement_SC017_TC032 updatepopbtn=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC032.class);
		updatepopbtn.enterRemarks();
		updatepopbtn.clickOnUpdate();
		
}
	
	@Test(description="verify close",priority=23,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC026 landetails=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC026.class);
		landetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC017_TC031 updatebtn=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC031.class);
		updatebtn.clickOnUpdate();
		
		NRDA_LandManagement_SC017_TC033 closen=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC033.class);
		closen.clickOnClose();
	}
	
	@Test(description="verify action forward",priority=24,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
	}
	
	@Test(description="verify action legal section",priority=25,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC035(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC017_TC035 legalsec=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC035.class);
		legalsec.selectLegalSection();
	}
	
	@Test(description="verify action user",priority=26,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC036(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC017_TC035 legalsec=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC035.class);
		legalsec.selectLegalSection();
		
		NRDA_LandManagement_SC017_TC036 user=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC036.class);
		user.selectLegalSectionManager();
	}
	
	@Test(description="verify blank comment",priority=27,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC037(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC017_TC035 legalsec=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC035.class);
		legalsec.selectLegalSection();
		
		NRDA_LandManagement_SC017_TC036 user=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC036.class);
		user.selectLegalSectionManager();
		
		NRDA_LandManagement_SC017_TC037 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC037.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=28,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC038(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC017_TC035 legalsec=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC035.class);
		legalsec.selectLegalSection();
		
		NRDA_LandManagement_SC017_TC036 user=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC036.class);
		user.selectLegalSectionManager();
		
		NRDA_LandManagement_SC017_TC038 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC038.class);
		comment.enterComment();
	}
	
	@Test(description="verify upload",priority=29,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC039(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC017_TC035 legalsec=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC035.class);
		legalsec.selectLegalSection();
		
		NRDA_LandManagement_SC017_TC036 user=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC036.class);
		user.selectLegalSectionManager();
		
		NRDA_LandManagement_SC017_TC038 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC038.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC017_TC039 upload=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC039.class);
		upload.uploadValidDocument();
		upload.verifyUploadMsg();
	}
	
	@Test(description="verify invalid upload",priority=30,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC040(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC040 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC040.class);
		invalid.UploadInvalidDocument();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify close",priority=31,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC041(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC041 close=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC041.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=32,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC017_TC042(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC017_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC017_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC017_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC017_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC017_TC034 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC034.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC017_TC035 legalsec=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC035.class);
		legalsec.selectLegalSection();
		
		NRDA_LandManagement_SC017_TC036 user=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC036.class);
		user.selectLegalSectionManager();
		
		NRDA_LandManagement_SC017_TC038 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC038.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC017_TC039 upload=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC039.class);
		upload.uploadValidDocument();
		upload.verifyUploadMsg();
		
		NRDA_LandManagement_SC017_TC042 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC017_TC042.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}


}
