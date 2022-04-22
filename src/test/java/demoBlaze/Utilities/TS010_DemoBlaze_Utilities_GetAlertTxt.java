package demoBlaze.Utilities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TS010_DemoBlaze_Utilities_GetAlertTxt {

	public WebDriverWait waitAlert(WebDriver webDriver, WebDriverWait webDriverWait) {
   		webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(20));
   		webDriverWait.until(ExpectedConditions.alertIsPresent());
		return webDriverWait;
	}
	
	public String getAlertText(WebDriver webDriver) {
		String strAlertTxt = null;
		waitAlert(webDriver, null);
		Alert alertMsg = webDriver.switchTo().alert();
		strAlertTxt = webDriver.switchTo().alert().getText();
		alertMsg.accept();
		return strAlertTxt;
	}
}
