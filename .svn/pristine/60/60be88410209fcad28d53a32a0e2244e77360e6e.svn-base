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
import NRDA_LEGAL.ToverifyFunctionalityof_GM_LEGAL;
import NRDA_LEGAL.ToverifyfunctionalityofAM_Legal;
import NRDA_LEGAL.ToverifyfunctionalityofM_Legal;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 24-11-2017
 * @Purpose: To verify login Legal Section As General Manager
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_LegalSectionLoginAs_GeneralManager extends URLPageWSNRDAScript
	{
	
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		waitForSomeTime();
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		action.moveToElement(web1).build().perform();
		waitForSomeTime();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}
	@DataProvider(name="GM-LEGAL")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"GM_LEGAL Credentials");
	}
	
	@DataProvider(name="M-LEGAL")
	public String[][] getExcelData1() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"M_LEGAL Credentials");
	}
	
	@DataProvider(name="AM-LEGAL")
	public String[][] getExcelData2() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_LEGAL Credentials");
	}
	
	@Test(priority=1,dataProvider ="GM-LEGAL",description="verifyLoginAs_GM")
	public void NRDA_LEGAL_SC_03_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyMenuFieldsonDashBoard_SC_03_TC01();
	
	}
	
	@Test(priority=2,dataProvider ="GM-LEGAL",description="verify_PendingApplicationLink")
	public void NRDA_LEGAL_SC_03_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyMenuFieldsonPendingApplication_SC_03_TC_02();
	
	}
	
	@Test(priority=3,dataProvider ="GM-LEGAL",description="verify_CaseNumberReceivbedByManager")
	public void NRDA_LEGAL_SC_03_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.VeriftMenuTabsInApplicationNumber_SC_03_TC_03();
	
	}
	
	@Test(priority=4,dataProvider ="GM-LEGAL",description="verify_AdvocateButtonFunctionality")
	public void NRDA_LEGAL_SC_03_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.VeriftMenuTabsInApplicationNumber_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofAdvocateButton_SC_03_TC_04();
	}
	
	@Test(priority=5,dataProvider ="GM-LEGAL",description="verify_OICButtonFunctionality")
	public void NRDA_LEGAL_SC_03_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.VeriftMenuTabsInApplicationNumber_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofOICButton_SC_03_TC_05();
	}
	
	@Test(priority=6,dataProvider ="GM-LEGAL",description="verify_SelectActionDropdownFunctionality")
	public void NRDA_LEGAL_SC_03_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofSelectActionDropdown_SC_03_TC_06();
	}
	
@Test(priority=7,dataProvider ="GM-LEGAL",description="verify_FunctionalityofEnterCommentsField")
	public void NRDA_LEGAL_SC_03_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofSelectActionDropdown_SC_03_TC_06();
		login_GMLegal.toVerifyFunctionalityofEnterCommentsField();
		login_GMLegal.ScroolupPage();
		
	}
	
	
	@Test(priority=8,dataProvider ="GM-LEGAL",description="verify_SelectActionDropdownFunctionalityAsSendBack")
	public void NRDA_LEGAL_SC_03_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
			login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
			login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
			login_GMLegal.toVerifyFunctionalityofSelectActionDropdownasSendBack_SC_03_TC_08();
			login_GMLegal.toVerifyFunctionalityofEnterCommentsField();
			login_GMLegal.toVerifyFunctionalityofSubmitButton_SC_03_TC_12();
		}

	@Test(priority=9,dataProvider ="M-LEGAL",description="verifySubmitButtonFunctionality_M_MAnager")
	public void NRDA_Legal_SC_02_TC_08_1(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	 {
		WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_MLegal.loginAs_MLEGAL(username, password);
		
		ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
		login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
		login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
		login_MLegal.toVerifyFunctionalityofSelectActionDropdown_SC_02_TC_07();
		login_MLegal.toVerifyFunctionalityofEnterCommentsField_SC_02_TC_08();
		login_MLegal.toVerifyFunctionalityofSubmitButton_SC_02_TC_09();
	 }
	
	@Test(priority=10,dataProvider ="GM-LEGAL",description="verify_CloseButtonFunctionality")
	public void NRDA_LEGAL_SC_03_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofSelectActionDropdown_SC_03_TC_06();
		login_GMLegal.toVerifyFunctionalityofEnterCommentsField();
		login_GMLegal.toVerifyFunctionalityofCloseButton_SC_03_TC_13();
		
	}
	
	@Test(priority=11,dataProvider ="GM-LEGAL",description="verify_SubmitButtonFunctionality Action is Forward")
	public void NRDA_LEGAL_SC_03_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofSelectActionDropdown_SC_03_TC_06();
		login_GMLegal.toVerifyFunctionalityofEnterCommentsField();
		login_GMLegal.toVerifyFunctionalityofSubmitButton_SC_03_TC_12();
		
	}
	
	
	
	
	
	@Test(priority=12,dataProvider ="AM-LEGAL",description="verifythe_SubmitButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
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
	
	@Test(priority=13,dataProvider ="M-LEGAL",description="verifySubmitButtonFunctionality_M_MAnager")
	public void NRDA_Legal_SC_02_TC_11_1(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_MLegal.loginAs_MLEGAL(username, password);
		
		ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
		login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
		login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
		login_MLegal.toVerifyFunctionalityofSelectActionDropdown_SC_02_TC_07();
		login_MLegal.toVerifyFunctionalityofEnterCommentsField_SC_02_TC_08();
		login_MLegal.toVerifyFunctionalityofSubmitButton_SC_02_TC_09();
	}
	

@Test(priority=14,dataProvider ="GM-LEGAL",description="VerifySelectActionDropdownFunctionalityAsApproved")
	public void NRDA_LEGAL_SC_03_TC_11_2(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofSelectActionDropdownasApproved_SC_03_TC_09();
		login_GMLegal.toVerifyFunctionalityofEnterCommentsField();
		login_GMLegal.toVerifyFunctionalityofSubmitButton_SC_03_TC_12();
	}

	@Test(priority=15,dataProvider ="GM-LEGAL",description="verify_SelectActionDropdownFunctionalityAsReject")
	public void NRDA_LEGAL_SC_03_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_GMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_GMLegal.loginAs_GMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL login_GMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL.class);
		login_GMLegal.toVerifyPendingApplicationLink_SC_03_TC_02();
		login_GMLegal.toVerifyCaseNumberForwardedByM_Manager_SC_03_TC_03();
		login_GMLegal.toVerifyFunctionalityofSelectActionDropdownasReject_SC_03_TC_07();
		login_GMLegal.toVerifyFunctionalityofEnterCommentsField();
		login_GMLegal.toVerifyFunctionalityofSubmitButton_SC_03_TC_12();
	}
	

	
}