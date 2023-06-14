package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Hoverpage extends Pagebase {

	public Hoverpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath ="/html/body/div[6]/div[2]/ul[1]/li[3]/a")
	WebElement Apeal;
	
	@FindBy(xpath ="/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[2]")
	WebElement clothing;
	
	@FindBy(css ="h1")
	public WebElement successhover;
	
	public void hoverpage()
	{
		Actions action = new Actions(driver);
		action.moveToElement(Apeal).moveToElement(clothing).click().build().perform();
		
	}
	
}
