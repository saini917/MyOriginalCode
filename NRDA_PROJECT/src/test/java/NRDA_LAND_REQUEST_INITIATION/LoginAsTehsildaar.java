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
	public void NRDA_LandManagement_SC011_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC011_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC011_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
		
	}
	
	@Test(description="verify land section",priority=1,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		display.verifyDisplay();
		
	}
	
	@Test(description="verify land request initiation process",priority=2,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
	}
	
	@Test(description="verify pagination",priority=3,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC003 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC003.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify Application num",priority=4,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC004 app=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC004.class);
		app.verifyApplicationNum();
	}
	
	@Test(description="verify Action by",priority=5,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC005 actionby=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC005.class);
		actionby.verifyAcyionBy();
	}
	
	@Test(description="verify Action date",priority=6,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC006 actiondate=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC006.class);
		actiondate.verifyActionDate();
	}
	
	@Test(description="verify Action date",priority=7,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC007 markedto=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC007.class);
		markedto.verifyMarkedTo();
	}
	
	@Test(description="verify pending days",priority=8,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC008 pendingdays=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC008.class);
		pendingdays.verifyPendingDays();
	}
	
	@Test(description="verify input box",priority=9,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC009 displays=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC009.class);
		displays.verifyDisplay();
	}

	@Test(description="verify invalid application number",priority=10,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC010 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC010.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid applicsation number",priority=11,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify action link",priority=12,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC012_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=13,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC013_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC013_TC001 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC013_TC001.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=14,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC013_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC013_TC002 print=PageFactory.initElements(driver,NRDA_LandManagement_SC013_TC002.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify request details",priority=15,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC014_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC014_TC001 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC014_TC001.class);
		requestdetails.clickOnRequestDetails();
	}

	@Test(description="verify open map",priority=16,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC014_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC014_TC001 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC014_TC001.class);
		requestdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC014_TC002 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC014_TC002.class);
		openmap.clickOnOpenMap();
		openmap.closePopUp();
	}
	
	@Test(description="verify land details",priority=17,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC014_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC014_TC003 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC014_TC003.class);
		landdetails.clickOnLandDetails();
		
	}
	
	@Test(description="verify action forward",priority=18,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
	}
	
	@Test(description="verify action user",priority=19,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
		NRDA_LandManagement_SC015_TC002 user=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC002.class);
		user.selectLandManager();
	}
	
	@Test(description="verify blank comment",priority=20,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
		NRDA_LandManagement_SC015_TC002 user=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC002.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC015_TC003 blankcomment=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC003.class);
		blankcomment.clickOnSubmit();
		blankcomment.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=21,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
		NRDA_LandManagement_SC015_TC002 user=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC002.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC015_TC004 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC004.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid upload document",priority=22,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
		NRDA_LandManagement_SC015_TC002 user=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC002.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC015_TC004 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC004.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC015_TC005 invaliddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC005.class);
		invaliddocument.UploadInvalidDocument();
		invaliddocument.verifyErrorMsg();
	}
	
	@Test(description="verify valid upload document",priority=23,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
		NRDA_LandManagement_SC015_TC002 user=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC002.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC015_TC004 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC004.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC015_TC006 validdocument=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC006.class);
		validdocument.uploadValidDocument();
		validdocument.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=24,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC007 close=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC007.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=25,dataProvider="Tehsildaar")
	public void NRDA_LandManagement_SC015_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandTehsildaar(username,password);
		
		NRDA_LandManagement_SC012_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC001.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC012_TC002 request=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC002.class);
		request.clickOnLandRequestInitiation();
		
		NRDA_LandManagement_SC012_TC011 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC011.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC012_TC012 action=PageFactory.initElements(driver,NRDA_LandManagement_SC012_TC012.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC015_TC001 actionforward=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC001.class);
		actionforward.selectForward();
		
		NRDA_LandManagement_SC015_TC002 user=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC002.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC015_TC004 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC004.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC015_TC006 validdocument=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC006.class);
		validdocument.uploadValidDocument();
		validdocument.verifyUploadMsg();
		
		NRDA_LandManagement_SC015_TC008 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC015_TC008.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
}
