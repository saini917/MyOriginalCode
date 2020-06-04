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
import HRMS_ERP_UAT_TOUR.ExpensePage;
import HRMS_ERP_UAT_TOUR.PostJournalEntriesPage;
import HRMS_ERP_UAT_TOUR.RemarksPage;
import HRMS_ERP_UAT_TOUR.RequestApprovePage;
import HRMS_ERP_UAT_TOUR.SubmitPage;
import HRMS_LOGINPAGE.LoginPageHRMS;
import HRMS_URL_Page.HRMS_URL;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsFM extends HRMS_URL
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

	@DataProvider(name="TOUR FM")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_TOUR_FM");
	}

	@Test(priority=1,description="login verify",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_HRMS_TOUR_34(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
	}
	
	@Test(priority=2,description="verify expenses",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_HRMS_TOUR_35(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
	}
	
	@Test(priority=3,description="verify expenses",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_HRMS_TOUR_36(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		ExpensePage expense=PageFactory.initElements(driver,ExpensePage.class);
		expense.clickOnExpense();
		expense.verifyExpenseAgainstTour();
	}
	
	@Test(priority=4,description="verify approve",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_HRMS_TOUR_37(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		ExpensePage expense=PageFactory.initElements(driver,ExpensePage.class);
		expense.clickOnExpense();
		expense.clickOnExpenseAgainstTour();
		
		RequestApprovePage app=PageFactory.initElements(driver,RequestApprovePage.class);
		app.clickOnSearch();
		app.enterFilterDetails();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnFMApproval();
		
		RemarksPage approve=PageFactory.initElements(driver,RemarksPage.class);
		approve.clickOnApprove();
		approve.enterFMRemark();
		approve.clickOnSubmit();
	}
	
	@Test(priority=5,description="verify post journal reimbursement",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_HRMS_TOUR_38(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		EmployeeHomePage exp=PageFactory.initElements(driver,EmployeeHomePage.class);
		exp.clickOnDiscussImage();
		exp.clickOnExpenses();
		
		ExpensePage expense=PageFactory.initElements(driver,ExpensePage.class);
		expense.clickOnExpense();
		expense.clickOnExpenseAgainstTour();
		
		RequestApprovePage app=PageFactory.initElements(driver,RequestApprovePage.class);
		app.clickOnSearch();
		app.enterFilterDetails();
		
		PostJournalEntriesPage entries=PageFactory.initElements(driver,PostJournalEntriesPage.class);
		entries.clickOnInReimbursement();
		entries.clickOnPostJournalEntries();
		entries.enterAmtToDisburse();
		entries.selectBankJournal();
		entries.clickOnPost();
	}

}
