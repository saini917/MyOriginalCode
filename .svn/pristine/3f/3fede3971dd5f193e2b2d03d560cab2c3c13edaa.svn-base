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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_Environment_Loginas_Citizen;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 16-12-2017
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_CEO extends URLPageWSNRDAScript
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
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();

	}
	
	@DataProvider(name="M-ENV")
	public String[][] getExcelData5() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"M_ENV_Credentials");
	}
	
	@DataProvider(name="DGM-ENV")
	public String[][] getExcelData1() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"DGM_ENV_Credentials");
	}

	
	@DataProvider(name="CEO-ENV")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"CEO_ENV_Credentials");
	}
	
	@DataProvider(name="citizen")
	public String[][] getExcelData2() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen Credentials");
	}

	
	@DataProvider(name="NRDA-EMPLOYEE")
	public String[][] getExcelData3() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Employee_Credentials");
	}
	
	@DataProvider(name="AM-ENV")
	public String[][] getExcelData4() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_ENV_Credentials");
	}

	@Test(dataProvider ="CEO-ENV",description="Verify the Home Page of CEO",priority=1)
	public void NRDA_ENVIRONMENT_SC_08_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toverifyDashBoardMenu_SC_08_TC_01();
		}
	
	@Test(dataProvider ="CEO-ENV",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_08_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationMenulist();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_08_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_08_TC_03();
		}
	
	
	@Test(dataProvider ="CEO-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsBlankField",priority=4)
	public void NRDA_ENVIRONMENT_SC_08_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_08_TC_04();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters",priority=5)
	public void NRDA_ENVIRONMENT_SC_08_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_08_TC_05();
		}
	
	@Test(dataProvider ="CEO-ENV",description="Verify the Search funcionality of pending application by entering characteronly.",priority=6)
	public void NRDA_ENVIRONMENT_SC_08_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_08_TC_06();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly",priority=7)
	public void NRDA_ENVIRONMENT_SC_08_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly_SC_08_TC_07();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyPendingApplicationWithValidNumber",priority=8)
	public void NRDA_ENVIRONMENT_SC_08_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
		}
	
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=9)
	public void NRDA_ENVIRONMENT_SC_08_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_08_TC_09();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyresetbuttonFunctionality_",priority=10)
	public void NRDA_ENVIRONMENT_SC_08_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyresetbuttonFunctionality_SC_08_TC_10();
		
		}
	
	
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityPrintButton",priority=11)
	public void NRDA_ENVIRONMENT_SC_08_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalityPrintButton_SC_08_TC_11();
		}
	
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityofUploadingValidDocument",priority=12)
	public void NRDA_ENVIRONMENT_SC_08_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_08_TC_09();
			Login_CEO_ENV.toVerifyfunctionalityofUploadingDocument_SC_08_TC_12();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityofUploadingINValidDocument",priority=13)
	public void NRDA_ENVIRONMENT_SC_08_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_08_TC_09();
			Login_CEO_ENV.toVerifyfunctionalityofUploadingInvalidDocument_SC_08_TC_13();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityofClose Button",priority=14)
	public void NRDA_ENVIRONMENT_SC_08_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_08_TC_09();
			Login_CEO_ENV.toVerifyfunctionalityofUploadingDocument_SC_08_TC_12();
			Login_CEO_ENV.toVerifyfunctionalityofCloseButton_SC_08_TC_19();
		}
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityof Select Action iS SendBAck",priority=15)
	public void NRDA_ENVIRONMENT_SC_08_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalitySelectingSendback_SC_08_TC_15();
			Login_CEO_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_CEO_ENV.toVerifyfunctionalityofUploadingDocument_SC_08_TC_12();
			Login_CEO_ENV.toVerifyfunctionalityofSubmitButton();
		}
	
	
	@Test(dataProvider ="DGM-ENV",description="toVerifySubmitButtonfunctionality",priority=16)
	public void NRDA_ENVIRONMENT_SC_08_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingDocument_SC_07_TC_13();
			Login_DGM_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_DGM_ENV.toVerifyfunctionalityofSubmitButton();
		}
	
	
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityof Select Action iS SendBAck",priority=17)
	public void NRDA_ENVIRONMENT_SC_08_TC_16_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalitySelectingApprove_SC_08_TC_17();
			Login_CEO_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_CEO_ENV.toVerifyfunctionalityofUploadingDocument_SC_08_TC_12();
			Login_CEO_ENV.toVerifyfunctionalityofSubmitButton();
			Login_CEO_ENV.toVerifySuccessfullyMsg();
		}
	
	@Test(dataProvider ="citizen",description="VerifytheSubmitButtonFunctionality",priority=18)
	public void NRDA_ENVIRONMENT_SC_08_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	 {
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
		login_citizen.verifytheDashBoardofEnvironmentNOC_SC_03_TC_02();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04();
		login_citizen.VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsINDIVIDUAL_SC_03_TC_05();
		login_citizen.VerifytheSubmitButtonfunctionality_SC_03_TC_18();
	 
	 }
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofSubmit Button",priority=10)
	public void NRDA_ENVIRONMENT_SC_08_TC_17_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			Login_Employee.ToverifySubjectandFileNoFields();
			Login_Employee.toVerifyfunctionalityofUploadingDocument_SC_04_TC_06();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField_SC_04_TC_08();
			Login_Employee.toVerifyfunctionalityofSubmitButton_SC_04_TC_10();
		}
	
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityofSubmitButton",priority=16)
	public void NRDA_ENVIRONMENT_SC_08_TC_17_2(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink_SC_05_TC_02();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_AM_ENV.toVerifyfunctionalityofUploadingDocument_SC_05_TC_13();
			Login_AM_ENV.toVerifyfunctionalityofSubmitButton_SC_05_TC_15();
			Login_AM_ENV.toVerifySuccessfullyMsg();
			
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySubmitButtonfunctionality ",priority=18)
	public void NRDA_ENVIRONMENT_SC_08_TC_17_3(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
			Login_MENV.toVerifyfunctionalityofUploadingDocument_SC_06_TC_13();
			Login_MENV.toVerifyfunctionalityofEnterCommentsField();
			Login_MENV.toVerifyfunctionalityofSubmitButton();
			Login_MENV.toVerifySuccessfullyMsg();
		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifySubmitButtonfunctionality",priority=16)
	public void NRDA_ENVIRONMENT_SC_08_TC_17_4(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingDocument_SC_07_TC_13();
			Login_DGM_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_DGM_ENV.toVerifyfunctionalityofSubmitButton();
		}
	
	
	@Test(dataProvider ="CEO-ENV",description="toVerifyfunctionalityof Select Action iS SendBAck",priority=17)
	public void NRDA_ENVIRONMENT_SC_08_TC_17_5(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage login_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_CEO.loginAsCEO_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO Login_CEO_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_CEO.class);
			Login_CEO_ENV.toVerifyPendingApplicationLink_SC_08_TC_02();
			Login_CEO_ENV.toVerifyPendingApplicationWithValidNumber_SC_08_TC_08();
			Login_CEO_ENV.toVerifyfunctionalitySelectingReject_SC_08_TC_17();
			Login_CEO_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_CEO_ENV.toVerifyfunctionalityofUploadingDocument_SC_08_TC_12();
			Login_CEO_ENV.toVerifyfunctionalityofSubmitButton();
			Login_CEO_ENV.toVerifySuccessfullyMsg();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
