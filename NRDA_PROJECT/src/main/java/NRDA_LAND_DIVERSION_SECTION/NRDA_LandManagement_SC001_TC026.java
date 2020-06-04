package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC026 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,500);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Update')]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException
	{
		switchFrameToMainWindow();
		update(update);
		
	}

}
