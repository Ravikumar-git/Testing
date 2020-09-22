package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.ExitappPage;
import vodafone.pages.SearchPage;
import vodafone.pages.Applaunch;

public class ExitappTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void Exitapp() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 
		  ExitappPage exit = new ExitappPage(driver);
		  exit.Exitapp();
		
		 

	  }
	  
}