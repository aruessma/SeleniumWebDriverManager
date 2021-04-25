package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.WikipediaSearchTestNG_Demo;

public class PropertiesFile {

	private static String configFile = "/src/test/java/config/config.properties";
	private static String projectPath = System.getProperty("user.dir");
	private static String configPropBrowser = "browser";
	private static String configPropResult = "result";
	private static Properties prop = new Properties();

	public static void main(String[] args) {

		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() {

		try {

			System.out.println("getProperties, Properties file : " + projectPath + configFile);

			InputStream input = new FileInputStream(projectPath + configFile);

			try {
				prop.load(input);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String browser = prop.getProperty(configPropBrowser);
			System.out.println("getProperties, Browser is : " + browser);
			WikipediaSearchTestNG_Demo.browserName = browser;

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}



	}

	public static void setProperties() {

		try {
			OutputStream output = new FileOutputStream(projectPath + configFile);
			
			prop.setProperty(configPropResult, "pass");
			try {
				prop.store(output, null);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

}
