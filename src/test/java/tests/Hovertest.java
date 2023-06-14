package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Hoverpage;

public class Hovertest extends Testbase {

	public Hoverpage  Hoverobj;
@Test

public void userhovertest()
{
	Hoverobj=new Hoverpage(driver);	
	Hoverobj.hoverpage();
	Assert.assertEquals("Clothing",Hoverobj.successhover.getText());                                               
}
	
}
