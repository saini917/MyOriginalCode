package HRMS_ERP_UAT_PAYROLL_TEST;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import HRMS_ERP_UAT_PAYROLL.HRComputeSheetPage;
import HRMS_ERP_UAT_PAYROLL.HRCreateNewPayslipBatches;
import HRMS_ERP_UAT_PAYROLL.HREmployeePaySlip;
import HRMS_ERP_UAT_PAYROLL.HRGeneratePaySlip;
import HRMS_ERP_UAT_PAYROLL.HRHomePage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsHRManager extends HRMS_URL
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_TESTDATA\\HRMS_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutHRMS() throws InterruptedException
	{
		WebElement logout=driver.findElement(By.xpath("//header[@role='banner']/nav/div/ul/li/a/img"));
		HighlightOnElement(logout);
		logout.click();
		Reporter.log("click on Administrator menu successfully",true);
		log.info("To verify click on Administrator menu successfully");

		WebElement logoutbtn=driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
		HighlightOnElement(logoutbtn);
		logoutbtn.click();
		Reporter.log("click on Logout buton successfully",true);
		log.info("To verify click on Logout button successfully");
		
		driver.close();
		Reporter.log("Browser closed succesfully",true);
		log.info("To verify Browser closed successfully");
	}

	@DataProvider(name="PAYROLL HRManager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_VRS_HR");
	}

	@Test(priority=1,description="login verify",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_1(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
	}
	
	@Test(priority=2,description="verify payroll",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_2(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
	}
	
	@Test(priority=3,description="verify payslip batches",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_3(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		homepage.clickOnPaySlipBatches();
	}
	
	@Test(priority=4,description="verify create",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_4(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		homepage.clickOnPaySlipBatches();
		homepage.clickOnCreate();
		
		HRCreateNewPayslipBatches batch=PageFactory.initElements(driver,HRCreateNewPayslipBatches.class);
		batch.enterPaySlipBatchName();
	}
	
	@Test(priority=5,description="verify payslip batch",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_5(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		homepage.clickOnPaySlipBatches();
		homepage.clickOnCreate();
		
		HRCreateNewPayslipBatches batch=PageFactory.initElements(driver,HRCreateNewPayslipBatches.class);
		batch.enterPaySlipBatchName();
		batch.clickOnSave();
	}
	
	@Test(priority=6,description="verify payslip batch",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_6(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		homepage.clickOnPaySlipBatches();
		homepage.clickOnSearch();
		homepage.enterFilterDetails();
	}
	
	@Test(priority=7,description="verify select all employee",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_7(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		homepage.clickOnPaySlipBatches();
		homepage.clickOnSearch();
		homepage.enterFilterDetails();
		
		HRCreateNewPayslipBatches batch=PageFactory.initElements(driver,HRCreateNewPayslipBatches.class);
		batch.clickOnDraft();
		batch.clickOnGeneratePaySlip();
		
		HRGeneratePaySlip slip=PageFactory.initElements(driver,HRGeneratePaySlip.class);
		slip.clickOnAddAnItem();
		slip.checkAllEmployee();
		slip.clickOnSelect();
		slip.clickOnGenerate();
	}
	
	@Test(priority=8,description="verify employee change draft to done",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_8(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		
		HREmployeePaySlip employeePaySlip=PageFactory.initElements(driver,HREmployeePaySlip.class);
		employeePaySlip.clickOnEmployeePaySlip();
		homepage.clickOnSearch();
		employeePaySlip.enterFilterDetails();	
	}
	
	@Test(priority=9,description="verify compute sheet",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_9(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		
		HREmployeePaySlip employeePaySlip=PageFactory.initElements(driver,HREmployeePaySlip.class);
		employeePaySlip.clickOnEmployeePaySlip();
		homepage.clickOnSearch();
		employeePaySlip.enterFilterDetails();
		employeePaySlip.clickOnDraft();
		
		HRComputeSheetPage compute=PageFactory.initElements(driver,HRComputeSheetPage.class);
		compute.clickOnComputeSheet();
	}
	
	@Test(priority=10,description="verify confirm",dataProvider="PAYROLL HRManager",alwaysRun=true)
	public void UAT_HRMS_PAY_10(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HR(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		homepage.clickOnPayroll();
		
		HREmployeePaySlip employeePaySlip=PageFactory.initElements(driver,HREmployeePaySlip.class);
		employeePaySlip.clickOnEmployeePaySlip();
		homepage.clickOnSearch();
		employeePaySlip.enterFilterDetails();
		employeePaySlip.clickOnDraft();
		
		HRComputeSheetPage compute=PageFactory.initElements(driver,HRComputeSheetPage.class);
		compute.clickOnComputeSheet();
		compute.clickOnConfirm();
	}
}
