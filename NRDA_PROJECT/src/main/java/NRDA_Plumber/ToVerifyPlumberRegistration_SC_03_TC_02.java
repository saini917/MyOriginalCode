package NRDA_Plumber;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPlumberRegistration_SC_03_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Submit".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[3]/center/table/tbody/tr/td/span/button/span[contains(text(),'Submit')]")
	private WebElement submit;


}
