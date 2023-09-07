package Script;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkiraryDemoLoginPage;
import pomPages.TestingPage;

public class TestClass2 extends BaseClass
{
	@Test
	
public void tc1() throws Throwable
{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skilrarydemoappication();
		
		
		
		SkiraryDemoLoginPage sd = new SkiraryDemoLoginPage(driver);
		
		utilies.switchingtabs(driver);
		
		utilies.dropDown(sd.getCoursedd(), pdata.getPropertydata("Coursedd"));
		
		TestingPage tp = new TestingPage(driver);
		
		utilies.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
	
		
	}

}
