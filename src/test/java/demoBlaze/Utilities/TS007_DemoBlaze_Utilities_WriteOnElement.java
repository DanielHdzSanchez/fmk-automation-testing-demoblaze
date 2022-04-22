package demoBlaze.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TS007_DemoBlaze_Utilities_WriteOnElement extends TS009_DemoBlaze_Utilities_WebDriverWait{

	public void writeOnElement(WebDriver webDriver, String strXpath, String strTextValue) {
		webDriverWait(webDriver, strXpath, null);
		WebElement webElement = webDriver.findElement(By.xpath(strXpath));
		webElement.clear();
		webElement.sendKeys(strTextValue);
	}
}
