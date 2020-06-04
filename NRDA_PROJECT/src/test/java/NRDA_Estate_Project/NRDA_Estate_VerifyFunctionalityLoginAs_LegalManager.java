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
public class NRDA_Estate_VerifyFunctionalityLoginAs_LegalManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="Legal_Manager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"LegalManager_Credentials");
	}
	
	@Test(dataProvider ="Legal_Manager",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_017_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifythedashboardoftheApplication();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_017_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_017_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_017_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyPrintButtonFunctionality();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyUnitPropertyDetailTab",priority=5)
	public void NRDA_Estate_SC_017_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyUnitPropertyDetailTab();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyViewLink",priority=6)
	public void NRDA_Estate_SC_017_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyViewLink();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyMarkCheckboxLink",priority=7)
	public void NRDA_Estate_SC_017_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyMarkCheckboxLink();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyCaseDropdown",priority=8)
	public void NRDA_Estate_SC_017_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyCaseDropdown();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyLegalRemarksTextboxField",priority=9)
	public void NRDA_Estate_SC_017_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyLegalRemarksTextboxField();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyUpdatePlotDetails",priority=10)
	public void NRDA_Estate_SC_017_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyUpdatePlotDetails();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyActionDropdownFunctionality",priority=11)
	public void NRDA_Estate_SC_017_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyActionDropdownFunctionality();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyEnterCommentsFieldisBlank",priority=12)
	public void NRDA_Estate_SC_017_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyActionDropdownFunctionality();
			LegalManager.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyEnterCommentsField",priority=13)
	public void NRDA_Estate_SC_017_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyActionDropdownFunctionality();
			LegalManager.toverifyEnterCommentsField();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyinvalidUploaddocumentfield",priority=14)
	public void NRDA_Estate_SC_017_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyActionDropdownFunctionality();
			LegalManager.toverifyEnterCommentsField();
			LegalManager.toverifyinvalidUploaddocumentfield();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifyUploaddocumentfield",priority=15)
	public void NRDA_Estate_SC_017_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyActionDropdownFunctionality();
			LegalManager.toverifyEnterCommentsField();
			LegalManager.toverifyUploaddocumentfield();
	
		}
	
	@Test(dataProvider ="Legal_Manager",description="toverifysubmitbuttonFunctionality",priority=16)
	public void NRDA_Estate_SC_017_TC_018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLegal_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LegalManager LegalManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LegalManager.class);
			LegalManager.toverifyActionButtonagainsttheApplication();
			LegalManager.toverifyActionDropdownFunctionality();
			LegalManager.toverifyEnterCommentsField();
			LegalManager.toverifyUploaddocumentfield();
			LegalManager.toverifysubmitbuttonFunctionality();
	
		}
	
}
