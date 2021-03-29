package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
	    //chrome Browser
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// open url , both url opens one after another in same window
		//driver.get("http://www.google.com");
//		driver.get("http://www.facebook.com");
//		String title= driver.getTitle();
//		System.out.println(title);
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7908977423");
//		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("nehagupta");
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//        List <WebElement> linkList=driver.findElements(By.tagName("a")); // to find all links
//        System.out.println(linkList.size());
        
        //driver.close();
		
		//WebDriver driver = new ChromeDriver();					

       // driver.get("http://demo.guru99.com/test/radio.html");					
//        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
//        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));							
       		
        
        driver.get("http://demo.guru99.com/test/facebook.html");					
        WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
        }		
		//driver.close();		
        		
    }		
        		
   	
	

}
