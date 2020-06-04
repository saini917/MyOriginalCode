package HRMS_ERP_UAT_VRS_TEST;

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
import HRMS_ERP_UAT_VRS.CEOapprovePage;
import HRMS_ERP_UAT_VRS.COHomePage;
import HRMS_ERP_UAT_VRS.EmployeeRetirement;
import HRMS_ERP_UAT_VRS.HomePage;
import HRMS_ERP_UAT_VRS.ResignationPage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsCEO extends HRMS_URL
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

	@DataProvider(name="VRS CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_VRS_CEO");
	}

	@Test(priority=1,description="login verify",dataProvider="VRS CEO",alwaysRun=true)
	public void UAT_HRMS_VRS_20(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_CEO(Username,Password);
	}
	
	@Test(priority=2,description="verify Resignation/retirement",dataProvider="VRS CEO",alwaysRun=true)
	public void UAT_HRMS_VRS_21(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_CEO(Username,Password);
		
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.clickOnDiscussImage();
		
		COHomePage cohome=PageFactory.initElements(driver,COHomePage.class);
		cohome.clickOnResignation();
	}
	
	@Test(priority=3,description="verify retirements",dataProvider="VRS CEO",alwaysRun=true)
	public void UAT_HRMS_VRS_22(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_CEO(Username,Password);
		
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.clickOnDiscussImage();
		
		COHomePage cohome=PageFactory.initElements(driver,COHomePage.class);
		cohome.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeRetirement name=PageFactory.initElements(driver,EmployeeRetirement.class);
		name.clickOnEmployeeSearch();
		name.clickOnEmployee();
		
		CEOapprovePage approve=PageFactory.initElements(driver,CEOapprovePage.class);
		approve.clickOnCEOStatus();
	}
	
	@Test(priority=4,description="verify approve",dataProvider="VRS CEO",alwaysRun=true)
	public void UAT_HRMS_VRS_23(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_VRS_CEO(Username,Password);
		
		HomePage home=PageFactory.initElements(driver,HomePage.class);
		home.clickOnDiscussImage();
		
		COHomePage cohome=PageFactory.initElements(driver,COHomePage.class);
		cohome.clickOnResignation();
		
		ResignationPage retirement=PageFactory.initElements(driver,ResignationPage.class);
		retirement.clickOnRetirement();
		retirement.clickOnRetirements();
		
		EmployeeRetirement name=PageFactory.initElements(driver,EmployeeRetirement.class);
		name.clickOnEmployeeSearch();
		name.clickOnEmployee();
		
		CEOapprovePage approve=PageFactory.initElements(driver,CEOapprovePage.class);
		approve.clickOnCEOStatus();
		approve.clickOnCEOApprove();
		approve.enterRemark();
		approve.clickOnSubmit();
	}

}
