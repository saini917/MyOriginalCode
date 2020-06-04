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
import NRDA_LEGAL.ToverifyFunctionalityof_GM_LEGAL_Approval;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 *
 */
/*@Listeners(GenericLibrary.ListenerDriver.class)*/
public class NRDA_LegalSectionLoginAs_GeneralManagerforApproval extends URLPageWSNRDAScript
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
	/*
	@Test(priority=1,dataProvider ="AM-LEGAL",description="verifyLoginAs AM-LEGAL")
	public void NRDA_Legal_SC_06_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	  {
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		ToverifyfunctionalityofAM_Legal AMLegal=PageFactory.initElements(driver, ToverifyfunctionalityofAM_Legal.class);
		AMLegal.toVerifyMenuFieldsonDashBoard_SC_01_TC01();
		
	  }
	
	
	@Test(priority=2,dataProvider ="AM-LEGAL",description="verifyCases for invoicing")
	public void NRDA_Legal_SC_06_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	  {
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL_Approval AMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL_Approval.class);
		AMLegal.toverifyProceslegainvoicelinkfunctionality();
		
	  }
	
	@Test(priority=3,dataProvider ="AM-LEGAL",description="verify case numbers")
	public void NRDA_Legal_SC_06_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	  {
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL_Approval AMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL_Approval.class);
		AMLegal.toverifyProceslegainvoicelinkfunctionality();
		AMLegal.toVerifyCaseNumberreceivedbyCEO();
		AMLegal.toverifymenulabels();
	  }*/
	
	@Test(priority=4,dataProvider ="AM-LEGAL",description="verify case numbers")
	public void NRDA_Legal_SC_06_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	  {
		WaterAndSewerageLoginPage loginAS_AMLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		loginAS_AMLegal.loginAs_AMLEGAL(username, password);
		
		ToverifyFunctionalityof_GM_LEGAL_Approval AMLegal=PageFactory.initElements(driver, ToverifyFunctionalityof_GM_LEGAL_Approval.class);
		AMLegal.toverifyProceslegainvoicelinkfunctionality();
		AMLegal.toVerifyCaseNumberreceivedbyCEO();
		AMLegal.toverifySubmitButtonFonctionality_SC_01_TC_19();
	  }
	
	
	
	
	
	
	
}
