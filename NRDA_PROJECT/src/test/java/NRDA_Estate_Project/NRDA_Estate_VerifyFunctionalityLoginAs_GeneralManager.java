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

public class NRDA_Estate_VerifyFunctionalityLoginAs_GeneralManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="GeneralManager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"GM_Credentials");
	}
	
	@Test(dataProvider ="GeneralManager",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_026_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifythedashboardoftheApplication();
	
		}
	
	
	@Test(dataProvider ="GeneralManager",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_026_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_026_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_026_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyPrintButtonFunctionality();
	
		}
	
	
	
	@Test(dataProvider ="GeneralManager",description="toverifyActionDropdownFunctionality",priority=5)
	public void NRDA_Estate_SC_026_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
	
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifySelectUserFunctionality",priority=6)
	public void NRDA_Estate_SC_026_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
	
		}
	
	
	@Test(dataProvider ="GeneralManager",description="toverifyEnterCommentsFieldisBlank",priority=7)
	public void NRDA_Estate_SC_026_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifyEnterCommentsField",priority=8)
	public void NRDA_Estate_SC_026_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifyinvalidUploaddocumentfield",priority=9)
	public void NRDA_Estate_SC_026_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyinvalidUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifyinvalidUploaddocumentfield",priority=10)
	public void NRDA_Estate_SC_026_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="GeneralManager",description="toverifyinvalidUploaddocumentfield",priority=11)
	public void NRDA_Estate_SC_026_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsGM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsGM.loginAsGeneralManager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_GeneralManager ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_GeneralManager.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifySelectUserFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyUploaddocumentfield();
			ChiefEngineer.toverifysubmitbuttonFunctionality();
		}
	
  }