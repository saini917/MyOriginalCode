package NRDA_NewConnection;

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
import NRDA_NewConnection.ToVerifyApplicantDetails_SC_03_TC_03;
import NRDA_NewConnection.ToVerifyApplicantDetails_SC_03_TC_07;
import NRDA_NewConnection.ToVerifyApplicationDetails_SC_03_TC_04;
import NRDA_NewConnection.ToVerifyApplicationDetails_SC_03_TC_05;
import NRDA_NewConnection.ToVerifyApplicationDetails_SC_03_TC_06;
import NRDA_NewConnection.ToVerifyConnectionDetailsTab_SC_03_TC_24;
import NRDA_NewConnection.ToVerifyDashboard_SC_02_TC_04;
import NRDA_NewConnection.ToVerifyConnectionDetailsTab_SC_03_TC_27;
import NRDA_NewConnection.ToVerifyWaterAndSewerageConnection_SC_03_TC_01;
import NRDA_NewConnection.ToVerifyWaterAndSewerageConnection_SC_03_TC_02;
import WaterAndSewerageLogin.WaterAndSewerageLoginPage;

@Listeners(GenericLibrary.ListenerDriver.class)
public class LoginAsCitizen extends URLPageWSNRDAScript
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
	@DataProvider(name="Valid_Connection")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Valid_Connection");
	}


	@Test(description="verify dashboard",priority=0,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_02_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyDashboard_SC_02_TC_04 verifydashboard=PageFactory.initElements(driver,ToVerifyDashboard_SC_02_TC_04.class);
		verifydashboard.clickOnFreshApp();
		verifydashboard.verifyDashboard();
	}

	@Test(description="verify display link",priority=1,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();
		watersewerage.toVerifyOptions01();
	}
	@Test(description="verify display dashbaord",priority=2,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.verifyDisplayDashboard();
	}

	@Test(description="verify display list",priority=3,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		//applicant_details.clickOnResetButton();
		//applicant_details.selectApplicantType();
		applicant_details.verifyDisplayList();
	}

	@Test(description="select Organization/Trust/Society",priority=4,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();

		ToVerifyApplicationDetails_SC_03_TC_05 proceed=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_05.class);
		proceed.clickOnResetButton();
		//proceed.selectOrganizerApplicantType();
		proceed.verifyDisplayList();
	}
	@Test(description="verify building details",priority=5,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();
		//applicant_details.selectApplicantType();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		//validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();
	}

	@Test(description="verify applicant details with valid data",priority=6,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		/*ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();
		applicant_details.selectApplicantType();*/

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		//validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();
	}

	@Test(description="Applicant Invalid data details",priority=7,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();
		//applicant_details.selectApplicantType();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyApplicationDetails_SC_03_TC_06 invaliddata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_06.class);
		invaliddata.clickOnBuildingDetailsNextButton();
		invaliddata.clickOnConnectionDetailsNextButton();
		invaliddata.clickOnSubmitButton();
		invaliddata.getErrorMsg();
	}

	@Test(description="select Organization/Trust/Society valid data",priority=8,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicationDetails_SC_03_TC_05 proceed=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_05.class);
		proceed.clickOnResetButton();
		//proceed.selectOrganizerApplicantType();

		ToVerifyApplicantDetails_SC_03_TC_07 applicant=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_07.class);
		applicant.enterValidData();
	}

	@Test(description="Building Details/Owner",priority=9,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_09(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.selectOwner();
		owner.verifyDisplayList();
		owner.verifyDisplayBtn();
	}

	@Test(description="Field of property",priority=10,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_10(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();
		propertyfield.verifyDisplayList();
		propertyfield.closeWindow();
	}

	@Test(description="enter valid property id",priority=11,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();
		//propertyfield.clickOnPropertyId();

		ToVerifyBuildingDetailsTab_SC_03_TC_10 propertyid=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_10.class);
		//propertyid.enterPropertyID();
		propertyid.selectSector();
		propertyid.clickOnSearchButton();
		//propertyid.viewResult();
		propertyid.closeWindow();
	}

	@Test(description="enter invalid property id",priority=12,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_12(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();
		//propertyfield.clickOnPropertyId();

		ToVerifyBuildingDetailsTab_SC_03_TC_11 propertyid=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_11.class);
		propertyid.enterPropertyID();
		propertyid.clickOnSearch();
		propertyid.closeWindow();
	}

	@Test(description="Plot number",priority=13,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_13(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();

		ToVerifyBuildingDetailsTab_SC_03_TC_12 plotno=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_12.class);
		plotno.enterPlotNumber();
		plotno.clickOnSearch();
		plotno.verifyField();
		plotno.closeWindow();
	}

	@Test(description="Other Details",priority=14,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_14(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		//ToVerifyApplicationDetails_SC_03_TC_05 proceed=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_05.class);
		//proceed.clickOnProceedBtn();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();

		ToVerifyBuildingDetailsTab_SC_03_TC_13 otherdetail=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_13.class);
		otherdetail.verifyOwnerDetails();
		otherdetail.clickOnSearch();
		otherdetail.viewResult();
		otherdetail.closeWindow();
	}


	@Test(description="Fill in form",priority=15,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_15(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();

		ToVerifyBuildingDetailsTab_SC_03_TC_12 plotno=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_12.class);
		plotno.enterPlotNumber();
		plotno.clickOnSearch();

		ToVerifyBuildingDetailsTab_SC_03_TC_15 fillinform=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_15.class);
		fillinform.selectPropertyIdData();
		fillinform.clickOnFillInForm();
	}



	@Test(description="Tenant",priority=16,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_16(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();

		ToVerifyBuildingDetailsTab_SC_03_TC_16 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_16.class);
		tenant.selectTenant();
		tenant.verifyDisplayList();
	}

	@Test(description="correspondence address yes",priority=17,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_17(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();

		ToVerifyBuildingDetailsTab_SC_03_TC_12 plotno=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_12.class);
		plotno.enterPlotNumber();
		plotno.clickOnSearch();

		ToVerifyBuildingDetailsTab_SC_03_TC_15 fillinform=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_15.class);
		fillinform.selectPropertyIdData();
		fillinform.clickOnFillInForm();

		ToVerifyBuildingDetailsTab_SC_03_TC_17 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_17.class);
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();
	}

	@Test(description="correspondence address No",priority=18,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_18(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_09 propertyfield=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_09.class);
		propertyfield.clickOnPropertyIDIcon();

		ToVerifyBuildingDetailsTab_SC_03_TC_12 plotno=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_12.class);
		plotno.enterPlotNumber();
		plotno.clickOnSearch();

		ToVerifyBuildingDetailsTab_SC_03_TC_15 fillinform=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_15.class);
		fillinform.selectPropertyIdData();
		fillinform.clickOnFillInForm();

		ToVerifyBuildingDetailsTab_SC_03_TC_18 correspondenceyno=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_18.class);
		correspondenceyno.selectCorresspondenceAddressNo();
		correspondenceyno.verifyBuildingDetailsAsTenant();
	}

	@Test(description="select as owner to check validation",priority=19,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_19(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();
		owner.selectOwner();

		ToVerifyBuildingDetailsTab_SC_03_TC_19 ownervalidation=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_19.class);
		ownervalidation.enterPropertyID();
		ownervalidation.enterNameOfBuilding();
		ownervalidation.selectCity();
		ownervalidation.selectSector();
		ownervalidation.enterHouseNumber();
		ownervalidation.enterFloor();
		ownervalidation.enterPinCode();
	}

	@Test(description="verify Tenant field",priority=20,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_20(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();

		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();
		tenant.verifyDisplayList();
	}

	@Test(description="verify Tenant corresspondence yes",priority=21,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_21(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();

		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();
	}

	@Test(description="verify Tenant corresspondence No",priority=22,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_22(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();

		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();

		ToVerifyBuildingDetailsTab_SC_03_TC_22 correspondenceno=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_22.class);
		correspondenceno.selectCorresspondenceAddressNo();
		correspondenceno.verifyBuildingDetailsAsTenant();
	}

	@Test(description="select as Tenant to check validation",priority=23,dataProvider="Valid_Connection")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_23(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		owner.clickOnResetBtn();
		owner.clickOnBuildingDetails();

		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_23 tenantvalidation=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_23.class);
		tenantvalidation.enterPropertyID();
		tenantvalidation.enterNameOfOwnerBuilding();
		tenantvalidation.enterNameOfBuilding();
		tenantvalidation.selectCity();
		tenantvalidation.selectSector();
		tenantvalidation.enterHouseNumber();
		tenantvalidation.enterFloor();
		tenantvalidation.enterPinCode();
	}

	@Test(priority=24,dataProvider ="Valid_Connection",description="click connection details tab")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_24(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.verifyConnectionDetailsTab();
	}

	@Test(priority=25,dataProvider ="Valid_Connection",description="select connection construction Yes")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_25(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_25 constructionyes=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_25.class);
		constructionyes.selectConnectionConstructionYes();
		constructionyes.verifyDisplayList();
	}

	@Test(priority=26,dataProvider ="Valid_Connection",description="select connection construction No")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_26(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_26 constructionno=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_26.class);
		constructionno.selectConnectionConstructionNo();
		constructionno.verifyDisplayList();
	}

	@Test(priority=27,dataProvider ="Valid_Connection",description="Verify Usage details")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_27(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_27 details=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_27.class);
		details.verifyDetailsOfUsage();

	}
	@Test(priority=28,dataProvider ="Valid_Connection",description="Applicant type=Water And Sewerage,commerical,factories")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_28(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_28 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_28.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}


	@Test(priority=29,dataProvider ="Valid_Connection",description="Applicant type=Water And Sewerage,domestic,individual")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_29(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_29 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_29.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=30,dataProvider ="Valid_Connection",description="Applicant type=Water And Sewerage,domestic,society")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_30(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_30 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_30.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=31,dataProvider ="Valid_Connection",description="Applicant type=Water And Sewerage,institutional,government offices")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_31(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_31 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_31.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=32,dataProvider ="Valid_Connection",description="Applicant type=Water And Sewerage,residentials,nurses home")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_32(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_32 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_32.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=33,dataProvider ="Valid_Connection",description="Applicant type=Water connection,commerical,factories")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_33(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_33 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_33.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=34,dataProvider ="Valid_Connection",description="Applicant type=Water connection,domestic,individual")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_34(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_34 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_34.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=35,dataProvider ="Valid_Connection",description="Applicant type=Water connection,domestic,society")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_35(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_35 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_35.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=36,dataProvider ="Valid_Connection",description="Applicant type=Water connection,institution,governement office")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_36(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_36 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_36.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=37,dataProvider ="Valid_Connection",description="Applicant type=Water connection,residential,nurses home")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_37(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_37 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_37.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=38,dataProvider ="Valid_Connection",description="Applicant type=sewerage connection,commerical,factories")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_38(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_38 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_38.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=39,dataProvider ="Valid_Connection",description="Applicant type=sewerage connection,domestic,individual")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_39(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_39 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_39.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=40,dataProvider ="Valid_Connection",description="Applicant type=sewerage connection,domestic,society")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_40(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_40 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_40.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=41,dataProvider ="Valid_Connection",description="Applicant type=sewerage connection,institution,government office")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_41(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_41 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_41.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=42,dataProvider ="Valid_Connection",description="Applicant type=sewerage connection,residential,nurses home")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_42(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_42 detail=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_42.class);
		detail.verifyWaterAndSewerage();
		detail.verifyField();
	}

	@Test(priority=43,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_43(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_43 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_43.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=44,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_44(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_44 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_44.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=45,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_45(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_45 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_45.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=46,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_46(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_46 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_46.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=47,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_47(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_47 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_47.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=48,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_48(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_48 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_48.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=49,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_49(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_49 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_49.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=50,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_50(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_50 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_50.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=51,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_51(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_51 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_51.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=52,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_52(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_52 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_52.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=53,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_53(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_53 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_53.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=54,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_54(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_54 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_54.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=55,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_55(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_55 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_55.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=56,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_56(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_56 filled=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_56.class);
		filled.verifyFilledFunctionality();
	}

	@Test(priority=57,dataProvider ="Valid_Connection",description="verify filled data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_57(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();
	}

	@Test(priority=58,dataProvider ="Valid_Connection",description="verify invalid data")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_58(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();
		connectiondeatils.clickOnResetButton();
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_58 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_58.class);
		invalid.enterTrust();
		invalid.enterNumberOfBed();
		invalid.enterNumberOfFlat();
		invalid.enterNumberOfSeat();
		invalid.enterNumberOfRoom();
		invalid.enterConnectionNumber();
		invalid.enterConnectionDiameter();
		invalid.enterConnectionSize();
		invalid.uploadSitePlan();
		invalid.getErrormsg();
	}

	@Test(priority=59,dataProvider ="Valid_Connection",description="verify upload document")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_59(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();
		uploadlist.verifyDisplayList();
	}

	@Test(priority=60,dataProvider ="Valid_Connection",description="verify upload document field")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_60(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();
	}


	@Test(priority=61,dataProvider ="Valid_Connection",description="verify upload document field")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_61(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_61 invaliduploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_61.class);
		invaliduploads.selectServiceRelatedDoc();
		invaliduploads.uploadDoc();
		invaliduploads.getErrorMsg();
		invaliduploads.selectIdentificationDoc();
		invaliduploads.uploadDocs();
		invaliduploads.getErrorMsg();
		invaliduploads.selectResidenceDoc();
		invaliduploads.uploadDocument();
		invaliduploads.getErrorMsg();
	}

	@Test(priority=62,dataProvider ="Valid_Connection",description="verify reset")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_63(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyUploadDocument_SC_03_TC_63 reset=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_63.class);
		reset.clickOnReset();
	}

	@Test(priority=63,dataProvider ="Valid_Connection",description="verify close yes")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_64(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyUploadDocument_SC_03_TC_64 yes=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_64.class);
		yes.clickOnClose();
		yes.clickOnYes();
	}

	@Test(priority=64,dataProvider ="Valid_Connection",description="verify close No")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_65(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyUploadDocument_SC_03_TC_64 yes=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_64.class);
		yes.clickOnClose();

		ToVerifyUploadDocument_SC_03_TC_65 no=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_65.class);
		no.clickOnNo();
	}

	@Test(priority=65,dataProvider ="Valid_Connection",description="verify Save as draft")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_66(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		newconnection.clickOnPopUpProceedButton();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyUploadDocument_SC_03_TC_66 draft=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_66.class);
		draft.clickSaveAsDraft();
		draft.clickOnApplicationStatus();
		draft.clickOnDraftedAplication();
	}

	@Test(priority=66,dataProvider ="Valid_Connection",description="verify Save as draft button")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_67(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyUploadDocument_SC_03_TC_66 draft=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_66.class);
		draft.clickOnApplicationStatus();
		draft.clickOnDraftedAplication();

		ToVerifyUploadDocument_SC_03_TC_67 draftbtn=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_67.class);
		draftbtn.clickOnWaterConnection();
	}

	@Test(priority=67,dataProvider ="Valid_Connection",description="verify proceed button")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_68(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyUploadDocument_SC_03_TC_66 draft=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_66.class);
		draft.clickOnApplicationStatus();
		draft.clickOnDraftedAplication();

		ToVerifyUploadDocument_SC_03_TC_67 draftbtn=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_67.class);
		draftbtn.clickOnWaterConnection();

		ToVerifyUploadDocument_SC_03_TC_68 proceedbtn=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_68.class);
		proceedbtn.clickOnProceed();
	}

	@Test(priority=68,dataProvider ="Valid_Connection",description="verify delete button")
	public void NRDA_Sewerage_New_Connection_SC_03_TC_69(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyUploadDocument_SC_03_TC_66 draft=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_66.class);
		draft.clickOnApplicationStatus();
		draft.clickOnDraftedAplication();

		ToVerifyUploadDocument_SC_03_TC_67 draftbtn=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_67.class);
		draftbtn.clickOnWaterConnection();

		ToVerifyUploadDocument_SC_03_TC_69 deletebtn=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_69.class);
		deletebtn.clickOnDelete();
		deletebtn.getErrorMsg();
	}

	@Test(priority=69,dataProvider ="Valid_Connection",description="verify Submit Fun")
	public void NRDA_Sewerage_New_Connection_SC_04_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_04_TC_01 label=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_01.class);
		label.clickOnSubmitBtn();
		label.verifyApplicationLabel();
		label.verifyApplicationStatus();
	}

	@Test(priority=70,dataProvider ="Valid_Connection",description="verify making payement")
	public void NRDA_Sewerage_New_Connection_SC_04_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_04_TC_01 label=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_01.class);
		label.clickOnSubmitBtn();
		label.verifyApplicationStatus();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_02 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_02.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();
		makepayment.clickOnMakePayment();
		makepayment.verifyDisplayList();
	}

	@Test(priority=74,dataProvider ="Valid_Connection",description="verify valid card Payment")
	public void NRDA_Sewerage_New_Connection_SC_04_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		//correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_04_TC_01 label=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_01.class);
		label.clickOnSubmitBtn();
		label.verifyApplicationStatus();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_02 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_02.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();
		makepayment.clickOnMakePayment();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_03 carddetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_03.class);
		carddetails.enterCreditCardNumber();
		carddetails.selectValidMonth();
		carddetails.selectValidYear();
		carddetails.enterCVVNumber();
		carddetails.enterCardNameHolder();
		carddetails.clickOnPayNow();
		carddetails.clickOnSimulate();
		carddetails.getApplicationNum();
	}

	@Test(priority=71,dataProvider ="Valid_Connection",description="verify invalid card Payment")
	public void NRDA_Sewerage_New_Connection_SC_04_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_04_TC_01 label=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_01.class);
		label.clickOnSubmitBtn();
		label.verifyApplicationStatus();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_02 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_02.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();
		makepayment.clickOnMakePayment();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_04 carddetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_04.class);
		carddetails.enterCreditCardNumber();
		carddetails.getErrorMsg();
	}

	@Test(priority=72,dataProvider ="Valid_Connection",description="verify invalid card Payment")
	public void NRDA_Sewerage_New_Connection_SC_04_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_04_TC_01 label=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_01.class);
		label.clickOnSubmitBtn();
		label.verifyApplicationStatus();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_02 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_02.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();
		makepayment.clickOnMakePayment();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_05 carddetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_05.class);
		carddetails.clickOnPayNow();
		carddetails.getErrorMsg();
	}

	@Test(priority=73,dataProvider ="Valid_Connection",description="verify invalid card Payment")
	public void NRDA_Sewerage_New_Connection_SC_04_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_04_TC_01 label=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_01.class);
		label.clickOnSubmitBtn();
		label.verifyApplicationStatus();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_02 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_02.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();
		makepayment.clickOnMakePayment();
		
		ToVerifyConnectionDetailsTab_SC_04_TC_03 carddetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_03.class);
		carddetails.enterCreditCardNumber();
		carddetails.selectValidMonth();
		carddetails.selectValidYear();
		

		ToVerifyConnectionDetailsTab_SC_04_TC_06 cvvdetails=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_04_TC_06.class);
		cvvdetails.enterCVVNumber();
		cvvdetails.clickOnPayNow();
		cvvdetails.getErrorMsg();
	}
	

	@Test(priority=75,dataProvider ="Valid_Connection",description="verify Submitted under Application Status")
	public void NRDA_Sewerage_New_Connection_SC_05_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_05_TC_01 submit=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_05_TC_01.class);
		submit.clickOnApplicationStatus();
		submit.clickOnSubmittedApplication();
		submit.verifyWaterAndSewerageConnectionExit();
		submit.verifyDisplayList();
	}

	@Test(priority=76,dataProvider ="Valid_Connection",description="verify Submitted under Application Status")
	public void NRDA_Sewerage_New_Connection_SC_05_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_05_TC_01 submit=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_05_TC_01.class);
		submit.clickOnApplicationStatus();

		ToVerifyConnectionDetailsTab_SC_05_TC_02 search=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_05_TC_02.class);
		search.enterCustomerId();
		search.clickOnSearchBtn();
		search.clickOnSubmittedApplication();
		search.verifyWaterAndSewerageConnectionExit();
		search.clickOnActionImg();
		search.verifyDisplayList();
	}

	@Test(priority=77,dataProvider ="Valid_Connection",description="verify save as draft")
	public void NRDA_Sewerage_New_Connection_SC_06_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_06_TC_01 save=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_06_TC_01.class);
		save.clickOnSaveAsDraftBtn();
		save.clickOnApplicationStatus();
		save.clickOnDraftedApplication();
		save.verifyWaterAndSewerageConnectionExit();
		save.verifyDisplayField();
	}

	@Test(priority=78,dataProvider ="Valid_Connection",description="verify proceed")
	public void NRDA_Sewerage_New_Connection_SC_06_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_06_TC_01 save=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_06_TC_01.class);
		save.clickOnSaveAsDraftBtn();
		save.clickOnApplicationStatus();
		save.clickOnDraftedApplication();
		save.verifyWaterAndSewerageConnectionExit();

		ToVerifyConnectionDetailsTab_SC_06_TC_02 proceed=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_06_TC_02.class);
		proceed.clickOnProceedBtn();
	}

	@Test(priority=79,dataProvider ="Valid_Connection",description="verify delete")
	public void NRDA_Sewerage_New_Connection_SC_06_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyWaterAndSewerageConnection_SC_03_TC_01 watersewerage=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_01.class);
		watersewerage.clickOnFreshApp();
		watersewerage.clickOnPublicHealth();

		ToVerifyWaterAndSewerageConnection_SC_03_TC_02 newconnection=PageFactory.initElements(driver,ToVerifyWaterAndSewerageConnection_SC_03_TC_02.class);
		newconnection.clickOnWaterAndSewerageConnection();
		newconnection.clickOnNewApplicationButton();
		newconnection.selectPopUp();
		newconnection.clickOnProceedButton();
		//newconnection.clickOnPopUpProceedButton();

		ToVerifyApplicantDetails_SC_03_TC_03 applicant_details=PageFactory.initElements(driver,ToVerifyApplicantDetails_SC_03_TC_03.class);
		applicant_details.clickOnResetButton();

		ToVerifyApplicationDetails_SC_03_TC_04 validdata=PageFactory.initElements(driver,ToVerifyApplicationDetails_SC_03_TC_04.class);
		validdata.verifyApplicantValidData();
		validdata.clickOnNextButton();

		ToVerifyBuildingDetailsTab_SC_03_TC_08 owner=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_08.class);
		owner.clickOnBuildingDetails();
		
		ToVerifyBuildingDetailsTab_SC_03_TC_20 tenant=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_20.class);
		tenant.selectTenant();

		ToVerifyBuildingDetailsTab_SC_03_TC_21 correspondenceyes=PageFactory.initElements(driver,ToVerifyBuildingDetailsTab_SC_03_TC_21.class);
		correspondenceyes.clickOnPropertyIDIcon();
		correspondenceyes.enterPlotNumber();
		correspondenceyes.clickOnSearch();
		correspondenceyes.selectPropertyIdData();
		correspondenceyes.clickOnFillInForm();
		correspondenceyes.selectCorrespondenceAddressYes();
		correspondenceyes.verifyBuildingDetailsAsTenant();

		ToVerifyConnectionDetailsTab_SC_03_TC_24 connectiondeatils=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_24.class);
		connectiondeatils.clickOnConnectionDetails();

		ToVerifyConnectionDetailsTab_SC_03_TC_57 validd=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_03_TC_57.class);
		validd.verifyValidDataFunctionality();
		validd.enterTrust();
		validd.enterNumberOfRoom();
		validd.enterConnectionDiameter();
		validd.uploadSitePlan();

		ToVerifyUploadDocument_SC_03_TC_59 uploadlist=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_59.class);
		uploadlist.clickOnUploadDocumentDetails();

		ToVerifyUploadDocument_SC_03_TC_60 uploads=PageFactory.initElements(driver,ToVerifyUploadDocument_SC_03_TC_60.class);
		uploads.selectServiceRelatedDoc();
		uploads.uploadDoc();
		uploads.selectIdentificationDoc();
		uploads.uploadDocs();
		uploads.selectResidenceDoc();
		uploads.uploadDocument();

		ToVerifyConnectionDetailsTab_SC_06_TC_01 save=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_06_TC_01.class);
		save.clickOnSaveAsDraftBtn();
		save.clickOnApplicationStatus();
		save.clickOnDraftedApplication();
		save.verifyWaterAndSewerageConnectionExit();

		ToVerifyConnectionDetailsTab_SC_06_TC_03 delete=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_06_TC_03.class);
		delete.clickOnDeleteBtn();
	}

	@Test(priority=80,dataProvider ="Valid_Connection",description="verify pending payment")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();
		pending.verifyWaterAndSewerageConnectionExit();
		pending.verifyDisplayList();
		pending.verifyDisplayButton();
	}

	@Test(priority=81,dataProvider ="Valid_Connection",description="verify proceed ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();
		proceedtopay.verifyPaymentApplicationLabel();
	}

	@Test(priority=82,dataProvider ="Valid_Connection",description="verify make payment ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_03 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_03.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();
		makepayment.verifyMakePayment();
	}

	@Test(priority=83,dataProvider ="Valid_Connection",description="click make payment ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_03 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_03.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();

		ToVerifyConnectionDetailsTab_SC_07_TC_04 payment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_04.class);
		payment.clickOnMakePayment();
		payment.verifyDisplayList();
	}

	@Test(priority=87,dataProvider ="Valid_Connection",description="click make payment with valid card details ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_05(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_03 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_03.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();

		ToVerifyConnectionDetailsTab_SC_07_TC_04 payment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_04.class);
		payment.clickOnMakePayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_05 valid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_05.class);
		valid.enterCreditCardNumber();
		valid.selectValidMonth();
		valid.selectValidYear();
		valid.enterCVVNumber();
		valid.enterCardNameHolder();
		valid.clickOnPayNow();
		valid.clickOnSimulate();
		valid.getApplicationNum();
	}

	@Test(priority=84,dataProvider ="Valid_Connection",description="click make payment with invalid card details ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_06(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_03 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_03.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();

		ToVerifyConnectionDetailsTab_SC_07_TC_04 payment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_04.class);
		payment.clickOnMakePayment();
		
		ToVerifyConnectionDetailsTab_SC_07_TC_05 valid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_05.class);
		valid.selectValidMonth();
		valid.selectValidYear();
		valid.enterCVVNumber();
		valid.enterCardNameHolder();

		ToVerifyConnectionDetailsTab_SC_07_TC_06 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_06.class);
		invalid.enterCreditCardNumber();
		invalid.clickOnPayNow();
		invalid.getErrorMsg();
	}

	@Test(priority=85,dataProvider ="Valid_Connection",description="click make payment with invalid card details ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_07(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_03 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_03.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();

		ToVerifyConnectionDetailsTab_SC_07_TC_04 payment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_04.class);
		payment.clickOnMakePayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_07 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_07.class);
		invalid.clickOnPayNow();
		invalid.getErrorMsg();
	}

	@Test(priority=86,dataProvider ="Valid_Connection",description="click make payment with invalid card details ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_08(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);
		
		ToVerifyConnectionDetailsTab_SC_07_TC_01 pending=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_01.class);
		pending.clickOnPendingPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_02 proceedtopay=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_02.class);
		proceedtopay.enterCustomerID();
		proceedtopay.clickOnSearchBtn();
		proceedtopay.verifyWaterAndSewerageConnExist();
		proceedtopay.clickOnProceedToPayment();

		ToVerifyConnectionDetailsTab_SC_07_TC_03 makepayment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_03.class);
		makepayment.selectPaymentGateway();
		makepayment.selectPaymentMode();

		ToVerifyConnectionDetailsTab_SC_07_TC_04 payment=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_04.class);
		payment.clickOnMakePayment();
		
		ToVerifyConnectionDetailsTab_SC_07_TC_05 valid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_05.class);
		valid.enterCreditCardNumber();
		valid.selectValidMonth();
		valid.selectValidYear();
		valid.enterCardNameHolder();

		ToVerifyConnectionDetailsTab_SC_07_TC_08 invalid=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_08.class);
		invalid.enterCVVNumber();
		invalid.clickOnPayNow();
		invalid.getErrorMsg();
	}


	@Test(priority=1,dataProvider ="Valid_Connection",description="payment 3500 and check the application status ")
	public void NRDA_Sewerage_New_Connection_SC_07_TC_11(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_07_TC_11 payment3500=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_07_TC_11.class);
		payment3500.clickOnPendingPayment();
		payment3500.enterCustomerID();
		payment3500.clickOnSearchBtn();
		payment3500.verifyWaterAndSewerageConnExist();
		payment3500.clickOnProceedToPayment();
		payment3500.selectPaymentGateway();
		payment3500.selectPaymentMode();
		payment3500.clickOnMakePayment();
		payment3500.enterCreditCardNumber();
		payment3500.selectValidMonth();
		payment3500.selectValidYear();
		payment3500.enterCVVNumber();
		payment3500.enterCardNameHolder();
		payment3500.clickOnPayNow();
		payment3500.clickOnSimulate();
	}

	
								//check status
	
	@Test(priority=1,dataProvider ="Valid_Connection",description="Approved and rejected application")
	public void NRDA_Sewerage_New_Connection_SC_12_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_12_TC_02 applicationstatus=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_12_TC_02.class);
		applicationstatus.verifyApprovedRejectedStatus();
		applicationstatus.enterCustomerID();
		applicationstatus.clickOnSearchBtn();
		applicationstatus.verifyDisplayList();
	}
	
	@Test(priority=2,dataProvider ="Valid_Connection",description="pagination")
	public void NRDA_Sewerage_New_Connection_SC_12_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_12_TC_02 applicationstatus=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_12_TC_02.class);
		applicationstatus.verifyApprovedRejectedStatus();
		
		ToVerifyConnectionDetailsTab_SC_12_TC_03 pagination=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_12_TC_03.class);
		pagination.clickOnPage2();
		pagination.clickOnPage1();
	}

	@Test(priority=3,dataProvider ="Valid_Connection",description="my Account")
	public void NRDA_Sewerage_New_Connection_SC_13_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_13_TC_01 account=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_01.class);
		account.clickOnMyAccount();
		account.displayList();
	}

	@Test(priority=4,dataProvider ="Valid_Connection",description="hyper link")
	public void NRDA_Sewerage_New_Connection_SC_13_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_13_TC_01 account=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_01.class);
		account.clickOnMyAccount();
		account.getConsumerId();

		ToVerifyConnectionDetailsTab_SC_13_TC_02 hyperlink=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_02.class);
		hyperlink.clickOnHyperLink();
	}

	@Test(priority=5,dataProvider ="Valid_Connection",description="hyper link close")
	public void NRDA_Sewerage_New_Connection_SC_13_TC_03(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_13_TC_01 account=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_01.class);
		account.clickOnMyAccount();

		ToVerifyConnectionDetailsTab_SC_13_TC_02 hyperlink=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_02.class);
		hyperlink.clickOnHyperLink();

		ToVerifyConnectionDetailsTab_SC_13_TC_03 close=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_03.class);
		close.clickOnClose();
	}
	
	@Test(priority=6,dataProvider ="Valid_Connection",description="pagination")
	public void NRDA_Sewerage_New_Connection_SC_13_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_13_TC_01 account=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_01.class);
		account.clickOnMyAccount();

		ToVerifyConnectionDetailsTab_SC_13_TC_04 pagi=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_13_TC_04.class);
		pagi.clickOnPage2();
		pagi.clickOnPage1();
	}

	@Test(priority=97,dataProvider ="Valid_Connection",description="my payment history")
	public void NRDA_Sewerage_New_Connection_SC_14_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_14_TC_01 history=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_14_TC_01.class);
		history.clickOnMyPaymentHistory();
		history.displayList();
	}

	@Test(priority=98,dataProvider ="Valid_Connection",description="action")
	public void NRDA_Sewerage_New_Connection_SC_14_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsCitizen(username, password);

		ToVerifyConnectionDetailsTab_SC_14_TC_01 history=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_14_TC_01.class);
		history.clickOnMyPaymentHistory();

		ToVerifyConnectionDetailsTab_SC_14_TC_02 download=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_14_TC_02.class);
		download.clickOnActionLink();


	}
}
