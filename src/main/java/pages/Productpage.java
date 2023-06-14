package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Productpage extends Pagebase {

	public Productpage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
	WebElement productdetails;
	
	@FindBy(css ="h1")
	public	WebElement Successsearch;
	
	@FindBy(css="button.button-1.add-to-cart-button")
	WebElement addtocart;
	
	public void userpressonproductdetails()
	{
	press(productdetails);	
	}
	public void pressonadd()
	{
	press(addtocart);
	driver.navigate().to("https://demo.nopcommerce.com/cart");
	}
	
	
}
