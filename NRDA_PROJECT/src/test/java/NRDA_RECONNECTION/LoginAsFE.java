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
public class LoginAsFE extends URLPageWSNRDAScript
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
		driver.close();
		waitForSomeTime();
	}
	@DataProvider(name="Field engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Field Engineer Credentials");
	}

	@Test(priority=1,dataProvider ="Field engineer",description="verify dashboard")
	public void NRDA_Reconnection_SC_03_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);
		
		NRDA_Reconnection_SC_03_TC_01 dashboard=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_01.class);
		dashboard.verifyDisplayLink();
		dashboard.verifyStatisticsDisplayLink();
	}


	@Test(priority=2,description="verify public health and engineering dipslay",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		display.verifyDisplayLink();
	}
	
	@Test(priority=3,description="verify Reconnection dipslay",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		reconnectiondisplay.verifyDisp();
	}
	
	@Test(priority=4,description="verify action page dipslay",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		actiondisplay.verifyDisplayList();
	}
	
	@Test(priority=5,description="verify action user",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_05 actionuser=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_05.class);
		actionuser.clickOnSelectAction();
		actionuser.verifySectionActionValue();
	}
	
	@Test(priority=6,description="blank action user",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_06 blankaction=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_06.class);
		blankaction.enterComment();
		blankaction.clickOnSubmit();
		blankaction.getErrormsg();
	}
	
	@Test(priority=7,description="blank comment",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_07(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_05 actionuser=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_05.class);
		actionuser.clickOnSelectAction();
		
		NRDA_Reconnection_SC_03_TC_07 user=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_07.class);
		user.selectActionUser();
		user.clickOnSubmit();
		user.getErrorMsg();
	}
	
	@Test(priority=8,description="save as draft",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_10 draft=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_10.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}

	@Test(priority=9,description="remove draft",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_11 removedraft=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_11.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
	}
	
	@Test(priority=10,description="close",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_12(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_12 close=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_12.class);
		close.clickOnClose();
	}
	
	@Test(priority=11,description="submit",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_03_TC_08(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_03_TC_02 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_02.class);
		display.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_03_TC_03 reconnectiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_03.class);
		reconnectiondisplay.clickOnReconnection();
		
		NRDA_Reconnection_SC_03_TC_04 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_04.class);
		actiondisplay.enterApplicationNum();
		actiondisplay.clickOnActionImg();
		
		NRDA_Reconnection_SC_03_TC_05 actionuser=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_05.class);
		actionuser.clickOnSelectAction();
		
		NRDA_Reconnection_SC_03_TC_07 user=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_07.class);
		user.selectActionUser();
		
		NRDA_Reconnection_SC_03_TC_06 blankaction=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_06.class);
		blankaction.enterComment();
		
		NRDA_Reconnection_SC_03_TC_08 submit=PageFactory.initElements(driver,NRDA_Reconnection_SC_03_TC_08.class);
		submit.verifyuploadDocument();
		submit.clickOnSubmit();
	}
	
	
	
										// Meter installation
	
	@Test(priority=1,description="verify action page dipslay",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_07_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_07_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_01.class);
		display.clickOnPublicHealthAndEng();
		display.clickOnReconnection();
		display.enterApplicationNum();
		display.clickOnActionImg();
		display.verifyDisplayList();
	}
	
	@Test(priority=2,description="verify action value",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_07_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_07_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_01.class);
		display.clickOnPublicHealthAndEng();
		display.clickOnReconnection();
		display.enterApplicationNum();
		display.clickOnActionImg();
		
		NRDA_Reconnection_SC_07_TC_02 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_02.class);
		actiondisplay.clickOnSelectAction();
		actiondisplay.verifySectionActionValue();
		
	}
	
	@Test(priority=3,description="verify save as draft",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_07_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_07_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_01.class);
		display.clickOnPublicHealthAndEng();
		display.clickOnReconnection();
		display.enterApplicationNum();
		display.clickOnActionImg();
		
		NRDA_Reconnection_SC_07_TC_04 saveasdraft=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_04.class);
		saveasdraft.clickOnSaveAsDraft();
		saveasdraft.verifyMessage();
	}
	
	@Test(priority=4,description="verify remove draft",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_07_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_07_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_01.class);
		display.clickOnPublicHealthAndEng();
		display.clickOnReconnection();
		display.enterApplicationNum();
		display.clickOnActionImg();
		
		NRDA_Reconnection_SC_07_TC_05 removedraft=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_05.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
		
	}
	
	@Test(priority=5,description="verify close",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_07_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_07_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_01.class);
		display.clickOnPublicHealthAndEng();
		display.clickOnReconnection();
		display.enterApplicationNum();
		display.clickOnActionImg();
		
		NRDA_Reconnection_SC_07_TC_06 close=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_06.class);
		close.clickOnClose();
}
	
	@Test(priority=5,description="verify submit",dataProvider ="Field engineer")
	public void NRDA_Reconnection_SC_07_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage logina_citizen=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		logina_citizen.loginAsFE(username, password);

		NRDA_Reconnection_SC_07_TC_01 display=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_01.class);
		display.clickOnPublicHealthAndEng();
		display.clickOnReconnection();
		display.enterApplicationNum();
		display.clickOnActionImg();
		
		NRDA_Reconnection_SC_07_TC_02 actiondisplay=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_02.class);
		actiondisplay.clickOnSelectAction();
		
		NRDA_Reconnection_SC_07_TC_03 submit=PageFactory.initElements(driver,NRDA_Reconnection_SC_07_TC_03.class);
		submit.selectCompletedInstallation();
		submit.enterComment();
		submit.verifyuploadDocument();
		submit.clickOnSubmit();
	}
	
	
}
