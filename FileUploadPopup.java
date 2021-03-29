package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
       
	public static void main(String []args) throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("http://html.com/input-type-file");
		  
		  driver.findElement(By.xpath(".//*[@id='fileupload']")).sendKeys("C:/Users/SG0303261/Desktop/NoAuditdataAvailable.png");
	
	
	
	
	
	
	
	
   }

}