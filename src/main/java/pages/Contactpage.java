package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contactpage extends Pagebase {

	public Contactpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id ="FullName")
	WebElement fname;
	
	@FindBy(id ="Email")
	WebElement emali;
	
	@FindBy(id ="Enquiry")
	WebElement Enquirytxt;
	
	@FindBy(css ="button.button-1.contact-us-button")
	WebElement submit;
	
	@FindBy(css ="div.result")
	public WebElement successcontact;
	
	public void usercontact(String fn,String mail,String inq)
	{
	write(fname,fn);
	write(emali,mail);
	write(Enquirytxt,inq);
	press(submit);
	}
	
}
