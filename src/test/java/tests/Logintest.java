package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Loginpage;

public class Logintest extends Testbase {
	
	public	Homepage Homeobj;
	public Loginpage Loginobj;
	
	@Test(groups={"A2"},dependsOnGroups ={"A1"})
	public void userlogintest()
	{
		Homeobj = new Homepage(driver);
		Homeobj.userpresslogin();
		Loginobj = new Loginpage(driver);
		Loginobj.userlogin("ppyodddfdjjhicuy@gmail.com","ahmedahmed");
		Assert.assertEquals("Log out",Loginobj.successlogin.getText() );
	}
	
	
	
}
