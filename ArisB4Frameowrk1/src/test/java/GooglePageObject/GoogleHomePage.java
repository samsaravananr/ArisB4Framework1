package GooglePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage 
{
	public WebDriver myD;

	public GoogleHomePage(WebDriver myD) 
	{
		super();
		this.myD = myD;
	}
	
	By SearchBox=By.name("q");
	By SearchButton=By.name("btnK");
	
	public WebElement FSearchBox()
	{
		return myD.findElement(SearchBox);
	}
	
	public WebElement FSearchButton()
	{
		return myD.findElement(SearchButton);
	}
	
	

}
