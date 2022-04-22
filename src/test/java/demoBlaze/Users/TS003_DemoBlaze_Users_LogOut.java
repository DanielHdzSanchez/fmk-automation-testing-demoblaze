package demoBlaze.Users;

import org.testng.annotations.Test;

import demoBlaze.Base.TS000_DemoBlaze_Base_TestConfig;
import demoBlaze.Support.TS005_DemoBlaze_Support_ReadExcell;
import demoBlaze.Utilities.TS006_DemoBlaze_Utilities_ClickOnElement;
import demoBlaze.Utilities.TS007_DemoBlaze_Utilities_WriteOnElement;

public class TS003_DemoBlaze_Users_LogOut extends TS000_DemoBlaze_Base_TestConfig{

	//This Method execute the testing with all of the specified validations
    @Test(description="TC003_DemoBlaze_Users_LogOut")
	  public void testCase002LogOut() {
    	try {
    		TS005_DemoBlaze_Support_ReadExcell suppGetExcelData = new TS005_DemoBlaze_Support_ReadExcell();
    		TS006_DemoBlaze_Utilities_ClickOnElement utilClickElem = new TS006_DemoBlaze_Utilities_ClickOnElement();
    		TS007_DemoBlaze_Utilities_WriteOnElement utilWriteElem = new TS007_DemoBlaze_Utilities_WriteOnElement();
    		//TS011_DemoBlaze_Utilities_ValidateAlertTxt utilValAlert = new TS011_DemoBlaze_Utilities_ValidateAlertTxt();
    		strData = suppGetExcelData.readExcel();
    		
    		utilClickElem.clickOnElement(webDriver, "//a[@id='login2']");
    		utilWriteElem.writeOnElement(webDriver, "//input[@id='loginusername']", strData[1][0]);
    		utilWriteElem.writeOnElement(webDriver, "//input[@id='loginpassword']", strData[1][1]);
    		utilClickElem.clickOnElement(webDriver, "//button [(contains(text(),'Log in')) and @class='btn btn-primary']");
    		utilClickElem.clickOnElement(webDriver, "//a[@id='logout2']");
    		//utilValAlert.validateAlertText(webDriver, "Sign up successful.");
    		
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
