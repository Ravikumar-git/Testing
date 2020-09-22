package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.HelpPage;
import vodafone.pages.Applaunch;


public class HelpPageTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void HelpPage() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 HelpPage help = new HelpPage(driver);
		 help.HelpPage();

	  }
	  
}