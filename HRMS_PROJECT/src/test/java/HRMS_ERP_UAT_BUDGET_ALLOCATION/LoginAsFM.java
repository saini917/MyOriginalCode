package HRMS_ERP_UAT_BUDGET_ALLOCATION;

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
import HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION.SubmitPage;
import HRMS_ERP_UAT_DSC.HRHomePage;
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
	public void UAT_Finance_BA_01(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
	}
	
	@Test(priority=2,description="verify budget initiator",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_Finance_BA_02(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		allocation.clickOnBudgetInitiator();
		allocation.enterYear();
		allocation.clickOnInitiate();
	}
	
	@Test(priority=3,description="verify Consolidate annual",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_Finance_BA_03(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationTabPage allocation=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocation.clickOnBudgetAllocationTab();
		allocation.clickOnConsolidateBudgetRequest();
		
		ConsolidateBudgetRequestPage cons=PageFactory.initElements(driver,ConsolidateBudgetRequestPage.class);
    	cons.clickOnSerach();
		cons.enterFilterDetails();
		cons.enterRequestNo();
		cons.clickOnApply();
		cons.clickOnAccountWaitingStatus();
	}
	
	
										//FM Approval
	
	@Test(priority=1,description="login verify",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_Finance_BA_11(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
	}
	
	@Test(priority=2,description="verify Consolidate annual",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_Finance_BA_12(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationTabPage allocation=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocation.clickOnBudgetAllocationTab();
		allocation.clickOnConsolidateBudgetRequest();
		
		ConsolidateBudgetRequestPage cons=PageFactory.initElements(driver,ConsolidateBudgetRequestPage.class);
    	cons.clickOnSerach();
		cons.enterFilterDetails();
		cons.enterRequestNo();
		cons.clickOnApply();
		cons.clickOnAccountWaitingStatus();
	}
	
	@Test(priority=2,description="verify Approve",dataProvider="TOUR FM",alwaysRun=true)
	public void UAT_Finance_BA_13(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationTabPage allocation=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocation.clickOnBudgetAllocationTab();
		allocation.clickOnConsolidateBudgetRequest();
		
		ConsolidateBudgetRequestPage cons=PageFactory.initElements(driver,ConsolidateBudgetRequestPage.class);
    	cons.clickOnSerach();
		cons.enterFilterDetails();
		cons.enterRequestNo();
		cons.clickOnApply();
		cons.clickOnAccountWaitingStatus();
		
		SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		submit.clickOnApprove();
		submit.selectCEO();
		submit.enterFMRemark();
		submit.clickOnApproves();
	}

}
