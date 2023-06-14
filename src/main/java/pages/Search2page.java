package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search2page extends Pagebase {

	public Search2page(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(id ="small-searchterms")
	WebElement searchtxt;
	
	
	
	public void userchooselist(String product) throws InterruptedException
	{
		write(searchtxt,product);
		Thread.sleep(3000);
		
		List <WebElement> li = driver.findElements(By.id("ui-id-1"));
		li.get(0).click();
	}
	
}
