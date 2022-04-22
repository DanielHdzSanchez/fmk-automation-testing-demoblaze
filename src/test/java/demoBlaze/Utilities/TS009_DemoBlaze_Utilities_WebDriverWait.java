package demoBlaze.Utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TS009_DemoBlaze_Utilities_WebDriverWait {

	public WebDriverWait webDriverWait(WebDriver webDriver, String strXpath, WebDriverWait webDriverWait) {
		webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(strXpath)));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath(strXpath)));
		return webDriverWait;
	}
	
}
