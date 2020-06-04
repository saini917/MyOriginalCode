package HRMS_ERP_UAT_DSC_TEST;

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
import HRMS_ERP_UAT_DSC.EditPage;
import HRMS_ERP_UAT_DSC.EmployeeDisciplinaryActionPage;
import HRMS_ERP_UAT_DSC.EmployeeHomePage;
import HRMS_ERP_UAT_DSC.EmployeeStatusPage;
import HRMS_ERP_UAT_DSC.HRHomePage;
import HRMS_ERP_UAT_DSC.SubmitPage;
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

	@DataProvider(name="DSC Employee")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_DSC_EMPLOYEE");
	}

	@Test(priority=1,description="login verify",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_7(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
	}
	
	@Test(priority=2,description="verify self service",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_8(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
	}
	
	@Test(priority=3,description="verify common service",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_9(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
		emppage.clickOnCommonService();
		emppage.clickOnShowCauseNotice();
	}
	
	@Test(priority=4,description="verify employee status",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_10(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
		emppage.clickOnCommonService();
		emppage.clickOnShowCauseNotice();
		
		EmployeeDisciplinaryActionPage status=PageFactory.initElements(driver,EmployeeDisciplinaryActionPage.class);
		status.clickOnEmployeeStatus();
	}
	
	@Test(priority=5,description="verify edit",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_11(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
		emppage.clickOnCommonService();
		emppage.clickOnShowCauseNotice();
		
		EmployeeDisciplinaryActionPage status=PageFactory.initElements(driver,EmployeeDisciplinaryActionPage.class);
		status.clickOnEmployeeStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		edit.enterRemark();
	}
	
	@Test(priority=6,description="verify submit feedback",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_12(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
		emppage.clickOnCommonService();
		emppage.clickOnShowCauseNotice();
		
		EmployeeDisciplinaryActionPage status=PageFactory.initElements(driver,EmployeeDisciplinaryActionPage.class);
		status.clickOnEmployeeStatus();
		
		EditPage edit=PageFactory.initElements(driver,EditPage.class);
		edit.clickOnEdit();
		edit.enterRemark();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnSubmitFeedback();
	}
	
	
	
								//check employee status
	
	@Test(priority=1,description="login verify",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_31(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
	}
	
	@Test(priority=2,description="verify self service",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_32(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
	}
	
	@Test(priority=3,description="verify common service",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_33(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
		emppage.clickOnCommonService();
		emppage.clickOnShowCauseNotice();
	}
	
	@Test(priority=4,description="verify status",dataProvider="DSC Employee",alwaysRun=true)
	public void UAT_HRMS_DSC_34(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		EmployeeHomePage emppage=PageFactory.initElements(driver,EmployeeHomePage.class);
		emppage.clickOnSelfService();
		emppage.clickOnCommonService();
		emppage.clickOnShowCauseNotice();
		
		EmployeeStatusPage status=PageFactory.initElements(driver,EmployeeStatusPage.class);
		status.clickOnEmployeeStatus();
		status.checkEmployeeStatus();
	}

}
