package GoogleTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Base 
{
	
	Properties	properties;
	FileInputStream fis;
	WebDriver myD;
	String vBrowser;
	
	public WebDriver BrowserCall() throws IOException
	{	
	properties=new Properties();
	fis=new FileInputStream("C:\\Users\\SARAVANAN R\\Mobile4\\ArisB4Frameowrk1\\Data.properties");
	properties.load(fis);
	vBrowser=properties.getProperty("Browser");
	
	if(vBrowser.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
		myD=new ChromeDriver();
	}
	else if(vBrowser.equalsIgnoreCase("Edge"))
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\msedgedriver.exe");
		myD=new EdgeDriver();	
	}
	else
	{
		System.out.println("Invalid Browser");
	}
	return myD;
	
	
		
	}
	
	
	

}
