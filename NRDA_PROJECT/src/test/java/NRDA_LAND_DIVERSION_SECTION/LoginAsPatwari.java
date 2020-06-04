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
public class LoginAsPatwari extends URLPageWSNRDAScript
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
	@DataProvider(name="Patwari")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Land_Patwari");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC002 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC002.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}

	@Test(description="verify Application form link",priority=1,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();
		display.verifyApplicationFormLink();
	}

	@Test(description="verify land section",priority=2,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();
		section.verifyLandSection();
	}

	@Test(description="verify land diversion section",priority=3,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();
		displaydiversion.verifyLandDiversion();
	}

	@Test(description="click on land diversion section",priority=4,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();
		displayproceed.verifyProceedBtn();
	}

	@Test(description="click on proceed",priority=5,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();
	}

	/*@Test(description="request details page",priority=6,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();
	}

	@Test(description="verify map",priority=7,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();

		NRDA_LandManagement_SC001_TC009 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		openmap.clickOnViewMap();
		openmap.closeMapPopUp();
	}

	@Test(description="verify map cancel",priority=8,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();

		NRDA_LandManagement_SC001_TC009 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		openmap.clickOnViewMap();

		NRDA_LandManagement_SC001_TC010 mapcancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		mapcancel.clickOnKhasraNumToMark();
		mapcancel.selectVillage();
		mapcancel.selectKhasraNum();
		mapcancel.clickOnCancel();
		mapcancel.closeMapPopUp();
	}

	@Test(description="verify map add",priority=9,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();

		NRDA_LandManagement_SC001_TC009 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		openmap.clickOnViewMap();

		NRDA_LandManagement_SC001_TC010 mapcancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		mapcancel.clickOnKhasraNumToMark();
		mapcancel.selectVillage();
		mapcancel.selectKhasraNum();

		NRDA_LandManagement_SC001_TC011 mapadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		mapadd.clickOnAdd();
		mapadd.closeMapPopUp();
	}

	@Test(description="verify save khasra geometry cancel",priority=10,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();

		NRDA_LandManagement_SC001_TC009 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		openmap.clickOnViewMap();

		NRDA_LandManagement_SC001_TC010 mapcancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		mapcancel.clickOnKhasraNumToMark();
		mapcancel.selectVillage();
		mapcancel.selectKhasraNum();

		NRDA_LandManagement_SC001_TC011 mapadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		mapadd.clickOnAdd();

		NRDA_LandManagement_SC001_TC012 savekhasrageometrycancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		savekhasrageometrycancel.clickOnSaveKhasraGeometry();
		savekhasrageometrycancel.enterRemarks();
		savekhasrageometrycancel.clickOnCancel();
		savekhasrageometrycancel.closeMapPopUp();
	}

	@Test(description="verify save khasra geometry save",priority=11,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();

		NRDA_LandManagement_SC001_TC009 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		openmap.clickOnViewMap();

		NRDA_LandManagement_SC001_TC010 mapcancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		mapcancel.clickOnKhasraNumToMark();
		mapcancel.selectVillage();
		mapcancel.selectKhasraNum();

		NRDA_LandManagement_SC001_TC011 mapadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		mapadd.clickOnAdd();

		NRDA_LandManagement_SC001_TC012 savekhasrageometrycancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		savekhasrageometrycancel.clickOnSaveKhasraGeometry();
		savekhasrageometrycancel.enterRemarks();

		NRDA_LandManagement_SC001_TC013 save=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		save.clickOnSave();
		save.clickOnOk();
		save.closeMapPopUp();
	}*/

	@Test(description="verify submit",priority=12,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC008 reqdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC008.class);
		reqdetailspage.selectExistingLandType();
		reqdetailspage.selectConvertedTo();
		reqdetailspage.enterPurpose();

		NRDA_LandManagement_SC001_TC009 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC009.class);
		openmap.clickOnViewMap();

		NRDA_LandManagement_SC001_TC010 mapcancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC010.class);
		mapcancel.clickOnKhasraNumToMark();
		mapcancel.selectVillage();
		mapcancel.selectKhasraNum();

		NRDA_LandManagement_SC001_TC011 mapadd=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC011.class);
		mapadd.clickOnAdd();

		NRDA_LandManagement_SC001_TC012 savekhasrageometrycancel=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC012.class);
		savekhasrageometrycancel.clickOnSaveKhasraGeometry();
		savekhasrageometrycancel.enterRemarks();

		NRDA_LandManagement_SC001_TC013 save=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC013.class);
		save.clickOnSave();
		save.clickOnOk();

		NRDA_LandManagement_SC001_TC014 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC014.class);
		submit.clickOnUpdate();
		submit.clickOnSubmit();
		submit.getApplicationNum();
	}

	@Test(description="verify close",priority=13,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC017 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC017.class);
		close.clickOnClose();
		close.clickOnClosePopUp();
	}
	@Test(description="verify close yes",priority=14,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC017 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC017.class);
		close.clickOnClose();

		NRDA_LandManagement_SC001_TC018 closeyes=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC018.class);
		closeyes.clickOnYes();
	}

	@Test(description="verify close no",priority=15,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC017 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC017.class);
		close.clickOnClose();

		NRDA_LandManagement_SC001_TC019 closeno=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC019.class);
		closeno.clickOnNo();
	}
	
	@Test(description="verify close no",priority=16,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC020 reset=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC020.class);
		reset.clickOnReset();
	}
	
	@Test(description="verify submit withot enter data",priority=17,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);

		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.clickOnEGovernance();

		NRDA_LandManagement_SC001_TC004 section=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC004.class);
		section.clickOnApplicationFormLink();

		NRDA_LandManagement_SC001_TC005 displaydiversion=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC005.class);
		displaydiversion.clickOnLandSection();

		NRDA_LandManagement_SC001_TC006 displayproceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC006.class);
		displayproceed.clickOnLandDiversion();

		NRDA_LandManagement_SC001_TC007 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC007.class);
		proceed.clickOnProceedBtn();

		NRDA_LandManagement_SC001_TC021 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC021.class);
		submit.clickOnSubmit();
		submit.getErrormMsg();
	}
	
	@Test(description="verify basic details",priority=17,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		basicdetails.verifyBasicDetails();
	}
	
	@Test(description="verify note sheet",priority=18,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC023 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC023.class);
		notesheet.verifyNoteSheet();
	}
	
	@Test(description="verify request details",priority=19,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC024 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		requestdetails.clickOnRequestDetails();
	}
	
	@Test(description="verify open map",priority=20,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC024 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		requestdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC001_TC025 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC025.class);
		openmap.verifyOpenMap();
		openmap.closeMapPopUp();
	}
	
	@Test(description="verify update",priority=21,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC024 requestdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC024.class);
		requestdetails.clickOnRequestDetails();
		
		NRDA_LandManagement_SC001_TC025 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC025.class);
		openmap.verifyOpenMap();
		
		NRDA_LandManagement_SC001_TC026 update=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC026.class);
		update.clickOnUpdate();
	}
	
	@Test(description="verify land details",priority=22,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC027(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC027 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC027.class);
		landdetails.clickOnLandDetails();
		landdetails.verifyDisplay();
	}
	
	@Test(description="verify forward",priority=23,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC028(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC028 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		forward.selectForward();
	}
	
	@Test(description="verify user",priority=24,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC029(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC028 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC001_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		user.selectAM();
	}
	
	@Test(description="verify subject and file num readable only",priority=25,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC030(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC030 readable=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC030.class);
		readable.verifyReadableSubject();
		readable.verifyReadableFileNum();
	}
	
	@Test(description="verify create new file",priority=26,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC031(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC031 create=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		create.clickOnSearch();
		create.clickOnCreateNewFile();
		create.enterSubject();
		create.enterFileNumber();
		create.selectType();
		create.selectCategory();
		create.selectDept();
		create.verifyClosePopUpWindow();
		create.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify clear",priority=27,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC032(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC031 create=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		create.clickOnSearch();
		create.clickOnCreateNewFile();
		create.enterSubject();
		create.enterFileNumber();
		create.selectType();
		create.selectCategory();
		create.selectDept();
		
		NRDA_LandManagement_SC001_TC032 clear=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC032.class);
		clear.clickOnClear();
		clear.verifyClosePopUpWindow();
		clear.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify submit",priority=29,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC033(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC031 create=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		create.clickOnSearch();
		create.clickOnCreateNewFile();
		create.enterSubject();
		create.enterFileNumber();
		create.selectType();
		create.selectCategory();
		create.selectDept();
		
		NRDA_LandManagement_SC001_TC033 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC033.class);
		submit.clickOnSubmit();
		submit.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify invalid subject and file",priority=30,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC034(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC031 create=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		create.clickOnSearch();
		
		NRDA_LandManagement_SC001_TC034 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC034.class);
		invalid.enterInvalidSubject();
		invalid.enterInvalidFileNumber();
		invalid.clickOnSearch();
		invalid.verifyErrorMsg();
		invalid.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify valid subject and file",priority=31,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC035(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC031 create=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		create.clickOnSearch();
		
		NRDA_LandManagement_SC001_TC035 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		valid.enterValidSubject();
		//valid.enterValidFileNumber();
		valid.clickOnSearch();
		valid.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify fill in form",priority=32,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC036(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC031 create=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC031.class);
		create.clickOnSearch();
		
		NRDA_LandManagement_SC001_TC035 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC035.class);
		valid.enterValidSubject();
		//valid.enterValidFileNumber();
		valid.clickOnSearch();
		
		NRDA_LandManagement_SC001_TC036 fillinform=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC036.class);
		fillinform.selectRecord();
		fillinform.clickOnFillInForm();
	}
	
	@Test(description="verify blank comment",priority=33,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC037(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC028 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC001_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		user.selectAM();
		
		NRDA_LandManagement_SC001_TC037 blank=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC037.class);
		blank.clickOnSubmit();
		blank.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=33,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC038(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC028 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC001_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		user.selectAM();
		
		NRDA_LandManagement_SC001_TC038 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC038.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid document",priority=34,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC039(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC039 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC039.class);
		invalid.UploadInvalidDocument();
		invalid.verifyErrorMsg();
	}
	
	@Test(description="verify valid document",priority=35,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC040(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC040 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC040.class);
		valid.clickOnUploadDocument();
		valid.verifyUploadMsg();
	}
	
	@Test(description="verify close",priority=36,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC041(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC041 close=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC041.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=37,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC042(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC022 basicdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC022.class);
		basicdetails.clickOnLandSection();
		basicdetails.clickOnLandDiversion();
		basicdetails.enterApplicationNum();
		basicdetails.clickOnAction();
		
		NRDA_LandManagement_SC001_TC028 forward=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC028.class);
		forward.selectForward();
		
		NRDA_LandManagement_SC001_TC029 user=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC029.class);
		user.selectAM();
		
		NRDA_LandManagement_SC001_TC038 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC038.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC001_TC040 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC040.class);
		valid.clickOnUploadDocument();
		valid.verifyUploadMsg();
		
		NRDA_LandManagement_SC001_TC042 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC042.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}


}
