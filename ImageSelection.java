package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
public class ImageSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
//		driver.get("https://www.guru99.com/api-testing.html");
//		driver.findElement(By.cssSelector("a[title=\"Guru99\"]")).click();
		
		
		
		
	        String baseUrl = "http://demo.guru99.com/test/newtours/";
	        
	                driver.get(baseUrl);           
	                WebElement link_Home = driver.findElement(By.linkText("Home"));
	                WebElement td_Home = driver
	                        .findElement(By
	                        .xpath("//html/body/div"
	                        + "/table/tbody/tr/td"
	                        + "/table/tbody/tr/td"
	                        + "/table/tbody/tr/td"
	                        + "/table/tbody/tr"));    
	                 
	                Actions builder = new Actions(driver);
	                Action mouseOverHome = builder
	                        .moveToElement(link_Home)
	                        .build();
	                 
	                String bgColor = td_Home.getCssValue("background-color");
	                System.out.println("Before hover: " + bgColor);        
	                mouseOverHome.perform();        
	                bgColor = td_Home.getCssValue("background-color");
	                System.out.println("After hover: " + bgColor);
	               
	        }
	

	}


