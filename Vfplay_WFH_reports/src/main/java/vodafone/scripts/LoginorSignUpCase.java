package vodafone.scripts;


import org.testng.annotations.*;
import vodafone.pages.Applaunch;
import vodafone.pages.LoginPage;

public class LoginorSignUpCase  extends Applaunch{
	
	@Test
	public void LoginPage() throws Throwable 
	{
	  
		LoginPage login = new LoginPage(driver);
		login.SelectContentLanguages();
		//login.VerifyingContentsinAlltabs();
		//login.dummylogin();
		login.OTPresendOTP();
	    login.LoginPageElements();
	  

		 
	 }

}
