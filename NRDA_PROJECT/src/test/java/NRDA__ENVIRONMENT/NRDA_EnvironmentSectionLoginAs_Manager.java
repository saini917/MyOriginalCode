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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date:
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_Manager extends URLPageWSNRDAScript
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
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();

	}

	@DataProvider(name="M-ENV")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"M_ENV_Credentials");
	}
	
	@DataProvider(name="AM-ENV")
	public String[][] getExcelData1() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_ENV_Credentials");
	}


	@Test(dataProvider ="M-ENV",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_10_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toverifythedashboardoftheApplication();

		}
	
	@Test(dataProvider ="M-ENV",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_10_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifyPendingApplicationMenulist1();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_10_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_06_TC_03();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsBlankField",priority=4)
	public void NRDA_ENVIRONMENT_SC_10_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_06_TC_04();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters",priority=5)
	public void NRDA_ENVIRONMENT_SC_10_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_06_TC_05();
		}
	
	@Test(dataProvider ="M-ENV",description="Verify the Search funcionality of pending application by entering characteronly.",priority=6)
	public void NRDA_ENVIRONMENT_SC_10_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_06_TC_06();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly",priority=7)
	public void NRDA_ENVIRONMENT_SC_10_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly_SC_06_TC_07();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifyPendingApplicationWithValidNumber",priority=8)
	public void NRDA_ENVIRONMENT_SC_10_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=9)
	public void NRDA_ENVIRONMENT_SC_10_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_06_TC_09();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifyfunctionalitySelecting Action is Forward",priority=10)
	public void NRDA_ENVIRONMENT_SC_10_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifyfunctionality of Print Button",priority=11)
	public void NRDA_ENVIRONMENT_SC_06_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
			Login_MENV.toVerifyfunctionalityPrintButton_SC_06_TC_11();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifyfunctionalityofUploadingInvalidDocument",priority=12)
	public void NRDA_ENVIRONMENT_SC_06_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
			Login_MENV.toVerifyfunctionalityofUploadingInvalidDocument_SC_06_TC_12();
		}
	
	
	@Test(dataProvider ="M-ENV",description="toVerifyfunctionalityofUploadingValidDocument",priority=13)
	public void NRDA_ENVIRONMENT_SC_06_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
			Login_MENV.toVerifyfunctionalityofUploadingDocument_SC_06_TC_13();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySubmitButtonfunctionality comment field is blank",priority=14)
	public void NRDA_ENVIRONMENT_SC_06_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
			Login_MENV.toVerifyfunctionalityofUploadingDocument_SC_06_TC_13();
			Login_MENV.toVerifyfunctionalityofSubmitButton();
			Login_MENV.toVerifyErrorMsgonCommentfieldAsBlank_SC_06_TC_14();
		}
	
	
	@Test(dataProvider ="M-ENV",description="toVerify CloseButtonfunctionality",priority=15)
	public void NRDA_ENVIRONMENT_SC_06_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_10();
			Login_MENV.toVerifyfunctionalityofUploadingDocument_SC_06_TC_13();
			Login_MENV.toVerifyfunctionalityofCloseButton_SC_06_TC_17();
		}
	
	@Test(dataProvider ="M-ENV",description="toVerifySubmitButtonfunctionality Action is Send back",priority=16)
	public void NRDA_ENVIRONMENT_SC_06_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage Login_M_ENV=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			Login_M_ENV.loginAsM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager Login_MENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager.class);
			Login_MENV.toVerifyPendingApplicationLink_SC_06_TC_02();
			Login_MENV.toVerifyPendingApplicationWithValidNumber_SC_06_TC_08();
			Login_MENV.toVerifyfunctionalitySelectingForward_SC_06_TC_15();
			Login_MENV.toVerifyfunctionalityofUploadingDocument_SC_06_TC_13();
			Login_MENV.toVerifyfunctionalityofEnterCommentsField();
			Login_MENV.toVerifyfunctionalityofSubmitButton();
		}
	
	@Test(dataProvider ="AM-ENV",description="To FOrward Application AM-ENV TO M-ENV",priority=17)
	public void NRDA_ENVIRONMENT_SC_06_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
	public void NRDA_ENVIRONMENT_SC_06_TC_16_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	
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
	
}
