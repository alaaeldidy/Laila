package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Pagebase {

	public Loginpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id ="Email")
	WebElement email;
	
	@FindBy(id ="Password")
	WebElement pass;
	
	@FindBy(css ="button.button-1.login-button")
	WebElement loginbtn;
	
	@FindBy(linkText  ="Log out")
	public WebElement successlogin;
	
	
	public void userlogin(String mail,String password)
	{
	write(email,mail);	
	write(pass, password);
	press(loginbtn);
		
	}
	
	
	
	
	
	
}
