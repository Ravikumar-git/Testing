package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.MywatchlistPage;
import vodafone.pages.Applaunch;


public class MyWatchlistTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void Mywatchlist() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 MywatchlistPage watchlist = new MywatchlistPage(driver);
		 watchlist.Mywatchlist();

	  }
	  
}