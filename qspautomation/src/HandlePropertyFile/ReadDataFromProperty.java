package HandlePropertyFile;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	public static String main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty("browser");
		return value;
		
	}

}
