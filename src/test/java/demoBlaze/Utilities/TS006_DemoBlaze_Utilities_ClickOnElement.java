package demoBlaze.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TS006_DemoBlaze_Utilities_ClickOnElement extends TS009_DemoBlaze_Utilities_WebDriverWait{

	public void clickOnElement(WebDriver webDriver, String strXpath) {
		webDriverWait(webDriver, strXpath, null);
		WebElement webElement = webDriver.findElement(By.xpath(strXpath));
		webElement.click();
	}
	
}
