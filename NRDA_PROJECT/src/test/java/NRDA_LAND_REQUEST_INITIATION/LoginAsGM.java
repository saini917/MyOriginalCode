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
public class LoginAsGM extends URLPageWSNRDAScript
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
	@DataProvider(name="GENERAL MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"General_Manager");
	}
	
	@Test(description="verify dashboard",priority=0,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC003.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify land section",priority=1,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		display.verifyDisplay();
	}
	
	@Test(description="verify land request initaition",priority=2,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
	}
	
	@Test(description="verify pagination",priority=3,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC006 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC006.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action date",priority=4,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC007 actiodate=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC007.class);
		actiodate.verifyActionDate();
	}
	
	@Test(description="verify action by",priority=5,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC008 actioby=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC008.class);
		actioby.verifyAcyionBy();
	}
	
	@Test(description="verify app num",priority=6,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC009 appnum=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC009.class);
		appnum.verifyApplicationNum();
	}
	
	@Test(description="verify marked to",priority=7,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC010 markedto=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC010.class);
		markedto.verifyMarkedTo();
	}
	
	@Test(description="verify pending days",priority=8,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC011 pendingdays=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC011.class);
		pendingdays.verifyPendingDays();
	}
	
	@Test(description="verify input box",priority=9,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC012 inputbox=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC012.class);
		inputbox.verifyDisplay();
	}
	
	@Test(description="verify invalid app num",priority=10,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC013 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC013.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid app num",priority=11,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=12,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=13,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC016 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC016.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=14,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC017 print=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC017.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=15,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC018 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC018.class);
		requesdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify land details",priority=16,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC027 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC027.class);
		landdetails.clickOnLandDetails();
	}
	
	@Test(description="verify view",priority=17,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC027 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC027.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC019_TC028 view=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC028.class);
		view.clickOnView();
	}
	
	@Test(description="verify view",priority=18,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC027 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC027.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC019_TC029 view=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC029.class);
		view.clickOnView();
	}
	
	@Test(description="verify select forward",priority=19,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
	}
	
	@Test(description="verify select user",priority=20,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC019_TC031 user=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC031.class);
		user.selectCEO();
	}
	
	@Test(description="verify blank comment",priority=21,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC019_TC031 user=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC031.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC019_TC032 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC032.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=22,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC019_TC031 user=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC031.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC019_TC033 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC033.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid upload",priority=23,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC019_TC031 user=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC031.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC019_TC033 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC033.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC019_TC034 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC034.class);
		invalid.UploadInvalidDocument();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid upload",priority=24,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC035(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC019_TC031 user=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC031.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC019_TC033 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC033.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC019_TC035 validupload=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC035.class);
		validupload.uploadValidDocument();
		validupload.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=25,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC036(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC036 close=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC036.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=26,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC019_TC037(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC019_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC019_TC005 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC005.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC019_TC014 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC014.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC019_TC015 action=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC015.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC019_TC030 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC030.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC019_TC031 user=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC031.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC019_TC033 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC033.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC019_TC035 validupload=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC035.class);
		validupload.uploadValidDocument();
		//validupload.verifyUploadMsg();
		
		NRDA_LandManagement_SC019_TC037 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC019_TC037.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}

}
