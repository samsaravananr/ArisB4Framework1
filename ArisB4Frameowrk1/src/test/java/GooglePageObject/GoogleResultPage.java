package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleResultPage 
{
	
	public WebDriver myD;

	public GoogleResultPage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}
	
	
	By ResultText=By.id("result-stats");
	
	
	public WebElement FResultStat()
	{
		return myD.findElement(ResultText);
	}
	
	

}
