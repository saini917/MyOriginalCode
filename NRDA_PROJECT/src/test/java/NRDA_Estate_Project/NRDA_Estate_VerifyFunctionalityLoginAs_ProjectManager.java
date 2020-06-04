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
public class NRDA_Estate_VerifyFunctionalityLoginAs_ProjectManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="M_Project")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"ProjectManager_Credentials");
	}
	
	@Test(dataProvider ="M_Project",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_014_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifythedashboardoftheApplication();
	
		}
	
	@Test(dataProvider ="M_Project",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_014_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="M_Project",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_014_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="M_Project",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_014_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyPrintButtonFunctionality();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyActionDropdownFunctionality",priority=5)
	public void NRDA_Estate_SC_014_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyDepartmentDropdownFunctionality",priority=6)
	public void NRDA_Estate_SC_014_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
		}
	
	

	@Test(dataProvider ="M_Project",description="toverifySelectUserFunctionality",priority=7)
	public void NRDA_Estate_SC_014_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyEnterCommentsFieldisBlank",priority=8)
	public void NRDA_Estate_SC_014_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
			M_Login.toverifyEnterCommentsFieldisBlank();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyEnterCommentsField",priority=9)
	public void NRDA_Estate_SC_014_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
			M_Login.toverifyEnterCommentsField();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyinvalidUploaddocumentfield",priority=10)
	public void NRDA_Estate_SC_014_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
			M_Login.toverifyEnterCommentsField();
			M_Login.toverifyinvalidUploaddocumentfield();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyUploaddocumentfield",priority=11)
	public void NRDA_Estate_SC_014_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
			M_Login.toverifyEnterCommentsField();
			M_Login.toverifyUploaddocumentfield();
		}
	
	@Test(dataProvider ="M_Project",description="toverifyUploaddocumentfield",priority=12)
	public void NRDA_Estate_SC_014_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsSE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsSE.loginAsProject_Manager(username, password);
			
			ToverifyFunctionalityof_M_Project M_Login=PageFactory.initElements(driver,ToverifyFunctionalityof_M_Project.class);
			M_Login.toverifyActionButtonagainsttheApplication();
			M_Login.toverifyActionDropdownFunctionality();
			M_Login.toverifyDepartmentDropdownFunctionality();
			M_Login.toverifySelectUserFunctionality();
			M_Login.toverifyEnterCommentsField();
			M_Login.toverifyUploaddocumentfield();
			M_Login.toverifysubmitbuttonFunctionality();
		}
	
 }
