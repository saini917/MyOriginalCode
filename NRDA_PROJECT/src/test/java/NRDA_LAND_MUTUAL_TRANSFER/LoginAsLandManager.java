package NRDA_LAND_MUTUAL_TRANSFER;

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
public class LoginAsLandManager extends URLPageWSNRDAScript{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,100);
		wait1.until(ExpectedConditions.visibilityOf(web1));
		HighlightOnElement(web1);
		wait1.until(ExpectedConditions.elementToBeClickable(web1));
		action.moveToElement(web1).build().perform();
		waitForDomElement();

		WebElement logout=driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
		wait1.until(ExpectedConditions.visibilityOf(logout));
		HighlightOnElement(logout);
		wait1.until(ExpectedConditions.elementToBeClickable(logout));
		logout.click();
		
		driver.close();
	}
	@DataProvider(name="LAND MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		return exceldata.getCellData(filepath,"Land_Manager");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify land section",priority=1,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
		
	}
	
	@Test(description="verify click on land diversion request",priority=2,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
	}
	
	@Test(description="verify app textbox",priority=3,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC005 apptextbox=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC005.class);
		apptextbox.verifyApplicationInputBox();
	}
	
	
	@Test(description="verify invalid application num",priority=4,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid application num",priority=5,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify application dashboard",priority=6,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC008 applicationdashboard=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		applicationdashboard.verifyDisplayList();
	}
	
	@Test(description="verify pagination",priority=7,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action",priority=8,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=9,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=10,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC012 print=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify bank details",priority=11,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC013 bankdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		bankdetails.clickOnBankDetails();
	}
	
	@Test(description="verify open map",priority=12,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC013 bankdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		bankdetails.clickOnBankDetails();
		
		NRDA_LandManagement_SC003_TC014 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC014.class);
		openmap.clickOnOpenMap();
		openmap.closePopUp();
	}
	
	@Test(description="verify land details",priority=13,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC015.class);
		landdetails.verifyLandDetails();
		landdetails.clickOnSurvey();
		landdetails.verifyPriceSchedule();
		landdetails.clickOnClose();
		landdetails.clickOnNo();
		landdetails.clickOnClose();
		landdetails.clickOnYes();
	}
	
	@Test(description="verify select action forward",priority=14,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC016.class);
		forward.selectForward();
	}
	
	@Test(description="verify select action planning section",priority=15,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC003_TC017 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC017.class);
		planningsection.selectPlanningSection();
	}
	
	@Test(description="verify select user",priority=16,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC003_TC017 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC017.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC003_TC018 user=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC018.class);
		user.selectPlanningSectionManager();
	}
	
	@Test(description="verify blank comment",priority=17,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC003_TC017 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC017.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC003_TC018 user=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC018.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC003_TC019 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC019.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=18,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC020 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC020.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid document",priority=19,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC021 invaliduploaddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC021.class);
		invaliduploaddocument.uploadInvalidDocument();
		invaliduploaddocument.verifyErrorMsg();
	}
	
	@Test(description="verify valid document",priority=20,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC022 uploaddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC022.class);
		uploaddocument.uploadValidDocument();
		uploaddocument.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=21,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC023 close=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC023.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=22,dataProvider="LAND MANAGER")
	public void NRDA_LandManagement_SC003_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandManager(username,password);
		
		NRDA_LandManagement_SC003_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC003_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		landreq.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC003_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC003_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC003_TC016 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC016.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC003_TC017 planningsection=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC017.class);
		planningsection.selectPlanningSection();
		
		NRDA_LandManagement_SC003_TC018 user=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC018.class);
		user.selectPlanningSectionManager();
		
		NRDA_LandManagement_SC003_TC020 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC020.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC003_TC022 uploaddocument=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC022.class);
		uploaddocument.uploadValidDocument();
		uploaddocument.verifyUploadMsg();
		
		NRDA_LandManagement_SC003_TC024 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC024.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}

}
