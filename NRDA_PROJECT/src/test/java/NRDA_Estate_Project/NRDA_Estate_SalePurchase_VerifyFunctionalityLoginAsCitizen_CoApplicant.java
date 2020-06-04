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
import WaterAndSewerageDisconnection.ToverifyDisConnectionAsWaterandSewerage;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;
import WaterAndSewerageNewConnection.ToVerifyPaymentDetailsofNewConnection;

public class NRDA_Estate_SalePurchase_VerifyFunctionalityLoginAsCitizen_CoApplicant extends URLPageWSNRDAScript
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
		//waitForSomeTime();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();

	}
	
	@DataProvider(name="Citizen_Individual")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"CitizenIndividual_Credentials");
	}
	
	@Test(dataProvider ="Citizen_Individual",description="Verify the Home Page DashBoard",priority=1)
	public void NRDA_Estate_SC_001_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifythedashboardoftheApplication();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifytheProjectListInApplication",priority=2)
	public void NRDA_Estate_SC_001_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifytheProjectListInApplication();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyApplyLink",priority=3)
	public void NRDA_Estate_SC_001_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifytheApplicantDetailsForm",priority=4)
	public void NRDA_Estate_SC_002_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifytheApplicantDetailsForm();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyApplicantDetailsFormFunctionality",priority=5)
	public void NRDA_Estate_SC_002_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifyApplicantDetailsFormFunctionality2();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifythePermanentandRegisteredAddresTab",priority=6)
	public void NRDA_Estate_SC_003_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifythePermanentandRegisteredAddresTab();;
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifythePermanentandRegisteredAddresTab",priority=6)
	public void NRDA_Estate_SC_003_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.tofillthePermanentandRegisteredAddresform();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifytheCorrespondence_CommunicationAddressTab",priority=7)
	public void NRDA_Estate_SC_004_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifytheCorrespondence_CommunicationAddressTab();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifythePermanentandRegisteredAddresTab",priority=8)
	public void NRDA_Estate_SC_004_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.tofilltheCorrespondence_CommunicationAddressForm();
	
		}
	
	
	@Test(dataProvider ="Citizen_Individual",description="toverifytheSupportingDocumentsTab",priority=9)
	public void NRDA_Estate_SC_005_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifytheSupportingDocumentsTab();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="tovFilltheFunctionalityofSupportDocuments",priority=10)
	public void NRDA_Estate_SC_005_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.tovFilltheFunctionalityofSupportDocuments();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifythePreferenceDetailTab",priority=11)
	public void NRDA_Estate_SC_006_TC_001(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifythePreferenceDetailTab();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="tofillthePreferenceDetailForm",priority=12)
	public void NRDA_Estate_SC_006_TC_002(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.tofillthePreferenceDetailForm();
	
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyResetButtonFunctionality",priority=1)
	public void NRDA_Estate_SC_006_TC_003(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifyApplicantDetailsFormFunctionality2();
			citizen.toverifyResetButtonFunctionality2();
	
		}
	
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyPaymentModeFunctionality",priority=1)
	public void NRDA_Estate_SC_006_TC_004(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifyApplicantDetailsFormFunctionality2();
			citizen.tofillthePermanentandRegisteredAddresform();
			citizen.tofilltheCorrespondence_CommunicationAddressForm();
			citizen.tovFilltheFunctionalityofSupportDocuments();
			citizen.tofillthePreferenceDetailForm();
			citizen.toverifySubmitButtonFunctionality2();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
		}
	
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyCardDetailsisInvalid",priority=1)
	public void NRDA_Estate_SC_006_TC_005(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifyApplicantDetailsFormFunctionality2();
			citizen.tofillthePermanentandRegisteredAddresform();
			citizen.tofilltheCorrespondence_CommunicationAddressForm();
			citizen.tovFilltheFunctionalityofSupportDocuments();
			citizen.tofillthePreferenceDetailForm();
			citizen.toverifySubmitButtonFunctionality2();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.enterInvaliddetailsoncreditcard();
			payment.clickOnPayNow();
			payment.verifyBlankMsg();
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyCardDetailsisvalid",priority=1)
	public void NRDA_Estate_SC_006_TC_006(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifyApplicantDetailsFormFunctionality2();
			citizen.tofillthePermanentandRegisteredAddresform();
			citizen.tofilltheCorrespondence_CommunicationAddressForm();
			citizen.tovFilltheFunctionalityofSupportDocuments();
			citizen.tofillthePreferenceDetailForm();
			citizen.toverifySubmitButtonFunctionality2();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.entervaliddetailsoncreditcard();
			payment.clickOnPayNow();
			payment.clickOnSimulateTransaction();
			
			
		}
	
	@Test(dataProvider ="Citizen_Individual",description="toverifyDownloadreceipt",priority=1)
	public void NRDA_Estate_SC_006_TC_007(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
		{
			WaterAndSewerageLoginPage LoginCitizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
			LoginCitizen.loginasCitizen(username, password);
			
			SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual citizen=PageFactory.initElements(driver,SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual.class);
			citizen.toverifyApplyLink();
			citizen.toverifyApplicantDetailsFormFunctionality2();
			citizen.tofillthePermanentandRegisteredAddresform();
			citizen.tofilltheCorrespondence_CommunicationAddressForm();
			citizen.tovFilltheFunctionalityofSupportDocuments();
			citizen.tofillthePreferenceDetailForm();
			citizen.toverifySubmitButtonFunctionality2();
			
			ToVerifyPaymentDetailsofNewConnection payment=PageFactory.initElements(driver, ToVerifyPaymentDetailsofNewConnection.class);
			payment.selectPaymentGateway();
			payment.selectPaymentMode();
			payment.entervaliddetailsoncreditcard();
			payment.clickOnPayNow();
			payment.clickOnSimulateTransaction();
			
			ToverifyDisConnectionAsWaterandSewerage Receipt=PageFactory.initElements(driver, ToverifyDisConnectionAsWaterandSewerage.class);
			Receipt.verifyDownloadReciept13();
		}
}