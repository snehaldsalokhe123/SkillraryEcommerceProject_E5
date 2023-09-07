package Script;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtocartPage;
import pomPages.SkillraryLoginPage;
import pomPages.SkiraryDemoLoginPage;

public class TestClass1 extends BaseClass
{
	@Test
	
public void tc1()
{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skilrarydemoappication();
		
		utilies.switchingtabs(driver);
		
		SkiraryDemoLoginPage sd = new SkiraryDemoLoginPage(driver);
		
		utilies.mouseHover(driver, sd.getCoursetab());
		
		sd.seleniumtrainingtab();
		
		AddtocartPage d = new AddtocartPage(driver);
		
		utilies.doubleClick(driver, d.getAddbtn());
		
		d.carttocartbutton();
		
		utilies.alertpopup(driver);
}
}
