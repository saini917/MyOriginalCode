package HRMS_ERP_UAT_BUDGET_REVISION;

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
import HRMS_ERP_UAT_BUDGET_ALLOCATION.BudgetAllocationMenu;
import HRMS_ERP_UAT_BUDGET_ALLOCATION.BudgetAllocationTabPage;
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

	@DataProvider(name="FM")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"HRMS_FM");
	}

	@Test(priority=1,description="login verify",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_21(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
	}
	
	@Test(priority=2,description="verify budget revision request",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_22(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		BudgetAllocationTabPage allocations=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocations.clickOnBudgetAllocationTab();
	    
	    BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
	    revision.clickOnBudgetRevisionRequest();
	}
	
	@Test(priority=3,description="verify create",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_23(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		BudgetAllocationTabPage allocations=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocations.clickOnBudgetAllocationTab();
	    
	    BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
	    revision.clickOnBudgetRevisionRequest();
	    
	    CreatePage create=PageFactory.initElements(driver,CreatePage.class);
	    create.clickOnCreate();
	}
	
	@Test(priority=4,description="verify Budget Details",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_24(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		BudgetAllocationTabPage allocations=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocations.clickOnBudgetAllocationTab();
	    
	    BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
	    revision.clickOnBudgetRevisionRequest();
	    
	    CreatePage create=PageFactory.initElements(driver,CreatePage.class);
	    create.clickOnCreate();
	    create.selectSection();
	  	create.assignedTo();
	    
	    BudgetDetailsPage details=PageFactory.initElements(driver,BudgetDetailsPage.class);
	    details.clickOnAddItem();
	    details.enterProjectName();
	    details.enterAmountRequest();
	    details.clickOnSaveAndClose();
	}
	
	@Test(priority=5,description="verify Miscellaneous Details",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_25(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		BudgetAllocationTabPage allocations=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocations.clickOnBudgetAllocationTab();
	    
	    BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
	    revision.clickOnBudgetRevisionRequest();
	    
	    CreatePage create=PageFactory.initElements(driver,CreatePage.class);
	    create.clickOnCreate();
	    create.selectSection();
	    create.assignedTo();
	    
	    BudgetDetailsPage details=PageFactory.initElements(driver,BudgetDetailsPage.class);
	    details.clickOnAddItem();
	    details.enterProjectName();
	    details.enterAmountRequest();
	    details.clickOnSaveAndClose();
	    
	    MiscellaniousPage mis=PageFactory.initElements(driver,MiscellaniousPage.class);
	    mis.clickOnMiscellaneous();
	    mis.clickOnAddItem();
	    mis.clickOnBudgetHead();
	    mis.enterAmountRequest();
	}
	
	@Test(priority=6,description="verify save",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_26(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		 BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
		   revision.clickOnBudgetRevisionRequest();
		    
		    CreatePage create=PageFactory.initElements(driver,CreatePage.class);
		    create.clickOnCreate();
		    create.selectSection();
		    create.assignedTo();
		    
		    BudgetDetailsPage details=PageFactory.initElements(driver,BudgetDetailsPage.class);
		    details.clickOnAddItem();
		    details.enterProjectName();
		    details.enterAmountRequest();
		    details.clickOnSaveAndClose();
		    
		    MiscellaniousPage mis=PageFactory.initElements(driver,MiscellaniousPage.class);
		    mis.clickOnMiscellaneous();
		    mis.clickOnAddItem();
		    mis.clickOnBudgetHead();
		    mis.enterAmountRequest();
		    
		    SavePage save=PageFactory.initElements(driver,SavePage.class);
		    save.clickOnSave();
	}
	
	@Test(priority=7,description="verify submit",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_27(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		 BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
		 revision.clickOnBudgetRevisionRequest();
		 
		 FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
		 filter.clickOnSerach();
		 filter.enterFilterDetails();
		 filter.enterRequestNo();
		 filter.clickOnApply();
		 filter.clickOnDraft();
		 
		 SubmitPage submit=PageFactory.initElements(driver,SubmitPage.class);
		 submit.clickOnSubmit();
		   
	}
	
	
	
	
							//FM Approval

	@Test(priority=1,description="login verify",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_31(String Username,String Password) throws InterruptedException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
	}
	
	@Test(priority=2,description="verify budget revision request",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_32(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
	}
	
	@Test(priority=3,description="verify budget revision request",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_33(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		BudgetAllocationTabPage allocations=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocations.clickOnBudgetAllocationTab();
	    
	    BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
	    revision.clickOnBudgetRevisionRequest();
	}
	
	@Test(priority=4,description="verify Approve",dataProvider="FM",alwaysRun=true)
	public void UAT_Finance_BA_34(String Username,String Password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		LoginPageHRMS loginhrms=PageFactory.initElements(driver,LoginPageHRMS.class);
		loginhrms.hrms_FM(Username,Password);
		
		HRHomePage home=PageFactory.initElements(driver,HRHomePage.class);
		home.clickOnDiscussImage();
		
		BudgetAllocationMenu allocation=PageFactory.initElements(driver,BudgetAllocationMenu.class);
		allocation.clickOnBudgetAllocation();
		
		BudgetAllocationTabPage allocations=PageFactory.initElements(driver,BudgetAllocationTabPage.class);
	    allocations.clickOnBudgetAllocationTab();
	    
	    BudgetRevisionRequest revision=PageFactory.initElements(driver,BudgetRevisionRequest.class);
	    revision.clickOnBudgetRevisionRequest();
	    
	    FilterPage filter=PageFactory.initElements(driver,FilterPage.class);
	    filter.clickOnSerach();
	    filter.enterFilterDetails();
	    filter.enterRequestNo();
	    filter.clickOnApply();
	    filter.clickOnFMWaitingStatus();
	    
	    ApprovePage approve=PageFactory.initElements(driver,ApprovePage.class);
	    approve.clickOnApprove();
	    approve.enterFMRemark();
	    approve.clickOnApproves();
	}

}
