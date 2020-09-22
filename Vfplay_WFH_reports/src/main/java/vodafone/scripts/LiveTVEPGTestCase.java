package vodafone.scripts;

import vodafone.pages.Applaunch;
import vodafone.pages.LiveTVEPEGPage;
import org.testng.annotations.*;

public class LiveTVEPGTestCase extends Applaunch 
{

       @Test
       public void LiveTVEPEG() throws Throwable
       {
    	    LiveTVEPEGPage page=new LiveTVEPEGPage(driver);
    	    page.LiveTVEPEGPage();
       }
 }
