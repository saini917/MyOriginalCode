package NRDA_RTI;

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
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;


/**
 * @author Sarvesh.Nellore
 * @Date: 31-10-2017
 * @Purpose:  RTI Login As Head
 */
public class NRDA_RTILoginAsHEAD extends URLPageWSNRDAScript
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
	@DataProvider(name="HEAD")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HEAD Credentials");
	}
	
	    @Test(priority=1,dataProvider ="HEAD",description="verifyLoginAsHead_SC_11_TC_01")
		public void NRDA_RTI_SC_11_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
			}
	    
	    @Test(priority=2,dataProvider ="HEAD",description="verifytheDashBoardOfRTI_HEAD_SC_11_TC_02")
		public void NRDA_RTI_SC_11_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toVerifyMenuFieldsonDashBoard_SC_11_TC02();
			}
	    
	    @Test(priority=3,dataProvider ="HEAD",description="verifythePaginationFunctionality_SC_11_TC_02")
		public void NRDA_RTI_SC_11_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toverifythefunctionalityofpaginationinPendingApplication_SC_11_TC_07();
			}
	    
	
	 @Test(priority=4,dataProvider ="HEAD",description="toverifythePendingApplicationInvalidNumber_SC_11_TC_08")
		public void NRDA_RTI_SC_11_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toverifythependingApplicationWithInvalidNumber_SC_11_TC_08();
			}
	
	 @Test(priority=5,dataProvider ="HEAD",description="NRDA_Water & Sewerage_RTI_SC_11_TC_09")
		public void NRDA_RTI_SC_11_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toverifythependingApplicationWithBlankField_SC_11_TC_09();
			}
	
	 @Test(priority=6,dataProvider ="HEAD",description="toVerifyActionButtonFunctionWithValidData_SC_11_TC_11")
		public void NRDA_RTI_SC_11_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toVerifyActionFunctionWithValidData_SC_11_TC_11();
			}
	

	 @Test(priority=7,dataProvider ="HEAD",description="toVerifySubmitButtonFunctionwithActionFieldISBlank_SC_11_TC_12")
		public void NRDA_RTI_SC_11_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toVerifyActionFunctionWithValidData_SC_11_TC_11();
				RTI_HEAD.toverifythependingApplicationActionFunctionality_SC_09_TC_11();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
				//RTI_HEAD.toVerifyErrorMessage();
			}
	
	
	    @Test(priority=8,dataProvider ="HEAD",description="toVerifySubmitButtonFunctionwithCommentFieldisBalnk_SC_11_TC_13")
			public void NRDA_RTI_SC_11_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toVerifyActionFunctionWithValidData_SC_11_TC_11();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_11_TC_13();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
				RTI_HEAD.toVerifyErrorMessageAsUserisBlank();
			}
	
	

	 	@Test(priority=9,dataProvider ="HEAD",description="toVerifyCloseButtonFunctionality_SC_11_TC_15")
		public void NRDA_RTI_SC_11_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toVerifyActionFunctionWithValidData_SC_11_TC_11();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
				RTI_HEAD.toverifytheCloseButtonFunctionality_SC_11_TC_15();
				
				
			}
	    
	    
	    
	 @Test(priority=10,dataProvider ="HEAD",description="toVerifySubmitButtonFunctionwithSelectingOfficerDropdown_SC_11_TC_14")
		public void NRDA_RTI_SC_11_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_HEAD=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_HEAD.loginAsHead(username, password);
				
				ToverifyRTILoginHEAD  RTI_HEAD=PageFactory.initElements(driver, ToverifyRTILoginHEAD.class);
				RTI_HEAD.toVerifyActionFunctionWithValidData_SC_11_TC_11();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12();
				RTI_HEAD.toverifythefunctionalityofForward_SC_11_TC_14();
				RTI_HEAD.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
				
			}
	
	
}
