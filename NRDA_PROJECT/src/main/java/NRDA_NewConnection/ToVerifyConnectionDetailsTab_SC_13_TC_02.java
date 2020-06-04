package NRDA_NewConnection;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_13_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "ALL ROWS".
	 * @author deepak.saini
	 * @since 2018-01-09
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr")
	private List<WebElement> allrows;

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/span[@class='ui-paginator-pages']/span")
	private List<WebElement> allpages;

	public void clickOnHyperLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String application_num=excel.getExcelData1("Customer ID",0,1);
		try
		{
			boolean check = true;
			for(int i=1; i<=(allpages.size()); i++)
			{
				for(int row=1; row<=allrows.size(); row++)
				{
					//Reporter.log("Total rows :" +allrows.size(),true); 
					String name = driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[3]/center/a")).getText();
					if(name.equals(application_num))
					{
						WebElement ApplicationNumber = driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[3]/center/a"));
						Reporter.log(name,true);
						ApplicationNumber.click();
						waitForSomeTime();
						check = false;
						break;
					}
				}
				if(check)
				{
					allpages.get(i).click();
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Reporter.log("Click on 'Application number' hyperlink",true);
	}
}
