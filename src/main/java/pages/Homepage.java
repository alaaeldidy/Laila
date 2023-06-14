package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	public JavascriptExecutor jse;
	
	public Homepage(WebDriver driver) {
		super(driver);
		
	
	}
	
@FindBy(linkText ="Register")
WebElement registerbtn;
	
@FindBy(linkText ="Log in")
WebElement loginbtn;

@FindBy(id ="small-searchterms")
WebElement searchtxt;

@FindBy(css ="button.button-1.search-box-button")
WebElement searchbtn;

@FindBy(linkText ="Contact us")
WebElement contactbtn;


public void userpressregister()
{
	press(registerbtn);
}

public void userpresslogin()
{
	press(loginbtn);
}

public void userSearch(String product)
{
	write(searchtxt, product);
	press(searchbtn);
}
public void usercontact()
{
	scroll();
	press(contactbtn);	
}
}
