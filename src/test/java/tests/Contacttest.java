package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Contactpage;
import pages.Homepage;

public class Contacttest extends Testbase{
	
	public	Homepage Homeobj;
	public Contactpage Contactobj;
	public JavascriptExecutor jse;
	
@Test
public void usertestcon()
{
	Homeobj=new Homepage(driver);
	Homeobj.usercontact();
	Contactobj=new Contactpage(driver);
	Contactobj.usercontact("loij","sdsafd@gmail.com","wqfsefscgcfxxcv");
	Assert.assertEquals("Your enquiry has been successfully sent to the store owner.",Contactobj.successcontact.getText());
}
	
	
	
	
	
}
