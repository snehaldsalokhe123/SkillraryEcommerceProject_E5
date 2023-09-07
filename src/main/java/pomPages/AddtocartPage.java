package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage 
{

	//declaration
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	//initialization
	
	public AddtocartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//uitilization
	
	

	public WebElement getAddbtn()
	{
		return addbtn;
	}

	public void carttocartbutton()
	{
		cartbtn.click();
	}
	
	
	
}
