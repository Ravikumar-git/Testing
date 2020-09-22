package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.BannersScrollingpage;
import vodafone.pages.Applaunch;


public class BannersScrollingTestCase extends Applaunch{

	 
	  @Test
	  public void BannerscrollingPage() throws Throwable 
	  {
	  
	  
		  BannersScrollingpage Banners = new BannersScrollingpage(driver);
		  Banners.BannersScrolling();

	  }
	  
}