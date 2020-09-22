package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.google.common.graph.SuccessorsFunction;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.Bitrates_OR;
import objectRepositary.Dummy_OR;
import objectRepositary.FullScreen_OR;
import objectRepositary.LoginPage_OR;
import objectRepositary.Search_OR;


public class Dummylogin extends Dummy_OR{
	public static AndroidDriver<AndroidElement> driver;  
	String text;
	//private AndroidDriver<AndroidElement> driver;

	Applaunch key = new Applaunch();
	public Dummylogin(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

//---------------------------------------------------------------------------------------
	
	public void Dummylogin() throws Throwable {
		try 
		{

			//-----------------------------------------------
			try {
				key.verticalSwipeOnce();

				Thread.sleep(5000);
				Dummy_OR.clickViewall.click();
				System.out.println("Clicked on More");

				Thread.sleep(5000);
				key.Screenshot();
				Dummy_OR.Contentclick.click();
				System.out.println("Clicked on  content");
			}
			catch(Exception e)
			{
				System.out.println("asaaa");
				Thread.sleep(8000);
				Dummy_OR.Moviestab.click();
				Thread.sleep(2000);
				Dummy_OR.txtHomeContentClick.click();
				System.out.println("Clicked on Home content");
			}

			Thread.sleep(3000);
			Dummy_OR.txtMobileNumber.sendKeys("8886003303");
			//Dummy_OR.txtMobileNumber.sendKeys("8886618119");
			System.out.println("Entered valid mobile number");
			Thread.sleep(5000);
			Dummy_OR.txtContinuebutton1.click();
			System.out.println("Clicked on Continue button");


			Thread.sleep(20000);
			Thread.sleep(500);
			System.out.println("Waiting");
			Dummy_OR.otpfield1.sendKeys("123456");
			System.out.println("Entered valid OTP");

			Thread.sleep(15000);
			Dummy_OR.otpbtn1.click();
			Thread.sleep(15000);
			//key.backDevice();
			key.Screenshot();

		}

		catch (Exception e) { e.printStackTrace(); } }
	
//------------------------------------------------------------------------------------
	
	public void Like() throws Throwable
	{
		
		try 
		{
		Dummy_OR.Like.isDisplayed();
		Dummy_OR.Like.click();
		System.out.println("Clicked on Like");
		}
		catch(Exception e)
		{
			System.out.println("Like not available");
		}
	}
	
	
//------------------------------------------------------------------------------	
	
	
	public void Miniplayer() throws Throwable
	{
		
		try 
		{
			Thread.sleep(20000);
			key.tap();
			Dummy_OR.downarrow.click();
			
			System.out.println("Successfully clicked on Miniplayer icon");
			Thread.sleep(1500);
		Dummy_OR.playerExpand.click();
		System.out.println("Clicked on Mini player expand");
		Thread.sleep(3000);
		key.backDevice();
		System.out.println("back");
		key.backDevice();
		System.out.println("back");
		}
		catch(Exception e)
		{
			System.out.println("Expand not working");
			Thread.sleep(5000);
			//key.tap();
			//System.out.println("tapped");
			key.backDevice();
			System.out.println("back");
			key.backDevice();
			System.out.println("back");
		}
	}
	
	
//------------------------------------------------------------------------------
	
	
	public void FFRR() throws Throwable
	{
		System.out.println("FFRR method");
		Dummy_OR.Clickonplayer.click();
		
		try {
			
		Dummy_OR.rewind20.click();
		System.out.println("rewind 20 secs");
		Thread.sleep(10000);
		
		
		}
		catch(Exception e)
		{
			System.out.println("rewind not working");
		}
		
		
		try {
			key.tap();
			Dummy_OR.forward20.click();	
			System.out.println("forward 20 secs");
			Thread.sleep(30000);
			}
			catch(Exception e)
			{
				System.out.println("forward not working");
			}
	
		key.backDevice();
		Thread.sleep(3000);
		
		key.backDevice();
		Thread.sleep(3000);
	}

//===========================================================
	
	
	public void BitRated() throws Throwable
	{
		try 
		{
			System.out.println("Bitrated method");
			//Thread.sleep(4000);
			Dummy_OR.clickBitrateicon.click();

			System.out.println("Clicked on Bitrate icon");
		}
		catch(Exception e)
		{
			System.out.println("catch");
			Thread.sleep(1000);
			Dummy_OR.Clickonplayer.click();
			System.out.println("Clicked on Player");

			Thread.sleep(5000);
			Dummy_OR.clickBitrateicon.click();

			System.out.println("Clicked on Bitrate icon");
		}

		//-----------------------------------------

		try
		{
			Thread.sleep(1000);
			Dummy_OR.Selectlowbitrate.click();
			System.out.println("Clicked on low Bitrate Quality");

			Thread.sleep(5000);
				Bitrates_OR.Clickonplayer.click();
				System.out.println("Clicked on Player");

			Thread.sleep(1000);
			Dummy_OR.clickBitrateicon.click();
			System.out.println("Clicked on Bitrate icon");
		}

		catch(Exception e)
		{
			System.out.println("Low bitrate Not available");

		}

		//-----------------------------------------
		try
		{
			Thread.sleep(1000);
			Dummy_OR.Selecthighbitrate.click();
			System.out.println("Clicked on high Bitrate Quality");

			Thread.sleep(30000);
			System.out.println("111");
			key.tap();
				//Bitrates_OR.Clickonplayer.click();
			System.out.println("Clicked on Player");

			Thread.sleep(1000);
			System.out.println("222");
			Dummy_OR.clickBitrateicon.click();
			System.out.println("Clicked on Bitrate icon");
		}

		catch(Exception e)
		{
			System.out.println("High bitrate Not available");
		}
		//-----------------------------------------
		try
		{
			Thread.sleep(1000);
			System.out.println("333");
			Dummy_OR.Selectmediumbitrate.click();
			System.out.println("Clicked on medium Bitrate Quality");

			Thread.sleep(30000);
			//Bitrates_OR.Clickonplayer.click();
			key.tap();
			System.out.println("Clicked on Player");
			

			Thread.sleep(1000);
			Dummy_OR.clickBitrateicon.click();
			System.out.println("Clicked on Bitrate icon");

			key.tap();

		}

		catch(Exception e)
		{
			System.out.println("Medium bitrate Not available");
		}
		//-----------------------------------------

		Thread.sleep(500);
		Dummy_OR.Selectautobitrate.click();
		System.out.println("Clicked on Auto Bitrate Quality");
		Thread.sleep(30000);
		
	}
//====================================================


	public void SelectContentLanguages() throws Throwable
	{
		try
		{
			Thread.sleep(30000);
			//driver.findElement(By.id("com.vodafone.vodafoneplay:id/contentLanguagesTitle")).isDisplayed();
			Dummy_OR.contentLanguage.isDisplayed();
			key.verticalSwipeOnce();
			
			Thread.sleep(3000);
			Dummy_OR.TeluguContentLanguage.click();
			Dummy_OR.saveButton.click();
			System.out.println("ContentLanguages");
			//driver.findElement(By.id("com.vodafone.vodafoneplay:id/save_button")).click();
		}
		catch(Exception e)
		{
			System.out.println("Select Content Languages are not displaying");
			//e.printStackTrace();
		}
	}



}