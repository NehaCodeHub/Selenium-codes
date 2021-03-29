package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionConcept {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  
		  
		  driver.get("https://rally1.rallydev.com/slm/login.op?logout=true");
		  driver.findElement(By.id("j_username")).sendKeys("neha.gupta.ctr@sabre.com");
		  driver.findElement(By.id("j_password")).sendKeys("Inter99net");
			//driver.findElement(By.id("login-button")).click();
		  
		  //executeScript---to execute js code
		  WebElement loginbtn=driver.findElement(By.id("login-button"));
		  flash(loginbtn, driver);
		  drawBorder(loginbtn, driver);
		  
		  //take screeenshot
		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  // Now you can do whatever you need to do with it, for example copy somewhere
		  FileUtils.copyFile(scrFile, new File("C:/tmp/screenshot2.png"));
          
		  
		  //generate alert at run time
		  
		  //generateAlert(driver, "There is an issue with the login button");
		  
		  //clickElementByJS(loginbtn, driver);
		  
		  //refreshBreowser
		  
		  refreshBrowserByJS(driver);
		  
		// gettitle of page by JS
			
		   System.out.println(getTitleByJS(driver));
		
		     scrollPageDown(driver);
		  }
	     
	      
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String bgcolor= element.getCssValue("backgroundColor");
		for(int i=0;i< 100; i++) {
			changeColor("green",element, driver);
			changeColor(bgcolor,element,driver);
			
		}
	}	
	
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	
	     try {
	    	 Thread.sleep(20);
	     }
	     catch(InterruptedException e) {
	      }

      }
	
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border= '3px solid red'", element);
		
		
		
	}
	
	
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	
//	public static void clickElementByJS(WebDriver driver, String message) {
//		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].click();", element);	
//	}
	
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");	
	}
	
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	
}