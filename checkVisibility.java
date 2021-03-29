package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkVisibility {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
		
		driver.get("https://rally1.rallydev.com/slm/login.op?logout=true");
		boolean b1=driver.findElement(By.id("login-button")).isDisplayed();
		System.out.println(b1);
        
		driver.findElement(By.id("j_username")).sendKeys("neha.gupta.ctr@sabre.com");
		driver.findElement(By.id("j_password")).sendKeys("Inter99net");
		boolean b2=driver.findElement(By.id("login-button")).isEnabled();
		System.out.println(b2);
		//just an example to use isSelected
		boolean b3=driver.findElement(By.name("Agree Terms")).isSelected();// only used with radio, checkbox,dropdown
		System.out.println(b3);
	}

}
