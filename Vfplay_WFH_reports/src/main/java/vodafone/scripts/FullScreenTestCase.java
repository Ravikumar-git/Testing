package vodafone.scripts;
import vodafone.pages.FullScreenPage;
import org.testng.annotations.*;
import vodafone.pages.Applaunch;


public class FullScreenTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void FullScreenPage() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 FullScreenPage FullScreen = new FullScreenPage(driver);
		 FullScreen.FullScreenPage();

	  }
	  
}
