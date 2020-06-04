package NRDA_LAND_MUTUAL_TRANSFER;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC011 extends CommonLibrary{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " note sheet".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Note Sheet')]")
	private WebElement notesheet;
	
	public void verifyNoteSheet(){
		wait.until(ExpectedConditions.visibilityOf(notesheet));
		Assert.assertTrue(notesheet.isDisplayed());
		HighlightOnElement(notesheet);
	}
	
	@FindBy(xpath="//div[@class='name-date-wrapper']/label")
	private List<WebElement> display;
	
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[2]/div/div/label")
	private List<WebElement> display1;
	
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[3]/div/div/label")
	List<WebElement> display2;
	
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[4]/div/div/label")
	List<WebElement> display3;
	
	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[5]/div/div/label")
	List<WebElement> display31;
	
	@FindBy(xpath="//div[contains(text(),'APPLICATION FORWARD TO AM')]")
	private WebElement display4;
	
	@FindBy(xpath="//div[@class='note-sheet-wrapper-left']/div[contains(text(),'APPLICATION FORWARD TO LAND MANAGER')]")
	private WebElement display5;
	
	@FindBy(xpath="//div[@class='note-sheet-wrapper-left']/div[contains(text(),'APPLICATION FORWARD TO PLANNING SECTION')]")
	private WebElement display6;
	
	@FindBy(xpath="//div[@class='note-sheet-wrapper-left']/div[contains(text(),'APPLICATION FORWARD TO LEGAL SECTION')]")
	private WebElement display7;
	
	public void verifyDisplay(){
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
		
		for(WebElement list:display2)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		for(WebElement list:display3)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		for(WebElement list:display31)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		Assert.assertTrue(display4.isDisplayed());
		HighlightOnElement(display4);
		
		Assert.assertTrue(display5.isDisplayed());
		HighlightOnElement(display5);
		
		Assert.assertTrue(display6.isDisplayed());
		HighlightOnElement(display6);
		
		Assert.assertTrue(display7.isDisplayed());
		HighlightOnElement(display7);
	}

}
