package GoogleTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import GooglePageObject.GoogleHomePage;
import GooglePageObject.GoogleResultPage;

public class TS002 extends Base 
{
	
	
	@Test
	public void STEP01() throws IOException, InterruptedException
	{
		myD=BrowserCall();
		myD.get(properties.getProperty("URL"));
		myD.manage().window().maximize();
		Thread.sleep(4000);
		
		//Enter the search data
		GoogleHomePage GHP=new GoogleHomePage(myD);
		GHP.FSearchBox().sendKeys("Aris Global");
		Thread.sleep(2000);
		GHP.FSearchButton().click();
		Thread.sleep(2000);
		
		
		//Capture the Result Statistics
		GoogleResultPage GRP=new GoogleResultPage(myD);
		String vRes=GRP.FResultStat().getText();
		System.out.println(vRes);
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.close();
	}
	
	
	
	
	
	

}
