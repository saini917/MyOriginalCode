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
public class LoginAsEE extends URLPageWSNRDAScript
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	String filepath="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\NRDA_TESTDATA.xlsx";

	/*@AfterMethod 
	public void logoutWS() throws InterruptedException
	{
		WebElement web1=driver.findElement(By.xpath("//a[@class='dropdown-toggle' and@role='button']/span"));
		Actions action = new Actions(driver);
		action.moveToElement(web1).build().perform();
		waitForSomeTime();

		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();

	}*/
	@DataProvider(name="Executive engineer")
	public String[][] getExcelData() throws InvalidFormatException, IOException
	{
		return exceldata.getCellData(filepath,"Executive Engineer Credentials");
	}
	
	@Test(priority=1,dataProvider ="Executive engineer",description="dashboard")
	public void NRDA_Reconnection_SC_05_TC_01(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_01 dashboard=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_01.class);
		dashboard.verifyDisplayLink();
		dashboard.verifyStatisticsDisplayLink();
	}
	
	@Test(priority=2,dataProvider ="Executive engineer",description="verify public health and engineering display")
	public void NRDA_Reconnection_SC_05_TC_02(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		dispaly.verifyDisplayLink();
	}
	
	@Test(priority=3,dataProvider ="Executive engineer",description="verify reconnection display")
	public void NRDA_Reconnection_SC_05_TC_03(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		dispalys.verifyDisp();
	}
	

	@Test(priority=4,dataProvider ="Executive engineer",description="verify action page display")
	public void NRDA_Reconnection_SC_05_TC_04(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		
		NRDA_Reconnection_SC_05_TC_04 actiondispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_04.class);
		actiondispalys.enterApplicationNum();
		actiondispalys.clickOnActionImg();
		actiondispalys.verifyDisplayList();
	}
	
	@Test(priority=5,dataProvider ="Executive engineer",description="verify action value")
	public void NRDA_Reconnection_SC_05_TC_05(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		
		NRDA_Reconnection_SC_05_TC_04 actiondispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_04.class);
		actiondispalys.enterApplicationNum();
		actiondispalys.clickOnActionImg();
		
		NRDA_Reconnection_SC_05_TC_05 actionvalue=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_05.class);
		actionvalue.clickOnSelectAction();
		actionvalue.verifySectionActionValue();
	}
	
	@Test(priority=6,dataProvider ="Executive engineer",description="verify save as draft")
	public void NRDA_Reconnection_SC_05_TC_09(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		
		NRDA_Reconnection_SC_05_TC_04 actiondispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_04.class);
		actiondispalys.enterApplicationNum();
		actiondispalys.clickOnActionImg();
		
		NRDA_Reconnection_SC_05_TC_09 draft=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_09.class);
		draft.clickOnSaveAsDraft();
		draft.verifyMessage();
	}
	
	@Test(priority=7,dataProvider ="Executive engineer",description="verify remove draft")
	public void NRDA_Reconnection_SC_05_TC_10(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		
		NRDA_Reconnection_SC_05_TC_04 actiondispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_04.class);
		actiondispalys.enterApplicationNum();
		actiondispalys.clickOnActionImg();
		
		NRDA_Reconnection_SC_05_TC_10 removedraft=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_10.class);
		removedraft.clickOnRemoveDraft();
		removedraft.verifyMessage();
	}
	
	@Test(priority=8,dataProvider ="Executive engineer",description="verify close")
	public void NRDA_Reconnection_SC_05_TC_11(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		
		NRDA_Reconnection_SC_05_TC_04 actiondispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_04.class);
		actiondispalys.enterApplicationNum();
		actiondispalys.clickOnActionImg();
		
		NRDA_Reconnection_SC_05_TC_11 close=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_11.class);
		close.clickOnClose();
	}
	
	@Test(priority=9,dataProvider ="Executive engineer",description="verify submit")
	public void NRDA_Reconnection_SC_05_TC_06(String username,String password) throws InterruptedException, Throwable, InvalidFormatException, IOException
	{
		WaterAndSewerageLoginPage login_as_EE=PageFactory.initElements(driver,WaterAndSewerageLoginPage.class);
		login_as_EE.loginAsEE(username, password);
		
		NRDA_Reconnection_SC_05_TC_02 dispaly=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_02.class);
		dispaly.clickOnPublicHealthAndEng();
		
		NRDA_Reconnection_SC_05_TC_03 dispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_03.class);
		dispalys.clickOnReconnection();
		
		NRDA_Reconnection_SC_05_TC_04 actiondispalys=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_04.class);
		actiondispalys.enterApplicationNum();
		actiondispalys.clickOnActionImg();
		
		NRDA_Reconnection_SC_05_TC_05 actionvalue=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_05.class);
		actionvalue.clickOnSelectAction();
		
		NRDA_Reconnection_SC_05_TC_06 actionuser=PageFactory.initElements(driver,NRDA_Reconnection_SC_05_TC_06.class);
		actionuser.selectUser();
		actionuser.enterComment();
		actionuser.verifyuploadDocument();
		actionuser.clickOnSubmit();
	}

}
