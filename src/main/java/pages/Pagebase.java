package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {
	
 	public	WebDriver driver;
 	public JavascriptExecutor jse;
 	public Actions actions;
	
	public  Pagebase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void press(WebElement ele)
	{
		ele.click();
	}
	
	public void write(WebElement ele,String txt)
	{
		ele.sendKeys(txt);
	}
	
	public void scroll()
	{
		//jse.executeScript("window.ScrollBy(0,5000)","");
		WebElement contact = driver.findElement(By.linkText("Contact us"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", contact);
	}


	


	
}
