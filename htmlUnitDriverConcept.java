package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;

public class htmlUnitDriverConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
		//WebDriver driver = new ChromeDriver(); // launch chrome
		
		WebDriver driver= new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
        
		driver.get("https://rally1.rallydev.com/slm/login.op?logout=true");
		driver.findElement(By.id("j_username")).sendKeys("neha.gupta.ctr@sabre.com");
		driver.findElement(By.id("j_password")).sendKeys("Inter99net");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.getTitle());
	}

}
