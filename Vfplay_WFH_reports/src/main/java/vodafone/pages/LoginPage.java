package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.FullScreen_OR;
import objectRepositary.LoginPage_OR;
import objectRepositary.MyWatchlistAddingRemoving_OR;
import vodafone.pages.Applaunch;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;
import java.time.Duration;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import vodafone.pages.Applaunch;

public class LoginPage extends LoginPage_OR {
	public static AndroidDriver<AndroidElement> driver;  
	public static AndroidDriver<MobileElement> dr;

	public LoginPage(AppiumDriver<AndroidElement> driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	Applaunch key= new Applaunch();
	String text;


	@SuppressWarnings("rawtypes")
	public void tapByElement (AndroidElement androidElement) {
		new TouchAction(driver)
		.tap(tapOptions().withElement(element(androidElement)))
		.waitAction(waitOptions(Duration.ofMillis(250))).perform();
	}

	//Tap by coordinates
	@SuppressWarnings("rawtypes")
	public void tapByCoordinates (int x,  int y) {
		new TouchAction(driver)
		.tap(point(500,500))
		.waitAction(waitOptions(Duration.ofMillis(250))).perform();
	}

	
//------------------------------------------------------------------------------------------------------------------
	
	public void SelectContentLanguages() throws Throwable
	{
		try
		{
			Thread.sleep(40000);
		//driver.findElement(By.id("com.vodafone.vodafoneplay:id/contentLanguagesTitle")).isDisplayed();
		LoginPage_OR.contentLanguage.isDisplayed();
			key.verticalSwipeOnce();
			Thread.sleep(1000);
		LoginPage_OR.saveButton.click();
		System.out.println("ContentLanguages");
		//driver.findElement(By.id("com.vodafone.vodafoneplay:id/save_button")).click();
		}
		catch(Exception e)
		{
			System.out.println("Select Content Languages are not displaying");
			//e.printStackTrace();
		}
	}
	
	
	
	public void VerifyingContentsinAlltabs() throws Throwable
	{
		try 
		{
			Thread.sleep(5000);
			System.out.println("Verifying Contents in Home Screen");
			key.verticalSwipe();
			key.verticalDownSwipe();

			Thread.sleep(1000);
			LoginPage_OR.Newstab.click();
			System.out.println("Verifying Contents in News Screen");
			key.verticalSwipe();
			key.verticalDownSwipe();

			Thread.sleep(1000);
			LoginPage_OR.Moviestab.click();
			System.out.println("Verifying Contents in Movies Screen");
			key.verticalSwipe();
			key.verticalDownSwipe();

			Thread.sleep(1000);
			LoginPage_OR.Originalstab.click();
			System.out.println("Verifying Contents in Originals Screen");
			key.verticalSwipe();
			key.verticalDownSwipe();

			Thread.sleep(1000);
			LoginPage_OR.TVtab.click();
			System.out.println("Verifying Contents in TV Screen");
			key.verticalSwipe();
			key.verticalDownSwipe();

			Thread.sleep(1000);
			LoginPage_OR.Hometab.click();
			key.verticalDownSwipe();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


public void dummylogin() throws Throwable{
	try
	{
		System.out.println("TestCase 1:	Login or Signup flow – With valid and invalid Vodafone number.");
		
		Thread.sleep(20000);
		try {
			
			//LoginPage_OR.Watchlist.click();
			key.verticalSwipeOnce();
			LoginPage_OR.clickViewall.click();
			System.out.println("Clicked on More");
			Thread.sleep(8000);
			LoginPage_OR.Contentclick.click();
			System.out.println("Clicked on  content");
		}
		catch(Exception e)
		{
			System.out.println("OTPresendOTP Method failed");
		}
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		LoginPage_OR.txtMobileNumber.sendKeys("8886003303");//sim1
		System.out.println("Entered valid mobile number");
		Thread.sleep(5000);
		LoginPage_OR.txtContinuebutton.click();
		System.out.println("Clicked on Continue button");

		System.out.println("TestCase 1:	Login or Signup flow – With valid and invalid Vodafone number.----PASS");

		Thread.sleep(10000);
		//LoginPage_OR.otpfield.click();
		//System.out.println("Successfully clicked on OTP field");
		Thread.sleep(500);
		System.out.println("Waiting");
		LoginPage_OR.otpfield.sendKeys("123456");
		System.out.println("Entered valid OTP");

		//key.backDevice();
		Thread.sleep(1000);
		LoginPage_OR.otpbtn.click();
		System.out.println("Successfully clicked on OTP button");
			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

	public void OTPresendOTP() throws Throwable {

		try 
		{
			

			/*Thread.sleep(5000);
			LoginPage_OR.txtHomeContentClick.click();
			System.out.println("Clicked on Home page");*/

			Thread.sleep(20000);
			try {
				
				//LoginPage_OR.Watchlist.click();
				
				
				
				key.verticalSwipeOnce();
				LoginPage_OR.clickViewall.click();
				System.out.println("Clicked on More");
				Thread.sleep(8000);
				//LoginPage_OR.Contentclick.click();
				key.tap();
				System.out.println("Clicked on  content");
			}
			catch(Exception e)
			{
				System.out.println("OTPresendOTP Method failed");
			}
			Thread.sleep(5000);
			//LoginPage_OR.txtMobileNumber.sendKeys("9160508889");
			LoginPage_OR.txtMobileNumber.sendKeys("7013556005");
			
			System.out.println("Entered Invalid mobile number");
			

			Thread.sleep(3000);
			LoginPage_OR.txtContinuebutton.click();
			System.out.println("Clicked on Continue button");

			Thread.sleep(5000);
			text=LoginPage_OR.SwitchtoVodafone.getText();
			System.out.println(text +" <--Popup displayed");
			text=LoginPage_OR.SwitchtoVodafonemsg.getText();
			System.out.println(text +" <--SwitchtoVodafone Popup msg");
			
			
			Thread.sleep(1000);
			text=LoginPage_OR.SwitchtoVodafone.getText();
			LoginPage_OR.SwitchtoVodafone.click();
			System.out.println("Clicked on -->" +text +" <--Popup button");
			Thread.sleep(2000);
			key.verticalSwipe();
			Thread.sleep(5000);
			key.backDevice();
			
			Thread.sleep(3000);
			LoginPage_OR.txtContinuebutton.click();
			System.out.println("Clicked on Continue button");
			Thread.sleep(3000);
			text=LoginPage_OR.SwitchtoVodafone.getText();
			System.out.println(text +" <--Popup displayed");
			Thread.sleep(1000);
			LoginPage_OR.SwitchtoVodafoneclose.click();
			System.out.println("Clicked on -->" +text +" <--Popup close mark");
			
									
			/*Thread.sleep(5000);
			text=LoginPage_OR.invalidPopup.getText();
			System.out.println(text +" <--Popup displayed");

			Thread.sleep(1000);
			LoginPage_OR.invalidPopupOkbutton.click();
			System.out.println("Clicked on -->" +text +" <--Popup OK button");*/

			//----------
			Thread.sleep(1000);
			
			//LoginPage_OR.txtMobileNumber.sendKeys("8886679118");//old num
			//LoginPage_OR.txtMobileNumber.sendKeys("8142508724");//sim2
			//LoginPage_OR.txtMobileNumber.sendKeys("8886618119");//sim1
			LoginPage_OR.txtMobileNumber.sendKeys("8886003303");
			
			
			//LoginPage_OR.txtMobileNumber.sendKeys("8142208800");
		//LoginPage_OR.txtMobileNumber.sendKeys("8886315570");
			System.out.println("Entered valid mobile number");

			Thread.sleep(5000);
			LoginPage_OR.txtContinuebutton.click();
			System.out.println("Clicked on Continue button");
			System.out.println("TestCase 1:	Login or Signup flow – With valid and invalid Vodafone number.----PASS");

//------------------------------------------------------------------------
			
			 System.out.println("TestCase 3: OTP / Resend OTP – with valid and invalid OTP.");

			Thread.sleep(10000);
			text=LoginPage_OR.OTPmessage.getText();
			System.out.println( text +" <--message displayed");
			
			Thread.sleep(30000);
			LoginPage_OR.otpfield.sendKeys("123455");
			System.out.println("Entered Invalid OTP");

			//key.backDevice();

			Thread.sleep(1000);
			LoginPage_OR.otpbtn.click();
			System.out.println("Successfully clicked on OTP button");

			Thread.sleep(2000);
			text=LoginPage_OR.invalidOTPpopup.getText();
			System.out.println(text +" <--Popup displayed");

			Thread.sleep(1000);
			LoginPage_OR.invalidPopupOkbutton.click();
			System.out.println("Clicked on --> " +text +" <-- Popup OK button");
			
			Thread.sleep(5000);
			LoginPage_OR.resendOTP.click();
			System.out.println("Clicked on Resend OTP button");

			Thread.sleep(10000);
			text=LoginPage_OR.OTPmessage.getText();
			System.out.println( text +" <--message displayed");

			/*Thread.sleep(9000);
			LoginPage_OR.otpfield.click();
			System.out.println("Successfully clicked on OTP field");*/
			
			Thread.sleep(10000);
			LoginPage_OR.otpfield.sendKeys("123456");
			System.out.println("Entered valid OTP");
			
			Thread.sleep(1000);
			LoginPage_OR.otpbtn.click();
			System.out.println("Successfully clicked on OTP button");

			System.out.println("TestCase 3: OTP / Resend OTP – with valid and invalid OTP.----PASS");
//------------------------------------------------------------------------			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	public void LoginPageElements() throws Throwable {
		try {
			/*System.out.println("Entering valid OTP manually ");
			Thread.sleep(30000);
			LoginPage_OR.otpbtn.click();
			System.out.println("Successfully clicked on OTP button");*/

			//Thread.sleep(1000);
			//key.backDevice();

			Thread.sleep(5000);
			text=LoginPage_OR.ContentName.getText();
			System.out.println("Content Playback name is :"+ text);


			System.out.println("Login test case pass");

			//-----------------------

			Thread.sleep(10000);

			key.backDevice();
			System.out.println("Dragged to mini player");
			Thread.sleep(5000);
			key.backDevice();
			System.out.println("Successfully clicked on Back key");

			try
			{
				Thread.sleep(1000);
				LoginPage_OR.PrintText.isDisplayed();
				text=LoginPage_OR.PrintText.getText();
				//Reporter.log(text +" Screen launched"); 
				key.backDevice();

			}
			catch(Exception e)
			{
				//Reporter.log(text +" screen not launched");

			}
			
			Thread.sleep(3000);
			key.verticalDownSwipe();
			
			//-----------------------
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.isinolsun.app:id/bluecollar_type_button"))).click();
			//-----------------------

			/*
						Thread.sleep(10000);
						LoginPage_OR.clickFullScreenicon.click();
						System.out.println("Clicked on fullscreen");
						Thread.sleep(5000);
						scroll.verticalSwipe();
						Thread.sleep(2000);
						key.backDevice();
						System.out.println("abc");
						LoginPage_OR.downarrow.click();
						System.out.println("Successfully dragged to mini player");
						Thread.sleep(2000);
						key.backDevice();*/
			//-----------------------


			//tapByCoordinates(500,500);

			//pressByCoordinates(500,600,10);

			/*KeyEvent k=new KeyEvent(AndroidKey.BACK);
			   driver.pressKey(k);*/

		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
