package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SceenshotConcept {
	public static void main(String []args) throws InterruptedException, IOException{
		
	
		  System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		  
		  driver.get("http://www.google.com/");
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  // Now you can do whatever you need to do with it, for example copy somewhere
		  FileUtils.copyFile(scrFile, new File("C:/tmp/screenshot.png"));
		  
    }
}