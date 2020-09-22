package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.CPiconsPage;
import vodafone.pages.SearchPage;
import vodafone.pages.Applaunch;
import vodafone.pages.CPiconsPage1;

public class CPiconTestCase extends Applaunch{
	
	 // TODO Auto-generated method stub
	  @Test
	  public void CPicon() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 
		/*CPiconsPage icons = new CPiconsPage(driver);
		icons.CPicons();*/
		
		CPiconsPage1 icons = new CPiconsPage1(driver);
		icons.CPicons();

	  }
	  

}
