package demoBlaze.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TS000_DemoBlaze_Base_TestConfig {

	/* Definition of the variables and URL constant 
	 * used for the test cases in the AOS project.*/
	protected WebDriver webDriver;
	static private String URL = "https://www.demoblaze.com/index.html"; 
	protected String [][] strData;
	
	/* Setup of the test. The driver is set up,
	 * the window maximized and a WebDriverWeb object
	 * is instanced for it to be used in the test cases.*/
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		String strFlags [] = {
				"--start-maximized"
			};
			
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments(strFlags);
		webDriver = new ChromeDriver(chromeOptions);
	}
	
	/* Before every method, we go back to the original URL
	 * in case there are 2 or more test cases contained in one class.*/
	@BeforeMethod
	public void confiureMethod() {
		webDriver.get(URL);
	}
	
	/* Just a heads up in the terminal telling that
	 * a test case has been executed.*/
	@AfterMethod
	public void tearDownMethod() {
		System.err.println("Method finished.");
	}
	
	
	/* After everything was executed, the driver is closed.*/
	@AfterClass
	public void tearDown() {
		webDriver.quit();
	}

}
