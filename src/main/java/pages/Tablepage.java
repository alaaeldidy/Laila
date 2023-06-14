package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tablepage extends Pagebase {

	public Tablepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText ="Apple MacBook Pro 13-inch")
	public WebElement successtable1;

	@FindBy(linkText="Samsung Series 9 NP900X4C Premium Ultrabook")
	public WebElement successtable2;

	@FindBy (xpath="//*[@id=\"shopping-cart-form\"]/div[1]/table")
	WebElement table ;

	public void usercomparetest()
	{

		List<WebElement> rows = table.findElements(By.tagName("tr"));	
		for(WebElement row:rows)
		{
			List<WebElement> cols = row.findElements(By.tagName("td"));
			for (WebElement col:cols)
			{
				System.out.println(col.getText());
			}

		}
	}
}


