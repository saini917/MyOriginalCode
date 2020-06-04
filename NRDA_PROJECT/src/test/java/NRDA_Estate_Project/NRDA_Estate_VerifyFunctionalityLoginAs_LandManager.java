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

public class NRDA_Estate_VerifyFunctionalityLoginAs_LandManager extends URLPageWSNRDAScript
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
	
	@DataProvider(name="Land_Manager")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"LandManager_Credentials");
	}
	
	@Test(dataProvider ="Land_Manager",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_019_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifythedashboardoftheApplication();
	
		}
	
	
	@Test(dataProvider ="Land_Manager",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_019_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_019_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_019_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyPrintButtonFunctionality();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyUnitPropertyDetailTab",priority=5)
	public void NRDA_Estate_SC_019_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyUnitPropertyDetailTab();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyViewLink",priority=6)
	public void NRDA_Estate_SC_019_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyViewLink();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyMarkCheckboxLink",priority=7)
	public void NRDA_Estate_SC_019_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyMarkCheckboxLink();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyLandRemarksTextboxField",priority=8)
	public void NRDA_Estate_SC_019_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyLandRemarksTextboxField();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyUpdatePlotDetails",priority=9)
	public void NRDA_Estate_SC_019_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyUpdatePlotDetails();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyActionDropdownFunctionality",priority=10)
	public void NRDA_Estate_SC_019_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyActionDropdownFunctionality();
	
		}
	
	
	@Test(dataProvider ="Land_Manager",description="toverifyEnterCommentsFieldisBlank",priority=11)
	public void NRDA_Estate_SC_019_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyActionDropdownFunctionality();
			LandManager.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyEnterCommentsField",priority=12)
	public void NRDA_Estate_SC_019_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyActionDropdownFunctionality();
			LandManager.toverifyEnterCommentsField();;
			
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyinvalidUploaddocumentfield",priority=13)
	public void NRDA_Estate_SC_019_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyActionDropdownFunctionality();
			LandManager.toverifyEnterCommentsField();
			LandManager.toverifyinvalidUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyinvalidUploaddocumentfield",priority=14)
	public void NRDA_Estate_SC_019_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyActionDropdownFunctionality();
			LandManager.toverifyEnterCommentsField();
			LandManager.toverifyUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="Land_Manager",description="toverifyinvalidUploaddocumentfield",priority=15)
	public void NRDA_Estate_SC_019_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsLand_Manager(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_LandManager LandManager=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_LandManager.class);
			LandManager.toverifyActionButtonagainsttheApplication();
			LandManager.toverifyActionDropdownFunctionality();
			LandManager.toverifyEnterCommentsField();
			LandManager.toverifyUploaddocumentfield();
			LandManager.toverifysubmitbuttonFunctionality();
		}
	
}