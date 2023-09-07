package pomPages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy; 
import org.openqa.selenium.support.PageFactory; 

public class SkillraryLoginPage 
{
	
	//Declaration
	
	//address of Gear webElement
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//address of skillary demo
	
	@FindBy(xpath="//a[text()=' SkilRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@vaue='go']")
	private WebElement searchbtn;
	
	
	//initialisation
	
	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void gearsbutton()
	{
		gearsbtn.click();
			
	}
	public void skilrarydemoappication()
	{
		gearsbtn.click();
			
	}
	

}
