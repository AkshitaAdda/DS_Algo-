package driverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class ConfigDriver {
	
	public static  WebDriver driver=null;

	public static WebDriver getBrowser() {
		try {
			ConfigReader cfgreader=new ConfigReader();
			String browserName=cfgreader.getbrowsername();
		
			switch (browserName.toLowerCase()) {
			
			case "chrome":
				WebDriverManager.chromedriver().setup();
				if(driver==null)
					   driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				if(driver==null)
					   driver=new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				if(driver==null)
					   driver=new EdgeDriver();
				break;
			case "safari":
				WebDriverManager.safaridriver().setup();
				if(driver==null)
					   driver=new SafariDriver();
				break;

			default:
				throw new IllegalArgumentException("Unsupported browser: " + browserName);
		
			}
			return driver;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
		return driver;
	  
		
	}
	public void closeallDriver() {
		driver.close();
	}

}
