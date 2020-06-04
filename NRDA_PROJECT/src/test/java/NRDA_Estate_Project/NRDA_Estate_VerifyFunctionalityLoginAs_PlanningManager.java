package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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

@Listeners(GenericLibrary.ListenerDriver.class)
public class NRDA_Estate_VerifyFunctionalityLoginAs_PlanningManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="Planning_Manager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"PlanningManager_Credentials");
	}
	
	@Test(dataProvider ="Planning_Manager",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_015_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifythedashboardoftheApplication();
	
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_015_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_015_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_015_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyPrintButtonFunctionality();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyUnitPropertyDetailTab",priority=5)
	public void NRDA_Estate_SC_015_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyUnitPropertyDetailTab();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyViewLink",priority=6)
	public void NRDA_Estate_SC_015_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyViewLink();
		}
	
	
	@Test(dataProvider ="Planning_Manager",description="toverifyMarkCheckboxLink",priority=7)
	public void NRDA_Estate_SC_015_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyMarkCheckboxLink();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyPlanningRemarksTextboxField",priority=8)
	public void NRDA_Estate_SC_015_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyPlanningRemarksTextboxField();
		}
	
	
	
	@Test(dataProvider ="Planning_Manager",description="toverifyUpdatePlotDetails",priority=9)
	public void NRDA_Estate_SC_015_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyUpdatePlotDetails();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyActionDropdownFunctionality",priority=10)
	public void NRDA_Estate_SC_015_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyActionDropdownFunctionality();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyEnterCommentsFieldisBlank",priority=11)
	public void NRDA_Estate_SC_015_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyActionDropdownFunctionality();
			PlanningManager.toverifyEnterCommentsFieldisBlank();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyEnterCommentsField",priority=12)
	public void NRDA_Estate_SC_015_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyActionDropdownFunctionality();
			PlanningManager.toverifyEnterCommentsField();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifyinvalidUploaddocumentfield",priority=13)
	public void NRDA_Estate_SC_015_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyActionDropdownFunctionality();
			PlanningManager.toverifyEnterCommentsField();
			PlanningManager.toverifyinvalidUploaddocumentfield();
		}
	
	
	@Test(dataProvider ="Planning_Manager",description="toverifyUploaddocumentfield",priority=14)
	public void NRDA_Estate_SC_015_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyActionDropdownFunctionality();
			PlanningManager.toverifyEnterCommentsField();
			PlanningManager.toverifyUploaddocumentfield();
		}
	
	@Test(dataProvider ="Planning_Manager",description="toverifysubmitbuttonFunctionality",priority=15)
	public void NRDA_Estate_SC_015_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsPM.loginAsPlanning_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_PlanningManager PlanningManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_PlanningManager.class);
			PlanningManager.toverifyActionButtonagainsttheApplication();
			PlanningManager.toverifyActionDropdownFunctionality();
			PlanningManager.toverifyEnterCommentsField();
			PlanningManager.toverifyUploaddocumentfield();
			PlanningManager.toverifysubmitbuttonFunctionality();
		}
	
	
	}