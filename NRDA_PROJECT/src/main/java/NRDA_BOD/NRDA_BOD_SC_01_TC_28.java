package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_28 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "forward to section".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Section Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/div/div/span")
	private WebElement sectionname;
	
	@FindBy(xpath="//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li/label")
	private List<WebElement> value;
	
	public void clickOnSectionName() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(sectionname));
		wait.until(ExpectedConditions.elementToBeClickable(sectionname));
		Assert.assertTrue(sectionname.isDisplayed());
		HighlightOnElement(sectionname);
		Assert.assertTrue(sectionname.isEnabled());
		sectionname.click();
		waitForSomeTime();
		
		for(WebElement ele:value)
		{
			Assert.assertTrue(ele.isDisplayed());
			String list=ele.getText();
			if(list.equalsIgnoreCase("Public Health and Engineering"))
			{
				HighlightOnElement(ele);
				ele.click();
				waitForSomeTime();
				Reporter.log("dropdown box is get selected with water and sewerage",true);
			}
		}
	}
	

}
