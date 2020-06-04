package NRDA_NewConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_14_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	String readPDF="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile\\PaymentHistory";

	public void clickOnActionLink() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		boolean check=true;
		String application_num=excel.getExcelData1("Customer ID",0,1);
		List<WebElement> allpages=driver.findElements(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/span[@class='ui-paginator-pages']/span"));
		for(int i=1; i<=allpages.size();i++)
		{
			Reporter.log("Totak No Of Pages:"+allpages.size(),true);
			List<WebElement> allrows=driver.findElements(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr"));
			for(int row=1; row<=allrows.size(); row++)
			{
				Reporter.log("Total rows :" +allrows.size(),true); 
				String name = driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[2]/center/span")).getText();
		
					Reporter.log(name,true);
					if(name.equals(application_num
							))
					{
						Thread.sleep(5000);
						WebElement action = driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr["+row+"]/td[2]/center/span/../../following-sibling::td/center/a/img"));
						action.click();
						waitForSomeTime();
						File file=new File(readPDF);
						FileInputStream fis=new FileInputStream(file);
						PDFParser parser=new PDFParser(fis);
						parser.parse();
						COSDocument cosdoc=parser.getDocument();
						PDDocument pdDoc=new PDDocument(cosdoc);
						PDFTextStripper strip=new PDFTextStripper();
						@SuppressWarnings("unused")
						String data=strip.getText(pdDoc);
						Reporter.log(name,true);
						Thread.sleep(5000);
						Reporter.log("Element  exist",true);
						check=false;
						break;
					}
					else
					{
						Reporter.log("Element not exist",true);
					}
			}
			if(check)
			{
				driver.findElement(By.xpath("//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/span[@class='ui-paginator-pages']/span["+i+"]")).click();
				Thread.sleep(5000);
			}
		}
		Reporter.log("User should be able to download the receipt.",true);
	}
}



