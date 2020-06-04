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
import org.testng.annotations.Test;

import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

public class NRDA_Estate_VerifyFunctionalityLoginAs_FinanceManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="Finance_Manager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"FinanceManager_Credentials");
	}
	
	@Test(dataProvider ="Finance_Manager",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_021_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifythedashboardoftheApplication();
	
		}
	
	
	@Test(dataProvider ="Finance_Manager",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_021_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_021_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_021_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyPrintButtonFunctionality();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyUnitPropertyDetailTab",priority=5)
	public void NRDA_Estate_SC_021_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyUnitPropertyDetailTab();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyViewLink",priority=6)
	public void NRDA_Estate_SC_021_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyViewLink();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyMarkCheckboxLink",priority=7)
	public void NRDA_Estate_SC_021_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyMarkCheckboxLink();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyLandRemarksTextboxField",priority=8)
	public void NRDA_Estate_SC_021_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyLandRemarksTextboxField();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyUpdatePlotDetails",priority=9)
	public void NRDA_Estate_SC_021_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyUpdatePlotDetails();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyActionDropdownFunctionality",priority=10)
	public void NRDA_Estate_SC_021_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyActionDropdownFunctionality();
	
		}
	
	
	@Test(dataProvider ="Finance_Manager",description="toverifyEnterCommentsFieldisBlank",priority=11)
	public void NRDA_Estate_SC_021_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyActionDropdownFunctionality();
			FinanceManager.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyEnterCommentsField",priority=12)
	public void NRDA_Estate_SC_021_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyActionDropdownFunctionality();
			FinanceManager.toverifyEnterCommentsField();;
			
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyinvalidUploaddocumentfield",priority=13)
	public void NRDA_Estate_SC_021_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyActionDropdownFunctionality();
			FinanceManager.toverifyEnterCommentsField();
			FinanceManager.toverifyinvalidUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyinvalidUploaddocumentfield",priority=14)
	public void NRDA_Estate_SC_021_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyActionDropdownFunctionality();
			FinanceManager.toverifyEnterCommentsField();
			FinanceManager.toverifyUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="Finance_Manager",description="toverifyinvalidUploaddocumentfield",priority=15)
	public void NRDA_Estate_SC_021_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsFinance_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_FinanceManager FinanceManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_FinanceManager.class);
			FinanceManager.toverifyActionButtonagainsttheApplication();
			FinanceManager.toverifyActionDropdownFunctionality();
			FinanceManager.toverifyEnterCommentsField();
			FinanceManager.toverifyUploaddocumentfield();
			FinanceManager.toverifysubmitbuttonFunctionality();
		}
	
  }