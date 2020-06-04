/**
 * 
 */
package NRDA_RTI;

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
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;


/**
 * @author Sarvesh.Nellore
 * @Date: 26-10-2017
 */
@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_RTILoginAsAPIO extends URLPageWSNRDAScript
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
	@DataProvider(name="APIO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"APIO Credentials");
	}
	
	 @Test(priority=1,dataProvider ="APIO",description="verifyLoginAsAPIO_SC_10_TC_01")
		public void NRDA_RTI_SC_10_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_PIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_PIO.loginAsAPIO(username, password);
			}
	 
	 @Test(priority=2,dataProvider ="APIO",description="verifytheDashBoardOfRTI_APIO_SC_10_TC_02")
		public void NRDA_RTI_SC_10_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_APIO.loginAsAPIO(username, password);
				
				ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
				RTI_APIO.toVerifyMenuFieldsonDashBoard_SC_10_TC02();
				RTI_APIO.toVerifyFieldsonRTIIcon_SC_10_TC02();
			}
	 

		@Test(priority=3,dataProvider ="APIO",description="verifytheApprovedCountLinkonRTI_APIO_SC_10_TC_03")
		public void NRDA_RTI_SC_10_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
			{
				WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
				login_as_APIO.loginAsAPIO(username, password);
				
				ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
				RTI_APIO.toclickonApprovecountlink();
				RTI_APIO.toVerifyActionButtonDisplayed01();
				RTI_APIO.toVerifyRecordPerPage02();
				RTI_APIO.toVerifyPagination02();
				RTI_APIO.closePopUpWindow();
				RTI_APIO.toverifyApproveCountinRTImenu02();
				RTI_APIO.closePopUpWindow();
			}
	
	
	@Test(priority=4,dataProvider ="APIO",description="verifytheRejectCountLinkonRTI_PIO_SC_10_TC_04")
	public void NRDA_RTI_SC_10_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toVerifyRejectCountlinkinRTImenu();
			RTI_APIO.toVerifyActionButtonDisplayed01();
			RTI_APIO.toVerifyRecordPerPage02();
			RTI_APIO.toVerifyPagination02();
			RTI_APIO.closePopUpWindow();
			RTI_APIO.toverifyRejectCountinRTImenu02();
			RTI_APIO.closePopUpWindow();
		}
	
	@Test(priority=5,dataProvider ="APIO",description="verifythePendingCountLinkonRTI_APIO_SC_10_TC_05")
	public void NRDA_RTI_SC_10_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toVerifyPendingCountlinkinRTImenu();
			RTI_APIO.toVerifyActionButtonDisplayed01();
			RTI_APIO.toVerifyRecordPerPage02();
			RTI_APIO.toVerifyPagination02();
			RTI_APIO.closePopUpWindow();
			RTI_APIO.toverifyPendingCountinRTImenu02();
			RTI_APIO.closePopUpWindow();
		}
	
	@Test(priority=6,dataProvider ="APIO",description="toverifythependingApplicationAsPublicInformationOfficer_SC_10_TC_06")
	public void NRDA_RTI_SC_10_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationAsPublicInformationOfficer_SC_10_TC_06();
			
		}
	
	@Test(priority=7,dataProvider ="APIO",description="toverifythefunctionalityofpaginationinPendingApplication_SC_10_TC_07")
	public void NRDA_RTI_SC_10_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythefunctionalityofpaginationinPendingApplication_SC_10_TC_07();
			
		}
	
	@Test(priority=8,dataProvider ="APIO",description="toverifythePendingApplicationInvalidNumber_SC_10_TC_08")
	public void NRDA_RTI_SC_10_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithInvalidNumber_SC_10_TC_08();
			
		}
	@Test(priority=9,dataProvider ="APIO",description="toverifythePendingApplicationBlankField_SC_10_TC_09")
	public void NRDA_RTI_SC_10_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithBlankField_SC_10_TC_09();
			
		}
	
	@Test(priority=10,dataProvider ="APIO",description="toverifythePendingApplicationBlankField_SC_10_TC_10")
	public void NRDA_RTI_SC_10_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithValidNumber_SC_10_TC_10();
			
		}
		
	
	@Test(priority=11,dataProvider ="APIO",description="toverifythePendingApplicationBlankField_SC_10_TC_11")
	public void NRDA_RTI_SC_10_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithValidNumber_SC_10_TC_10();
			RTI_APIO.toverifythependingApplicationActionFunctionality_SC_10_TC_11();
		}
	
	
	@Test(priority=12,dataProvider ="APIO",description="toverifytheSubmitButtonActionFunctionalityisBlank_SC_10_TC_12")
	public void NRDA_RTI_SC_10_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithValidNumber_SC_10_TC_10();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_10_TC_12();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
			//RTI_APIO.toVerifyErrorMessage();
		}
	
	
	@Test(priority=14,dataProvider ="APIO",description="toverifytheSubmitButtonCommentFieldIsBlank_SC_10_TC_14")
	public void NRDA_RTI_SC_10_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithValidNumber_SC_10_TC_10();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_10_TC_12();
			
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_10_TC_14();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
			RTI_APIO.toVerifyErrorMessageAsUserisBlank();
		}
	
	@Test(priority=15,dataProvider ="APIO",description="toverifythefunctionalityofSelectingDepartment_SC_10_TC_15")
	public void NRDA_RTI_SC_10_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifythependingApplicationWithValidNumber_SC_10_TC_10();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_10_TC_12();
			RTI_APIO.toVerifyFunctionalityofDepartment_DepartmentHead_SC_10_TC_15();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_10_TC_14();
			RTI_APIO.toVerifySubmitbuttonFunctionalityWithActionFieldISBlank();
			RTI_APIO.toVerifyErrorMessageAsUserisBlank();
		}
	
	
	@Test(priority=16,dataProvider ="APIO",description="toverifythefunctionalityofCloseButton_SC_10_TC_17")
	public void NRDA_RTI_SC_10_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifyfunctionalityofclosebutton_SC_09_TC_18();
			//RTI_APIO.toverifythemenuAfterClosingPendingApplication_SC_09_TC_018();
		}
	
	@Test(priority=17,dataProvider ="APIO",description="toverifythefunctionalityofSelectingDepartment_SC_10_TC_16")
	public void NRDA_RTI_SC_10_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage login_as_APIO=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			login_as_APIO.loginAsAPIO(username, password);
			
			ToverifyRTILoginAPIO RTI_APIO=PageFactory.initElements(driver, ToverifyRTILoginAPIO.class);
			RTI_APIO.toverifySubmitFunctionalitywithActionAsForward_SC_10_TC_17();
		}

	
	
	}