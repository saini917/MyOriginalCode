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
import NRDA_LEGAL.ToverifyfunctionalityofM_Legal;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

/**
 * @author Sarvesh.Nellore
 * @Date: 21-11-2017
 * @Purpose: Legal Section Login As Manager
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_LegalSectionLoginAs_Manager extends URLPageWSNRDAScript
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
		public String[][] getExcelData() throws InvalidFormatException, IOException
		{
			
			return exceldata.getCellData(filepath,"M_LEGAL Credentials");
		}
		
		@Test(priority=1,dataProvider ="M-LEGAL",description="verifyLoginAs_M_LEGAL")
		public void NRDA_LEGAL_SC_02_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyMenuFieldsonDashBoard_SC_02_TC01();
		}
		
		@Test(priority=2,dataProvider ="M-LEGAL",description="verify_PendingApplicationLink")
		public void NRDA_LEGAL_SC_02_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyMenuFieldsonPendingApplication_SC_02_TC_02();
			
		}
		
		@Test(priority=3,dataProvider ="M-LEGAL",description="verify_CaseNumberReceivedBy_AM_MAnager")
		public void NRDA_Legal_SC_02_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			//login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_03();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.VeriftMenuTabsInApplicationNumber_SC_02_TC_03();
			
		}
		
		@Test(priority=4,dataProvider ="M-LEGAL",description="verify_AdvocateButtonFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.VeriftMenuTabsInApplicationNumber_SC_02_TC_03();
			login_MLegal.toVerifyFunctionalityofAdvocateButton_SC_02_TC_04();
		}
		
		@Test(priority=5,dataProvider ="M-LEGAL",description="verifyOICButtonFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.VeriftMenuTabsInApplicationNumber_SC_02_TC_03();
			login_MLegal.toVerifyFunctionalityofOICButton_SC_02_TC_05();
		}
		
		@Test(priority=6,dataProvider ="M-LEGAL",description="verifySelectActionDropdownFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.toVerifyFunctionalityofSelectActionDropdown_SC_02_TC_06();
		}
		
		@Test(priority=7,dataProvider ="M-LEGAL",description="verifySelectUserDropdownFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.toVerifyFunctionalityofSelectActionDropdown_SC_02_TC_07();
			
		}
		
		@Test(priority=8,dataProvider ="M-LEGAL",description="verifyEnterCommentsFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.toVerifyFunctionalityofSelectActionDropdown_SC_02_TC_07();
			login_MLegal.toVerifyFunctionalityofEnterCommentsField_SC_02_TC_08();
		}
		
		@Test(priority=9,dataProvider ="M-LEGAL",description="verifyCloseButtonFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAS_MLegal=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAS_MLegal.loginAs_MLEGAL(username, password);
			
			ToverifyfunctionalityofM_Legal login_MLegal=PageFactory.initElements(driver, ToverifyfunctionalityofM_Legal.class);
			login_MLegal.toVerifyPendingApplicationLink_SC_02_TC_02();
			login_MLegal.toVerifyCaseNumberForwardedByAM_Manager_SC_02_TC_003();
			login_MLegal.toVerifyFunctionalityofSelectActionDropdown_SC_02_TC_07();
			login_MLegal.toVerifyFunctionalityofEnterCommentsField_SC_02_TC_08();
			login_MLegal.toVerifyFunctionalityofCloseButton_SC_02_TC_10();
		}
		
		@Test(priority=10,dataProvider ="M-LEGAL",description="verifySubmitButtonFunctionality_M_MAnager")
		public void NRDA_Legal_SC_02_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
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
		
		
}
