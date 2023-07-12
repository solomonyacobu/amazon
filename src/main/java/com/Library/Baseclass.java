package com.Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public WebDriver driver;
	public Properties prop;
	
	

	public void LaunchApp() throws InterruptedException, IOException {
		
	
		
		
		
		FileInputStream input=new FileInputStream("src/test/resources/Properties/amazon.properties");
		prop=new Properties();
		prop.load(input);
		
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("edgedriver"))
	{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(prop.getProperty("url1"));
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}
		public void teardown() {
			driver.close();
			
		}

	}


