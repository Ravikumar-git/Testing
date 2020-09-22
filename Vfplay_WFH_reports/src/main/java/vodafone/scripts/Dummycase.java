
package vodafone.scripts;
import vodafone.pages.FullScreenPage;
import org.testng.annotations.*;
import vodafone.pages.Applaunch;
import vodafone.pages.Dummylogin;

@SuppressWarnings("rawtypes")
public class Dummycase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void Dummylogin() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		  Dummylogin sample = new Dummylogin(driver);
		  sample.SelectContentLanguages();
		  sample.Dummylogin();
		  sample.Like();
		  sample.Miniplayer();
		// sample.FFRR();
		// sample.BitRated();

	  }
	  
}