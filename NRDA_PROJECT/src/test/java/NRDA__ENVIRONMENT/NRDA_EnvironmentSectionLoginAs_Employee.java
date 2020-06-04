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
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee;
import NRDA_ENVIRONMENT.ToverifyFunctionalityof_Environment_Loginas_Citizen;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 01-12-2017
 * @Purpose: WaterAndSewerage_EnvironmentSectionLoginAs_Employee
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSectionLoginAs_Employee extends URLPageWSNRDAScript
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

	@DataProvider(name="NRDA-EMPLOYEE")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Employee_Credentials");
	}

	@Test(dataProvider ="NRDA-EMPLOYEE",description="Verify the Home Page of Citizen",priority=1)
	public void NRDA_ENVIRONMENT_SC_04_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toverifythedashboardoftheApplication();
			
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="Verify the Pending Applications",priority=2)
	public void NRDA_ENVIRONMENT_SC_04_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationMenulist();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyPendingApplicationWithValidNumber",priority=3)
	public void NRDA_ENVIRONMENT_SC_04_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{ 
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyPaginationinApplication",priority=3)
	public void NRDA_ENVIRONMENT_SC_04_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toveriftthePaginationinPendingApplications();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyApplicationFieldAs Invalid Number",priority=3)
	public void NRDA_ENVIRONMENT_SC_04_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toverifythefunctionalityofsearchfiledasInvalidApplicationNumber();
		}
	
	
	
	
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySubjectField();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalityFileField();
		}
	
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toverifytheSearchbuttonFunctionality();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toverifyfunctionalityofClearButton();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.ToverifyFunctionalityofSearchbuttoncreatenewfile();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityPendingApplicationbyselectingspecificapplication",priority=4)
	public void NRDA_ENVIRONMENT_SC_04_TC_8(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySelectingActionDropdownasForward();
		}
	
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySelectingActionDropdownasForward();
			Login_Employee.toVerifyfunctionalityofUploadingDocument();
		
		}
	

	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySelectingActionDropdownasForward();
			Login_Employee.toVerifyfunctionalityofUploadingInvalidDocument();
		
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_18(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySelectingActionDropdownasForward();
			Login_Employee.toVerifyfunctionalityofUploadingDocument();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField();
		
		}
	
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_20(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySelectingActionDropdownasForward();
			Login_Employee.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			Login_Employee.toVerifyfunctionalityofUploadingDocument();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField();
			Login_Employee.toVerifyfunctionalityofCloseButton();
		
		}
	
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_19(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
					
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyEnvironmentSectionLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalityPendingApplicationbyselectingspecificapplication_SC_04_TC_04();
			Login_Employee.toVerifyfunctionalitySelectingActionDropdownasForward();
			Login_Employee.ToverifyFunctionalityofSearchbuttoncreatenewfile();
			Login_Employee.toVerifyfunctionalityofUploadingDocument();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField();
			Login_Employee.toVerifyfunctionalityofSubmitButton();
		
		}
	
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_21(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toverifyDashboardoftheEnvironmentApplicationForm();
			
			ToverifyFunctionalityof_Environment_Loginas_Citizen login_citizen=PageFactory.initElements(driver, ToverifyFunctionalityof_Environment_Loginas_Citizen.class);
			login_citizen.verifytheDashBoardofEnvironmentNOC();
			
		}
	
	
	
	
	/*
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalitySelectingForward",priority=5)
	public void NRDA_ENVIRONMENT_SC_04_TC_05_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingDocument",priority=6)
	public void NRDA_ENVIRONMENT_SC_04_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			//Login_Employee.ToverifySubjectandFileNoFields();
			Login_Employee.toVerifyfunctionalityofUploadingDocument_SC_04_TC_06();
			
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofUploadingInvalidDocument",priority=7)
	public void NRDA_ENVIRONMENT_SC_04_TC_07_1(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			//Login_Employee.ToverifySubjectandFileNoFields();
			Login_Employee.toVerifyfunctionalityofUploadingInvalidDocument_SC_04_TC_07();
			
		}
	

	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofEnterCommentsField",priority=8)
	public void NRDA_ENVIRONMENT_SC_04_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			//Login_Employee.ToverifySubjectandFileNoFields();
			Login_Employee.toVerifyfunctionalityofUploadingDocument_SC_04_TC_06();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField_SC_04_TC_08();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofClose Button",priority=9)
	public void NRDA_ENVIRONMENT_SC_04_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			//Login_Employee.ToverifySubjectandFileNoFields();
			Login_Employee.toVerifyfunctionalityofUploadingDocument_SC_04_TC_06();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField_SC_04_TC_08();
			Login_Employee.toVerifyfunctionalityofCloseButton_SC_04_TC_09();
		}
	
	@Test(dataProvider ="NRDA-EMPLOYEE",description="toVerifyfunctionalityofSubmit Button",priority=10)
	public void NRDA_ENVIRONMENT_SC_04_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			logina_citizen.loginAsEmployee(username, password);
			
			ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee Login_Employee=PageFactory.initElements(driver, ToverifyFunctionalityof_EnvironmentSection_Loginas_Employee.class);
			Login_Employee.toVerifyPendingApplicationLink_SC_04_TC_02();
			Login_Employee.toVerifyPendingApplicationWithValidNumber_SC_04_TC_03();
			Login_Employee.toVerifyfunctionalitySelectingForward_SC_04_TC_05();
			//Login_Employee.ToverifySubjectandFileNoFields();
			Login_Employee.toVerifyfunctionalityofUploadingDocument_SC_04_TC_06();
			Login_Employee.toVerifyfunctionalityofEnterCommentsField_SC_04_TC_08();
			Login_Employee.toVerifyfunctionalityofSubmitButton_SC_04_TC_10();
		}*/


}
