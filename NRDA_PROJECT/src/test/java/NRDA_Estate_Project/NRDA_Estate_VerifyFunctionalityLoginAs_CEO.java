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

public class NRDA_Estate_VerifyFunctionalityLoginAs_CEO extends URLPageWSNRDAScript
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
	
	@DataProvider(name="CEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"CEO_Credentials");
	}
	
	@Test(dataProvider ="CEO",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_027_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifythedashboardoftheApplication();
	
		}
	
	
	@Test(dataProvider ="CEO",description="toverifyMyInboxlink",priority=2)
	public void NRDA_Estate_SC_027_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyPendingApplication();
	
		}
	
	@Test(dataProvider ="CEO",description="toverifyActionButtonagainsttheApplication",priority=3)
	public void NRDA_Estate_SC_027_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
	
		}
	
	@Test(dataProvider ="CEO",description="toverifyPrintButtonFunctionality",priority=4)
	public void NRDA_Estate_SC_027_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPrintButtonFunctionality();
	
		}
	
	
	
	
	
	
	
	@Test(dataProvider ="CEO",description="toverifyActionDropdownFunctionality",priority=5)
	public void NRDA_Estate_SC_027_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyActionDropdownFunctionality();
	
		}
	
	
	@Test(dataProvider ="CEO",description="toverifyEnterCommentsFieldisBlank",priority=6)
	public void NRDA_Estate_SC_027_TC_008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyActionDropdownFunctionality();
			CEO.toverifyEnterCommentsFieldisBlank();
	
		}
	
	@Test(dataProvider ="CEO",description="toverifyEnterCommentsField",priority=7)
	public void NRDA_Estate_SC_027_TC_009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyActionDropdownFunctionality();
			CEO.toverifyEnterCommentsField();;
			
		}
	
	@Test(dataProvider ="CEO",description="toverifyinvalidUploaddocumentfield",priority=8)
	public void NRDA_Estate_SC_027_TC_010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyActionDropdownFunctionality();
			CEO.toverifyEnterCommentsField();
			CEO.toverifyinvalidUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="CEO",description="toverifyinvalidUploaddocumentfield",priority=9)
	public void NRDA_Estate_SC_027_TC_011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyActionDropdownFunctionality();
			CEO.toverifyEnterCommentsField();
			CEO.toverifyUploaddocumentfield();
			
		}
	
	@Test(dataProvider ="CEO",description="toverifyinvalidUploaddocumentfield",priority=10)
	public void NRDA_Estate_SC_027_TC_012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyActionDropdownFunctionality();
			CEO.toverifyEnterCommentsField();
			CEO.toverifyUploaddocumentfield();
			CEO.toverifysubmitbuttonFunctionality();
		}
	
	@Test(dataProvider ="CEO",description="toverifyApplicationGridintheApplication1",priority=11)
	public void NRDA_Estate_SC_027_TC_013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyApplicationGridintheApplication1();
			
		}
	
	@Test(dataProvider ="CEO",description="toverifyApplicationGridintheApplication1",priority=12)
	public void NRDA_Estate_SC_027_TC_014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			
		}
	
	@Test(dataProvider ="CEO",description="toverifyPrintButtonFunctionality",priority=13)
	public void NRDA_Estate_SC_027_TC_015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPrintButtonFunctionality();
			
		}
	
	
	@Test(dataProvider ="CEO",description="toverifyPublishTabFunctionality",priority=14)
	public void NRDA_Estate_SC_027_TC_016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPublishTabFunctionality();
			
		}
	
	@Test(dataProvider ="CEO",description="toverifyRemarksFieldFunctionality",priority=15)
	public void NRDA_Estate_SC_027_TC_017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPublishTabFunctionality();
			CEO.toverifyRemarksFieldFunctionality();
		}
	
	@Test(dataProvider ="CEO",description="toverifyinvalidUploaddocumentfield1",priority=16)
	public void NRDA_Estate_SC_027_TC_018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPublishTabFunctionality();
			CEO.toverifyRemarksFieldFunctionality();
			CEO.toverifyinvalidUploaddocumentfield1();
		}
	
	
	@Test(dataProvider ="CEO",description="toverifyinvalidUploaddocumentfield1",priority=17)
	public void NRDA_Estate_SC_027_TC_019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPublishTabFunctionality();
			CEO.toverifyRemarksFieldFunctionality();
			CEO.toverifyUploaddocumentfield1();
		}
	
	
	@Test(dataProvider ="CEO",description="toverifyPublishFunctionality",priority=18)
	public void NRDA_Estate_SC_027_TC_020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage loginAsLM=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			loginAsLM.loginAsCEO(username, password);
			
			ToverifyFunctionalityofApplicationLoginAs_CEO CEO=PageFactory.initElements(driver,ToverifyFunctionalityofApplicationLoginAs_CEO.class);
			CEO.toverifyActionButtonagainsttheApplication1();
			CEO.toverifyPublishTabFunctionality();
			CEO.toverifyRemarksFieldFunctionality();
			CEO.toverifyUploaddocumentfield1();
			CEO.toverifyPublishFunctionality();
		}
	
  }