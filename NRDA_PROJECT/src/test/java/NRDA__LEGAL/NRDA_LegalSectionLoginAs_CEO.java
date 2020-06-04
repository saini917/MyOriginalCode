/**
 * 
 */
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
import NRDA_LEGAL.TOverifyfunctionalityof_CEO_LEGAL;
import NRDA_LEGAL.ToverifyFunctionalityof_GM_LEGAL;
import NRDA_LEGAL.ToverifyfunctionalityofAM_Legal;
import NRDA_LEGAL.ToverifyfunctionalityofM_Legal;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @DAte: 24-11-2017
 * @Purpose: Legal Section Login As CEO
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_LegalSectionLoginAs_CEO extends URLPageWSNRDAScript
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
	
	@DataProvider(name="M-LEGAL")
	public String[][] getExcelData2() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"M_LEGAL Credentials");
	}
	
	@DataProvider(name="AM-LEGAL")
	public String[][] getExcelData3() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"AM_LEGAL Credentials");
	}
	
	
	
	@DataProvider(name="GM-LEGAL")
	public String[][] getExcelData1() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"GM_LEGAL Credentials");
	}
	
	@DataProvider(name="CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"CEO_LEGAL Credentials");
	}
	
	@Test(priority=1,dataProvider ="CEO",description="verifyLoginAs_CEO")
	public void NRDA_LEGAL_SC_04_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.toVerifyMenuFieldsonDashBoard_SC_04_TC_01();
	}
	
	@Test(priority=2,dataProvider ="CEO",description="verify_Caselistlinks")
	public void NRDA_LEGAL_SC_04_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.verifymenulistUnderCaseList_SC_04_TC_02();
	}
	
	@Test(priority=3,dataProvider ="CEO",description="verifyNewCaseLink")
	public void NRDA_LEGAL_SC_04_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.verifymenulistUnderCaseList_SC_04_TC_02();
		login_Ceo.toVerifyMenuFieldsonNewCase_SC_04_TC_03();
	}
	
	@Test(priority=4,dataProvider ="CEO",description="toVerifytheCaseNumberRigister")
	public void NRDA_LEGAL_SC_04_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.VeriftMenuTabsInApplicationNumber_SC_04_TC_04();
	}
	
	@Test(priority=5,dataProvider ="CEO",description="toVerifyAdvocateButton ")
	public void NRDA_LEGAL_SC_04_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofAdvocateButton_SC_04_TC_05();
		

	}
	
	@Test(priority=6,dataProvider ="CEO",description="toVerify_View_Update_AdvocateButton")
	public void NRDA_LEGAL_SC_04_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofAdvocateButton_SC_04_TC_05();
		login_Ceo.toVerifyFunctionalityofView_UpdateAdvocateButton_SC_04_TC_06();
		login_Ceo.Closrpopup();
	}
	
	@Test(priority=7,dataProvider ="CEO",description="toVerify_EditButton_Advocate")
	public void NRDA_LEGAL_SC_04_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofAdvocateButton_SC_04_TC_05();
		login_Ceo.toVerifyFunctionalityofView_UpdateAdvocateButton_SC_04_TC_06();
		login_Ceo.toVerifyEditButtonFunctionalityofAdvocate_SC_04_TC_07();
		login_Ceo.Closrpopup();
	}
	
	
	@Test(priority=8,dataProvider ="CEO",description="toVerifyOICButton")
	public void NRDA_LEGAL_SC_04_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityof_OICButton_SC_04_TC_08();
		
	}
	
	@Test(priority=9,dataProvider ="CEO",description="toVerifyOICButton")
	public void NRDA_LEGAL_SC_04_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityof_OICButton_SC_04_TC_08();
		login_Ceo.toVerifyFunctionalityofADD_View_UpdateOICButton_SC_04_TC_09();
		login_Ceo.Closrpopup();
		
	}
	
	@Test(priority=10,dataProvider ="CEO",description="toVerifyEditButtonFunctionalityinOIC")
	public void NRDA_LEGAL_SC_04_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityof_OICButton_SC_04_TC_08();
		login_Ceo.toVerifyFunctionalityofADD_View_UpdateOICButton_SC_04_TC_09();
		login_Ceo.toVerifyEditButtonFunctionalityofOIC_SC_04_TC_10();
		login_Ceo.Closrpopup();
		
	}
	
	
	@Test(priority=11,dataProvider ="CEO",description="verifySelectActionDropdownFunctionalityAsSendBack")
	public void NRDA_LEGAL_SC_04_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofSelectActionDropdownasSendBack_SC_04_TC_12();
		login_Ceo.toVerifyFunctionalityofEnterCommentsField();
		login_Ceo.toVerifyFunctionalityofSubmitButton_SC_04_TC_15();
		
	}
	
	@Test(priority=12,dataProvider ="GM-LEGAL",description="Application Forward Gm TO CEO")
	public void NRDA_LEGAL_SC_03_TC_11_1(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
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
	
	
	
	
	
	
	@Test(priority=13,dataProvider ="CEO",description="verifyEnterCommentsFunctionality")
	public void NRDA_LEGAL_SC_04_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofSelectActionDropdownasApprove_SC_04_TC_13();
		login_Ceo.toVerifyFunctionalityofEnterCommentsField();
		login_Ceo.ScroolupPage();
		
	}
	
	@Test(priority=14,dataProvider ="CEO",description="verifyCloseButtonFunctionality")
	public void NRDA_LEGAL_SC_04_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofSelectActionDropdownasApprove_SC_04_TC_13();
		login_Ceo.toVerifyFunctionalityofEnterCommentsField();
		login_Ceo.toVerifyFunctionalityofCloseButton_SC_04_TC_16();
	
		
	}
	
	@Test(priority=15,dataProvider ="CEO",description="verifySubmitButtonFunctionality Action is Approve")
	public void NRDA_LEGAL_SC_04_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.toVerifyCaseNumberForwardedByGeneral_Manager_SC_04_TC_04();
		login_Ceo.toVerifyFunctionalityofSelectActionDropdownasApprove_SC_04_TC_13();
		login_Ceo.toVerifyFunctionalityofEnterCommentsField();
		login_Ceo.toVerifyFunctionalityofSubmitButton_SC_04_TC_15();

	}
	
	@Test(priority=16,dataProvider ="AM-LEGAL",description="verifythe_SubmitButtonFunctionality")
	public void NRDA_Legal_SC_01_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
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
	
	@Test(priority=17,dataProvider ="M-LEGAL",description="verifySubmitButtonFunctionality_M_MAnager")
	public void NRDA_Legal_SC_02_TC_15_1(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
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
	
	
	@Test(priority=18,dataProvider ="GM-LEGAL",description="verify_SubmitButtonFunctionality Action is Forward")
	public void NRDA_LEGAL_SC_03_TC_15_2(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
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
	
	@Test(priority=19,dataProvider ="CEO",description="verifySelectActionDropdownFunctionalityAsReject")
	public void NRDA_LEGAL_SC_04_TC_15_3(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_CEO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_CEO.loginAs_CEO(username, password);
		
		TOverifyfunctionalityof_CEO_LEGAL login_Ceo=PageFactory.initElements(driver, TOverifyfunctionalityof_CEO_LEGAL.class);
		login_Ceo.verifyCaseListLink_SC_04_TC_02();
		login_Ceo.clickFirstCaseNumber();
		login_Ceo.toVerifyFunctionalityofSelectActionDropdownasReject_SC_04_TC_11();
		login_Ceo.toVerifyFunctionalityofEnterCommentsField();
		login_Ceo.toVerifyFunctionalityofSubmitButton_SC_04_TC_15();
		
	}
	
}
