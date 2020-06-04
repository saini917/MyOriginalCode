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
public class LoginAsPlanningSectionManager extends URLPageWSNRDAScript{
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
	@DataProvider(name="PLANNING SECTION MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		return exceldata.getCellData(filepath,"Planning_Section_Manager");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify land section",priority=1,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
		
	}
	
	@Test(description="verify click on land encroachment",priority=2,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
	}
	
	@Test(description="verify app textbox",priority=3,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC005 apptextbox=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC005.class);
		apptextbox.verifyApplicationInputBox();
	}
	
	
	@Test(description="verify invalid application num",priority=4,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid application num",priority=5,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify application dashboard",priority=6,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC008 applicationdashboard=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC008.class);
		applicationdashboard.verifyDisplayList();
	}
	
	@Test(description="verify pagination",priority=7,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action",priority=8,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=9,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC011.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=10,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC012 print=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC012.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify khasra details",priority=11,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC013 khasradetails=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC013.class);
		khasradetails.clickOnKhasraDetails();
	}
	
	@Test(description="verify open map",priority=12,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC014 map=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC014.class);
		map.clickOnBankDetails();
		map.clickOnOpenMap();
		map.closePopUp();
	}
	
	@Test(description="verify land details",priority=13,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC015.class);
		landdetails.clickOnLandDetails();
		landdetails.clickOnAdd();
	}
	
	@Test(description="verify updates",priority=14,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC015.class);
		landdetails.clickOnLandDetails();
		landdetails.clickOnAdd();
		
		NRDA_LandManagement_SC004_TC016 update=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC016.class);
		update.enterRemarks();
		update.clickOnUpdate();
	}
	
	@Test(description="verify survey",priority=15,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC004_TC017 survey=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC017.class);
		survey.clickOnSurvey();
		survey.verifyPriceSchedule();
		survey.clickOnClose();
		survey.clickOnNo();
		survey.clickOnClose();
		survey.clickOnYes();
		
	}
	
	@Test(description="verify forward",priority=16,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC018.class);
		forward.selectForward();
	}
	
	@Test(description="verify select legal section",priority=17,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC004_TC019 legalsection=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC019.class);
		legalsection.selectLegalSection();
	}
	
	@Test(description="verify user",priority=18,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC004_TC019 legalsection=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC019.class);
		legalsection.selectLegalSection();
		
		NRDA_LandManagement_SC004_TC020 user=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC020.class);
		user.selectLegalSectionManager();
	}
	
	@Test(description="verify blank comment",priority=19,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC004_TC019 legalsection=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC019.class);
		legalsection.selectLegalSection();
		
		NRDA_LandManagement_SC004_TC020 user=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC020.class);
		user.selectLegalSectionManager();
		
		NRDA_LandManagement_SC004_TC021 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC021.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=20,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC022 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC022.class);
		comment.enterComment();
	}
	
	@Test(description="verify valid document",priority=21,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC023 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC023.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
	}
	
	@Test(description="verify invalid document",priority=22,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC024 invalids=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC024.class);
		invalids.uploadInvalidDocument();
		invalids.verifyErrorMsg();
	}
	
	@Test(description="verify close",priority=23,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC025 close=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC025.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=24,dataProvider="PLANNING SECTION MANAGER")
	public void NRDA_LandManagement_SC004_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsPlanningSectionManager(username,password);
		
		NRDA_LandManagement_SC004_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC004_TC004 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		landreq.clickOnLandMutualTransfer();
		
		NRDA_LandManagement_SC004_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC004_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC004_TC018 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC018.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC004_TC019 legalsection=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC019.class);
		legalsection.selectLegalSection();
		
		NRDA_LandManagement_SC004_TC020 user=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC020.class);
		user.selectLegalSectionManager();
		
		NRDA_LandManagement_SC004_TC022 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC022.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC004_TC023 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC023.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
		
		NRDA_LandManagement_SC004_TC026 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC026.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
	
}
