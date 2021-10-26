package GoogleTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import GooglePageObject.GoogleHomePage;
import GooglePageObject.GoogleResultPage;


public class TS003 extends Base 
{
	
	@Test
	public void STEP02() throws IOException, InterruptedException
	{
		
		myD=BrowserCall();
		myD.get(properties.getProperty("URL"));
//		myD.manage().window().maximize();
		Thread.sleep(4000);
		Assert.assertEquals(properties.getProperty("ExpectedTitle"), myD.getTitle());
		System.out.println("End of Test");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.manage().deleteAllCookies();
		myD.close();
		
		
	}
	
	

}
