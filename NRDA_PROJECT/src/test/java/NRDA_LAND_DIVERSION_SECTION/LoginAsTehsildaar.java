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
public class LoginAsTehsildaar extends URLPageWSNRDAScript
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
	@DataProvider(name="Tehsildaar")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Land_Tehsildaar");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify land section",priority=1,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
		
	}
	
	@Test(description="verify land diversion request",priority=2,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
	}
	
	@Test(description="verify Application input box",priority=3,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC005 inputbox=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC005.class);
		inputbox.verifyApplicationInputBox();
	}
	
	@Test(description="verify invalid Application number",priority=4,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC006.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid Application number",priority=5,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify Application dashbaord",priority=6,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC008 displays=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		displays.verifyDisplayList();
	}
	
	@Test(description="verify pagination",priority=7,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action",priority=8,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=9,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC011.class);
		notesheet.verifyNoteSheet();
	}
	
	@Test(description="verify print",priority=10,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC012 print=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC012.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details tab",priority=11,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC013 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC013.class);
		requestdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=12,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC013 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC013.class);
		requestdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC002_TC014 map=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC014.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify land details",priority=13,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC015.class);
		landdetails.clickOnLandDetails();
	}
	
	@Test(description="verify select forward",priority=14,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
	}
	
	@Test(description="verify select user",priority=15,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC002_TC017 user=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC017.class);
		user.selectLandManager();
	}
	
	@Test(description="verify blank comment",priority=16,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC002_TC017 user=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC017.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC002_TC018 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC018.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=17,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC002_TC017 user=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC017.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC002_TC019 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC019.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid document",priority=18,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC002_TC017 user=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC017.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC002_TC019 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC019.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC002_TC020 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC020.class);
		invalid.UploadInvalidDocument();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid document",priority=19,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC002_TC017 user=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC017.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC002_TC019 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC019.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC002_TC021 validdoc=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC021.class);
		validdoc.uploadValidDocument();
		validdoc.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=20,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC022 close=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC022.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=21,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC002_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC002_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC004 request=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		request.clickOnLandDiversion();
		
		NRDA_LandManagement_SC002_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC002_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC002_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC002_TC017 user=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC017.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC002_TC019 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC019.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC002_TC021 validdoc=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC021.class);
		validdoc.uploadValidDocument();
		validdoc.verifyUploadMsg();
		
		NRDA_LandManagement_SC002_TC023 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC023.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}

}


