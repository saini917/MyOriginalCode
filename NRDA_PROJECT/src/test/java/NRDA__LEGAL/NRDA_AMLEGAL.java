
package NRDA__LEGAL;

import java.io.IOException;

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
import NRDA_LEGAL.ToverifyfunctionalityofAM_Legal;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 *
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_AMLEGAL extends URLPageWSNRDAScript
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
		driver.close();

	}
	@DataProvider(name="AM-LEGAL")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_LEGAL Credentials");
	}
	
	@Test(priority=1,dataProvider ="AM-LEGAL",description="verifyLoginAsEE")
	public void NRDA_Legal_SC_01_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		
		
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toVerifyMenuFieldsonDashBoard_SC_01_TC01();
		
	}
	
	@Test(priority=2,dataProvider ="AM-LEGAL",description="Verify Pending Application")
	public void NRDA_Legal_SC_01_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifythefunctionalityofPendingApplications_SC_01_TC_02();
		AMLegal.toVerifyFieldsonNewCaseSC_01_TC02();
		AMLegal.toVerifyRecordPerPage02();
		AMLegal.toVerifyPagination02();
		
	}
	
	
	
	@Test(priority=3,dataProvider ="AM-LEGAL",description="verifytheProcessedCaseFunctionality")
	public void NRDA_Legal_SC_01_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifythefunctionalityofPendingApplications_SC_01_TC_02();
		AMLegal.toVerifyFieldsonProcessedCaseSC_01_TC03();;
		AMLegal.toVerifyRecordPerPage_SC_01_TC_03();
		AMLegal.toVerifyPagination_SC_01_TC_03();
		
	}
	
	
	@Test(priority=4,dataProvider ="AM-LEGAL",description="verifytheApprove_RejectFunctionality")
	public void NRDA_Legal_SC_01_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApproveRejectLinkFunctionality_SC_01_TC_04();
	
	}
	
	@Test(priority=5,dataProvider ="AM-LEGAL",description="verifythe_PaymentCollectionFunctionality")
	public void NRDA_Legal_SC_01_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyPaymentCollectionsFunctionality_SC_01_TC_05();
	
	}
	
	@Test(priority=6,dataProvider ="AM-LEGAL",description="verifythe_MisReportsFunctionality")
	public void NRDA_Legal_SC_01_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyMisReportsFunctionality_SC_01_TC_06();
	
	}
	
	
	@Test(priority=7,dataProvider ="AM-LEGAL",description="verifythe_CaseListFunctionality")
	public void NRDA_Legal_SC_01_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyCaseListFunctionality_SC_01_TC_07();
		AMLegal.toVerifyFieldsonNewCaseSC_01_TC02();
		AMLegal.toVerifyRecordPerPage02();
		AMLegal.toVerifyPagination02();
	
	}
	
	@Test(priority=8,dataProvider ="AM-LEGAL",description="verifythe_ProcessLegalInvoiceFunctionality")
	public void NRDA_Legal_SC_01_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyProcessLegalInvoiceFunctionality_SC_01_TC_08();
		AMLegal.toVerifyFieldsonCasesforinvoicingSC_01_TC08();
		AMLegal.toVerifyRecordPerPage_SC_01_TC_08();
		AMLegal.toVerifyPagination02();
	
	}
	
	
	@Test(priority=9,dataProvider ="AM-LEGAL",description="verifythe_MeetingManagementFunctionality")
	public void NRDA_Legal_SC_01_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyMeetingManagementFunctionality_SC_01_TC_09();
	
	}
	
	
	@Test(priority=10,dataProvider ="AM-LEGAL",description="verifythe_ApplicationFormFunctionality")
	public void NRDA_Legal_SC_01_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toVerifyMenuinApplicationForm_SC_01_TC10();
	
	}
	
	
		@Test(priority=11,dataProvider ="AM-LEGAL",description="verifythe_LegalDepartmentFunctionality")
	public void NRDA_Legal_SC_01_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.toVerifyMenuinNewCaseEntry_SC_01_TC11();
	
	}
	
	
		@Test(priority=12,dataProvider ="AM-LEGAL",description="verifythe_CaseBasicDetailLinkFunctionality")
	public void NRDA_Legal_SC_01_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.toVerifyCaseBasicDetailsLink_SC_01_TC12();
	
	}
	

	@Test(priority=13,dataProvider ="AM-LEGAL",description="verifythe_ConnectedCaseDetailLinkFunctionality")
	public void NRDA_Legal_SC_01_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.toVerifyConnectedCaseDetailsLink_SC_01_TC13();
	
	}
	
	@Test(priority=14,dataProvider ="AM-LEGAL",description="verifythe_LandDetailLinkFunctionality")
	public void NRDA_Legal_SC_01_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.toVerifyLandDetailsLink_SC_01_TC14();
	
	}
	
	@Test(priority=15,dataProvider ="AM-LEGAL",description="verifythe_CloseButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.tofillvaliddatainApplicationForm();
		AMLegal.toverifyCloseButtonFunctionality_SC_01_TC_15();
		AMLegal.verifyDisplayLink();
	}
	
	@Test(priority=16,dataProvider ="AM-LEGAL",description="verifythe_ResetButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.tofillvaliddatainApplicationForm();
		AMLegal.toverifyResetButtonFunctionality_SC_01_TC_16();
		
	}
	
	@Test(priority=17,dataProvider ="AM-LEGAL",description="verifythe_AssignAdvocateButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.tofillvaliddatainApplicationForm();
		AMLegal.verifysubmitbuttonfunctionality();
		AMLegal.toverifyAdvocateButtonFonctionality_SC_01_TC_17();
		
	}
	
	@Test(priority=18,dataProvider ="AM-LEGAL",description="verifythe_AssignOICButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.tofillvaliddatainApplicationForm();
		AMLegal.verifysubmitbuttonfunctionality();
		AMLegal.toverifyAdvocateButtonFonctionality_SC_01_TC_17();
		AMLegal.toverifyOICButtonFonctionality_SC_01_TC_18();
		
	}
	
	@Test(priority=19,dataProvider ="AM-LEGAL",description="verifythe_SubmitButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_19(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
	
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toverifyApplicationFormFunctionality_SC_01_TC_10();
		AMLegal.toverifyLegalDepartmentLink_SC_01_TC_11();
		AMLegal.tofillvaliddatainApplicationForm();
		AMLegal.verifysubmitbuttonfunctionality();
		AMLegal.SetCaseTrackingNumberinExcel();
		AMLegal.toverifyAdvocateButtonFonctionality_SC_01_TC_17();
		AMLegal.toverifyOICButtonFonctionality_SC_01_TC_18();
		AMLegal.toverifySubmitButtonFonctionality_SC_01_TC_19();
	
	}
	
	
}
