package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.inetbanking.utilities.ReadConfig;

public class BasePage {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getApplicationURL();
	public String userID = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public String customerName = readconfig.getCusName();
	public String dateOfBirth = readconfig.getCusDoB();
	public String address = readconfig.getCusAddress();
	public String city = readconfig.getCusCity();
	public String state = readconfig.getCusState();
	public String pin = readconfig.getCusPin();
	public String mobileNumber = readconfig.getCusMobileNumber();
	public String eMail = readconfig.getCusEmail();
	public String cuPassword = readconfig.getCusPassword();
	public static WebDriver driver;
	public static Logger log = LogManager.getLogger("eBanking");

	// Git Hub Remote Repository link: https://github.com/shahin286/PageObjectModel.git
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		
		if (br.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (br.equals("edge")) {
			driver = new EdgeDriver();
		}
		else if (br.equals("safari")) {
			driver = new SafariDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(baseURL);
		log.info("Page URL is open");
		driver.manage().window().maximize();

	}

	
	@AfterClass
	public void tearDown() {
		driver.quit();
		log.info("Browser Closed");
	}
	
	
	public void captureScreenShot(WebDriver driver, String testCaseName) throws IOException  {
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		
		File target = new File(System.getProperty("user.dir")+"/screenshots/"+testCaseName+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot Taken");
	}
	
	public boolean isAlertPresent() {

		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {

		}
		return false;
	}

}



























