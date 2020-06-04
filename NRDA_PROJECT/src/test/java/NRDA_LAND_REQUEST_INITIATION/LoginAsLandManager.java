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
public class LoginAsLandManager extends URLPageWSNRDAScript
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
	@DataProvider(name="LAND MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Land_Manager");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
		
	}
	
	@Test(description="verify land section",priority=1,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
		
	}
	
	@Test(description="verify click on land request initiation",priority=2,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
	}
	
	@Test(description="verify pagination",priority=3,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC005 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC005.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
		
	}
	
	@Test(description="verify application number",priority=4,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC006 appnum=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC006.class);
		appnum.verifyApplicationNum();
		
	}
	
	@Test(description="verify action by",priority=5,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC007 actionby=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC007.class);
		actionby.verifyAcyionBy();
		
	}
	
	@Test(description="verify action date",priority=6,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC008 actiondate=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC008.class);
		actiondate.verifyActionDate();
		
	}
	
	@Test(description="verify marked to",priority=7,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC009 markedto=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC009.class);
		markedto.verifyMarkedTo();
		
	}
	
	@Test(description="verify pending days",priority=8,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC010 pendingdays=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC010.class);
		pendingdays.verifyPendingDays();
		
	}
	
	@Test(description="verify inbox box",priority=9,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC011 displays=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC011.class);
		displays.verifyDisplay();
	}
	
	@Test(description="verify invalid application num",priority=10,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC012 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC012.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid application num",priority=11,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=12,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=13,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC015 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC015.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=14,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC016 print=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC016.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=15,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC017 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC017.class);
		requestdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=16,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC017 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC017.class);
		requestdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC016_TC018 map=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC018.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	
	@Test(description="verify land details",priority=17,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC026.class);
		landdetails.clickOnLandDetails();
	}
	
	@Test(description="verify select action forward",priority=18,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
	}
	
	@Test(description="verify select action planning section",priority=19,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
	}
	
	@Test(description="verify select user",priority=20,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC016_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC029.class);
		user.selectPlanningSectionManager();
	}
	
	@Test(description="verify blank comment",priority=21,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC016_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC029.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC016_TC030 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC030.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=22,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC016_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC029.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC016_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC031.class);
		comment.enterComment();
	}
	
	@Test(description="verify valid document",priority=23,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC016_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC029.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC016_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC031.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC016_TC032 uploaddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC032.class);
		uploaddocument.uploadValidDocument();
		uploaddocument.verifyUploadMsg();
	}
	
	@Test(description="verify invalid document",priority=24,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC016_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC029.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC016_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC031.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC016_TC033 invaliduploaddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC033.class);
		invaliduploaddocument.UploadInvalidDocument();
		invaliduploaddocument.verifyErrorMsg();
	}
	
	@Test(description="verify close",priority=25,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC034 close=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC034.class);
		close.clickOnClose();
	}
	
	@Test(description="verify invalid submit",priority=26,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC035(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC035 invalidsubmit=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC035.class);
		invalidsubmit.clickOnSubmit();
		invalidsubmit.verifyErrorMsg();
	}
	
	@Test(description="verify submit",priority=27,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC016_TC036(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC016_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC016_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC004.class);
		landreq.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC016_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC016_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC016_TC027 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC027.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC016_TC028 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC028.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC016_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC029.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC016_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC031.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC016_TC033 invaliduploaddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC033.class);
		invaliduploaddocument.UploadInvalidDocument();
		invaliduploaddocument.verifyErrorMsg();
		
		NRDA_LandManagement_SC016_TC036 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC016_TC036.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}

}
