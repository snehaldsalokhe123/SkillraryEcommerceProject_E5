package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	//Declaration
	
	@FindBy(id="Selenium Training")
	private WebElement seleniumtraining;
	
	@FindBy(id="mycart")
	private WebElement carttab;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	
	private WebElement facebook;
	
    //initilization
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	
	public WebElement getSeleniumtraining()
	{
		return seleniumtraining;
		
	}

	public WebElement getCarttab()
	{
		return carttab;
	}

	public void facebookicon()
	{
		facebook.click();
	}
}
