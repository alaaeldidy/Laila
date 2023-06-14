package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Registerpage;

public class Registertest extends Testbase {

	public	Homepage Homeobj;
	public Registerpage Registerobj;
	
@Test(groups={"A1" })
public void userregistertest()
{
	Homeobj = new Homepage(driver);
	Homeobj.userpressregister();
	Registerobj=new Registerpage(driver);
	Registerobj.userputregisterdata("Alaa","mohamed","ppyodddfdjjhicuy@gmail.com","ahmedahmed");
	Assert.assertEquals("Your registration completed", Registerobj.successregister.getText());
}
	
	
}
