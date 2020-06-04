package NRDA_RECONNECTION;

import java.io.IOException;

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
	public void NRDA_Reconnection_SC_02_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_01 homedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_01.class);
		homedisplay.verifyDisplayLink();
		homedisplay.verifyStatisticsDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify under Public health and Engineering")
	public void NRDA_Reconnection_SC_02_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		health.verifyDisplayLink();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify under Reconnection of water supply")
	public void NRDA_Reconnection_SC_02_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		display.verifyDisp();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify action page")
	public void NRDA_Reconnection_SC_02_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		ation.verifyDisplayList();
		
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="verify search file")
	public void NRDA_Reconnection_SC_02_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_05 searchfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_05.class);
		searchfile.clickOnSearchBtn();
		searchfile.verifyFileField();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify create file")
	public void NRDA_Reconnection_SC_02_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_05 searchfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_05.class);
		searchfile.clickOnSearchBtn();
		
		NRDA_Reconnection_SC_02_TC_06 createfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_06.class);
		createfile.clickOnCreateNewFill();
		createfile.verifyDisplayField();
		createfile.closePopup();
	}

	@Test(priority=7,dataProvider ="junior engineer",description="verify create file submit button")
	public void NRDA_Reconnection_SC_02_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_05 searchfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_05.class);
		searchfile.clickOnSearchBtn();
		
		NRDA_Reconnection_SC_02_TC_06 createfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_06.class);
		createfile.clickOnCreateNewFill();
		
		NRDA_Reconnection_SC_02_TC_07 createsubmit=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_07.class);
		createsubmit.verifCreateFile();
		createsubmit.clickOnSubmit();
		createsubmit.closePopup();
	}
	
	@Test(priority=8,dataProvider ="junior engineer",description="verify fill in form button")
	public void NRDA_Reconnection_SC_02_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_05 searchfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_05.class);
		searchfile.clickOnSearchBtn();
		
		NRDA_Reconnection_SC_02_TC_08 filefill=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_08.class);
		filefill.enterSubject();
		filefill.clickOnSearch();
		filefill.selectRecord();
		filefill.clickOnFillInFormBtn();
	}
	
	@Test(priority=9,dataProvider ="junior engineer",description="verify action value")
	public void NRDA_Reconnection_SC_02_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_09 actionvalue=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_09.class);
		actionvalue.clickOnSelectAction();
		actionvalue.verifySectionActionValue();
	}
	

	@Test(priority=10,dataProvider ="junior engineer",description="verify save as draft")
	public void NRDA_Reconnection_SC_02_TC_13(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_13 draft=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_13.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	
	@Test(priority=11,dataProvider ="junior engineer",description="verify remove draft")
	public void NRDA_Reconnection_SC_02_TC_14(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_14 removedraft=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_14.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
	}

	@Test(priority=11,dataProvider ="junior engineer",description="verify close")
	public void NRDA_Reconnection_SC_02_TC_15(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_15 close=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_15.class);
		close.clickOnClose();
	}
	
	@Test(priority=12,dataProvider ="junior engineer",description="submit to FE")
	public void NRDA_Reconnection_SC_02_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_02_TC_02 health=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_02.class);
		health.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_02_TC_03 display=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_03.class);
		display.clickOnReconnection();
		
		NRDA_Reconnection_SC_02_TC_04 ation=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_04.class);
		ation.enterApplicationNum();
		ation.clickOnActionImg();
		
		NRDA_Reconnection_SC_02_TC_05 searchfile=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_05.class);
		searchfile.clickOnSearchBtn();
		
		NRDA_Reconnection_SC_02_TC_08 filefill=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_08.class);
		filefill.enterSubject();
		filefill.clickOnSearch();
		filefill.selectRecord();
		filefill.clickOnFillInFormBtn();
		
		NRDA_Reconnection_SC_02_TC_09 actionvalue=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_09.class);
		actionvalue.clickOnSelectAction();
		
		NRDA_Reconnection_SC_02_TC_10 forward=PageFactory.initElements(driver, NRDA_Reconnection_SC_02_TC_10.class);
		forward.selectActionForward();
		forward.selectUser();
		forward.enterComment();
		forward.verifyuploadDocument();
		forward.clickOnSubmit();
	}
	
	
	
	
	
										// Application forward to EE
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify action page dashboard")
	public void NRDA_Reconnection_SC_04_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		actionpagedisplay.verifyDisplayList();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify action value")
	public void NRDA_Reconnection_SC_04_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_02 actionvalue=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_02.class);
		actionvalue.clickOnSelectAction();
		actionvalue.verifySectionActionValue();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify blank action")
	public void NRDA_Reconnection_SC_04_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_03 comment=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_03.class);
		comment.enterComment();
		comment.clickOnSubmit();
		comment.getErrormsg();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify blank comment")
	public void NRDA_Reconnection_SC_04_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_04 action=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_04.class);
		action.clickOnSelectAction();
		action.selectActionForward();
		action.selectUser();
		action.clickOnSubmit();
		action.getErrorMsg();
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="verify save as draft")
	public void NRDA_Reconnection_SC_04_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_08 saveasdraft=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_08.class);
		saveasdraft.clickOnSaveAsDraft();
		saveasdraft.verifyMessage();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify remove draft")
	public void NRDA_Reconnection_SC_04_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_09 removeasdraft=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_09.class);
		removeasdraft.clickOnRemoveDraft();
		removeasdraft.verifyMessage();
	}
	
	@Test(priority=7,dataProvider ="junior engineer",description="verify close")
	public void NRDA_Reconnection_SC_04_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_10 close=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_10.class);
		close.clickOnClose();
	}
	
	@Test(priority=8,dataProvider ="junior engineer",description="verify submit")
	public void NRDA_Reconnection_SC_04_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_04_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_04_TC_04 action=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_04.class);
		action.clickOnSelectAction();
		action.selectActionForward();
		action.selectUser();
		
		NRDA_Reconnection_SC_04_TC_03 comment=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_03.class);
		comment.enterComment();
		
		NRDA_Reconnection_SC_04_TC_05 submit=PageFactory.initElements(driver, NRDA_Reconnection_SC_04_TC_05.class);
		submit.verifyuploadDocument();
		submit.clickOnSubmit();
	}
	
	
	
	
											//Meter Installation
	
	@Test(priority=1,dataProvider ="junior engineer",description="verify action page dashboard")
	public void NRDA_Reconnection_SC_06_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_06_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		actionpagedisplay.verifyDisplayList();
	}
	
	@Test(priority=2,dataProvider ="junior engineer",description="verify action value")
	public void NRDA_Reconnection_SC_06_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_06_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_06_TC_02 actionvalue=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_02.class);
		actionvalue.clickOnSelectAction();
		actionvalue.verifySectionActionValue();
		actionvalue.verifyDisplayList();
	}
	
	@Test(priority=3,dataProvider ="junior engineer",description="verify save as draft")
	public void NRDA_Reconnection_SC_06_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_06_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_06_TC_05 draft=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_05.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	
	@Test(priority=4,dataProvider ="junior engineer",description="verify remove draft")
	public void NRDA_Reconnection_SC_06_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_06_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_06_TC_06 removedraft=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_06.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
	}
	
	@Test(priority=5,dataProvider ="junior engineer",description="verify close")
	public void NRDA_Reconnection_SC_06_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_06_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_06_TC_07 close=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_07.class);
		close.clickOnClose();
	}
	
	@Test(priority=6,dataProvider ="junior engineer",description="verify submit")
	public void NRDA_Reconnection_SC_06_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsJE(username, password);

		NRDA_Reconnection_SC_06_TC_01 actionpagedisplay=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_01.class);
		actionpagedisplay.clickOnPublicHealthAndEng();
		actionpagedisplay.clickOnReconnection();
		actionpagedisplay.enterApplicationNum();
		actionpagedisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_06_TC_02 actionvalue=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_02.class);
		actionvalue.clickOnSelectAction();
		
		NRDA_Reconnection_SC_06_TC_03 submit=PageFactory.initElements(driver, NRDA_Reconnection_SC_06_TC_03.class);
		submit.selectActionForwardConnection();
		submit.selectUser();
		submit.enterComment();
		submit.verifyuploadDocument();
		submit.clickOnSubmit();
	}
	
}
