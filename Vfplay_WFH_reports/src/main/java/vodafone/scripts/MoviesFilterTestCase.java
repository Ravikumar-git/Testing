package vodafone.scripts;


import org.testng.annotations.*;

import vodafone.pages.Applaunch;
import vodafone.pages.MoviesFilterPage;

public class MoviesFilterTestCase extends Applaunch{
      
         @Test
         public void MovieFilter() throws Throwable 
         {
            MoviesFilterPage filter = new MoviesFilterPage(driver);
            filter.MoviesFilter();
         }
}




