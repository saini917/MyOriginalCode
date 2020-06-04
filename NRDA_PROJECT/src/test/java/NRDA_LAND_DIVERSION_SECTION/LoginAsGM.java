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
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

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
	public void NRDA_LandManagement_SC006_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify land section",priority=1,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
	}
	
	@Test(description="verify land encroachment process",priority=2,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
	}
	
	@Test(description="verify application search box",priority=3,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC005 appsearchbox=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC005.class);
		appsearchbox.verifyApplicationInputBox();
	}
	
	@Test(description="verify invalid application",priority=4,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC006.class);
		invalid.enterInvalidApplicationNum();
	}
	
	@Test(description="verify valid application",priority=5,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify application dashboard",priority=6,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC008 appdasgboard=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC008.class);
		appdasgboard.verifyDisplayList();
	}
	
	@Test(description="verify pagination",priority=7,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action",priority=8,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=9,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC011.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify request details",priority=10,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC013 reqdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC013.class);
		reqdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=11,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC013 reqdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC013.class);
		reqdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC006_TC014 map=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC014.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify land details",priority=12,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC015.class);
		landdetails.clickOnLandDetails();
	}
	

	@Test(description="verify land view details",priority=14,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC006_TC017 view=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC017.class);
		view.clickOnView();
	}
	
	@Test(description="verify forward",priority=16,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC018.class);
		forward.selectForward();
	}
	
	@Test(description="verify user",priority=17,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC006_TC019 user=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC019.class);
		user.selectCEO();
	}
	
	@Test(description="verify blank comment",priority=18,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC006_TC019 user=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC019.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC006_TC020 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC020.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=19,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC006_TC019 user=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC019.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC006_TC021 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC021.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid upload",priority=20,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC022 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC022.class);
		invalid.uploadInvalidDocument();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid upload",priority=21,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC023 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC023.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=22,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC024 close=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC024.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=23,dataProvider="GENERAL MANAGER")
	public void NRDA_LandManagement_SC006_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsGM(username,password);
		
		NRDA_LandManagement_SC006_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC006_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC004.class);
		landrequest.clickOnLandDiversion();
		
		NRDA_LandManagement_SC006_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC006_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC006_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC006_TC019 user=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC019.class);
		user.selectCEO();
		
		NRDA_LandManagement_SC006_TC021 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC021.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC006_TC023 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC023.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
		
		NRDA_LandManagement_SC006_TC025 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC006_TC025.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}


}
