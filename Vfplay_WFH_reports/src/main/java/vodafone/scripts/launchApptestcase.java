package vodafone.scripts;


import org.testng.annotations.*;
import vodafone.pages.Applaunch; 


public class launchApptestcase {
  
	 @Test
	  public void Applunch() throws Throwable 
	  {
		  Applaunch launch = new Applaunch();
		  launch.startAppiumServer();
		  launch.clickalltabs();
		 /* launch.verticalSwipe();
		  launch.verticalDownSwipe();*/

}
  }

