package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.BitratePage;
import vodafone.pages.Applaunch;


public class BitratesTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void BitratePage() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		  BitratePage bitrate = new BitratePage(driver);
		  bitrate.BitratePage();

	  }
	  
}