package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Productpage;

public class Searchtest extends Testbase {

	public	Homepage Homeobj;
	public Productpage Productobj;
	
	@Test
	public void usersearchtest()
	{
		Homeobj = new Homepage(driver);
		Homeobj.userSearch("mac");
		Productobj=new Productpage(driver);
		Productobj.userpressonproductdetails();
		Assert.assertEquals("Apple MacBook Pro 13-inch",Productobj.Successsearch.getText());
	}
}
