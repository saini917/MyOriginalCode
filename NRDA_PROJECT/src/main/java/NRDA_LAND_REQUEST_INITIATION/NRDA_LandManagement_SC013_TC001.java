package NRDA_LAND_REQUEST_INITIATION;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC013_TC001 extends CommonLibrary
{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " note sheet".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Note Sheet')]")
	private WebElement notesheet;
	
	public void verifyNoteSheet()
	{
		wait.until(ExpectedConditions.visibilityOf(notesheet));
		Assert.assertTrue(notesheet.isDisplayed());
		HighlightOnElement(notesheet);
	}
	
	@FindBy(xpath="//div[@class='name-date-wrapper']/label")
	private List<WebElement> display;
	
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[2]/div/div/label")
	private List<WebElement> display1;
	
	@FindBy(xpath="//div[@class='document-num']/a")
	private WebElement display2;
	
	@FindBy(xpath="//div[contains(text(),'request submit to AM')]")
	private WebElement display3;
	
	public void verifyDisplay()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		for(WebElement list:display1)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		Assert.assertTrue(display2.isDisplayed());
		HighlightOnElement(display2);
		
		Assert.assertTrue(display3.isDisplayed());
		HighlightOnElement(display3);
	}


}
