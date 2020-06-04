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
import HRMS_ERP_UAT_PAYROLL.DownLoadPaySlipPage;
import HRMS_ERP_UAT_PAYROLL.EmployeeHomePage;
import HRMS_ERP_UAT_PAYROLL.HRHomePage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsEmployee extends HRMS_URL
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

	@DataProvider(name="PAYROLL EMPLOYEE")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_VRS_EMPLOYEE");
	}

	@Test(priority=1,description="login verify",dataProvider="PAYROLL EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_PAY_11(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
	}
	
	@Test(priority=2,description="verify self service",dataProvider="PAYROLL EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_PAY_12(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		
		EmployeeHomePage home=PageFactory.initElements(driver,EmployeeHomePage.class);
		home.clickOnSelfService();
	}
	
	@Test(priority=3,description="verify common service",dataProvider="PAYROLL EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_PAY_13(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		
		EmployeeHomePage home=PageFactory.initElements(driver,EmployeeHomePage.class);
		home.clickOnSelfService();
		home.clickOnCommonService();
	}
	
	@Test(priority=4,description="verify payslip download",dataProvider="PAYROLL EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_PAY_14(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_Employee(Username,Password);
		
		HRHomePage homepage=PageFactory.initElements(driver,HRHomePage.class);
		homepage.clickOnDiscussImage();
		
		EmployeeHomePage home=PageFactory.initElements(driver,EmployeeHomePage.class);
		home.clickOnSelfService();
		home.clickOnCommonService();
		home.clickOnPaySlip();
		
		DownLoadPaySlipPage slip=PageFactory.initElements(driver,DownLoadPaySlipPage.class);
		slip.selectMonth();
		slip.clickOnDownload();
		slip.clickOnCancel();
	}

}
