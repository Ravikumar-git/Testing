package vodafone.scripts;


import org.testng.annotations.*;
//import vodafone.utilities.BaseClass;
import vodafone.pages.Applaunch;
import vodafone.pages.HomePage;

public class HomePageTestCase extends Applaunch{

	  
	/*public HomePageTestCase(AppiumDriver<AndroidElement> driver) {
	super(driver);		
	// TODO Auto-generated constructor stub	
	}
*/
	@Test
	public void HomePage() throws Throwable 
	{
	  
		HomePage home = new HomePage(driver);
	   	home.HomePageElements();

		 
	 }
}
