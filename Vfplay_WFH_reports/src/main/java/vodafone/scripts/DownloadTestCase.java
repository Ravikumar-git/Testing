package vodafone.scripts;

import vodafone.pages.Applaunch;
import vodafone.pages.DownloadPage;
import org.testng.annotations.*;


public class DownloadTestCase extends Applaunch{
	 
      @Test
      public void DownloadPage() throws Throwable
	{
    	  DownloadPage page = new DownloadPage(driver);
    	page.DownloadScreen();
    }
}