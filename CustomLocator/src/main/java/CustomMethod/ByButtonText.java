package CustomMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class ByButtonText {

	public static By buttonText(final String buttonText) {

		return new By() {

			@Override
			public List<WebElement> findElements(SearchContext sctext) {
				String xpath = "//button[contains(text(),'" + buttonText + "')]";
				List<WebElement> elements = sctext.findElements(By.xpath(xpath));
				return elements;
			}
		};

	}

	public static By buttonTitle(String title) {
		String xpath = "//input[@type='button'][@title='" + title + "']";

		// returned the xpath formed along with By Class
		return By.xpath(xpath);
	}
}
