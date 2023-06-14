package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage extends Pagebase {

	public Registerpage(WebDriver driver) {
		super(driver);
	}

@FindBy(id ="gender-female")
WebElement gender;

@FindBy(id ="FirstName")
WebElement fname;

@FindBy(id ="LastName")
WebElement lname;

@FindBy(id ="Email")
WebElement email;

@FindBy(id ="Password")
WebElement pass;

@FindBy(id ="ConfirmPassword")
WebElement conpass;

@FindBy(id ="register-button")
WebElement register;

@FindBy(css ="div.result")
public WebElement successregister;


public void userputregisterdata(String firstname,String lastname , String mail,String password)
{
press(gender);
write(fname, firstname);
write(lname, lastname);
write(email, mail);
write(pass, password);
write(conpass, password);
press(register);

}


	
	

}
