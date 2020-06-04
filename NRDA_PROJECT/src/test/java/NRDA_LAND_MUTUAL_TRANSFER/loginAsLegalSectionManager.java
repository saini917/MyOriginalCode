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
public class loginAsLegalSectionManager extends URLPageWSNRDAScript{
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
	
	@DataProvider(name="LEGAL SECTION MANAGER")
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		return exceldata.getCellData(filepath,"Legal_Section_Manager");
	}
	
	@Test(description="verify dashboard",priority=0,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
		
	}
	
	@Test(description="verify land section",priority=1,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		display.verifyDisplay();
	}
	
	@Test(description="verify land encroachment process",priority=2,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
	}
	
	@Test(description="verify application number",priority=3,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC005 searchbox=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC005.class);
		searchbox.verifyApplicationInputBox();
	}
	
	@Test(description="verify invalid app num",priority=4,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC006.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid app num",priority=5,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
	}
	
	@Test(description="verify display",priority=6,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC008 displays=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC008.class);
		displays.verifyDisplayList();
	}
	
	@Test(description="verify pagination",priority=7,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}
	
	@Test(description="verify action",priority=8,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
	}
	
	@Test(description="verify note sheet",priority=9,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC011.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}
	
	@Test(description="verify print",priority=10,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC012 print=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC012.class);
		print.clickOnPrint();
	}
	
	@Test(description="verify khasra detials",priority=11,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC013 khasradetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC013.class);
		khasradetails.clickOnKhasraDetails();
	}
	
	@Test(description="verify open map",priority=12,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC013 khasradetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC013.class);
		khasradetails.clickOnKhasraDetails();
		
		NRDA_LandManagement_SC005_TC014 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC014.class);
		openmap.clickOnOpenMap();
		openmap.closePopUp();
	}
	
	@Test(description="verify view",priority=13,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		landdetails.clickOnView();
	}
	
	@Test(description="verify add",priority=14,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 add=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		add.verifyAdd();
	}
	
	@Test(description="verify select case No",priority=15,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 add=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		add.verifyAdd();
		
		NRDA_LandManagement_SC005_TC017 caseno=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC017.class);
		caseno.selectCaseNo();
		caseno.clickOnUpdate();
	}
	
	@Test(description="verify select case yes",priority=15,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 add=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		add.verifyAdd();
		
		NRDA_LandManagement_SC005_TC018 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC018.class);
		caseyes.selectCaseYes();
	}
	
	@Test(description="verify select case yes fill all field",priority=16,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 add=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		add.verifyAdd();
		
		NRDA_LandManagement_SC005_TC018 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC018.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC019 filleddata=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		filleddata.enterCaseNo();
		filleddata.enterCaseDate();
		filleddata.selectCourtName();
		filleddata.enterRespondent();
		filleddata.enterNextHearingDate();
		filleddata.enterAppilantName();
		filleddata.enterLegalRemarks();
		filleddata.uploadValidDocument();
		filleddata.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=17,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 add=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		add.verifyAdd();
		
		NRDA_LandManagement_SC005_TC018 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC018.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC020 close=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC020.class);
		close.clickOnClose();
	}
	
	@Test(description="verify update",priority=18,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC016 add=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC016.class);
		add.verifyAdd();
		
		NRDA_LandManagement_SC005_TC018 caseyes=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC018.class);
		caseyes.selectCaseYes();
		
		NRDA_LandManagement_SC005_TC019 filleddata=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC019.class);
		filleddata.enterCaseNo();
		filleddata.enterCaseDate();
		filleddata.selectCourtName();
		filleddata.enterRespondent();
		filleddata.enterNextHearingDate();
		filleddata.enterAppilantName();
		filleddata.enterLegalRemarks();
		filleddata.uploadValidDocument();
		filleddata.verifyUploadMsg();
		
		NRDA_LandManagement_SC005_TC021 update=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC021.class);
		update.clickOnUpdate();
	}
	
	@Test(description="verify survey",priority=19,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC015.class);
		landdetails.clickOnLandDetails();
		
		NRDA_LandManagement_SC005_TC022 survey=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC022.class);
		survey.clickOnSurvey();
		survey.verifyPriceSchedule();
		survey.clickOnClose();
		survey.clickOnNo();
		survey.clickOnClose();
		survey.clickOnYes();
	}
	
	@Test(description="verify forward",priority=20,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC023 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC023.class);
		forward.selectForward();
	}
	
	@Test(description="verify land manager",priority=21,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC023 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC023.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC024 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC024.class);
		landmanager.selectLandSection();
	}
	
	@Test(description="verify user",priority=22,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC023 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC023.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC024 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC024.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC025 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		user.selectLandManager();
	}
	
	@Test(description="verify blank comment",priority=23,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		

		NRDA_LandManagement_SC005_TC023 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC023.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC024 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC024.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC025 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC005_TC026 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC026.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=24,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC027 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid document",priority=25,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC028 invalidocs=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC028.class);
		invalidocs.uploadInvalidDocument();
		invalidocs.verifyErrorMsg();
	}
	
	@Test(description="verify valid docs",priority=26,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC029 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC029.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=27,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC030 close=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC030.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=28,dataProvider="LEGAL SECTION MANAGER")
	public void NRDA_LandManagement_SC005_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsLegalSectionManager(username,password);
		
		NRDA_LandManagement_SC005_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC003.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC005_TC004 landrequest=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC004.class);
		landrequest.clickOnLandMutualTrnasfer();
		
		NRDA_LandManagement_SC005_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC007.class);
		valid.enterApplicationNum();
		
		NRDA_LandManagement_SC005_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC010.class);
		action.clickOnAction();
		
		NRDA_LandManagement_SC005_TC023 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC023.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC005_TC024 landmanager=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC024.class);
		landmanager.selectLandSection();
		
		NRDA_LandManagement_SC005_TC025 user=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC025.class);
		user.selectLandManager();
		
		NRDA_LandManagement_SC005_TC027 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC027.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC005_TC029 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC029.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
		
		NRDA_LandManagement_SC005_TC031 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC005_TC031.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
	
}
