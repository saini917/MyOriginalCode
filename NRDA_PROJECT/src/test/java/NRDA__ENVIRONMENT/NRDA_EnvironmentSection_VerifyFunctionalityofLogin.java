package NRDA__ENVIRONMENT;

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
import NRDA_ENVIRONMENT.ToverifytheFunctionalityof_Environment_Login;


/**
 * @author Sarvesh.Nellore
 * @Date: 30-11-2017
 * @Purpose: Verify the Functionality of Login
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_EnvironmentSection_VerifyFunctionalityofLogin extends URLPageWSNRDAScript
{

	

	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";


	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		waitForSomeTime();
		driver.close();

	}
	
	@DataProvider(name="citizen")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Citizen Credentials");
	}

		@Test(dataProvider ="citizen",description="To verifythefunctionalityof Loginwithvalid Credientials",priority=1)
		public void NRDA_ENVIRONMENT_SC_02_TC_01(String username,String password) throws Exception
		 {
			
			ToverifytheFunctionalityof_Environment_Login login=PageFactory.initElements(driver, ToverifytheFunctionalityof_Environment_Login.class);
			login.LoginwithValidCredentials_SC_02_TC_01();
			login.toverifyDashBoardMenu();
			//login.logoutWS();
		 }
		
		@Test(dataProvider ="citizen",description="LoginwithInValidUser",priority=2)
		public void NRDA_ENVIRONMENT_SC_02_TC_02(String username,String password) throws Exception
		 {
			
			ToverifytheFunctionalityof_Environment_Login login=PageFactory.initElements(driver, ToverifytheFunctionalityof_Environment_Login.class);
			login.LoginwithInValidUser_SC_02_TC_02();
		
		 }
	
		@Test(dataProvider ="citizen",description="LoginwithInValidPassword",priority=3)
		public void NRDA_ENVIRONMENT_SC_02_TC_03(String username,String password) throws Exception
		 {
			
			ToverifytheFunctionalityof_Environment_Login login=PageFactory.initElements(driver, ToverifytheFunctionalityof_Environment_Login.class);
			login.LoginwithInValidPassword_SC_02_TC_03();
		
		 }
		
		@Test(dataProvider ="citizen",description="LoginwithBlankFields",priority=4)
		public void NRDA_ENVIRONMENT_SC_02_TC_04(String username,String password) throws Exception
		 {
			
			ToverifytheFunctionalityof_Environment_Login login=PageFactory.initElements(driver, ToverifytheFunctionalityof_Environment_Login.class);
			login.LoginwithBlankFields_SC_02_TC_04();
		
		 }
	

}
