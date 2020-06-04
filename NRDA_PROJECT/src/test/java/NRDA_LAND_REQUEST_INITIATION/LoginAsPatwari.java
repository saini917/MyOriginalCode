package NRDA_LAND_REQUEST_INITIATION;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import GenericLibrary.ExcelDataDriver;
import LoginLogoutWSNRDAScript.URLPageWSNRDAScript;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsPatwari extends URLPageWSNRDAScript
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		WebDriverWait wait1 = new WebDriverWait(driver,50);
		wait1.until(ExpectedConditions.visibilityOf( web1));
		action.moveToElement(web1).build().perform();
		waitForSomeTime();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}
	@DataProvider(name="Patwari")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Land_Patwari");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Patwari")
	public void NRDA_LandManagement_SC001_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC001_TC003 display=PageFactory.initElements(driver,NRDA_LandManagement_SC001_TC003.class);
		display.verifyDashboard();
		display.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify eGovernance",priority=1,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display.clickOnEGovernance();
		display.verifyDisplay();
	}
	
	@Test(description="verify Application form link",priority=2,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC002 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC002.class);
		display1.verifyApplicationFormLink();
	}
	
	@Test(description="click on Application form link",priority=3,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		applink.verifyLandSection();
	}
	
	@Test(description="click on Land Section",priority=4,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
	}
	
	@Test(description="verify Land Section",priority=5,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC005 displaylist=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC005.class);
		displaylist.verifyDisplay();
	}
	
	@Test(description="verify Land Request initiation",priority=6,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC006 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC006.class);
		landreq.verifyLandReqInitiation();
	}
	
	@Test(description="verify proceed",priority=7,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		landreq.verifyProceedBtn();
	}
	
	@Test(description="click on proceed",priority=8,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
	}
	
	@Test(description="verify request details page",priority=9,dataProvider="Patwari")
	public void NRDA_LandManagement_SC002_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC002_TC009 requestdetailspage=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC009.class);
		requestdetailspage.verifyDisplay();
	}
	
	@Test(description="verify request by NRDA",priority=10,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
	}
	
	@Test(description="verify invalid land area",priority=11,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		

		NRDA_LandManagement_SC003_TC002 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC002.class);
		invalid.enterInvalidLandArea();
	}
	
	@Test(description="verify accept 20 digit land area",priority=12,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		

		NRDA_LandManagement_SC003_TC003 twenty=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC003.class);
		twenty.enterTwentyDigitLandArea();
	}
	
	@Test(description="verify valid land area",priority=13,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
	}
	
	@Test(description="verify invalid date",priority=14,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC005 invalid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC005.class);
		invalid.selectInvalidTargetDate();
	}
	
	@Test(description="verify valid target date",priority=14,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
	}
	
	@Test(description="verify view map",priority=15,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		viewmap.closeMapPopUp();
	}
	
	@Test(description="verify khasra number pop up",priority=16,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		khasranum.clickOnCancel();
		viewmap.closeMapPopUp();
	}
	

	@Test(description="verify radio btn",priority=17,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC009 radio=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC009.class);
		radio.verifyDisplay();
		khasranum.clickOnCancel();
		viewmap.closeMapPopUp();
	}
	
	@Test(description="verify select village",priority=18,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		viewmap.closeMapPopUp();
	}
	
	@Test(description="verify select khasra number",priority=19,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		viewmap.closeMapPopUp();
	}
	

	@Test(description="verify Add",priority=20,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		
		NRDA_LandManagement_SC003_TC012 add=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		add.clickOnAdd();
		viewmap.closeMapPopUp();
	}
	
	@Test(description="verify save khasra geometery",priority=21,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		
		NRDA_LandManagement_SC003_TC012 add=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC003_TC013 geometery=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		geometery.clickOnSaveKhasraGeometry();
		geometery.clickOnCancel();
		viewmap.closeMapPopUp();
	}
	

	@Test(description="verify remarks",priority=22,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		
		NRDA_LandManagement_SC003_TC012 add=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC003_TC013 geometery=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		geometery.clickOnSaveKhasraGeometry();
		
		NRDA_LandManagement_SC003_TC014 remarks=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC014.class);
		remarks.verifyRemarks();
		geometery.clickOnCancel();
		viewmap.closeMapPopUp();
	}

	@Test(description="enter remarks",priority=23,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		
		NRDA_LandManagement_SC003_TC012 add=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC003_TC013 geometery=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		geometery.clickOnSaveKhasraGeometry();
		
		NRDA_LandManagement_SC003_TC015 remark=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC015.class);
		remark.enterRemarks();
		geometery.clickOnCancel();
		viewmap.closeMapPopUp();
	}

	@Test(description="verify cancel",priority=24,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		
		NRDA_LandManagement_SC003_TC012 add=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC003_TC013 geometery=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		geometery.clickOnSaveKhasraGeometry();
		
		NRDA_LandManagement_SC003_TC016 cancel=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC016.class);
		cancel.clickOnCancel();
		viewmap.closeMapPopUp();
	}
	
	@Test(description="verify save",priority=25,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC008 khasranum=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC008.class);
		khasranum.clickOnKhasraNumIcon();
		
		NRDA_LandManagement_SC003_TC010 village=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC010.class);
		village.selectVillage();
		
		NRDA_LandManagement_SC003_TC011 khasrano=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC011.class);
		khasrano.selectKhasraNum();
		
		NRDA_LandManagement_SC003_TC012 add=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC012.class);
		add.clickOnAdd();
		
		NRDA_LandManagement_SC003_TC013 geometery=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC013.class);
		geometery.clickOnSaveKhasraGeometry();
		
		NRDA_LandManagement_SC003_TC015 remark=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC015.class);
		remark.enterRemarks();
		
		NRDA_LandManagement_SC003_TC017 save=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC017.class);
		save.clickOnSave();
		viewmap.closeMapPopUp();
	}
	
	@Test(description="verify update",priority=26,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC018(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC007 viewmap=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC007.class);
		viewmap.clickOnViewMap();
		
		NRDA_LandManagement_SC003_TC018 update=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC018.class);
		update.clickOnUpdate();
	}
	
	@Test(description="verify invalid purpose",priority=27,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC019 purpose=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC019.class);
		purpose.enterInvalidPurpose();
	}
	
	@Test(description="verify valid purpose",priority=28,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC020 purpose=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC020.class);
		purpose.enterPurpose();
	}
	
	@Test(description="verify close",priority=29,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
	}
	
	@Test(description="verify reset",priority=29,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC020 purpose=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC020.class);
		purpose.enterPurpose();
		
		NRDA_LandManagement_SC003_TC025 reset=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC025.class);
		reset.clickOnReset();
	}
	
	@Test(description="verify submit",priority=30,dataProvider="Patwari")
	public void NRDA_LandManagement_SC003_TC026(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC003_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC001.class);
		requestby.selectRequestByNRDA();
		
		NRDA_LandManagement_SC003_TC004 valid=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC004.class);
		valid.enterValidLandArea();
		
		NRDA_LandManagement_SC003_TC006 validdate=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC006.class);
		validdate.selectTargetDate();
		
		NRDA_LandManagement_SC003_TC020 purpose=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC020.class);
		purpose.enterPurpose();
		
		NRDA_LandManagement_SC003_TC026 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC003_TC026.class);
		submit.clickOnsubmit();
	}
	
	@Test(description="verify requested by OTHER",priority=31,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
	}
	
	@Test(description="verify requested type",priority=32,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC002 requesttype=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC002.class);
		requesttype.selectRequestType();
	}
	
	@Test(description="verify requested type individual",priority=33,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC003 requesttype=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		requesttype.selectRequestTypeIndividual();
		requesttype.verifyDisplay();
	}
	
	@Test(description="verify requested type individual submit",priority=34,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC003 requesttype=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC003.class);
		requesttype.selectRequestTypeIndividual();
		
		NRDA_LandManagement_SC004_TC004 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC004.class);
		submit.clickOnViewMap();
		submit.clickOnKhasraNumIcon();
		submit.selectVillage();
		submit.selectKhasraNum();
		submit.clickOnAdd();
		//submit.clickOnSaveKhasraGeometry();
		//submit.clickOnSave();
		submit.closeMapPopUp();
		submit.enterPurpose();
		submit.enterFirstName();
		submit.enterLastName();
		submit.selectRelationshipType();
		submit.enterFatherName();
		submit.enterMotherName();
		submit.selectGender();
		submit.selectDateOfBirth();
		submit.enterEmailID();
		submit.enterMobile();
		submit.clickOnSubmit();
	}
	
	@Test(description="verify requested type",priority=35,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC005 requesttype=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC005.class);
		requesttype.selectRequestType();
	}
	
	@Test(description="verify requested type Organization",priority=36,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
	}
	
	@Test(description="verify requested type Organization submit",priority=37,dataProvider="Patwari")
	public void NRDA_LandManagement_SC004_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
	}
	
	@Test(description="verify note sheet",priority=38,dataProvider="Patwari")
	public void NRDA_LandManagement_SC007_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC007_TC001 notesheet=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC001.class);
		notesheet.verifyNoteSheet();
	}
	
	@Test(description="verify request details",priority=39,dataProvider="Patwari")
	public void NRDA_LandManagement_SC007_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC007_TC002 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC002.class);
		requesdetails.verifyRequestDetails();
	}
	
	@Test(description="verify open map",priority=40,dataProvider="Patwari")
	public void NRDA_LandManagement_SC007_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC007_TC002 requesdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC002.class);
		requesdetails.verifyRequestDetails();
		
		NRDA_LandManagement_SC007_TC003 openmap=PageFactory.initElements(driver,NRDA_LandManagement_SC007_TC003.class);
		openmap.verifyOpenMap();
		openmap.closeMapPopUp();
	}
	
	@Test(description="verify land details",priority=41,dataProvider="Patwari")
	public void NRDA_LandManagement_SC008_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC008_TC001 landdetails=PageFactory.initElements(driver,NRDA_LandManagement_SC008_TC001.class);
		landdetails.verifyLandDetails();
	}
	
	@Test(description="verify select action forward",priority=42,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
	}
	
	@Test(description="verify select AM",priority=43,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
	}
	
	@Test(description="verify subject readable mode",priority=44,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC003 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC003.class);
		subject.verifySubject();
	}
	
	@Test(description="verify file readable mode",priority=45,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC004 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC004.class);
		file.verifyFileNumber();
	}

	@Test(description="verify search",priority=46,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		search.verifyDisplayList();
		search.verifyClosePopUpWindow();
	}
	
	@Test(description="verify create file",priority=47,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		createfile.verifyDisplayList();
		createfile.verifyClosePopUpWindow();
		createfile.verifyClosePopUpWindow1();
	}

	@Test(description="verify subject",priority=48,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		subject.verifyClosePopUpWindow();
		subject.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify file",priority=49,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC008(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		
		NRDA_LandManagement_SC009_TC008 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC008.class);
		file.enterFileNumber();
		file.verifyClosePopUpWindow();
		file.verifyClosePopUpWindow1();
	}

	@Test(description="verify type",priority=50,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC009(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		
		NRDA_LandManagement_SC009_TC008 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC008.class);
		file.enterFileNumber();
		
		NRDA_LandManagement_SC009_TC009 type=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC009.class);
		type.selectType();
		type.verifyClosePopUpWindow();
		type.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify category",priority=51,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC010(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		
		NRDA_LandManagement_SC009_TC008 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC008.class);
		file.enterFileNumber();
		
		NRDA_LandManagement_SC009_TC009 type=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC009.class);
		type.selectType();
		
		NRDA_LandManagement_SC009_TC010 category=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC010.class);
		category.selectCategory();
		category.verifyClosePopUpWindow();
		category.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify dept",priority=52,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC011(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		
		NRDA_LandManagement_SC009_TC008 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC008.class);
		file.enterFileNumber();
		
		NRDA_LandManagement_SC009_TC009 type=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC009.class);
		type.selectType();
		
		NRDA_LandManagement_SC009_TC010 category=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC010.class);
		category.selectCategory();
		
		NRDA_LandManagement_SC009_TC011 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC011.class);
		dept.selectDept();
		dept.verifyClosePopUpWindow();
		dept.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify clear",priority=53,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC012(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		
		NRDA_LandManagement_SC009_TC008 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC008.class);
		file.enterFileNumber();
		
		NRDA_LandManagement_SC009_TC009 type=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC009.class);
		type.selectType();
		
		NRDA_LandManagement_SC009_TC010 category=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC010.class);
		category.selectCategory();
		
		NRDA_LandManagement_SC009_TC011 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC011.class);
		dept.selectDept();
		
		NRDA_LandManagement_SC009_TC012 clear=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC012.class);
		clear.clickOnClear();
		clear.verifyClosePopUpWindow();
		clear.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify submit",priority=54,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC013(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC006 createfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC006.class);
		createfile.clickOnCreateNewFile();
		
		NRDA_LandManagement_SC009_TC007 subject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC007.class);
		subject.enterSubject();
		
		NRDA_LandManagement_SC009_TC008 file=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC008.class);
		file.enterFileNumber();
		
		NRDA_LandManagement_SC009_TC009 type=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC009.class);
		type.selectType();
		
		NRDA_LandManagement_SC009_TC010 category=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC010.class);
		category.selectCategory();
		
		NRDA_LandManagement_SC009_TC011 dept=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC011.class);
		dept.selectDept();
		
		NRDA_LandManagement_SC009_TC013 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC013.class);
		submit.clickOnSubmit();
		submit.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify invalid subject",priority=55,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC014(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC014 invalidsubject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC014.class);
		invalidsubject.enterInvalidSubject();
		invalidsubject.clickOnSearch();
		invalidsubject.verifyErrorMsg();
		invalidsubject.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify valid subject",priority=56,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC015(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC015 validsubject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC015.class);
		validsubject.enterValidSubject();
		validsubject.clickOnSearch();
		validsubject.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify invalid file",priority=57,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC016(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC016 invalidfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC016.class);
		invalidfile.enterInvalidFileNumber();
		invalidfile.clickOnSearch();
		invalidfile.verifyClosePopUpWindow1();
		invalidfile.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify valid file",priority=58,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC017(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC017 validfile=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC017.class);
		validfile.enterValidFileNumber();
		validfile.clickOnSearch();
		validfile.verifyClosePopUpWindow1();
	}
	@Test(description="verify select record",priority=59,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC019(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC015 validsubject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC015.class);
		validsubject.enterValidSubject();
		validsubject.clickOnSearch();
	
		NRDA_LandManagement_SC009_TC019 record=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC019.class);
		record.selectRecord();
		record.verifyClosePopUpWindow1();
	}
	
	@Test(description="verify fill in form",priority=60,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC020(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC015 validsubject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC015.class);
		validsubject.enterValidSubject();
		validsubject.clickOnSearch();
	
		NRDA_LandManagement_SC009_TC019 record=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC019.class);
		record.selectRecord();
		
		NRDA_LandManagement_SC009_TC020 fillinform=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC020.class);
		fillinform.clickOnFillInForm();
	}
	
	@Test(description="verify blank comment",priority=61,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC021(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC021 blankcomment=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC021.class);
		blankcomment.clickOnSubmit();
		blankcomment.verifyErrorMsg();
	}
	
	@Test(description="verify comment",priority=62,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC022(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC022 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC022.class);
		comment.enterComment();
	}
	
	@Test(description="verify invalid upload file",priority=63,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC023(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC022 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC022.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC009_TC023 invalidupload=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC023.class);
		invalidupload.UploadInvalidDocument();
		invalidupload.verifyErrorMsg();
	}
	
	@Test(description="verify upload file",priority=64,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC024(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC022 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC022.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC009_TC024 upload=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC024.class);
		upload.clickOnUploadDocument();
		upload.verifyMsg();
	}
	
	@Test(description="verify close",priority=65,dataProvider="Patwari")
	public void NRDA_LandManagement_SC009_TC025(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC025 close=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC025.class);
		close.clickOnClose();
	}
	
	@Test(description="verify submit",priority=66,dataProvider="Patwari")
	public void NRDA_LandManagement_SC010_TC001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage patwari=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		patwari.loginAsLandPatwari(username,password);
		
		NRDA_LandManagement_SC002_TC001 display1=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC001.class);
		display1.clickOnEGovernance();
		
		NRDA_LandManagement_SC002_TC003 applink=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC003.class);
		applink.clickOnApplicationFormLink();
		
		NRDA_LandManagement_SC002_TC004 display=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC004.class);
		display.clickOnLandSection();
		
		NRDA_LandManagement_SC002_TC007 landreq=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC007.class);
		landreq.clickOnLandReqInitiation();
		
		NRDA_LandManagement_SC002_TC008 proceed=PageFactory.initElements(driver,NRDA_LandManagement_SC002_TC008.class);
		proceed.clickOnProceedBtn();
		
		NRDA_LandManagement_SC004_TC001 requestby=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC001.class);
		requestby.selectRequestByOTHER();
		
		NRDA_LandManagement_SC004_TC006 requesttypeorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC006.class);
		requesttypeorg.selectRequestTypeOrganization();
		requesttypeorg.verifyDisplay();
		
		NRDA_LandManagement_SC004_TC007 submiteorg=PageFactory.initElements(driver,NRDA_LandManagement_SC004_TC007.class);
		submiteorg.clickOnViewMap();
		submiteorg.clickOnKhasraNumIcon();
		submiteorg.selectVillage();
		submiteorg.selectKhasraNum();
		submiteorg.clickOnAdd();
		submiteorg.closeMapPopUp();
		submiteorg.enterPurpose();
		submiteorg.enterDeptName();
		submiteorg.enterDeptAddress();
		submiteorg.enterContactPersonName();
		submiteorg.enterContactPersonDesignation();
		submiteorg.enterContactPersonMobile();
		submiteorg.enterContactPersonEmail();
		submiteorg.clickOnSubmit();
		submiteorg.getApplicationNum();
		
		NRDA_LandManagement_SC009_TC001 selectforward=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC001.class);
		selectforward.selectForward();
		
		NRDA_LandManagement_SC009_TC002 selectuser=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC002.class);
		selectuser.selectAM();
		
		NRDA_LandManagement_SC009_TC005 search=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC005.class);
		search.clickOnSearch();
		
		NRDA_LandManagement_SC009_TC015 validsubject=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC015.class);
		validsubject.enterValidSubject();
		validsubject.clickOnSearch();
	
		NRDA_LandManagement_SC009_TC019 record=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC019.class);
		record.selectRecord();
		
		NRDA_LandManagement_SC009_TC020 fillinform=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC020.class);
		fillinform.clickOnFillInForm();
		
		NRDA_LandManagement_SC009_TC022 comment=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC022.class);
		comment.enterComment();
		
		NRDA_LandManagement_SC009_TC024 upload=PageFactory.initElements(driver,NRDA_LandManagement_SC009_TC024.class);
		upload.clickOnUploadDocument();
		upload.verifyMsg();
		
		NRDA_LandManagement_SC010_TC001 submit=PageFactory.initElements(driver,NRDA_LandManagement_SC010_TC001.class);
		submit.clickOnSubmit();
		submit.verifyMsg();
	}
}
