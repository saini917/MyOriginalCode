package NRDA_BOD;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_03_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Add/Update Agenda')]/../../following-sibling::div/div/div/div/center)[1]/button/span")
	private WebElement addagenda;
	
	public void clickOnAddAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addagenda));
		wait.until(ExpectedConditions.elementToBeClickable(addagenda));
		Assert.assertTrue(addagenda.isDisplayed());
		HighlightOnElement(addagenda);
		Assert.assertTrue(addagenda.isEnabled());
		addagenda.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display list".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/span/label")
	private List<WebElement> display;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Agenda Button".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/button/span")
	private WebElement button;
	
	public void verifyDisplayList()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollTop = arguments[1];",driver.findElement(By.xpath("(//div[@id='inboxForm:aplRspDia']/div)[2]")), 400);
		Assert.assertTrue(button.isDisplayed());
		HighlightOnElement(button);
	}
		
}
