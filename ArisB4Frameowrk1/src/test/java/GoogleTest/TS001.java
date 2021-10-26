package GoogleTest;

import java.io.IOException;

import org.testng.annotations.Test;

public class TS001 extends Base 
{
	
	
	@Test
	public void STEP01() throws IOException, InterruptedException
	{
		myD=BrowserCall();
		myD.get(properties.getProperty("URL"));
		myD.manage().window().maximize();
		Thread.sleep(4000);
		myD.close();
	}
	

}
