package genericLibrary;

import java.io.IOException; 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	
	public Propertyfile pdata=new Propertyfile();
	
	public WebDriverUtilities utilies= new WebDriverUtilities();
	
	@BeforeTest
	
	public void openApp() throws IOException
	{
		WebDriverManager.firefoxdriver().setup();
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get(pdata.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		
		String name = res.getName();
		
		if(status==2) 
		{
			
			Photo p = new Photo();
			
			p.getPhoto(driver, name);
		}
		driver.close();
			
		}
	}
	


