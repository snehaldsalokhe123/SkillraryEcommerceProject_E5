package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 

{
	//1.Handling dropdown

	public void dropDown(WebElement ele, String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	//2.handling mouseover
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);

		a.moveToElement(ele).perform();
	}

	//3.Handling doubleclick

	public void doubleClick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();

	}

	//4.Handling Right Click
	public void rightclick(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	//5.Handling Dran and Drp

	public void dragdrop(WebDriver driver,WebElement src,WebElement target)
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	//6.Shifting control to frame

	public void switchFrame(WebDriver driver, String value)
	{
		driver.switchTo().defaultContent();
	}

	//7 shifting control to normal web page

	public void switchbackframe(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}

	//8Shifting control to pop up

	public void alertpopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	//9.shiftig contrl to child window
	public void switchingtabs(WebDriver driver)
	{
		Set<String> child =driver.getWindowHandles();
		for(String b : child)
		{
			driver.switchTo().window(b);
		}
	}
	
	//10 Handling Scrollbar
	
	public void scrollBar(WebDriver driver,int x,int y)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeAsyncScript("windows.scrollBy("+x+","+y+")");
		
	}
}










