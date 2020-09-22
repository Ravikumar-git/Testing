package vodafone.scripts;


import org.testng.annotations.*;
import vodafone.pages.AppSettings;
import vodafone.pages.Applaunch;


public class AppSettingsTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void AppSettings() throws Throwable {
	  
	  	 AppSettings settings = new AppSettings(driver);
		 settings.AppSettings();

	  }
	  
}