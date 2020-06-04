package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC009 extends CommonLibrary{
	
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "pagination forward ".
 * @author deepak.saini
 * @since 2018-04-17
 */
/*****************************************************************************************************/

@FindBy(xpath=".//*[@id='inboxForm:j_id1583889823_159c1e7f:serviceWisedata_paginator_bottom']/span[5]/span")
private WebElement forward;

public void clickOnForward() throws InterruptedException{
	wait.until(ExpectedConditions.visibilityOf(forward));
	Assert.assertTrue(forward.isDisplayed());
	HighlightOnElement(forward);
	Assert.assertTrue(forward.isEnabled());
	if(!forward.isEnabled())
	{
		Reporter.log("Test case fail",true);
	}
	else
	{
		wait.until(ExpectedConditions.elementToBeClickable(forward));
		Actions act=new Actions(driver);
		act.click(forward).build().perform();
		waitForDomElement();
	}
}

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "pagination forward page 2".
 * @author deepak.saini
 * @since 2018-04-17
 */
/*****************************************************************************************************/

@FindBy(xpath=".//*[@id='inboxForm:j_id1583889823_159c1e7f:serviceWisedata_paginator_bottom']/span[1]/span")
private WebElement backward;

public void clickOnBackward() throws InterruptedException{
	wait.until(ExpectedConditions.visibilityOf(backward));
	Assert.assertTrue(backward.isDisplayed());
	HighlightOnElement(backward);
	Assert.assertTrue(backward.isEnabled());
	
	if(!backward.isEnabled())
	{
		Reporter.log("Test case fail",true);
	}
	else
	{
		wait.until(ExpectedConditions.elementToBeClickable(backward));
		Actions act=new Actions(driver);
		act.click(backward).build().perform();
		waitForDomElement();
		Reporter.log("Test case pass",true);
	}
}

}
