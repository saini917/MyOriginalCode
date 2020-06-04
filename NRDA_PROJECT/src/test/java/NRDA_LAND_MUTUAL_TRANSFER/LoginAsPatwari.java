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
public class LoginAsPatwari extends URLPageWSNRDAScript{
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
	
	@DataProvider(name="Patwari")
	public String[][] getExcelData() throws InvalidFormatException, IOException{
		return exceldata.getCellData(filepath,"Land_Patwari");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}

	@Test(description="verify eGovernance",priority=1,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();
		display.verifyDisplay();
	}

	@Test(description="verify Application form link",priority=2,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC005 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		display1.verifyApplicationFormLink();
	}

	@Test(description="verify Land Section",priority=3,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();
		applink.verifyLandSection();
	}

	@Test(description="verify Land encrochment Section",priority=4,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();
		encrochment.verifyProceedBtn();
	}

	@Test(description="verify procedd",priority=5,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();
	}

	@Test(description="verify select khasra ",priority=6,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC009 selectkhasra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		selectkhasra.clickOnKhasraNum();
		selectkhasra.selectTehsilName();
		selectkhasra.selectVillageName();
		selectkhasra.selectKhasraNo();
		selectkhasra.clickOnFillInForm();
	}

	@Test(description="verify owner name ",priority=7,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC010 ownername=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		ownername.verifyOwnerName();
	}

	@Test(description="verify enter all details ",priority=8,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC011 details=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		details.verifyRelationshipWithOwner();
		details.verifyApplicantName();
		details.verifyFatherName();
		details.verifyGender();
		details.selectDateOfBirth();
		details.verifyMobileNumber();
		details.verifyEmailId();
		details.verifyCaste();
		details.verifyRehabilitationType();
		details.verifyPurpose();
	}

	@Test(description="verify open map ",priority=9,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC012 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		map.clickOnViewMap();
		map.closeMapPopUp();
	}

	@Test(description="verify select village and khasra num and click on cancel",priority=10,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC012 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		map.clickOnViewMap();

		NRDA_LandManagement_SC001_TC013 kahsra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		kahsra.clickOnKhasraNumToMark();
		kahsra.selectVillage();
		kahsra.selectKhasraNum();
		kahsra.clickOnCancel();
		kahsra.closeMapPopUp();
	}

	@Test(description="verify select village and khasra num and click on add",priority=11,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC012 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		map.clickOnViewMap();

		NRDA_LandManagement_SC001_TC013 kahsra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		kahsra.clickOnKhasraNumToMark();
		kahsra.selectVillage();
		kahsra.selectKhasraNum();

		NRDA_LandManagement_SC001_TC014 add=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC014.class);
		add.clickOnAdd();
		add.closeMapPopUp();
	}

	@Test(description="verify cnacel geometry khasra",priority=12,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC012 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		map.clickOnViewMap();

		NRDA_LandManagement_SC001_TC013 kahsra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		kahsra.clickOnKhasraNumToMark();
		kahsra.selectVillage();
		kahsra.selectKhasraNum();

		NRDA_LandManagement_SC001_TC014 add=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC014.class);
		add.clickOnAdd();

		NRDA_LandManagement_SC001_TC015 savegeometry=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC015.class);
		savegeometry.clickOnSaveKhasraGeometry();
		savegeometry.enterRemarks();
		savegeometry.clickOnCancel();
		savegeometry.closeMapPopUp();
	}

	@Test(description="verify save geometry khasra",priority=13,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC012 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		map.clickOnViewMap();
	
		NRDA_LandManagement_SC001_TC013 kahsra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		kahsra.clickOnKhasraNumToMark();
		kahsra.selectVillage();
		kahsra.selectKhasraNum();

		NRDA_LandManagement_SC001_TC014 add=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC014.class);
		add.clickOnAdd();

		NRDA_LandManagement_SC001_TC015 savegeometry=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC015.class);
		savegeometry.clickOnSaveKhasraGeometry();
		savegeometry.enterRemarks();

		NRDA_LandManagement_SC001_TC016 ok=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC016.class);
		ok.clickOnSave();
		ok.clickOnOk();
		ok.closeMapPopUp();
	}

	@Test(description="verify update",priority=14,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC012 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		map.clickOnViewMap();

		NRDA_LandManagement_SC001_TC013 kahsra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		kahsra.clickOnKhasraNumToMark();
		kahsra.selectVillage();
		kahsra.selectKhasraNum();

		NRDA_LandManagement_SC001_TC014 add=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC014.class);
		add.clickOnAdd();

		NRDA_LandManagement_SC001_TC015 savegeometry=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC015.class);
		savegeometry.clickOnSaveKhasraGeometry();
		savegeometry.enterRemarks();

		NRDA_LandManagement_SC001_TC016 ok=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC016.class);
		ok.clickOnSave();
		ok.clickOnOk();

		NRDA_LandManagement_SC001_TC017 update=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC017.class);
		update.clickOnUpdate();
	}

	@Test(description="verify reset",priority=15,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC009 selectkhasra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		selectkhasra.clickOnKhasraNum();
		selectkhasra.selectTehsilName();
		selectkhasra.selectVillageName();
		selectkhasra.selectKhasraNo();
		selectkhasra.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC010 ownername=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		ownername.verifyOwnerName();

		NRDA_LandManagement_SC001_TC011 details=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		details.verifyRelationshipWithOwner();
		details.verifyApplicantName();
		details.verifyFatherName();
		details.verifyGender();
		details.selectDateOfBirth();
		details.verifyMobileNumber();
		details.verifyEmailId();
		details.verifyCaste();
		details.verifyRehabilitationType();
		details.verifyPurpose();

		NRDA_LandManagement_SC001_TC018 reset=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC018.class);
		reset.clickOnReset();
	}

	@Test(description="verify close",priority=16,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC019 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC019.class);
		close.clickOnClose();
		close.clickOnNo();
		close.clickOnClose();
		close.clickOnYes();
	}

	@Test(description="verify next",priority=17,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC009 selectkhasra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		selectkhasra.clickOnKhasraNum();
		selectkhasra.selectTehsilName();
		selectkhasra.selectVillageName();
		selectkhasra.selectKhasraNo();
		selectkhasra.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC010 ownername=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		ownername.verifyOwnerName();

		NRDA_LandManagement_SC001_TC011 details=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		details.verifyRelationshipWithOwner();
		//details.verifyApplicantName();
		details.verifyFatherName();
		details.verifyGender();
		details.selectDateOfBirth();
		details.verifyMobileNumber();
		details.verifyEmailId();
		details.verifyCaste();
		details.verifyRehabilitationType();
		details.verifyPurpose();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();
	}

	@Test(description="verify corresspondance address",priority=18,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC021 corresepondanceadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC021.class);
		corresepondanceadd.selectDistrict();
		corresepondanceadd.selectTehsil();
		corresepondanceadd.selectVillage();
		corresepondanceadd.enterHouseNum();
		corresepondanceadd.enterPostOffice();
		corresepondanceadd.enterPindCode();
	}

	@Test(description="verify next",priority=19,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();
	}

	@Test(description="verify serach bank detials by bank name",priority=20,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC023 bankname=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		bankname.clickOnSearchBy();
		bankname.selectState();
		bankname.selectDistrict();
		bankname.selectCity();
		bankname.serachByBankName();
		bankname.selectBankName();
		bankname.selectBankBranch();
		bankname.clickOnFillInForm();
	}

	@Test(description="verify serach bank detials by IFSC code",priority=21,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC023 bankname=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		bankname.clickOnSearchBy();
		bankname.selectState();
		bankname.selectDistrict();
		bankname.selectCity();

		NRDA_LandManagement_SC001_TC024 ifscode=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		ifscode.serachByIFSCode();
		ifscode.selectIFSCode();
		ifscode.clickOnFillInForm();
	}

	@Test(description="verify enter acc num and acc holder name",priority=22,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC023 bankname=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		bankname.clickOnSearchBy();
		bankname.selectState();
		bankname.selectDistrict();
		bankname.selectCity();

		NRDA_LandManagement_SC001_TC024 ifscode=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		ifscode.serachByIFSCode();
		ifscode.selectIFSCode();
		ifscode.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC025 acc=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC025.class);
		acc.enterAccountNum();
		acc.enterAccountHolderName();
	}

	@Test(description="verify bank details next",priority=23,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();
	}

	@Test(description="verify declaration",priority=24,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC009 selectkhasra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		selectkhasra.clickOnKhasraNum();
		selectkhasra.selectTehsilName();
		selectkhasra.selectVillageName();
		selectkhasra.selectKhasraNo();
		selectkhasra.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC010 ownername=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		ownername.verifyOwnerName();

		NRDA_LandManagement_SC001_TC011 details=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		details.verifyRelationshipWithOwner();
		details.verifyApplicantName();
		details.verifyFatherName();
		details.verifyGender();
		details.selectDateOfBirth();
		details.verifyMobileNumber();
		details.verifyEmailId();
		details.verifyCaste();
		details.verifyRehabilitationType();
		details.verifyPurpose();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC021 corresepondanceadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC021.class);
		corresepondanceadd.selectDistrict();
		corresepondanceadd.selectTehsil();
		corresepondanceadd.selectVillage();
		corresepondanceadd.enterHouseNum();
		corresepondanceadd.enterPostOffice();
		corresepondanceadd.enterPindCode();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC023 bankname=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		bankname.clickOnSearchBy();
		bankname.selectState();
		bankname.selectDistrict();
		bankname.selectCity();

		NRDA_LandManagement_SC001_TC024 ifscode=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		ifscode.serachByIFSCode();
		ifscode.selectIFSCode();
		ifscode.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC025 acc=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC025.class);
		acc.enterAccountNum();
		acc.enterAccountHolderName();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();

		NRDA_LandManagement_SC001_TC027 declarartion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC027.class);
		declarartion.verifyIWE();
		declarartion.verifySO();
		declarartion.verifyCaste();
	}

	@Test(description="verify declarations",priority=25,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC009 selectkhasra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		selectkhasra.clickOnKhasraNum();
		selectkhasra.selectTehsilName();
		selectkhasra.selectVillageName();
		selectkhasra.selectKhasraNo();
		selectkhasra.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC010 ownername=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		ownername.verifyOwnerName();

		NRDA_LandManagement_SC001_TC011 details=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		details.verifyRelationshipWithOwner();
		details.verifyApplicantName();
		details.verifyFatherName();
		details.verifyGender();
		details.selectDateOfBirth();
		details.verifyMobileNumber();
		details.verifyEmailId();
		details.verifyCaste();
		details.verifyRehabilitationType();
		details.verifyPurpose();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC021 corresepondanceadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC021.class);
		corresepondanceadd.selectDistrict();
		corresepondanceadd.selectTehsil();
		corresepondanceadd.selectVillage();
		corresepondanceadd.enterHouseNum();
		corresepondanceadd.enterPostOffice();
		corresepondanceadd.enterPindCode();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC023 bankname=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		bankname.clickOnSearchBy();
		bankname.selectState();
		bankname.selectDistrict();
		bankname.selectCity();

		NRDA_LandManagement_SC001_TC024 ifscode=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		ifscode.serachByIFSCode();
		ifscode.selectIFSCode();
		ifscode.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC025 acc=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC025.class);
		acc.enterAccountNum();
		acc.enterAccountHolderName();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();

		NRDA_LandManagement_SC001_TC028 declarartion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		declarartion.enterResidenceOf();
		declarartion.enterTehsil();
		declarartion.enterDistrict();
	}

	@Test(description="verify declaration next",priority=26,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();

		NRDA_LandManagement_SC001_TC029 declarationnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		declarationnext.clickOnDeclarationNext();
	}

	@Test(description="verify invalid document",priority=27,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();

		NRDA_LandManagement_SC001_TC029 declarationnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		declarationnext.clickOnDeclarationNext();

		NRDA_LandManagement_SC001_TC030 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC030.class);
		invalid.uploadLetter();
		invalid.khasraPaanchsala();
		invalid.patwariReport();
		invalid.getErrorMsg();
	}

	@Test(description="verify valid document",priority=28,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();

		NRDA_LandManagement_SC001_TC029 declarationnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		declarationnext.clickOnDeclarationNext();

		NRDA_LandManagement_SC001_TC031 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		valid.uploadLetter();
		valid.khasraPaanchsala();
		valid.patwariReport();
		valid.verifyUploadMsg();
	}

	@Test(description="verify submit",priority=29,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC006 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		applink.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC007 encrochment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		encrochment.clickOnLandSection();
		encrochment.clickOnLandMutualTransfer();

		NRDA_LandManagement_SC001_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC009 selectkhasra=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		selectkhasra.clickOnKhasraNum();
		selectkhasra.selectTehsilName();
		selectkhasra.selectVillageName();
		selectkhasra.selectKhasraNo();
		selectkhasra.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC010 ownername=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		ownername.verifyOwnerName();

		NRDA_LandManagement_SC001_TC011 details=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		details.verifyRelationshipWithOwner();
		details.verifyApplicantName();
		details.verifyFatherName();
		details.verifyGender();
		details.selectDateOfBirth();
		details.verifyMobileNumber();
		details.verifyEmailId();
		details.verifyCaste();
		details.verifyRehabilitationType();
		details.verifyPurpose();

		NRDA_LandManagement_SC001_TC020 next=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		next.clickOnNext();

		NRDA_LandManagement_SC001_TC021 corresepondanceadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC021.class);
		corresepondanceadd.selectDistrict();
		corresepondanceadd.selectTehsil();
		corresepondanceadd.selectVillage();
		corresepondanceadd.enterHouseNum();
		corresepondanceadd.enterPostOffice();
		corresepondanceadd.enterPindCode();

		NRDA_LandManagement_SC001_TC022 corresspondacenext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		corresspondacenext.clickOnCorresspondanceNext();

		NRDA_LandManagement_SC001_TC023 bankname=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		bankname.clickOnSearchBy();
		bankname.selectState();
		bankname.selectDistrict();
		bankname.selectCity();

		NRDA_LandManagement_SC001_TC024 ifscode=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		ifscode.serachByIFSCode();
		ifscode.selectIFSCode();
		ifscode.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC025 acc=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC025.class);
		acc.enterAccountNum();
		acc.enterAccountHolderName();

		NRDA_LandManagement_SC001_TC026 bankdetailsnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		bankdetailsnext.clickOnBankDetailNext();

		NRDA_LandManagement_SC001_TC028 declarartion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		declarartion.enterResidenceOf();
		declarartion.enterTehsil();
		declarartion.enterDistrict();
		declarartion.clickOnOwnership();

		NRDA_LandManagement_SC001_TC029 declarationnext=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		declarationnext.clickOnDeclarationNext();

		NRDA_LandManagement_SC001_TC031 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		valid.uploadLetter();
		valid.khasraPaanchsala();
		valid.patwariReport();
		//valid.verifyUploadMsg();

		NRDA_LandManagement_SC001_TC034 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC034.class);
		submit.clickOnSubmit();
		submit.getApplicationNum();
	}

	@Test(description="verify note sheet",priority=30,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC035(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();
		notesheet.verifyNoteSheet();
	}

	@Test(description="verify khasra details",priority=31,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC036(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC036 khasradetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC036.class);
		khasradetails.verifyKhasraDetails();
	}

	@Test(description="verify address",priority=32,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC037(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC037 address=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC037.class);
		address.verifyCorrespondanceAddress();
	}

	@Test(description="verify bank details",priority=33,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC038(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC038 bankdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC038.class);
		bankdetails.verifyBankDetails();
	}

	@Test(description="verify declaration",priority=34,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC039(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC039 declaration=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC039.class);
		declaration.verifyDeclaration();
	}

	@Test(description="verify upload",priority=35,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC040(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC040 upload=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC040.class);
		upload.verifyUpload();
	}

	@Test(description="verify open map",priority=36,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC041(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC040 upload=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC040.class);
		upload.verifyUpload();

		NRDA_LandManagement_SC001_TC041 map=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC041.class);
		map.verifyOpenMap();
		map.clickOnUpdate();
	}

	@Test(description="verify land details",priority=37,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC042(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC042 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC042.class);
		landdetails.verifyLandDetails();
		landdetails.clickOnSurvey();
		landdetails.closePopUp();
	}

	@Test(description="verify price schedule",priority=38,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC043(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC042 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC042.class);
		landdetails.verifyLandDetails();
		landdetails.clickOnSurvey();

		NRDA_LandManagement_SC001_TC043 priceschedule=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC043.class);
		priceschedule.verifyPriceSchedule();
		priceschedule.verifyTotalAmount();
		priceschedule.enterRemarks();
		priceschedule.closePopUp();
	}

	@Test(description="verify land details survey close",priority=38,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC044(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC042 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC042.class);
		landdetails.verifyLandDetails();
		landdetails.clickOnSurvey();

		NRDA_LandManagement_SC001_TC043 priceschedule=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC043.class);
		priceschedule.verifyPriceSchedule();

		NRDA_LandManagement_SC001_TC044 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC044.class);
		close.clickOnClose();
		close.clickOnNo();
		close.clickOnClose();
		close.clickOnYes();
	}

	@Test(description="verify land details survey submit",priority=39,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC045(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC042 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC042.class);
		landdetails.verifyLandDetails();
		landdetails.clickOnSurvey();

		NRDA_LandManagement_SC001_TC043 priceschedule=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC043.class);
		priceschedule.verifyPriceSchedule();
		priceschedule.verifyTotalAmount();
		priceschedule.enterRemarks();

		NRDA_LandManagement_SC001_TC045 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC045.class);
		submit.clickOnSubmit();
	}

	@Test(description="verify forward",priority=40,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC046(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC046 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC046.class);
		forward.selectForward();
	}

	@Test(description="verify AM",priority=41,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC047(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC046 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC046.class);
		forward.selectForward();

		NRDA_LandManagement_SC001_TC047 AM=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC047.class);
		AM.selectAM();
	}

	@Test(description="verify subject and file num",priority=42,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC048(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC046 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC046.class);
		forward.selectForward();

		NRDA_LandManagement_SC001_TC047 AM=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC047.class);
		AM.selectAM();

		NRDA_LandManagement_SC001_TC048 readable=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC048.class);
		readable.verifyReadableSubject();
		readable.verifyReadableFileNum();
	}

	@Test(description="verify create new file and clear",priority=43,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC049(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC049 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC049.class);
		createfile.clickOnSearch();
		createfile.clickOnCreateNewFile();
		createfile.enterSubject();
		createfile.enterFileNumber();
		createfile.selectType();
		createfile.selectCategory();
		createfile.selectDept();
		createfile.clickOnClear();
		createfile.verifyClosePopUpWindow();
		createfile.verifyClosePopUpWindow1();
	}

	@Test(description="verify submit",priority=44,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC050(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC049 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC049.class);
		createfile.clickOnSearch();
		createfile.clickOnCreateNewFile();
		createfile.enterSubject();
		createfile.enterFileNumber();
		createfile.selectType();
		createfile.selectCategory();
		createfile.selectDept();

		NRDA_LandManagement_SC001_TC050 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC050.class);
		submit.clickOnSubmit();
		submit.verifyClosePopUpWindow1();
	}

	@Test(description="verify invalid search",priority=45,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC051(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC049 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC049.class);
		createfile.clickOnSearch();

		NRDA_LandManagement_SC001_TC051 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC051.class);
		invalid.enterInvalidSubject();
		invalid.enterInvalidFileNumber();
		invalid.clickOnSearch();
		invalid.verifyErrorMsg();
		invalid.verifyClosePopUpWindow1();
	}

	@Test(description="verify valid search",priority=46,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC052(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC049 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC049.class);
		createfile.clickOnSearch();

		NRDA_LandManagement_SC001_TC052 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC052.class);
		valid.enterValidSubject();
		valid.clickOnSearch();
		valid.verifyClosePopUpWindow1();
	}

	@Test(description="verify fill in form",priority=47,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC053(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC049 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC049.class);
		createfile.clickOnSearch();

		NRDA_LandManagement_SC001_TC052 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC052.class);
		valid.enterValidSubject();
		valid.clickOnSearch();

		NRDA_LandManagement_SC001_TC053 fillinform=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC053.class);
		fillinform.selectRecord();
		fillinform.clickOnFillInForm();
	}

	@Test(description="verify blank comment",priority=48,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC054(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC046 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC046.class);
		forward.selectForward();

		NRDA_LandManagement_SC001_TC047 AM=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC047.class);
		AM.selectAM();

		NRDA_LandManagement_SC001_TC054 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC054.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}

	@Test(description="verify comment",priority=48,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC055(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC055 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC055.class);
		comment.enterComment();
	}

	@Test(description="verify invalid upload",priority=49,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC056(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC056 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC056.class);
		invalid.UploadInvalidDocument();
		invalid.verifyErrorMsg();
	}

	@Test(description="verify valid upload",priority=50,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC057(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC057 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC057.class);
		valid.clickOnUploadDocument();
		valid.verifyUploadMsg();
	}

	@Test(description="verify close",priority=51,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC058(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC058 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC058.class);
		close.clickOnClose();
	}

	@Test(description="verify submit",priority=52,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC059(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC035 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		notesheet.clickOnLandSection();
		notesheet.clickOnLandMutualTransfer();
		notesheet.enterApplicationNum();
		notesheet.clickOnAction();

		NRDA_LandManagement_SC001_TC049 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC049.class);
		createfile.clickOnSearch();

		NRDA_LandManagement_SC001_TC052 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC052.class);
		valid.enterValidSubject();
		valid.clickOnSearch();

		NRDA_LandManagement_SC001_TC053 fillinform=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC053.class);
		fillinform.selectRecord();
		fillinform.clickOnFillInForm();

		NRDA_LandManagement_SC001_TC046 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC046.class);
		forward.selectForward();

		NRDA_LandManagement_SC001_TC047 AM=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC047.class);
		AM.selectAM();

		NRDA_LandManagement_SC001_TC055 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC055.class);
		comment.enterComment();

		NRDA_LandManagement_SC001_TC057 valids=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC057.class);
		valids.clickOnUploadDocument();
		valids.verifyUploadMsg();

		NRDA_LandManagement_SC001_TC059 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC059.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
}
