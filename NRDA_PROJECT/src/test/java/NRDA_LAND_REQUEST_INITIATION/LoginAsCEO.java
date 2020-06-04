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
public class LoginAsCEO extends URLPageWSNRDAScript
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
	@DataProvider(name="CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Land_CEO");
	}
	
	@Test(description="verify dashboard",priority=0,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify land section",priority=1,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
	}
	
	@Test(description="verify land request initaition",priority=2,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
	}
	
	@Test(description="verify pagination",priority=3,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC005 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC005.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action date",priority=4,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC006 actiodate=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC006.class);
		actiodate.verifyActionDate();
	}
	
	@Test(description="verify action by",priority=5,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC007 actioby=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC007.class);
		actioby.verifyAcyionBy();
	}
	
	@Test(description="verify app num",priority=6,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC008 appnum=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC008.class);
		appnum.verifyApplicationNum();
	}
	
	@Test(description="verify marked to",priority=7,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC009 markedto=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC009.class);
		markedto.verifyMarkedTo();
	}
	
	@Test(description="verify pending days",priority=8,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC010 pendingdays=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC010.class);
		pendingdays.verifyPendingDays();
	}
	
	@Test(description="verify input box",priority=9,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC011 inputbox=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC011.class);
		inputbox.verifyDisplay();
	}
	
	@Test(description="verify invalid app num",priority=10,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC012 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC012.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid app num",priority=11,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=12,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=13,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC015 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC015.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=14,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC016 print=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC016.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=15,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC017 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC017.class);
		requesdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=16,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC017 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC017.class);
		requesdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC020_TC018 map=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC018.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify land details",priority=17,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC026.class);
		landdetails.clickOnLandDetails();
	}
	
	@Test(description="verify view",priority=18,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC020_TC027 view=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC027.class);
		view.clickOnView();
	}
	
	@Test(description="verify view",priority=19,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC026 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC026.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC020_TC028 view=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC028.class);
		view.clickOnView();
	}
	
	@Test(description="verify select approve",priority=20,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC029 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC029.class);
		approve.selectApprove();
	}
	
	@Test(description="verify blank comment",priority=21,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC029 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC029.class);
		approve.selectApprove();
		
		NRDA_LandManagement_SC020_TC030 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC030.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=22,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC029 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC029.class);
		approve.selectApprove();
		
		NRDA_LandManagement_SC020_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC031.class);
		comment.enterComment();
	}
	
	@Test(description="verify valid upload",priority=23,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC029 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC029.class);
		approve.selectApprove();
		
		NRDA_LandManagement_SC020_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC031.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC020_TC032 validupload=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC032.class);
		validupload.uploadValidDocument();
		validupload.verifyUploadMsg();
	}
	
	@Test(description="verify invalid upload",priority=24,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC029 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC029.class);
		approve.selectApprove();
		
		NRDA_LandManagement_SC020_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC031.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC020_TC033 invalidupload=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC033.class);
		invalidupload.UploadInvalidDocument();
		invalidupload.verifyErrorMsg();
	}
	
	@Test(description="verify close",priority=25,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC034 close=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC034.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=26,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC041(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC013 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC013.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC014 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC014.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC029 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC029.class);
		approve.selectApprove();
		
		NRDA_LandManagement_SC020_TC031 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC031.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC020_TC033 invalidupload=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC033.class);
		invalidupload.UploadInvalidDocument();
		//invalidupload.verifyErrorMsg();
		
		NRDA_LandManagement_SC020_TC041 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC041.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
	
	@Test(description="verify application number",priority=27,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC051(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action",priority=28,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC052(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
	}
	
	@Test(description="verify download letter",priority=29,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC053(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
	}
	
	@Test(description="verify download govt pdf",priority=30,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC054(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC054 govtpdf=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC054.class);
		govtpdf.clickOnDownloadGovtPdf();
	}
	
	@Test(description="verify govt transfer letter",priority=31,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC055(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC055 govttrasferletter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC055.class);
		govttrasferletter.clickOnGovtTransferLetter();
	}
	
	@Test(description="verify download khasra pdf",priority=32,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC056(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC056 downloadkhasrapdf=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC056.class);
		downloadkhasrapdf.clickOnDownloadKhasraPdf();
	}
	
	@Test(description="verify khasra letter",priority=33,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC057(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC057 khasraletter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC057.class);
		khasraletter.clickOnkhasraLetter();
	}
	
	@Test(description="verify download mutaul pdf",priority=34,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC058(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC058 mutualpdf=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC058.class);
		mutualpdf.clickOnMutualPdf();
	}
	
	@Test(description="verify download mutaul letter",priority=35,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC059(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC059 mutualletter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC059.class);
		mutualletter.clickOnMutualLetter();
	}

	@Test(description="verify signed letter",priority=36,dataProvider="CEO")
	public void NRDA_LandManagement_SC020_TC060(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);
		
		NRDA_LandManagement_SC020_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC020_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC004.class);
		landrequest.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC020_TC051 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC051.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC020_TC052 action=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC052.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC020_TC053 letter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC053.class);
		letter.clickOnDownloadLetter();
		
		NRDA_LandManagement_SC020_TC060 signedletter=PageFactory.initElements(driver,NRDA_LandManagement_SC020_TC060.class);
		signedletter.verifySignedLetter();
	}


}
