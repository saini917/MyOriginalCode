package NRDA_PRO;

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
public class LoginAsDEO extends URLPageWSNRDAScript
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
	@DataProvider(name="DEO")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"PRO_DEO");
	}


	@Test(description="verify dashboard",priority=1,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_01 verifydashboard=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_01.class);
		verifydashboard.toVerifyDashboard();
	}
	
	@Test(description="verify dashboard",priority=2,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_03 verifydashboard=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_03.class);
		verifydashboard.verifyStatisticsDisplayLink();
	}
	
	@Test(description="verify advertisement and publication",priority=3,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
	}
	
	@Test(description="verify pro information bill",priority=4,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
	}
	
	@Test(description="verify publication date",priority=5,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
		
		NRDA_PRO_SC_07_TC_06 publicationdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_06.class);
		publicationdate.selectPublicationDate();
	}
	
	@Test(description="verify invoice number",priority=6,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
		
		NRDA_PRO_SC_07_TC_06 publicationdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_06.class);
		publicationdate.selectPublicationDate();
		
		NRDA_PRO_SC_07_TC_07 invoicenum=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_07.class);
		invoicenum.enterInvoiceNum();
	}
	
	@Test(description="verify bill date",priority=7,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
		
		NRDA_PRO_SC_07_TC_06 publicationdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_06.class);
		publicationdate.selectPublicationDate();
		
		NRDA_PRO_SC_07_TC_07 invoicenum=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_07.class);
		invoicenum.enterInvoiceNum();
		
		NRDA_PRO_SC_07_TC_08 billdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_08.class);
		billdate.selectBillDate();
	}
	
	@Test(description="verify amount",priority=8,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
		
		NRDA_PRO_SC_07_TC_06 publicationdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_06.class);
		publicationdate.selectPublicationDate();
		
		NRDA_PRO_SC_07_TC_07 invoicenum=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_07.class);
		invoicenum.enterInvoiceNum();
		
		NRDA_PRO_SC_07_TC_08 billdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_08.class);
		billdate.selectBillDate();
		
		NRDA_PRO_SC_07_TC_09 amt=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_09.class);
		amt.enterAmount();
	}

	@Test(description="verify upload",priority=9,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
		
		NRDA_PRO_SC_07_TC_06 publicationdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_06.class);
		publicationdate.selectPublicationDate();
		
		NRDA_PRO_SC_07_TC_07 invoicenum=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_07.class);
		invoicenum.enterInvoiceNum();
		
		NRDA_PRO_SC_07_TC_08 billdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_08.class);
		billdate.selectBillDate();
		
		NRDA_PRO_SC_07_TC_09 amt=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_09.class);
		amt.enterAmount();
		
		NRDA_PRO_SC_07_TC_10 upload=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_10.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify add details",priority=10,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		proinformation.clickOnPROBillInformation();
		proinformation.clickOnNewBill();
		
		NRDA_PRO_SC_07_TC_06 publicationdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_06.class);
		publicationdate.selectPublicationDate();
		
		NRDA_PRO_SC_07_TC_07 invoicenum=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_07.class);
		invoicenum.enterInvoiceNum();
		
		NRDA_PRO_SC_07_TC_08 billdate=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_08.class);
		billdate.selectBillDate();
		
		NRDA_PRO_SC_07_TC_09 amt=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_09.class);
		amt.enterAmount();
		
		NRDA_PRO_SC_07_TC_10 upload=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_10.class);
		upload.uploadDocument();
		//upload.verifyMessage();
		
		NRDA_PRO_SC_07_TC_11 adddetails=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_11.class);
		adddetails.enterRemarks();
		adddetails.clickOnAddDetails();
	}
	
	@Test(description="verify select action",priority=11,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		
		NRDA_PRO_SC_07_TC_12 user=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_12.class);
		user.selectActionForward();
		user.selectm_Admin();
	}
	
	@Test(description="verify comment",priority=12,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		
		NRDA_PRO_SC_07_TC_12 user=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_12.class);
		user.selectActionForward();
		user.selectm_Admin();
		
		NRDA_PRO_SC_07_TC_13 comment=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_13.class);
		comment.enterComment();
	}
	
	@Test(description="verify upload",priority=13,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		
		NRDA_PRO_SC_07_TC_12 user=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_12.class);
		user.selectActionForward();
		user.selectm_Admin();
		
		NRDA_PRO_SC_07_TC_13 comment=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_13.class);
		comment.enterComment();
		
		NRDA_PRO_SC_07_TC_14 upload=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_14.class);
		upload.uploadDocument();
		upload.verifyMessage();
	}
	
	@Test(description="verify blank comment",priority=14,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		
		NRDA_PRO_SC_07_TC_15 blank=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_15.class);
		blank.clickOnSubmit();
		blank.verifyErrorMessage();
	}
	
	@Test(description="verify submit",priority=15,dataProvider="DEO")
	public void NRDA_PRO_SC_07_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage login_officer=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_officer.loginAsDEOPROfficer(username, password);

		NRDA_PRO_SC_07_TC_04 adv=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_04.class);
		adv.clickOnPublicRelOffice();
		adv.clickOnAdvertisementAndPub();
		adv.enterApplicationNum();
		
		NRDA_PRO_SC_07_TC_05 proinformation=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_05.class);
		proinformation.clickOnAction();
		
		NRDA_PRO_SC_07_TC_12 user=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_12.class);
		user.selectActionForward();
		user.selectm_Admin();
		
		NRDA_PRO_SC_07_TC_13 comment=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_13.class);
		comment.enterComment();
		
		NRDA_PRO_SC_07_TC_14 upload=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_14.class);
		upload.uploadDocument();
		upload.verifyMessage();
		
		NRDA_PRO_SC_07_TC_16 submit=PageFactory.initElements(driver,NRDA_PRO_SC_07_TC_16.class);
		submit.clickOnSubmit();
		submit.verifySuccessfulMessage();
	}
}
