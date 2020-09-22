package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.ContinueWatchingpage;
import vodafone.pages.Applaunch;


public class ContinueWatchingTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void ContinueWatching() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		  ContinueWatchingpage continuewatching = new ContinueWatchingpage(driver);
		  continuewatching.ContinueWatching();

	  }
	  
}