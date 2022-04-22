package demoBlaze.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TS008_DemoBlaze_Utilities_GetElement extends TS009_DemoBlaze_Utilities_WebDriverWait{

	public WebElement getElement(WebDriver webDriver, String strXpath, WebElement webElement) {
		webDriverWait(webDriver, strXpath, null);
		webElement = webDriver.findElement(By.xpath(strXpath));
		return webElement;
	}
}
