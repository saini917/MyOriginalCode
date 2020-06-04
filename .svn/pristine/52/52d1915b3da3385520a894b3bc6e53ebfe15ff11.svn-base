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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Manager;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 15-12-2017
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_DGManager extends URLPageWSNRDAScript
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
	public String[][] getExcelData1() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"M_ENV_Credentials");
	}

	@DataProvider(name="DGM-ENV")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"DGM_ENV_Credentials");
	}

	@Test(dataProvider ="DGM-ENV",description="Verify the Home Page of DGM",priority=1)
	public void NRDA_ENVIRONMENT_SC_07_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toverifyDashBoardMenu_SC_07_TC_01();

		}
	
	@Test(dataProvider ="DGM-ENV",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_07_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationMenulist();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_07_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsInValidNumber_SC_07_TC_03();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsBlankField",priority=4)
	public void NRDA_ENVIRONMENT_SC_07_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsBlankField_SC_07_TC_04();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters",priority=5)
	public void NRDA_ENVIRONMENT_SC_07_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterSpecialCharacters_SC_07_TC_05();

		}
	
	@Test(dataProvider ="DGM-ENV",description="Verify the Search funcionality of pending application by entering characteronly.",priority=6)
	public void NRDA_ENVIRONMENT_SC_07_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterAlphabetsonly_SC_07_TC_06();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly",priority=7)
	public void NRDA_ENVIRONMENT_SC_07_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifySearchFieldAsPendingApplicationNumberAsEnterNumericonly_SC_07_TC_07();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyPendingApplicationWithValidNumber",priority=8)
	public void NRDA_ENVIRONMENT_SC_07_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=9)
	public void NRDA_ENVIRONMENT_SC_07_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_07_TC_09();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionalitySelecting Action is Forward",priority=10)
	public void NRDA_ENVIRONMENT_SC_07_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionality of Print Button",priority=11)
	public void NRDA_ENVIRONMENT_SC_07_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityPrintButton_SC_07_TC_11();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionalityofUploadingInvalidDocument",priority=12)
	public void NRDA_ENVIRONMENT_SC_07_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingInvalidDocument_SC_07_TC_12();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionalityofUploadingValidDocument",priority=13)
	public void NRDA_ENVIRONMENT_SC_07_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingDocument_SC_07_TC_13();

		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionalitycomment field as blank",priority=14)
	public void NRDA_ENVIRONMENT_SC_07_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingDocument_SC_07_TC_13();
			Login_DGM_ENV.toVerifyfunctionalityofSubmitButton();
			Login_DGM_ENV.toVerifyErrorMsgonCommentfieldAsBlank_SC_07_TC_14();
		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionality of Close Button",priority=15)
	public void NRDA_ENVIRONMENT_SC_07_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_10();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingDocument_SC_07_TC_13();
			Login_DGM_ENV.toVerifyfunctionalityofCloseButton_SC_06_TC_17();
		}
	
	@Test(dataProvider ="DGM-ENV",description="toVerifyfunctionality Action is Send Back",priority=16)
	public void NRDA_ENVIRONMENT_SC_07_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_DGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_DGM.loginAsDGM_ENV(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager Login_DGM_ENV=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_DGManager.class);
			Login_DGM_ENV.toVerifyPendingApplicationLink_SC_07_TC_02();
			Login_DGM_ENV.toVerifyPendingApplicationWithValidNumber_SC_07_TC_08();
			Login_DGM_ENV.toVerifyfunctionalitySelectingForward_SC_07_TC_15();
			Login_DGM_ENV.toVerifyfunctionalityofUploadingDocument_SC_07_TC_13();
			Login_DGM_ENV.toVerifyfunctionalityofEnterCommentsField();
			Login_DGM_ENV.toVerifyfunctionalityofSubmitButton();
		}
	
	@Test(dataProvider ="M-ENV",description="To Forward Application M-ENV TO DGM-ENV",priority=17)
	public void NRDA_ENVIRONMENT_SC_07_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
	public void NRDA_ENVIRONMENT_SC_07_TC_16_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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
	
}
