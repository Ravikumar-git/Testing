package vodafone.scripts;


import org.testng.annotations.*;
import vodafone.pages.ViewallPage;
import vodafone.pages.Applaunch;


public class ViewallPageTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void ViewallPage() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 ViewallPage viewall = new ViewallPage(driver);
		 viewall.ViewallPage();

	  }
	  
}
