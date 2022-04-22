package demoBlaze.Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TS011_DemoBlaze_Utilities_ValidateAlertTxt extends TS010_DemoBlaze_Utilities_GetAlertTxt{

	public void validateAlertText(WebDriver webDriver, String strAlertTxt) {
		String strVal = getAlertText(webDriver);
		if (strAlertTxt.equals(strVal)) {
			System.out.println("The Alert Message is matching " + "\n" + "Alert Message to Validate : " +strAlertTxt + "\n"
					+ "Message Returned from Alert: " +strVal);
			Assert.assertTrue(strAlertTxt.equals(strVal));
		} else {
			System.out.println("The Alert Message is not matching " + "\n" + "Alert Message to Validate : " +strAlertTxt + "\n"
					+ "Message Returned from Alert: " +strVal);
			Assert.assertTrue(strAlertTxt.equals(strVal));
		}
	}
}