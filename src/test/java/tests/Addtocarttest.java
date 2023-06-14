package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Productpage;
import pages.Tablepage;

public class Addtocarttest extends Testbase {

	public Productpage Productobj;
	public Tablepage Tableobj;
	public	Homepage Homeobj;
	
@Test
public void useraddcarttest()
{
	Homeobj = new Homepage(driver);
	Homeobj.userSearch("mac");
	Productobj=new Productpage(driver);
	Productobj.userpressonproductdetails();
	Assert.assertEquals("Apple MacBook Pro 13-inch",Productobj.Successsearch.getText());
	Productobj.pressonadd();
	Tableobj = new Tablepage(driver);
	Assert.assertEquals("Apple MacBook Pro 13-inch",Tableobj.successtable1.getText() );
	Homeobj.userSearch("samsung");
	Productobj.userpressonproductdetails();
	Assert.assertEquals("Samsung Series 9 NP900X4C Premium Ultrabook",Productobj.Successsearch.getText());
	Productobj.pressonadd();
	Assert.assertEquals("Samsung Series 9 NP900X4C Premium Ultrabook",Tableobj.successtable2.getText());
	Tableobj = new Tablepage(driver);
	Tableobj.usercomparetest();
}

	
	
	
}
