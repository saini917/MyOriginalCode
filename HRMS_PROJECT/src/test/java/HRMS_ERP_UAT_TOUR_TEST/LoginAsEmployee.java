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
import HRMS_ERP_UAT_TOUR.CreateRequestPage;
import HRMS_ERP_UAT_TOUR.EmployeeHomePage;
import HRMS_ERP_UAT_TOUR.SaveButton;
import HRMS_ERP_UAT_TOUR.SubmitPage;
import HRMS_ERP_UAT_TOUR.TourRequestPage;
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

	@DataProvider(name="TOUR EMPLOYEE")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_EMPLOYEE");
	}

	@Test(priority=1,description="login verify",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_1(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
	}
	
	@Test(priority=2,description="verify Expenses",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_2(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
	}
	
	@Test(priority=3,description="verify Tour Request",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_3(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
	}
	
	@Test(priority=4,description="verify create",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_4(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		CreateRequestPage create=PageFactory.initElements(driver,CreateRequestPage.class);
		create.clickOnCreate();
		create.enterSourceFrom();
		create.enterDestinationTo();
		create.selectTourStartDate();
		create.selectTourEndDate();
	}
	
	@Test(priority=5,description="verify Add an Item",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_5(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		CreateRequestPage create=PageFactory.initElements(driver,CreateRequestPage.class);
		create.clickOnCreate();
		create.enterSourceFrom();
		create.enterDestinationTo();
		create.selectTourStartDate();
		create.selectTourEndDate();
		create.clickOnAddAnItem();
		create.sourceFrom();
		create.destinationTo();
		create.travelMode();
	}
	
	@Test(priority=6,description="verify comment box",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_6(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		CreateRequestPage create=PageFactory.initElements(driver,CreateRequestPage.class);
		create.clickOnCreate();
		create.enterSourceFrom();
		create.enterDestinationTo();
		create.selectTourStartDate();
		create.selectTourEndDate();
		create.clickOnAddAnItem();
		create.sourceFrom();
		create.destinationTo();
		create.travelMode();
		create.reasonForTour();
	}
	
	@Test(priority=7,description="verify save",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_7(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		CreateRequestPage create=PageFactory.initElements(driver,CreateRequestPage.class);
		create.clickOnCreate();
		create.enterSourceFrom();
		create.enterDestinationTo();
		create.selectTourStartDate();
		create.selectTourEndDate();
		create.clickOnAddAnItem();
		create.sourceFrom();
		create.destinationTo();
		create.travelMode();
		create.reasonForTour();
		
		SaveButton save=PageFactory.initElements(driver,SaveButton.class);
		save.clickOnSave();
	}
	
	@Test(priority=8,description="verify submit",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_8(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnEmployeDraft();
		submit.clickOnSubmit();
	}
	
						//log Expenses
	
	@Test(priority=1,description="login verify",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_21(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
	}
	
	@Test(priority=2,description="verify Expenses",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_22(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
	}
	
	@Test(priority=3,description="verify Tour Request",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_23(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
	}
	
	@Test(priority=4,description="verify Log Expenses",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_24(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnEmployeeDoneStatus();
		submit.clickOnEmployeeLogExpenses();
	}
	
	@Test(priority=5,description="verify submit",dataProvider="TOUR EMPLOYEE",alwaysRun=true)
	public void UAT_HRMS_TOUR_25(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_Employee(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		TourRequestPage tour=PageFactory.initElements(driver,TourRequestPage.class);
		tour.clickOnTourRequest();
		tour.clickOnTourRequestMenu();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnEmployeeDoneStatus();
		submit.clickOnEmployeeLogExpenses();
		submit.clickOnAddItem();
		submit.selectExpense();
		submit.enterExpenseDesc();
		submit.selectCity();
		submit.enterUnitCost();
		submit.enterQuantity();
		submit.expDesc();
		submit.clickOnAny();
		submit.clickOnEmployeeSubmit();
	}

}
