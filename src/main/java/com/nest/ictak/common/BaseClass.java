package com.nest.ictak.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public static Properties properties;
	public static WebDriver driver;
	
	public BaseClass() throws IOException {
		// TODO Auto-generated constructor stub
		
		//Accessing the properties from config file
		properties = new Properties();
		FileInputStream dataFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		properties.load(new InputStreamReader(dataFile,Charset.forName("UTF-8")));
	}

	public static WebDriver getDriver() {
		return driver; 
	}

	public static void setDriver(WebDriver driver) {
		BaseClass.driver = driver;
	}
	
	//Initializing driver
	@BeforeTest
	public void openDriver()
	{
		if(properties.getProperty("browser").equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(properties.getProperty("browser").equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(properties.getProperty("browser").equals("edge"))
		{
			driver = new EdgeDriver();
		}
		getDriver().get(properties.getProperty("url"));
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
}
