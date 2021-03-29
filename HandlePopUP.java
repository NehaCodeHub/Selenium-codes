package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUP {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		
		Set <String> handler= driver.getWindowHandles();
		
		Iterator<String> it=handler.iterator();
		String parentWindowId= it.next();
		System.out.println("Parent Window Id :"+ parentWindowId);
		
		String childWindowId= it.next();
		System.out.println("Child WindowId :"+ childWindowId);
		
		
		
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
				
		driver.switchTo().window(childWindowId);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
