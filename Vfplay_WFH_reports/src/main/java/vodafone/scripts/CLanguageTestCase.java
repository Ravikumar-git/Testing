package vodafone.scripts;
import org.testng.annotations.*;
import vodafone.pages.CLanguagePage;
import vodafone.pages.Applaunch;

public class CLanguageTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void CLanguagePage() throws Throwable {
	  
		  CLanguagePage lang = new CLanguagePage(driver);
		  lang.CLanguage();

	  }
	  
}