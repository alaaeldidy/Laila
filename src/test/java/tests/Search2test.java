package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Productpage;
import pages.Search2page;

public class Search2test extends Testbase {

	public Search2page Search2obj;
	public Productpage Productobj;
	
	@Test
	public void usersearch2() throws InterruptedException
	{
		Search2obj=new Search2page (driver);
		Search2obj.userchooselist("mac");
		Productobj=new Productpage(driver);
		Assert.assertEquals("Apple MacBook Pro 13-inch",Productobj.Successsearch.getText());
	}
	
	
	
}
