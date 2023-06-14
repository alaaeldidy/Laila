package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;




public class Testbase {

	public WebDriver driver;
	public JavascriptExecutor jse;
	@BeforeClass
	public	void openurl(@Optional("chrome") String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			String path= System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			driver=new ChromeDriver();	
		}

		if(browsername.equalsIgnoreCase("firfox"))
		{
			String path= System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", path);
			driver=new FirefoxDriver();	
		}

           driver.manage().window().maximize();
           driver.navigate().to("http://demo.nopcommerce.com");;
	}
	

	
	
	@AfterMethod 
	public void usertakescreen(ITestResult result) throws IOException

	{ 
		if(ITestResult.FAILURE == result.getStatus()) 
		{ 
			String path=System.getProperty("user.dir")+"\\trail\\Screenshots";
			TakesScreenshot ts = ((TakesScreenshot) driver); 
			File source=ts.getScreenshotAs(OutputType.FILE); 
		    FileUtils.copyFile(source,new File(".\\Screenshots\\"+result.getName()+".png"));
		}

	}
	
	
	


	@AfterClass
	public void usercloseurl()
	{
		driver.close();
	}
	
	
	
	
}