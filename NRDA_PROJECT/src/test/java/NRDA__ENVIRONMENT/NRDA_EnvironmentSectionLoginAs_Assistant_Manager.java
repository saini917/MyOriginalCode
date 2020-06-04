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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 06-12-2017
 * @Purpose: 
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_Assistant_Manager extends URLPageWSNRDAScript
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

	@DataProvider(name="AM-ENV")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_ENV_Credentials");
	}

	@Test(dataProvider ="AM-ENV",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_09_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toverifythedashboardoftheApplication();

		}
	
	@Test(dataProvider ="AM-ENV",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_09_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationMenulist();

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_09_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_05_TC_03();
			

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsBlankField",priority=4)
	public void NRDA_ENVIRONMENT_SC_09_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_05_TC_04();

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters",priority=5)
	public void NRDA_ENVIRONMENT_SC_09_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_05_TC_05();

		}
	
	@Test(dataProvider ="AM-ENV",description="Verify the Search funcionality of pending application by entering characteronly.",priority=6)
	public void NRDA_ENVIRONMENT_SC_09_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_05_TC_06();

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly",priority=7)
	public void NRDA_ENVIRONMENT_SC_09_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly_SC_05_TC_07();

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyPendingApplicationWithValidNumber",priority=8)
	public void NRDA_ENVIRONMENT_SC_09_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=9)
	public void NRDA_ENVIRONMENT_SC_09_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_05_TC_09();

		}
	
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalitySelecting Action is Forward",priority=10)
	public void NRDA_ENVIRONMENT_SC_09_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();

		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionality of Print Button",priority=11)
	public void NRDA_ENVIRONMENT_SC_09_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityPrintButton_SC_05_TC_11();
			
		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityofUploadingInvalidDocument",priority=12)
	public void NRDA_ENVIRONMENT_SC_09_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityofUploadingInvalidDocument_SC_05_TC_12();
			
		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityofUploadingValidDocument",priority=13)
	public void NRDA_ENVIRONMENT_SC_09_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityofUploadingDocument_SC_05_TC_13();
			
		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityofComment field is blank",priority=14)
	public void NRDA_ENVIRONMENT_SC_09_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityofUploadingDocument_SC_05_TC_13();
			Login_AM_ENV.toVerifyfunctionalityofSubmitButton_SC_05_TC_15();
			Login_AM_ENV.toVerifyErrorMsginCommentFieldisBlank();
		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityofCloseButton",priority=15)
	public void NRDA_ENVIRONMENT_SC_09_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_AM_ENV.toVerifyfunctionalityofUploadingDocument_SC_05_TC_13();
			Login_AM_ENV.toVerifyfunctionalityofCloseButton_SC_05_TC_16();
			
		}
	
	@Test(dataProvider ="AM-ENV",description="toVerifyfunctionalityofSubmitButton",priority=16)
	public void NRDA_ENVIRONMENT_SC_09_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsAM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager Login_AM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Assistant_Manager.class);
			Login_AM_ENV.toVerifyPendingApplicationLink();
			Login_AM_ENV.toVerifyPendingApplicationWithValidNumber_SC_05_TC_08();
			Login_AM_ENV.toVerifyfunctionalitySelectingForward_SC_05_TC_10();
			Login_AM_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_AM_ENV.toVerifyfunctionalityofUploadingDocument_SC_05_TC_13();
			Login_AM_ENV.toVerifyfunctionalityofSubmitButton_SC_05_TC_15();
			Login_AM_ENV.toVerifySuccessfullyMsg();
			
		}
	
}
 
