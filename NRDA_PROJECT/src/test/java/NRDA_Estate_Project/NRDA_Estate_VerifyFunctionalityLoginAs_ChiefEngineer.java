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

public class NRDA_Estate_VerifyFunctionalityLoginAs_ChiefEngineer extends URLPageWSNRDAScript
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
	
	@DataProvider(name="Chief_Engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"ChiefEngineer_Credentials");
	}
	
	@Test(dataProvider ="Chief_Engineer",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_023_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifythedashboardoftheApplication();
	
		}
	
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_023_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyMyInboxlink();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_023_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_023_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyPrintButtonFunctionality();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyUnitPropertyDetailTab",priority=5)
	public void NRDA_Estate_SC_023_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyUnitPropertyDetailTab();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyViewLink",priority=6)
	public void NRDA_Estate_SC_023_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyViewLink();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyMarkCheckboxLink",priority=7)
	public void NRDA_Estate_SC_023_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyMarkCheckboxLink();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyLandRemarksTextboxField",priority=8)
	public void NRDA_Estate_SC_023_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyEngineerRemarksTextboxField();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyUpdatePlotDetails",priority=9)
	public void NRDA_Estate_SC_023_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyUpdatePlotDetails();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyActionDropdownFunctionality",priority=10)
	public void NRDA_Estate_SC_023_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
	
		}
	
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyEnterCommentsFieldisBlank",priority=11)
	public void NRDA_Estate_SC_023_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyEnterCommentsField",priority=12)
	public void NRDA_Estate_SC_023_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();;
			
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyinvalidUploaddocumentfield",priority=13)
	public void NRDA_Estate_SC_023_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyinvalidUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyinvalidUploaddocumentfield",priority=14)
	public void NRDA_Estate_SC_023_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="Chief_Engineer",description="toverifyinvalidUploaddocumentfield",priority=15)
	public void NRDA_Estate_SC_023_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsChiefEngineer(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer ChiefEngineer=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_ChiefEngineer.class);
			ChiefEngineer.toverifyActionButtonagainsttheApplication();
			ChiefEngineer.toverifyActionDropdownFunctionality();
			ChiefEngineer.toverifyEnterCommentsField();
			ChiefEngineer.toverifyUploaddocumentfield();
			ChiefEngineer.toverifysubmitbuttonFunctionality();
		}
	
  }