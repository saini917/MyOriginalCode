package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_Estate_VerifyFunctionalityLoginAs_SectionEngineer extends URLPageWSNRDAScript {
	
	
	
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		action.moveToElement(web1).build().perform();
		waitForSomeTime();
		waitForSomeTime();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();

	}
	
	@DataProvider(name="SE_Estate")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"SectionEngineer_Credentials");
	}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Home Page of SE",priority=1)
	public void NRDA_Estate_SC_001_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifythedashboardoftheApplication();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Application Form Link",priority=2)
	public void NRDA_Estate_SC_001_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Estate And Project Section Link",priority=3)
	public void NRDA_Estate_SC_001_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyEstate_Project_SectionLink();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the New ProjectCreation Link",priority=4)
	public void NRDA_Estate_SC_001_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the ProceedButtonFunctionality",priority=5)
	public void NRDA_Estate_SC_001_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyProceedButtonFunctionality();
	
		}
	
	
	@Test(dataProvider ="SE_Estate",description="Verify the ProjectCreationForm",priority=6)
	public void NRDA_Estate_SC_002_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyProjectCreationForm();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Budget Inclusion Year",priority=7)
	public void NRDA_Estate_SC_002_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the ProjectCodeFiled",priority=8)
	public void NRDA_Estate_SC_002_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the ProjectNameFiled",priority=9)
	public void NRDA_Estate_SC_002_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the LandUseZone Dropdown",priority=10)
	public void NRDA_Estate_SC_002_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
			SE_Login.toverifyLandUseZone();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Sector Dropdown",priority=11)
	public void NRDA_Estate_SC_002_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
			SE_Login.toverifyLandUseZone();
			SE_Login.toverifySectorFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Project Location Field",priority=12)
	public void NRDA_Estate_SC_002_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
			SE_Login.toverifyLandUseZone();
			SE_Login.toverifySectorFunctionality();
			SE_Login.toverifyProjectLocationFiled();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="Verify the Reset Button Functionality",priority=13)
	public void NRDA_Estate_SC_002_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
			SE_Login.toverifyLandUseZone();
			SE_Login.toverifySectorFunctionality();
			SE_Login.toverifyProjectLocationFiled();
			SE_Login.toverifyResetButtonFunctionality();
		}
	
	
	
	@Test(dataProvider ="SE_Estate",description="Verify the Close Button Functionality",priority=14)
	public void NRDA_Estate_SC_002_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
			SE_Login.toverifyLandUseZone();
			SE_Login.toverifySectorFunctionality();
			SE_Login.toverifyProjectLocationFiled();
			SE_Login.toverifyCloseButtonFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="Verify the Next Button Functionality",priority=15)
	public void NRDA_Estate_SC_002_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toverifyBudjetInclusionYear();
			SE_Login.toverifyProjectCodeFiled();
			SE_Login.toverifyProjectNameFiled();
			SE_Login.toverifyLandUseZone();
			SE_Login.toverifySectorFunctionality();
			SE_Login.toverifyProjectLocationFiled();
			SE_Login.toverifyNextButtonFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyProjectDetailsGeneralForm",priority=16)
	public void NRDA_Estate_SC_003_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyProjectDetailsGeneralForm();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyIsApplication_TenderFeesApplicable",priority=17)
	public void NRDA_Estate_SC_003_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyApplication_TenderFeesField",priority=18)
	public void NRDA_Estate_SC_003_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifyApplicationModeofPayment",priority=19)
	public void NRDA_Estate_SC_003_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyApplicationModeofApplication",priority=20)
	public void NRDA_Estate_SC_003_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyApplicationTenderOpenDate",priority=21)
	public void NRDA_Estate_SC_003_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLastdateClarifficationObjectionSubmission",priority=22)
	public void NRDA_Estate_SC_003_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLastdateApplicationTenderSubmission",priority=23)
	public void NRDA_Estate_SC_003_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLottaryBidOpeningDate",priority=24)
	public void NRDA_Estate_SC_003_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAllotmentMethod",priority=25)
	public void NRDA_Estate_SC_003_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyIsReservationApplicable",priority=26)
	public void NRDA_Estate_SC_003_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyIsAdditionalPremiunApplicable",priority=27)
	public void NRDA_Estate_SC_003_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyIsAdditionalPremiunApplicable",priority=28)
	public void NRDA_Estate_SC_003_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
			SE_Login.toverifyIsSurrenderApplicable();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAREARNo_Field",priority=29)
	public void NRDA_Estate_SC_003_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
			SE_Login.toverifyIsSurrenderApplicable();
			SE_Login.toverifyAREARNo_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyResetButtonFunctionality1",priority=30)
	public void NRDA_Estate_SC_003_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
			SE_Login.toverifyIsSurrenderApplicable();
			SE_Login.toverifyAREARNo_Field();
			SE_Login.toverifyResetButtonFunctionality1();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality1",priority=31)
	public void NRDA_Estate_SC_003_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
			SE_Login.toverifyIsSurrenderApplicable();
			SE_Login.toverifyAREARNo_Field();
			SE_Login.toverifyNextButtonFunctionality1();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyCloseButtonFunctionality1",priority=32)
	public void NRDA_Estate_SC_003_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
			SE_Login.toverifyIsSurrenderApplicable();
			SE_Login.toverifyAREARNo_Field();
			SE_Login.toverifyCloseButtonFunctionality1();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyBackButtonFunctionality1",priority=33)
	public void NRDA_Estate_SC_003_TC_018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonProjectGeneralDetailsTab();
			SE_Login.toverifyIsApplication_TenderFeesApplicable();
			SE_Login.toverifyApplication_TenderFeesField();
			SE_Login.toverifyApplicationModeofPayment();
			SE_Login.toverifyApplicationModeofApplication();
			SE_Login.toverifyApplicationTenderOpenDate();
			SE_Login.toverifyLastdateClarifficationObjectionSubmission();
			SE_Login.toverifyLastdateApplicationTenderSubmission();
			SE_Login.toverifyLottaryBidOpeningDate();
			SE_Login.toverifyAllotmentMethod();
			SE_Login.toverifyIsReservationApplicable();
			SE_Login.toverifyIsAdditionalPremiunApplicable();
			SE_Login.toverifyIsSurrenderApplicable();
			SE_Login.toverifyAREARNo_Field();
			SE_Login.toverifyBackButtonFunctionality1();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifyProjectDetailsGeneralForm",priority=34)
	public void NRDA_Estate_SC_004_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyUnit_PropertyDetailTab();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLandUseActivity_Dropdown",priority=35)
	public void NRDA_Estate_SC_004_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPropertyType_Dropdown",priority=36)
	public void NRDA_Estate_SC_004_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyBuiltUpAreaField",priority=37)
	public void NRDA_Estate_SC_004_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPlotAreaField",priority=38)
	public void NRDA_Estate_SC_004_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyFloor_Dropdown",priority=39)
	public void NRDA_Estate_SC_004_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyTentativeUnitsField",priority=40)
	public void NRDA_Estate_SC_004_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyMapIcon",priority=41)
	public void NRDA_Estate_SC_004_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			SE_Login.toverifyMapIcon();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyOpenMapButton",priority=42)
	public void NRDA_Estate_SC_004_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			SE_Login.toverifyOpenMapButton();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMarkButton",priority=43)
	public void NRDA_Estate_SC_004_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			SE_Login.toverifyAddMarkButton();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifySaveButton",priority=44)
	public void NRDA_Estate_SC_004_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			SE_Login.toverifySaveButton();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyOKButton",priority=45)
	public void NRDA_Estate_SC_004_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			SE_Login.toverifyOKButton();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyConfirmButton",priority=46)
	public void NRDA_Estate_SC_004_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			SE_Login.toverifyConfirmButton();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyConfirmButton",priority=47)
	public void NRDA_Estate_SC_004_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyEMD_BidSecurity",priority=48)
	public void NRDA_Estate_SC_004_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPerformanceBankGuarantee",priority=49)
	public void NRDA_Estate_SC_004_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
			SE_Login.toverifyPerformanceBankGuarantee();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyModeofSecurityDeposite_Dropdown",priority=50)
	public void NRDA_Estate_SC_004_TC_018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
			SE_Login.toverifyPerformanceBankGuarantee();
			SE_Login.toverifyModeofSecurityDeposite_Dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyRemarksField",priority=51)
	public void NRDA_Estate_SC_004_TC_019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
			SE_Login.toverifyPerformanceBankGuarantee();
			SE_Login.toverifyModeofSecurityDeposite_Dropdown();
			SE_Login.toverifyRemarksField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality",priority=52)
	public void NRDA_Estate_SC_004_TC_020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
			SE_Login.toverifyPerformanceBankGuarantee();
			SE_Login.toverifyModeofSecurityDeposite_Dropdown();
			SE_Login.toverifyRemarksField();
			SE_Login.toverifyAddMoreButtonFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyRemoveButtonFunctionality",priority=53)
	public void NRDA_Estate_SC_004_TC_021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
			SE_Login.toverifyPerformanceBankGuarantee();
			SE_Login.toverifyModeofSecurityDeposite_Dropdown();
			SE_Login.toverifyRemarksField();
			SE_Login.toverifyRemoveButtonFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality2",priority=54)
	public void NRDA_Estate_SC_004_TC_022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickUnit_PropertyDetailTab();
			SE_Login.toverifyLandUseActivity_Dropdown();
			SE_Login.toverifyPropertyType_Dropdown();
			//SE_Login.toverifyBuiltUpAreaField();
			SE_Login.toverifyPlotAreaField();
			//SE_Login.toverifyFloor_Dropdown();
			SE_Login.toverifyTentativeUnitsField();
			//SE_Login.toverifyConfirmButton();To Active When Application Submitted
			SE_Login.toverifyRateperSQMeter();
			SE_Login.toverifyEMD_BidSecurity();
			SE_Login.toverifyPerformanceBankGuarantee();
			SE_Login.toverifyModeofSecurityDeposite_Dropdown();
			SE_Login.toverifyRemarksField();
			SE_Login.toverifyNextButtonFunctionality2();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifyApplicantReservationCategory",priority=55)
	public void NRDA_Estate_SC_005_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyApplicantReservationCategory();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyClassDropdownFunctionality",priority=56)
	public void NRDA_Estate_SC_005_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickonApplicantReservationCategory();
			SE_Login.toverifyClassDropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyCategoryDropdownFunctionality",priority=57)
	public void NRDA_Estate_SC_005_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickonApplicantReservationCategory();
			SE_Login.toverifyClassDropdownFunctionality();
			SE_Login.toverifyCategoryDropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyReservationRuleDropdownFunctionality",priority=58)
	public void NRDA_Estate_SC_005_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickonApplicantReservationCategory();
			SE_Login.toverifyClassDropdownFunctionality();
			SE_Login.toverifyCategoryDropdownFunctionality();
			SE_Login.toverifyReservationRuleDropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPercentage_LumpsumpField",priority=59)
	public void NRDA_Estate_SC_005_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickonApplicantReservationCategory();
			SE_Login.toverifyClassDropdownFunctionality();
			SE_Login.toverifyCategoryDropdownFunctionality();
			SE_Login.toverifyReservationRuleDropdownFunctionality();
			SE_Login.toverifyPercentage_LumpsumpField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality1",priority=60)
	public void NRDA_Estate_SC_005_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickonApplicantReservationCategory();
			SE_Login.toverifyClassDropdownFunctionality();
			SE_Login.toverifyCategoryDropdownFunctionality();
			SE_Login.toverifyReservationRuleDropdownFunctionality();
			SE_Login.toverifyPercentage_LumpsumpField();
			SE_Login.toverifyAddMoreButtonFunctionality1();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality3",priority=61)
	public void NRDA_Estate_SC_005_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.toclickonApplicantReservationCategory();
			SE_Login.toverifyClassDropdownFunctionality();
			SE_Login.toverifyCategoryDropdownFunctionality();
			SE_Login.toverifyReservationRuleDropdownFunctionality();
			SE_Login.toverifyPercentage_LumpsumpField();
			SE_Login.toverifyNextButtonFunctionality3();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyApplicantReservationCategory",priority=62)
	public void NRDA_Estate_SC_006_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyAdditionalFeesApplicable();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyProperty_plotPreferenceTypeDropdownFunctionality",priority=63)
	public void NRDA_Estate_SC_006_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonAdditionalFeeApplicable();
			SE_Login.toverifyProperty_plotPreferenceTypeDropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPaymentTypeDropdownFunctionality",priority=64)
	public void NRDA_Estate_SC_006_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonAdditionalFeeApplicable();
			SE_Login.toverifyProperty_plotPreferenceTypeDropdownFunctionality();
			SE_Login.toverifyPaymentTypeDropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPaymentTypeDropdownFunctionality",priority=65)
	public void NRDA_Estate_SC_006_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonAdditionalFeeApplicable();
			SE_Login.toverifyProperty_plotPreferenceTypeDropdownFunctionality();
			SE_Login.toverifyPaymentTypeDropdownFunctionality();
			SE_Login.toverifyAdditionalPremiumField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality2",priority=66)
	public void NRDA_Estate_SC_006_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonAdditionalFeeApplicable();
			SE_Login.toverifyProperty_plotPreferenceTypeDropdownFunctionality();
			SE_Login.toverifyPaymentTypeDropdownFunctionality();
			SE_Login.toverifyAdditionalPremiumField();
			SE_Login.toverifyAddMoreButtonFunctionality2();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality4",priority=67)
	public void NRDA_Estate_SC_006_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonAdditionalFeeApplicable();
			SE_Login.toverifyProperty_plotPreferenceTypeDropdownFunctionality();
			SE_Login.toverifyPaymentTypeDropdownFunctionality();
			SE_Login.toverifyAdditionalPremiumField();
			SE_Login.toverifyNextButtonFunctionality4();
		}
	@Test(dataProvider ="SE_Estate",description="toverifyPremiumPaymentPlan",priority=68)
	public void NRDA_Estate_SC_007_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyPremiumPaymentPlan();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPaymentPlan_DropdownFunctionality",priority=69)
	public void NRDA_Estate_SC_007_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPaymentTenureField",priority=70)
	public void NRDA_Estate_SC_007_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyDownPaymentField",priority=71)
	public void NRDA_Estate_SC_007_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyRoIinstallmentField",priority=72)
	public void NRDA_Estate_SC_007_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
			SE_Login.toverifyRoIinstallmentField();
		}
	

	@Test(dataProvider ="SE_Estate",description="toverifyDownpaymentdaysField",priority=73)
	public void NRDA_Estate_SC_007_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
			SE_Login.toverifyRoIinstallmentField();
			SE_Login.toverifyDownpaymentdaysField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyDownpaymentdaysField",priority=74)
	public void NRDA_Estate_SC_007_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
			SE_Login.toverifyRoIinstallmentField();
			SE_Login.toverifyDownpaymentdaysField();
			SE_Login.toverifyPaymentCycle_DropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyDelayPenaltyField",priority=75)
	public void NRDA_Estate_SC_007_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
			SE_Login.toverifyRoIinstallmentField();
			SE_Login.toverifyDownpaymentdaysField();
			SE_Login.toverifyPaymentCycle_DropdownFunctionality();
			SE_Login.toverifyDelayPenaltyField();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality3",priority=76)
	public void NRDA_Estate_SC_007_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
			SE_Login.toverifyRoIinstallmentField();
			SE_Login.toverifyDownpaymentdaysField();
			SE_Login.toverifyPaymentCycle_DropdownFunctionality();
			SE_Login.toverifyDelayPenaltyField();
			SE_Login.toverifyAddMoreButtonFunctionality3();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality5",priority=77)
	public void NRDA_Estate_SC_007_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickonPremiumPaymentPlan();
			SE_Login.toverifyPaymentPlan_DropdownFunctionality();
			SE_Login.toverifyPaymentTenureField();
			SE_Login.toverifyDownPaymentField();
			SE_Login.toverifyRoIinstallmentField();
			SE_Login.toverifyDownpaymentdaysField();
			SE_Login.toverifyPaymentCycle_DropdownFunctionality();
			SE_Login.toverifyDelayPenaltyField();
			SE_Login.toverifyNextButtonFunctionality5();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyOtherLease_LicenseTermsCondition",priority=78)
	public void NRDA_Estate_SC_008_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyOtherLease_LicenseTermsCondition();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLandDisposalMethodFunctionality",priority=79)
	public void NRDA_Estate_SC_008_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyMinimumLeaseLicensePeriod_Field",priority=80)
	public void NRDA_Estate_SC_008_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLeaseLicenseExtendable_DropdownFunctionality",priority=81)
	public void NRDA_Estate_SC_008_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyExtendibleTerm_Filed",priority=82)
	public void NRDA_Estate_SC_008_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLicense_LeasePaymentMethod_dropdownFunctionality",priority=83)
	public void NRDA_Estate_SC_008_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLeaserent_LicenseFees_Field",priority=84)
	public void NRDA_Estate_SC_008_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyLeaserent_LicenseFeesPayable_dropdown",priority=85)
	public void NRDA_Estate_SC_008_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPenaltyofLeaaserentDelay_Field",priority=86)
	public void NRDA_Estate_SC_008_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
			SE_Login.toverifyPenaltyofLeaaserentDelay_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPenaltyPayable_dropdown",priority=87)
	public void NRDA_Estate_SC_008_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
			SE_Login.toverifyPenaltyofLeaaserentDelay_Field();
			SE_Login.toverifyPenaltyPayable_dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifySelectRule_dropdown",priority=88)
	public void NRDA_Estate_SC_008_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
			SE_Login.toverifyPenaltyofLeaaserentDelay_Field();
			SE_Login.toverifyPenaltyPayable_dropdown();
			SE_Login.toverifySelectRule_dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyPenaltyComputation_dropdown",priority=89)
	public void NRDA_Estate_SC_008_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
			SE_Login.toverifyPenaltyofLeaaserentDelay_Field();
			SE_Login.toverifyPenaltyPayable_dropdown();
			SE_Login.toverifySelectRule_dropdown();
			SE_Login.toverifyPenaltyComputation_dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyRemarks_Field",priority=90)
	public void NRDA_Estate_SC_008_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
			SE_Login.toverifyPenaltyofLeaaserentDelay_Field();
			SE_Login.toverifyPenaltyPayable_dropdown();
			SE_Login.toverifySelectRule_dropdown();
			SE_Login.toverifyPenaltyComputation_dropdown();
			SE_Login.toverifyRemarks_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyRemarks_Field",priority=91)
	public void NRDA_Estate_SC_008_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickOtherLease_LicenseTermsCondition();
			SE_Login.toverifyLandDisposalMethodFunctionality();
			SE_Login.toverifyMinimumLeaseLicensePeriod_Field();
			SE_Login.toverifyLeaseLicenseExtendable_DropdownFunctionality();
			SE_Login.toverifyExtendibleTerm_Filed();
			SE_Login.toverifyLicense_LeasePaymentMethod_dropdownFunctionality();
			SE_Login.toverifyLeaserent_LicenseFees_Field();
			SE_Login.toverifyLeaserent_LicenseFeesPayable_dropdown();
			SE_Login.toverifyPenaltyofLeaaserentDelay_Field();
			SE_Login.toverifyPenaltyPayable_dropdown();
			SE_Login.toverifySelectRule_dropdown();
			SE_Login.toverifyPenaltyComputation_dropdown();
			SE_Login.toverifyRemarks_Field();
			SE_Login.toverifyNextButtonFunctionality6();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifyDevelopmentPlanTab",priority=92)
	public void NRDA_Estate_SC_009_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyDevelopmentPlanTab();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyTimeLineApplicationForm_Dropdown",priority=93)
	public void NRDA_Estate_SC_009_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyMileStoneName_Field",priority=94)
	public void NRDA_Estate_SC_009_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyTimelines_Field",priority=95)
	public void NRDA_Estate_SC_009_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNoOfExtensions_Field",priority=96)
	public void NRDA_Estate_SC_009_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyMilestoneCode_Field",priority=97)
	public void NRDA_Estate_SC_009_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyExtnBlock_Dropdown",priority=98)
	public void NRDA_Estate_SC_009_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
			SE_Login.toverifyExtnBlock_Dropdown();
		}
	
//	@Test(dataProvider ="SE_Estate",description="toverifyMaxCompletion_Field",priority=17)
//	public void NRDA_Estate_SC_009_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
//		{
//			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
//			loginAsSE.loginAsSE_Estate(username, password);
//			
//			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
//			SE_Login.toverifyApplicationFormLink();
//			SE_Login.toverifyNewProjectCreationLink();
//			SE_Login.toclickonProceedButton();
//			SE_Login.toclickDevelopmentPlanTab();
//			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
//			SE_Login.toverifyMileStoneName_Field();
//			SE_Login.toverifyTimelines_Field();
//			SE_Login.toverifyNoOfExtensions_Field();
//			SE_Login.toverifyMilestoneCode_Field();
//			SE_Login.toverifyExtnBlock_Dropdown();
//			SE_Login.toverifyMaxCompletion_Field();
//		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAdd_UpdatePenaltySchedule_Button",priority=99)
	public void NRDA_Estate_SC_009_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
			SE_Login.toverifyExtnBlock_Dropdown();
			//SE_Login.toverifyMaxCompletion_Field();
			SE_Login.toverifyAdd_UpdatePenaltySchedule_Button();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality4",priority=100)
	public void NRDA_Estate_SC_009_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
			SE_Login.toverifyExtnBlock_Dropdown();
			//SE_Login.toverifyMaxCompletion_Field();
			SE_Login.toverifyAdd_UpdatePenaltySchedule_Button();
			SE_Login.toverifyAddMoreButtonFunctionality4();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality7",priority=101)
	public void NRDA_Estate_SC_009_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
			SE_Login.toverifyExtnBlock_Dropdown();
			//SE_Login.toverifyMaxCompletion_Field();
			SE_Login.toverifyAdd_UpdatePenaltySchedule_Button();
			SE_Login.toverifyAddMoreButtonFunctionality4();
			SE_Login.toverifyNextButtonFunctionality7();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifySurrenderWithdrawalConditionTab",priority=102)
	public void NRDA_Estate_SC_010_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifySurrenderWithdrawalConditionTab();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality7",priority=103)
	public void NRDA_Estate_SC_010_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
			SE_Login.toverifyExtnBlock_Dropdown();
			//SE_Login.toverifyMaxCompletion_Field();
			SE_Login.toverifyAdd_UpdatePenaltySchedule_Button();
			SE_Login.toverifyAddMoreButtonFunctionality4();
			SE_Login.toverifyNextButtonFunctionality7();
			SE_Login.tpFilltheSurrenderForm();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyNextButtonFunctionality8",priority=104)
	public void NRDA_Estate_SC_010_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickDevelopmentPlanTab();
			SE_Login.toverifyTimeLineApplicationForm_Dropdown();
			SE_Login.toverifyMileStoneName_Field();
			SE_Login.toverifyTimelines_Field();
			SE_Login.toverifyNoOfExtensions_Field();
			SE_Login.toverifyMilestoneCode_Field();
			SE_Login.toverifyExtnBlock_Dropdown();
			//SE_Login.toverifyMaxCompletion_Field();
			SE_Login.toverifyAdd_UpdatePenaltySchedule_Button();
			SE_Login.toverifyAddMoreButtonFunctionality4();
			SE_Login.toverifyNextButtonFunctionality7();
			SE_Login.tpFilltheSurrenderForm();
			SE_Login.toverifyNextButtonFunctionality8();
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifySupportingDocumentsTab",priority=105)
	public void NRDA_Estate_SC_011_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifySupportingDocumentsTab();
			
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifyuploadDocumentDraftBooklet",priority=106)
	public void NRDA_Estate_SC_011_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickSupportingDocumentsTab();
			SE_Login.toverifyuploadDocumentDraftBooklet();
			
		}
	
	
	@Test(dataProvider ="SE_Estate",description="toverifyuploadDocumentLayout",priority=107)
	public void NRDA_Estate_SC_011_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickSupportingDocumentsTab();
			SE_Login.toverifyuploadDocumentDraftBooklet();
			SE_Login.toverifyuploadDocumentLayout();	
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyuploadDocumentTenderDocument",priority=108)
	public void NRDA_Estate_SC_011_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickSupportingDocumentsTab();
			SE_Login.toverifyuploadDocumentDraftBooklet();
			SE_Login.toverifyuploadDocumentLayout();
			SE_Login.toverifyuploadDocumentTenderDocument();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyuploadDocumentTenderDocument",priority=109)
	public void NRDA_Estate_SC_011_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickSupportingDocumentsTab();
			SE_Login.toverifyuploadDocumentDraftBooklet();
			SE_Login.toverifyuploadDocumentLayout();
			SE_Login.toverifyuploadDocumentTenderDocument();
			SE_Login.toverifyNextButtonFunctionality9();
	
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifySupportingDocumentsTab",priority=110)
	public void NRDA_Estate_SC_012_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toverifyEligibilityCheckListTab();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyRequireddocument_Dropdown",priority=111)
	public void NRDA_Estate_SC_012_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickEligibilityCheckListTab();
			SE_Login.toverifyRequireddocument_Dropdown();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyMandatory_Field",priority=112)
	public void NRDA_Estate_SC_012_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickEligibilityCheckListTab();
			SE_Login.toverifyRequireddocument_Dropdown();
			SE_Login.toverifyMandatory_Field();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality5",priority=113)
	public void NRDA_Estate_SC_012_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.toclickEligibilityCheckListTab();
			SE_Login.toverifyRequireddocument_Dropdown();
			SE_Login.toverifyMandatory_Field();
			SE_Login.toverifyAddMoreButtonFunctionality5();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyAddMoreButtonFunctionality5",priority=114)
	public void NRDA_Estate_SC_012_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.tofillProjectGeneralDetailForm();
			SE_Login.tofillUnitPropertyDetailForm();
			SE_Login.tofillformasApplicantReservationCategory();
			SE_Login.tofillformasAdditionalFeesApplicable();
			SE_Login.tofillFormasPremiumPaymentPlan();
			SE_Login.tofillformasOtherlicenseLease();
			SE_Login.tofillformasDevelopmentPlan();
			SE_Login.tpFilltheSurrenderForm();
			SE_Login.toverifyNextButtonFunctionality8();
			SE_Login.touploadAllSupportingDocuments();
			SE_Login.tofillformasElegibilitychecklist();
			SE_Login.toverifySubmitButtonFunctionality1();
		}
	
	
	
	
	@Test(dataProvider ="SE_Estate",description="toverifySelectuserDropdownFunctionality",priority=115)
	public void NRDA_Estate_SC_013_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.tofillProjectGeneralDetailForm();
			SE_Login.tofillUnitPropertyDetailForm();
			SE_Login.tofillformasApplicantReservationCategory();
			SE_Login.tofillformasAdditionalFeesApplicable();
			SE_Login.tofillFormasPremiumPaymentPlan();
			SE_Login.tofillformasOtherlicenseLease();
			SE_Login.tofillformasDevelopmentPlan();
			SE_Login.tpFilltheSurrenderForm();
			SE_Login.toverifyNextButtonFunctionality8();
			SE_Login.touploadAllSupportingDocuments();
			SE_Login.tofillformasElegibilitychecklist();
			SE_Login.toverifySubmitButtonFunctionality1();
			SE_Login.toverifyActionDropdownFunctionality();
			SE_Login.toverifySelectuserDropdownFunctionality();
			SE_Login.toVerifyfunctionalitySubjectField();
			SE_Login.toVerifyfunctionalityFileField();
			SE_Login.toVerifySearchButtonfunctionality();
			SE_Login.toVerifysubjectfieldFunctionality();
			SE_Login.toVerifySerachButtonFunctionalityinPopup();
			SE_Login.toVerifyFileSelectableinPopup();
			SE_Login.toVerifyFillinformButtonFunctionalityinPopup();
			
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyEnterCommentsFieldisBlank",priority=116)
	public void NRDA_Estate_SC_013_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.tofillProjectGeneralDetailForm();
			SE_Login.tofillUnitPropertyDetailForm();
			SE_Login.tofillformasApplicantReservationCategory();
			SE_Login.tofillformasAdditionalFeesApplicable();
			SE_Login.tofillFormasPremiumPaymentPlan();
			SE_Login.tofillformasOtherlicenseLease();
			SE_Login.tofillformasDevelopmentPlan();
			SE_Login.tpFilltheSurrenderForm();
			SE_Login.toverifyNextButtonFunctionality8();
			SE_Login.touploadAllSupportingDocuments();
			SE_Login.tofillformasElegibilitychecklist();
			SE_Login.toverifySubmitButtonFunctionality1();
			SE_Login.toverifyActionDropdownFunctionality();
			SE_Login.toverifySelectuserDropdownFunctionality();
			SE_Login.toVerifyFillinformButtonFunctionalityinPopup();
			SE_Login.toverifyEnterCommentsFieldisBlank();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifyinvalidUploaddocumentfield",priority=117)
	public void NRDA_Estate_SC_013_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.tofillProjectGeneralDetailForm();
			SE_Login.tofillUnitPropertyDetailForm();
			SE_Login.tofillformasApplicantReservationCategory();
			SE_Login.tofillformasAdditionalFeesApplicable();
			SE_Login.tofillFormasPremiumPaymentPlan();
			SE_Login.tofillformasOtherlicenseLease();
			SE_Login.tofillformasDevelopmentPlan();
			SE_Login.tpFilltheSurrenderForm();
			SE_Login.toverifyNextButtonFunctionality8();
			SE_Login.touploadAllSupportingDocuments();
			SE_Login.tofillformasElegibilitychecklist();
			SE_Login.toverifySubmitButtonFunctionality1();
			SE_Login.toverifyActionDropdownFunctionality();
			SE_Login.toverifySelectuserDropdownFunctionality();
			SE_Login.toVerifyFillinformButtonFunctionalityinPopup();
			SE_Login.toverifyEnterCommentsField();
			SE_Login.toverifyinvalidUploaddocumentfield();
		}
	
	@Test(dataProvider ="SE_Estate",description="toverifysubmitbuttonFunctionality",priority=118)
	public void NRDA_Estate_SC_013_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsSE_Estate(username, password);
			
			ToverifyFunctionalityof_ProjectCreation SE_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_ProjectCreation.class);
			SE_Login.toverifyApplicationFormLink();
			SE_Login.toverifyNewProjectCreationLink();
			SE_Login.toclickonProceedButton();
			SE_Login.tofilltheProjectCreationForm();
			SE_Login.tofillProjectGeneralDetailForm();
			SE_Login.tofillUnitPropertyDetailForm();
			SE_Login.tofillformasApplicantReservationCategory();
			SE_Login.tofillformasAdditionalFeesApplicable();
			SE_Login.tofillFormasPremiumPaymentPlan();
			SE_Login.tofillformasOtherlicenseLease();
			SE_Login.tofillformasDevelopmentPlan();
			SE_Login.tpFilltheSurrenderForm();
			SE_Login.toverifyNextButtonFunctionality8();
			SE_Login.touploadAllSupportingDocuments();
			SE_Login.tofillformasElegibilitychecklist();
			SE_Login.toverifySubmitButtonFunctionality1();
			SE_Login.toverifyActionDropdownFunctionality();
			SE_Login.toverifySelectuserDropdownFunctionality();
			SE_Login.toVerifyFillinformButtonFunctionalityinPopup();
			SE_Login.toverifyEnterCommentsField();
			SE_Login.toverifyUploaddocumentfield();
			SE_Login.toverifysubmitbuttonFunctionality();
		}
	
			
}
