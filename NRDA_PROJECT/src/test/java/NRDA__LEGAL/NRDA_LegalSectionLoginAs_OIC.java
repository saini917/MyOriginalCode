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
import NRDA_LEGAL.ToverifyFunctionalityof_OIC_LEGAL;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 *
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_LegalSectionLoginAs_OIC extends URLPageWSNRDAScript
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
	@DataProvider(name="OIC-LEGAL")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"OIC_LEGAL Credentials");
	}
	
	@Test(priority=1,dataProvider ="OIC-LEGAL",description="verifyLoginAs_OIC")
	public void NRDA_LEGAL_SC_06_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyMenuFieldsonDashBoard_SC_06_TC_01();

	}
	
	@Test(priority=2,dataProvider ="OIC-LEGAL",description="verifyApprove_RejectLink_OIC")
	public void NRDA_LEGAL_SC_06_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifMenuFieldsinApproveorRejectLink_SC_06_TC_02();

	}
	
	@Test(priority=3,dataProvider ="OIC-LEGAL",description="verifyNewcaseEntry_OIC")
	public void NRDA_LEGAL_SC_06_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifMenuFieldsinNewCaseEntry_SC_06_TC_03();

	}
	
	@Test(priority=4,dataProvider ="OIC-LEGAL",description="verifyActionButtonFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifyActionButtonFunctionality_SC_06_TC_04();
		login_OIC.clickonActionbutton();
		login_OIC.VeriftMenuTabsInApplicationNumber_SC_06_TC_04();

	}
	
	@Test(priority=5,dataProvider ="OIC-LEGAL",description="verifyHearingTabnFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifyActionButtonFunctionality_SC_06_TC_04();
		login_OIC.clickonActionbutton();
		login_OIC.toverifyHearingTabFunctionality_SC_06_TC_05();

	}
	
	@Test(priority=6,dataProvider ="OIC-LEGAL",description="verifyAddCaseHearingFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifyActionButtonFunctionality_SC_06_TC_04();
		login_OIC.clickonActionbutton();
		login_OIC.toverifyHearingTabFunctionality_SC_06_TC_05();
		login_OIC.toverifyAddCaseHearingButtonFunctionality_SC_06_TC_06();
		login_OIC.close_POPUP();
	}
	
	@Test(priority=7,dataProvider ="OIC-LEGAL",description="verifyAddHearingButtonFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifyActionButtonFunctionality_SC_06_TC_04();
		login_OIC.clickonActionbutton();
		login_OIC.toverifyHearingTabFunctionality_SC_06_TC_05();
		login_OIC.toverifyAddHearingButtonFunctionality_SC_06_TC_07();
		login_OIC.close_POPUP();
	}
	
	@Test(priority=8,dataProvider ="OIC-LEGAL",description="verifyAdvocateButtonFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifyActionButtonFunctionality_SC_06_TC_04();
		login_OIC.clickonActionbutton();
		login_OIC.toverifyAdvocateButtonFonctionality_SC_06_TC_08();
		
	}
	
	@Test(priority=9,dataProvider ="OIC-LEGAL",description="verifyOICButtonFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyApprove_RajectLink_SC_06_TC_02();
		login_OIC.toVerifyActionButtonFunctionality_SC_06_TC_04();
		login_OIC.clickonActionbutton();
		login_OIC.toverifyOICButtonFonctionality_SC_06_TC_09();
	}
	
	@Test(priority=10,dataProvider ="OIC-LEGAL",description="verifySelectActionDropdownFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyPendingApplicationLink();
		login_OIC.toVerifyCaseNumber();
		login_OIC.toVerifyFunctionalityofSelectActionDropdown_SC_06_TC_10();
	}
	
	@Test(priority=11,dataProvider ="OIC-LEGAL",description="verifyEnterCommentFieldFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyPendingApplicationLink();
		login_OIC.toVerifyCaseNumber();
		login_OIC.toVerifyFunctionalityofSelectActionDropdown_SC_06_TC_10();
		login_OIC.toVerifyFunctionalityofEnterCommentsField_SC_06_TC_12();
	}
	
	@Test(priority=12,dataProvider ="OIC-LEGAL",description="verifyUploadDocumentFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyPendingApplicationLink();
		login_OIC.toVerifyCaseNumber();
		login_OIC.toVerifyFunctionalityofSelectActionDropdown_SC_06_TC_10();
		login_OIC.toVerifyFunctionalityofEnterCommentsField_SC_06_TC_12();
		login_OIC.toVerifyFunctionalityofUploadDocument_SC_06_TC_13();
	}
	
	
	@Test(priority=13,dataProvider ="OIC-LEGAL",description="verifySubmitButtonFunctionality_OIC")
	public void NRDA_LEGAL_SC_06_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_OICLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_OICLegal.loginAs_OIC(username, password);
		
		ToverifyFunctionalityof_OIC_LEGAL login_OIC=PageFactory.initElements(driver, ToverifyFunctionalityof_OIC_LEGAL.class);
		login_OIC.toVerifyPendingApplicationLink();
		login_OIC.toVerifyCaseNumber();
		login_OIC.toVerifyFunctionalityofSelectActionDropdown_SC_06_TC_10();
		login_OIC.toVerifyFunctionalityofEnterCommentsField_SC_06_TC_12();
		login_OIC.toVerifyFunctionalityofUploadDocument_SC_06_TC_13();
		login_OIC.toVerifyFunctionalityofSubmitButton_SC_06_TC_14();
	}
	
}
