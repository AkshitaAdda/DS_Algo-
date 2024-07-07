package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties properties;

	public ConfigReader() {
		if(properties==null) {
			properties = new Properties();
			try {
				FileInputStream input = new FileInputStream("src/test/resources/Config/config.properties");
				properties.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public  String getHomePage() {
		return properties.getProperty("appURL");
	}

	public static  String getLoginPage() {
		return properties.getProperty("username,password");

	}
	public  String getbrowsername() {
		return properties.getProperty("browser");

	}

}
