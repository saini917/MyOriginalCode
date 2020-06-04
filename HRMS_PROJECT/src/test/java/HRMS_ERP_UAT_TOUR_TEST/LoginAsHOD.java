package HRMS_ERP_UAT_TOUR_TEST;

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
import HRMS_ERP_UAT_TOUR.EmployeeHomePage;
import HRMS_ERP_UAT_TOUR.RequestApprovePage;
import HRMS_ERP_UAT_TOUR.SubmitPage;
import HRMS_ERP_UAT_TOUR.TourRequestPage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsHOD extends HRMS_URL
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

	@DataProvider(name="TOUR HOD")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_HOD");
	}

	@Test(priority=1,description="login verify",dataProvider="TOUR HOD",alwaysRun=true)
	public void UAT_HRMS_TOUR_9(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
	}
	
	@Test(priority=2,description="verify expenses",dataProvider="TOUR HOD",alwaysRun=true)
	public void UAT_HRMS_TOUR_10(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
	}
	
	@Test(priority=3,description="verify Tour Request",dataProvider="TOUR HOD",alwaysRun=true)
	public void UAT_HRMS_TOUR_11(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		
		RequestApprovePage app=PageFactory.initElements(driver,RequestApprovePage.class);
		app.verifyRequestToApprove();
	}
	
	@Test(priority=4,description="verify submit",dataProvider="TOUR HOD",alwaysRun=true)
	public void UAT_HRMS_TOUR_12(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_HOD(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		
		RequestApprovePage app=PageFactory.initElements(driver,RequestApprovePage.class);
		app.clickOnRequestToApprove();
		app.clickOnSearch();
		app.enterFilterDetails();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnHODApproval();
		submit.clickOnSubmitToHR();
	}

}
