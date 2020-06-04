package NRDA_NewConnection;

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
public class LoginAsJE extends URLPageWSNRDAScript
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
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		waitForSomeTime();
		driver.close();
	}
	
	@DataProvider(name="junior engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Junior Engineer Credentials");
	}
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify dashboard")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_01 homedisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_01.class);
		homedisplay.verifyDisplayLink();
		homedisplay.verifyStatisticsDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify under Public health and Engineering")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();
		health.verifyDisplayLink();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="Water and Sewerage Connection")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		sewerage.verifyDisp();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="Application number")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_04 seweragestatus=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_04.class);
		seweragestatus.verifyNavigation();
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="click on action")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_05 pendingdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_05.class);
		pendingdisplay.verifyDisp();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="Pagination")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_06 pagination=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_06.class);
		pagination.clickOnPage2();
		pagination.clickOnPage1();
	}
	
	@Test(priority=7,dataProvider ="junior engineer",description="invalid application")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_07 invapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_07.class);
		invapp.enterApplicationNum();
		invapp.verifyErrorMsg();
	}
	
	@Test(priority=8,dataProvider ="junior engineer",description="invalid pending days")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_08 invpendingdays=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_08.class);
		invpendingdays.enterPendingDays();
		invpendingdays.verifyErrorMsg();
	}
	
	@Test(priority=9,dataProvider ="junior engineer",description="valid application number")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
	}
	
	@Test(priority=10,dataProvider ="junior engineer",description="verify action")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		actdisplay.verifyDisplayList();
	}
	
	@Test(priority=11,dataProvider ="junior engineer",description="blank action")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_11 blankaction=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_11.class);
		blankaction.enterComment();
		blankaction.clickOnSubmit();
		blankaction.verifyErrorMsg();
	}
	
	@Test(priority=12,dataProvider ="junior engineer",description="blank user action")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_12 blankuseraction=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_12.class);
		blankuseraction.selectActionForward();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_11 blankaction=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_11.class);
		blankaction.enterComment();
		blankuseraction.clickOnSubmit();
		blankuseraction.verifyMsg();
	}
	
	@Test(priority=13,dataProvider ="junior engineer",description="enter blank comment")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_12 blankuseraction=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_12.class);
		blankuseraction.clickOnSelectAction();
		blankuseraction.selectActionForward();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_13 blankcomment=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_13.class);
		blankcomment.selectUserBlankComment();
		blankcomment.clickOnSubmit();
		blankcomment.getErrorMsg();
	
	}
	
	@Test(priority=14,dataProvider ="junior engineer",description="File Search")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
	
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		search.verifyFileField();
	}
	
	@Test(priority=15,dataProvider ="junior engineer",description="create new file")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_15 create=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_15.class);
		create.clickOnCreateNewFill();
		create.verifyDisplayField();
		create.closePopup();
	}
	
	@Test(priority=18,dataProvider ="junior engineer",description="file no")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_16(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
	
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_15 create=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_15.class);
		create.clickOnCreateNewFill();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_16 fileno=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_16.class);
		fileno.verifyFileNo();
		fileno.closePopup();
	}
	
	@Test(priority=17,dataProvider ="junior engineer",description="subject")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_17(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		

		ToVerifyConnectionDetailsTab_SC_08_TC_15 create=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_15.class);
		create.clickOnCreateNewFill();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_17 subject=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_17.class);
		subject.verifySubject();
		subject.closePopup();
	}
		
	@Test(priority=18,dataProvider ="junior engineer",description="create file number")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_18(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_15 create=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_15.class);
		create.clickOnCreateNewFill();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_18 createfileno=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_18.class);
		createfileno.verifCreateFile();
		createfileno.clickOnSubmit();
		createfileno.closePopup();
	}
	
	@Test(priority=19,dataProvider ="junior engineer",description="create file number search button")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_19(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_19 fillinformbtn=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_19.class);
		fillinformbtn.enterSubject();
		fillinformbtn.clickOnSearch();
		fillinformbtn.selectRecord();
		fillinformbtn.clickOnFillInFormBtn();
	}
	
	@Test(priority=20,dataProvider ="junior engineer",description="Map")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_20(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
	
		ToVerifyConnectionDetailsTab_SC_08_TC_20 map=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_20.class);
		map.clickOnMap();
	}
	
	@Test(priority=24,dataProvider ="junior engineer",description="Submit to FE")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_21(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
	
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_12 blankuseraction=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_12.class);
		blankuseraction.clickOnSelectAction();
		blankuseraction.selectActionForward();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_13 blankcomment=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_13.class);
		blankcomment.selectUserBlankComment();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_14 search=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_14.class);
		search.clickOnSearchBtn();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_19 fillinformbtn=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_19.class);
		fillinformbtn.enterSubject();
		fillinformbtn.clickOnSearch();
		fillinformbtn.selectRecord();
		fillinformbtn.clickOnFillInFormBtn();
		
		
		ToVerifyConnectionDetailsTab_SC_08_TC_21 submit=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_21.class);
		submit.enterComment();
		submit.verifyuploadDocument();
		submit.clickOnSubmit();
	}
	
	@Test(priority=21,dataProvider ="junior engineer",description="Close")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_24(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_24 close=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_24.class);
		close.clickOnClose();
	}
	
	@Test(priority=22,dataProvider ="junior engineer",description="save as draft")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_25(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_25 savedraft=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_25.class);
		savedraft.clickOnSaveAsDraft();
		savedraft.verifyMessage();
	}
	
	@Test(priority=23,dataProvider ="junior engineer",description="remove draft")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_26(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_26 removedraft=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_26.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
	}
	
	@Test(priority=27,description="JE to EE",dataProvider ="junior engineer")
	public void NRDA_Sewerage_New_Connection_SC_08_TC_27(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException 
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		

		ToVerifyConnectionDetailsTab_SC_08_TC_27 forwardtoEE=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_08_TC_27.class);
		forwardtoEE.selectAction();
		forwardtoEE.selectUser();
		forwardtoEE.enterComment();
		forwardtoEE.verifyuploadDocument();
		forwardtoEE.clickOnSubmit();
	}
	
	
	
	
							//meter installation
	
	@Test(priority=1,description="verify Meter installation",dataProvider ="junior engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_01(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException 
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_01 action=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_01.class);
		action.displayList();
	}
	
	@Test(priority=3,description="submit",dataProvider ="junior engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_02(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException 
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_02 submit=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_02.class);
		submit.selectUserActionForward();
		submit.selectUserActionFE();
		submit.enterComment();
		submit.uploadDocument();
		submit.clickOnSubmit();
		submit.getSuccessfulMsg();
	}
	
	
	@Test(priority=2,description="close",dataProvider ="junior engineer")
	public void NRDA_Sewerage_New_Connection_SC_11_TC_04(String username,String password) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException 
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		ToVerifyConnectionDetailsTab_SC_08_TC_02 health=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_02.class);
		health.clickOnPublicHealthAndEng();

		ToVerifyConnectionDetailsTab_SC_08_TC_03 sewerage=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_03.class);
		sewerage.clickOnWaterAndSewerage();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_09 valapp=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_09.class);
		valapp.enterApplicationNum();
		
		ToVerifyConnectionDetailsTab_SC_08_TC_10 actdisplay=PageFactory.initElements(driver, ToVerifyConnectionDetailsTab_SC_08_TC_10.class);
		actdisplay.clickOnActionImg();
		
		ToVerifyConnectionDetailsTab_SC_11_TC_04 close=PageFactory.initElements(driver,ToVerifyConnectionDetailsTab_SC_11_TC_04.class);
		close.clickOnClose();
	}
	
	/*@Test(priority=15,dataProvider ="junior engineer",description="NRDA_Water & Sewerage_SC_08_TC_20")
	public void verifyJEToEE_08_TC_20(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyApplicationLoginAsJE application=PageFactory.initElements(driver,ToVerifyApplicationLoginAsJE.class);
		application.toVerifyPendingApplicationIconNewApplication06();
		application.toVerifyJEToEEForwardAction();
	}
	
	@Test(priority=15,dataProvider ="junior engineer",description="NRDA_Water & Sewerage_SC_08_TC_20")
	public void verifyJEToFE(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);
		
		ToVerifyApplicationLoginAsJE application=PageFactory.initElements(driver,ToVerifyApplicationLoginAsJE.class);
		application.toVerifyJEToFEForwardAction();
	}*/
	}


