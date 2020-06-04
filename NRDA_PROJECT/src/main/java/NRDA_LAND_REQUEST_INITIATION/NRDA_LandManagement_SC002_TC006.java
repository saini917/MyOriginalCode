package NRDA_LAND_REQUEST_INITIATION;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC006 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land request initiation".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[@class='c1']/span[contains(text(),'LAND REQUEST INITIATION PROCESS')]")
	private WebElement land_req_initiation;
	
	public void verifyLandReqInitiation()
	{
		Assert.assertTrue(land_req_initiation.isDisplayed());
		HighlightOnElement(land_req_initiation);
	}

}
