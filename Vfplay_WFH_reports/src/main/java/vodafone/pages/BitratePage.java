package vodafone.pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.Bitrates_OR;

import objectRepositary.FullScreen_OR;
import objectRepositary.LoginPage_OR;


public class BitratePage extends Bitrates_OR{
	public static AndroidDriver<AndroidElement> driver;  
String text;
//private AndroidDriver<AndroidElement> driver;

	Applaunch key = new Applaunch();
	 public BitratePage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	 
	 
	 public void BitRated() throws Throwable
		{
			try 
			{
				System.out.println("Bitrated method");
				Thread.sleep(8000);
				key.tap();
				Bitrates_OR.clickBitrateicon.click();

				System.out.println("Clicked on Bitrate icon");
			}
			catch(Exception e)
			{
				System.out.println("catch");
				Thread.sleep(1000);
				//Bitrates_OR.Clickonplayer.click();
				key.tap();
				System.out.println("Clicked on Player");

				Thread.sleep(500);
				Bitrates_OR.clickBitrateicon.click();

				System.out.println("Clicked on Bitrate icon");
			}

			//-----------------------------------------

			try
			{
				Thread.sleep(1000);
				Bitrates_OR.Selectlowbitrate.click();
				System.out.println("Clicked on low Bitrate Quality");

				Thread.sleep(10000);
					//Bitrates_OR.Clickonplayer.click();
					
				System.out.println("Clicked on Player");
				key.tap();
				Thread.sleep(1000);
				System.out.println("Clicked on Player");
				key.tap();

				Thread.sleep(500);
				Bitrates_OR.clickBitrateicon.click();
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
				Bitrates_OR.Selecthighbitrate.click();
				System.out.println("Clicked on high Bitrate Quality");

				Thread.sleep(30000);
				System.out.println("111");
				key.tap();
					//Bitrates_OR.Clickonplayer.click();
					System.out.println("Clicked on Player");

				Thread.sleep(1000);
				System.out.println("222");
				Bitrates_OR.clickBitrateicon.click();
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
				Bitrates_OR.Selectmediumbitrate.click();
				System.out.println("Clicked on medium Bitrate Quality");

				Thread.sleep(30000);
				//Bitrates_OR.Clickonplayer.click();
				key.tap();
				System.out.println("Clicked on Player");

				Thread.sleep(1000);
				Bitrates_OR.clickBitrateicon.click();
				System.out.println("Clicked on Bitrate icon");

				//key.tap();

			}

			catch(Exception e)
			{
				System.out.println("Medium bitrate Not available");
			}
			//-----------------------------------------

			Thread.sleep(1000);
			//key.tap();
			Bitrates_OR.Selectautobitrate.click();
			System.out.println("Clicked on Auto Bitrate Quality");
			Thread.sleep(30000);
		}
	 
	 

	public void BitratePage() throws Throwable {
		try {
			
			//-----------------------------------------------
			Thread.sleep(30000);
			//-----------------------------------------------------------------
			
				
			System.out.println("--------->Test Case ID:15	Bitrates in Player controls.settings(Auto,High,Medium).<----------");
			
				Thread.sleep(3000);
				Bitrates_OR.clickNewstab.click();
				System.out.println("Clicked on News tab");
				
				/*Thread.sleep(10000);
				Bitrates_OR.clickonContent.click();
				System.out.println("Clicked on Content");*/
				
				
				Thread.sleep(5000);
				key.verticalSwipeOnce();

				Bitrates_OR.Carousel3.click();
				System.out.println("Clicked on More");

				Thread.sleep(5000);
				//FullScreen_OR.Contentclick.click();//Movies & Originals
				//Bitrates_OR.Contentclick.click();
				key.tap();
				System.out.println("Clicked on  content");
				
				System.out.println("Entering into Bitrated method");
				BitRated();	
				
				/*Thread.sleep(3000);
				Bitrates_OR.Clickonplayer.click();
				System.out.println("Clicked on Player");*/
								
				Thread.sleep(500);
				System.out.println("Bitrate test case pass");
				
				
				Thread.sleep(10000);

				key.backDevice();
				System.out.println("Dragged to mini player");

				Thread.sleep(3000);
				key.backDevice();
				System.out.println("Successfully clicked on Back key");

				try
				{
				
				Thread.sleep(3000);
				Bitrates_OR.PrintText.isDisplayed();
				text=Bitrates_OR.PrintText.getText();
				System.out.println(text +" -----Screen launched");
				key.backDevice();
				}
				
				/*try
				{
					Thread.sleep(3000);
					Bitrates_OR.PrintText.isDisplayed();
					text=Bitrates_OR.PrintText.getText();
					//Reporter.log(text +" Screen launched"); 
					key.backDevice();

				}*/
				catch(Exception e)
				{
					//Reporter.log(text +" screen not launched");

				}
				
				
				
				/*Thread.sleep(2000);
				key.tap();
				Bitrates_OR.Contentclick.click();
				System.out.println("Successfully dragged to mini player");
				
				key.backDevice();
				Thread.sleep(1000);
				key.backDevice();*/
				
				Thread.sleep(3000);
				Bitrates_OR.Hometab.click();
				
				System.out.println("--------->Test Case ID:15	Bitrates in Player controls.settings(Auto,High,Medium).<----------");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	
}

}