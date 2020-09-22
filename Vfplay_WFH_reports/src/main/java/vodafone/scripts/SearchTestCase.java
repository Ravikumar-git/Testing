package vodafone.scripts;


import org.testng.annotations.*;
import vodafone.pages.SearchPage;
import vodafone.pages.Applaunch;



public class SearchTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void Search() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		 
		SearchPage search = new SearchPage(driver);
		 search.Searchkey();
		
		 

	  }
	  
}