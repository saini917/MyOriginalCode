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
public class LoginAsCEO  extends URLPageWSNRDAScript{
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

	@DataProvider(name="CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		return exceldata.getCellData(filepath,"Land_CEO");
	}

	@Test(description="verify dashboard",priority=0,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}

	@Test(description="verify land section",priority=1,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();
		section.verifyDisplay();
	}

	@Test(description="verify land encroachment process",priority=2,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();		
	}

	@Test(description="verify application search box",priority=3,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC005 searchbox=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC005.class);
		searchbox.verifyApplicationInputBox();
	}

	@Test(description="verify invalid application num",priority=3,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC006 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC006.class);
		invalid.enterInvalidApplicationNum();
		invalid.verifyErrorMsg();
	}

	@Test(description="verify valid application num",priority=4,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();
	}

	@Test(description="verify application dashboard",priority=5,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC008 appdash=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC008.class);
		appdash.verifyDisplayList();
	}

	@Test(description="verify pagination",priority=6,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC009 pagination=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC009.class);
		pagination.clickOnForward();
		pagination.clickOnBackward();
	}

	@Test(description="verify action",priority=7,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();
	}

	@Test(description="verify notesheet",priority=8,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC011 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC011.class);
		notesheet.verifyNoteSheet();
		notesheet.verifyDisplay();
	}

	@Test(description="verify print",priority=9,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC012 print=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC012.class);
		print.clickOnPrint();
	}

	@Test(description="verify khasra details",priority=10,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC013 khasradetails=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC013.class);
		khasradetails.clickOnKhasraDetails();
	}

	@Test(description="verify open map",priority=11,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC013 khasradetails=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC013.class);
		khasradetails.clickOnKhasraDetails();

		NRDA_LandManagement_SC007_TC014 map=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC014.class);
		map.clickOnOpenMap();
		map.closePopUp();
	}

	@Test(description="verify land details",priority=12,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC015.class);
		landdetails.clickOnLandDetails();
		landdetails.clickOnView();
		landdetails.clickOnView1();
	}

	@Test(description="verify survey",priority=13,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC015 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC015.class);
		landdetails.clickOnLandDetails();

		NRDA_LandManagement_SC007_TC016 survey=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC016.class);
		survey.clickOnSurvey();
		survey.verifyPriceSchedule();
		survey.clickOnClose();
		survey.clickOnNo();
		survey.clickOnClose();
		survey.clickOnYes();
	}

	@Test(description="verify approve",priority=14,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC017 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC017.class);
		approve.selectApprove();
	}

	@Test(description="verify blank comment",priority=15,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC017 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC017.class);
		approve.selectApprove();

		NRDA_LandManagement_SC007_TC018 submitwithotcomm=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC018.class);
		submitwithotcomm.clickOnSubmit();
		submitwithotcomm.verifyErrorMsg();
	}

	@Test(description="verify comment",priority=16,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC019 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC019.class);
		comment.enterComment();
	}

	@Test(description="verify invalid document",priority=17,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC020 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC020.class);
		invalid.uploadInvalidDocument();
		invalid.verifyErrorMsg();
	}

	@Test(description="verify valid document",priority=18,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC021 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC021.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();
	}

	@Test(description="verify close",priority=19,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC022 close=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC022.class);
		close.clickOnClose();
	}

	@Test(description="verify submit",priority=20,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC017 approve=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC017.class);
		approve.selectApprove();

		NRDA_LandManagement_SC007_TC019 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC019.class);
		comment.enterComment();

		NRDA_LandManagement_SC007_TC021 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC021.class);
		valids.uploadValidDocument();
		valids.verifyUploadMsg();

		NRDA_LandManagement_SC007_TC023 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC023.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}

	@Test(description="verify download leter",priority=21,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC031 download=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC031.class);
		download.clickOnDownloadLetter();
		download.verifyMutualLetter();
	}
	@Test(description="verify mutual leter",priority=22,dataProvider="CEO")
	public void NRDA_LandManagement_SC007_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage sectionmanager=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		sectionmanager.loginAsCEO(username,password);

		NRDA_LandManagement_SC007_TC003 section=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		section.clickOnLandSection();

		NRDA_LandManagement_SC007_TC004 landencroch=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC004.class);
		landencroch.clickOnLandMutualTrnasfer();

		NRDA_LandManagement_SC007_TC007 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC007.class);
		valid.enterApplicationNum();

		NRDA_LandManagement_SC007_TC010 action=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC010.class);
		action.clickOnAction();

		NRDA_LandManagement_SC007_TC031 download=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC031.class);
		download.clickOnDownloadLetter();

		NRDA_LandManagement_SC007_TC032 mutual=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC032.class);
		mutual.clickOnMutualLetter();
	}
}
