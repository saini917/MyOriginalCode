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

public class NRDA_Estate_VerifyFunctionalityLoginAs_ChiefEngineerManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="chiefmanager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"ChiefEngineerManage_Credentials");
	}
	
	@Test(dataProvider ="chiefmanager",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_025_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifythedashboardoftheApplication();
	
		}
	
	
	@Test(dataProvider ="chiefmanager",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_025_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_025_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_025_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyPrintButtonFunctionality();
	
		}
	
	
	
	@Test(dataProvider ="chiefmanager",description="toverifyActionDropdownFunctionality",priority=5)
	public void NRDA_Estate_SC_025_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
	
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifySelectUserFunctionality",priority=6)
	public void NRDA_Estate_SC_025_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
	
		}
	
	
	@Test(dataProvider ="chiefmanager",description="toverifyEnterCommentsFieldisBlank",priority=7)
	public void NRDA_Estate_SC_025_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifyEnterCommentsField",priority=8)
	public void NRDA_Estate_SC_025_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifyinvalidUploaddocumentfield",priority=9)
	public void NRDA_Estate_SC_025_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyinvalidUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifyinvalidUploaddocumentfield",priority=10)
	public void NRDA_Estate_SC_025_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="chiefmanager",description="toverifyinvalidUploaddocumentfield",priority=11)
	public void NRDA_Estate_SC_025_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsCPM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsCPM.loginAsChiefEngineerManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineerManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyUploaddocumentfield();
			ChiefEngineer.toverifysubmitbuttonFunctionality();
		}
	
  }