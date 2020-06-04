package NRDA_LAND_MUTUAL_TRANSFER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC007_TC032 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "mutual letter".
 * @author deepak.saini
 * @since 2018-06-05
 */
/*****************************************************************************************************/
@FindBy(xpath="//button/descendant::span[contains(text(),'Mutual Letter')]")
private WebElement mutualletter;

public void clickOnMutualLetter(){
	wait.until(ExpectedConditions.visibilityOf(mutualletter));
	Assert.assertTrue(mutualletter.isDisplayed());
	HighlightOnElement(mutualletter);
	Assert.assertTrue(mutualletter.isEnabled());
	wait.until(ExpectedConditions.elementToBeClickable(mutualletter));
	mutualletter.click();
	waitForDomElement();
}

}
