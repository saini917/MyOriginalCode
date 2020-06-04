package NRDA_MeterTesting;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_01_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Populated names".
	 * @author deepak.saini
	 * @since 2018-03-22
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td[1]/../following-sibling::tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private List<WebElement> list;
	
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/../../../following-sibling::td/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement list1;
	
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/../../../following-sibling::td/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")
	private WebElement list2;
	

	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/../../../following-sibling::td/table/tbody/tr/td[2]/table/tbody/tr/td/select")
	private WebElement list3;
	
	public void namePopulated() throws InterruptedException
	{	
		for(WebElement li:list)
		{
			Assert.assertTrue(li.isDisplayed());
			HighlightOnElement(li);
		}
		
			Assert.assertTrue(list1.isDisplayed());
			HighlightOnElement(list1);
			
			Assert.assertTrue(list2.isDisplayed());
			HighlightOnElement(list2);
			
			Assert.assertTrue(list3.isDisplayed());
			HighlightOnElement(list3);
	}
}
