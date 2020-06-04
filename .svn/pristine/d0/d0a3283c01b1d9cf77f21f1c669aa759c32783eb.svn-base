package NRDA__LEGAL;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import NRDA_LEGAL.ToverifyFunctionalityof_BOD_LEGAL;
import NRDA_LEGAL.ToverifyFunctionalityof_OIC_LEGAL;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 *
 */
public class NRDA_LegalSectionLoginAs_BOD extends URLPageWSNRDAScript
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
	@DataProvider(name="BOD-LEGAL")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		
		return exceldata.getCellData(filepath,"BOD_LEGAL Credentials");
	}
	
	@Test(priority=1,dataProvider ="BOD-LEGAL",description="verifyLoginAs_BOD")
	public void NRDA_LEGAL_SC_05_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyMenuFieldsonDashBoard_SC_04_TC_01();*/
		
	}
	
	
	@Test(priority=2,dataProvider ="BOD-LEGAL",description="verifyApproverejectLinkFunctionality")
	public void NRDA_LEGAL_SC_05_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifMenuFieldsinApproveorRejectLink_SC_05_TC_02();*/
		
	}
	
	
	@Test(priority=3,dataProvider ="BOD-LEGAL",description="verifyNewcaseEntry_BOD")
	public void NRDA_LEGAL_SC_05_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifMenuFieldsinNewCaseEntry_SC_05_TC_03();*/
		
	}
	
	
	@Test(priority=4,dataProvider ="BOD-LEGAL",description="verifyActionButtonFunctionality_BOD")
	public void NRDA_LEGAL_SC_05_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		/*
		ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.VeriftMenuTabsInApplicationNumber_SC_05_TC_04();*/
		
	}
	
	@Test(priority=5,dataProvider ="BOD-LEGAL",description="verifyAdvocateButtonFunctionality_BOD")
	public void NRDA_LEGAL_SC_05_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyFunctionalityofAdvocateButton_SC_05_TC_05();*/
		
	}
	
	
	@Test(priority=6,dataProvider ="BOD-LEGAL",description="verifyUpdateAdvocateButtonFunctionality_BOD")
	public void NRDA_LEGAL_SC_05_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyFunctionalityofAdvocateButton_SC_05_TC_05();
		login_BOD.toVerifyFunctionalityofUpdateAdvocateButton_SC_05_TC_06();
		login_BOD.closePOPup();*/
		
	}
	
	@Test(priority=7,dataProvider ="BOD-LEGAL",description="verifyEditAdvocateButtonFunctionality_BOD")
	public void NRDA_LEGAL_SC_05_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyFunctionalityofAdvocateButton_SC_05_TC_05();
		login_BOD.toVerifyFunctionalityofUpdateAdvocateButton_SC_05_TC_06();
		login_BOD.toVerifyEditButtonFunctionalityofAdvocate_SC_05_TC_07();
		login_BOD.closePOPup();*/
		
	}
	
	@Test(priority=8,dataProvider ="BOD-LEGAL",description="verifyOICButtonFunctionality_BOD")
	public void NRDA_LEGAL_SC_05_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
	/*	
		ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyFunctionalityof_OICButton_SC_05_TC_08();*/
	}
	
	@Test(priority=9,dataProvider ="BOD-LEGAL",description="toVerifyFunctionalityofADD_View_UpdateAdvocateButton_BOD")
	public void NRDA_LEGAL_SC_05_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyFunctionalityof_OICButton_SC_05_TC_08();
		login_BOD.toVerifyFunctionalityofADD_View_UpdateOICButton_SC_05_TC_09();
		login_BOD.closePOPup();*/
		
	}
	
	@Test(priority=10,dataProvider ="BOD-LEGAL",description="toVerifyFunctionalityofEDit_OICButton_BOD")
	public void NRDA_LEGAL_SC_05_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyFunctionalityof_OICButton_SC_05_TC_08();
		login_BOD.toVerifyFunctionalityofADD_View_UpdateOICButton_SC_05_TC_09();
		login_BOD.toVerifyEditButtonFunctionalityofOIC_SC_05_TC_10();
		login_BOD.closePOPup();*/
		
	}
	
	@Test(priority=11,dataProvider ="BOD-LEGAL",description="toVerifyFunctionalityofClose_OICButton_BOD")
	public void NRDA_LEGAL_SC_05_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage loginAS_BODLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_BODLegal.loginAs_BOD(username, password);
		
		/*ToverifyFunctionalityof_BOD_LEGAL login_BOD=PageFactory.initElements(driver, ToverifyFunctionalityof_BOD_LEGAL.class);
		login_BOD.toVerifyApprove_RajectLink_SC_05_TC_02();
		login_BOD.toVerifyActionButtonFunctionality_SC_05_TC_04();
		login_BOD.clickonActionbutton();
		login_BOD.toVerifyCloseButtonFunctionalityofOIC_SC_05_TC_11();*/
		
		
	}
	
}
