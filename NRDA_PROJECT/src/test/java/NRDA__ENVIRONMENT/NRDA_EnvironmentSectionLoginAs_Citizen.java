/**
 * 
 */
package NRDA__ENVIRONMENT;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_Environment_Loginas_Citizen;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 29-11-2017
 * @Purpose: WaterAndSewerage_EnvironmentSectionLoginAs_Citizen
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_Citizen extends URLPageWSNRDAScript
{


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
		waitForSomeTime();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();

	}

	@DataProvider(name="citizen")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen Credentials");
	}

		@Test(dataProvider ="citizen",description="Verify the Home Page of Citizen",priority=1)
		public void NRDA_ENVIRONMENT_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		 {
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsCitizen(username, password);
			
			ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
			login_citizen.toverifyDashBoardMenu_SC_03_TC_01();
		 
		 }
	
	@Test(dataProvider ="citizen",description="VerifytheDashBoardof ENVIRONMENT NOC",priority=2)
	public void NRDA_ENVIRONMENT_SC_03_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.verifytheDashBoardofEnvironmentNOC();
	 }
	
	
	@Test(dataProvider ="citizen",description="Verify the Functionality of BasicDetail Form",priority=3)
	public void NRDA_ENVIRONMENT_SC_03_TC_02_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifyFunctionalityofBasicDetailForm();
	 }
	
	
	@Test(dataProvider ="citizen",description="Verify the Functionality of Correspondence Address",priority=3)
	public void NRDA_ENVIRONMENT_SC_03_TC_02_2(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifyFunctionalityofCorrespondenceAddress();
	 }
	
	@Test(dataProvider ="citizen",description="Verify the Functionality of Property Details",priority=3)
	public void NRDA_ENVIRONMENT_SC_03_TC_02_3(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifyFunctionalityofPropertyDetails();
	 }
	
	
	@Test(dataProvider ="citizen",description="Verify the Functionality of Type of NOC",priority=3)
	public void NRDA_ENVIRONMENT_SC_03_TC_02_4(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.toverifyFunctionalityofTypeofNOC();
	 }
	
	
	
	
	@Test(dataProvider ="citizen",description="VerifythefunctionalityoftheEnvironmentPagewithoutenteranydetails",priority=3)
	public void NRDA_ENVIRONMENT_SC_03_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifythefunctionalityoftheEnvironmentPagewithoutenteranydetails_SC_03_TC_03();
	 }
	
	@Test(dataProvider ="citizen",description="VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject",priority=4)
	public void NRDA_ENVIRONMENT_SC_03_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
	 }
	
	@Test(dataProvider ="citizen",description="VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsIndividual",priority=5)
	public void NRDA_ENVIRONMENT_SC_03_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsINDIVIDUAL_SC_03_TC_05();
	 }
	
	/*@Test(dataProvider ="citizen",description="VerifyAddMoreButtonFunctionality",priority=6)
	public void NRDA_ENVIRONMENT_SC_03_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsINDIVIDUAL_SC_03_TC_05();
		login_citizen.VerifyAddMoreButtonFunctionality_SC_03_TC_06();
		
	 }
	
	@Test(dataProvider ="citizen",description="VerifyDeleteRowButtonFunctionality",priority=7)
	public void NRDA_ENVIRONMENT_SC_03_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsINDIVIDUAL_SC_03_TC_05();
		login_citizen.VerifyAddMoreButtonFunctionality_SC_03_TC_06();
		login_citizen.VerifyDeleteRowButtonFunctionality_SC_03_TC_07();
		
	 }*/
	
	@Test(dataProvider ="citizen",description="VerifySaveAsDraftButtonFunctionality",priority=8)
	public void NRDA_ENVIRONMENT_SC_03_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifySaveAsDraftButtonFunctionality_SC_03_TC_08();
		
	 }
	
	@Test(dataProvider ="citizen",description="VerifyBackButtonFunctionality",priority=9)
	public void NRDA_ENVIRONMENT_SC_03_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifyBackButtonFunctionality_SC_03_TC_09();
		
	 }
	
	@Test(dataProvider ="citizen",description="VerifyDownloadFromProjectButtonFunctionality",priority=10)
	public void NRDA_ENVIRONMENT_SC_03_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifyDownloadFromProjectButtonFunctionality_SC_03_TC_10();
		
	 }
	
	@Test(dataProvider ="citizen",description="VerifyCloseButtonFunctionality",priority=11)
	public void NRDA_ENVIRONMENT_SC_03_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifyCloseButtonFunctionality_SC_03_TC_11();
		login_citizen.clickonPopup_YESButton();
		login_citizen.toverifyDashBoardMenu_SC_03_TC_01();
		
	 }
	
	@Test(dataProvider ="citizen",description="VerifyResetButtonFunctionality",priority=12)
	public void NRDA_ENVIRONMENT_SC_03_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		//login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		//login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsINDIVIDUAL_SC_03_TC_05();
		//login_citizen.VerifyResetButtonFunctionality_SC_03_TC_12();
		login_citizen.VerifytextFieldsResetornot();
	 }
	
	@Test(dataProvider ="citizen",description="VerifytheuploadfunctionalitywithInValidFile",priority=16)
	public void NRDA_ENVIRONMENT_SC_03_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		
		//login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheuploadfunctionalitywithInValidFile_SC_03_TC_16();
	 }
	
	@Test(dataProvider ="citizen",description="VerifytheuploadfunctionalitywithValidFile",priority=17)
	public void NRDA_ENVIRONMENT_SC_03_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		//login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheuploadfunctionalitywithValidFile_SC_03_TC_17();
	 }
		
	@Test(dataProvider ="citizen",description="VerifytheSubmitButtonFunctionality",priority=18)
	public void NRDA_ENVIRONMENT_SC_03_TC_18(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.resettheApplication();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifytheSubmitButtonfunctionality_SC_03_TC_18();
	 
	 }
	
	
	@Test(dataProvider ="citizen",description="VerifytheSubmittedApplication Menu As Citizen",priority=19)
	public void NRDA_ENVIRONMENT_SC_05_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.toverifythesubmittedApplicationStatus_SC_05_TC_01();
	 
	 }
	
	
	@Test(dataProvider ="citizen",description="VerifytheFunctionality of Action Button in Submitted Application",priority=19)
	public void NRDA_ENVIRONMENT_SC_05_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.toverifytheActionButtonEnvironmentAppplication_SC_05_TC02();
	 
	 }
	
	@Test(dataProvider ="citizen",description="VerifytheFunctionality of submitted application status",priority=19)
	public void NRDA_ENVIRONMENT_SC_05_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.toverifytheApplicationStatus_SC_05_TC_03();
	 
	 }
	
	
	@Test(dataProvider ="citizen",description="VerifySaveAsDraftButtonFunctionality",priority=8)
	public void NRDA_ENVIRONMENT_SC_06_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifySaveAsDraftButtonFunctionality_SC_03_TC_08();
		login_citizen.toverifytheDraftedApplicationinInEnvironment_SC_06_TC_01();
		
	 }
	
	
	@Test(dataProvider ="citizen",description="VerifytheFunctionality of submitted application status",priority=19)
	public void NRDA_ENVIRONMENT_SC_06_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.toverifyProceedButtoninDraftedApplication_SC_06_TC_02();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifytheSubmitButtonfunctionality_SC_03_TC_18();
	 
	 }
	
	@Test(dataProvider ="citizen",description="VerifyDeleteButtonFunctionalityin Drafted Application",priority=8)
	public void NRDA_ENVIRONMENT_SC_06_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04();
		login_citizen.toverifythefunctionalityof_UploadingDocument();
		login_citizen.VerifySaveAsDraftButtonFunctionality_SC_03_TC_08();
		login_citizen.toverifyDeleteButtoninDraftedApplication_SC_06_TC_03();
		
	 }
	
	
	@Test(dataProvider ="citizen",description="VerifytheFunctionality of submitted application status",priority=19)
	public void NRDA_ENVIRONMENT_SC_07_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.toverifytheApproved_RejectedApplicationinInEnvironment_SC_07_TC_01();
	 
	 }
	
		

		
}
