package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
    static WebDriver driver;
    public static void main(String[]args) throws IOException {
    	
    	//create Properties object
    	Properties prop= new Properties();
    	
    	
    	//create FileInputStream object, this is to establish connection b/w java code and property file
    	FileInputStream ip= new FileInputStream ("C:/Users/SG0303261/eclipse-workspace/SeleniumProject/src/SeleniumSessions/config.properties");
    	
    	//load property file using Properties object
    	prop.load(ip);
    	
    	System.out.println(prop.getProperty("name"));
    	System.out.println(prop.getProperty("URL"));
    	
    	String browserName= prop.getProperty("browser");
    	
		if(browserName.equals("chrome"))
    	{
    	System.setProperty("webdriver.chrome.driver","C:/Users/SG0303261/Downloads/chromedriver_win32/chromedriver.exe");
        driver= new ChromeDriver();
    	
    	
    	}
    	else {
    	 System.out.println("Driver doesnot exist");	
    	
    	}
		driver.get(prop.getProperty("URL"));
    }
}
