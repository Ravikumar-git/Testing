package vodafone.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.FullScreen_OR;
import objectRepositary.HelpPage_OR;
import objectRepositary.LoginPage_OR;
import vodafone.pages.Applaunch;

public class FullScreenPage extends FullScreen_OR{
	public static AndroidDriver<AndroidElement> driver;  
	Applaunch key = new Applaunch();
	String text;
	//private AndroidDriver<AndroidElement> driver;


	public FullScreenPage(AppiumDriver<AndroidElement> driver) 
	{	super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);  }

	public void FullScreencommon() throws Throwable 
	{
		try 
		{
			System.out.println("FullScreen inner loop1 Enter ");
			Thread.sleep(15000);
			FullScreen_OR.ContentName.isDisplayed();
			System.out.println("Content Name :--"+ text);

			//FullScreen_OR.clickonplayerscreen.click();
			key.tap();
			System.out.println("Clicked on player screen1");

			/*FullScreen_OR.clickonplayerscreen.click();////dummy
			System.out.println("Clicked on player screen2");*/
			//FullScreen_OR.clickFullScreenicon.click();
			FullScreen_OR.clickFullScreen.click();
			System.out.println("Successfully clicked on Full screen icon");

			Thread.sleep(3000);
			key.BrightnessSwipe();

			//System.out.println("volume");

			Thread.sleep(1000);
			key.SeekbarSwipe();
			System.out.println("seekbar");

			Thread.sleep(1000);
			FullScreen_OR.clickonplayerscreen.click();
			System.out.println("Clicked on player screen");

			key.backDevice();

			Thread.sleep(1000);
			/*FullScreen_OR.clickonplayerscreen.click();
			System.out.println("Clicked on player screen");

			key.backDevice();
			Thread.sleep(1000);
			key.backDevice();*/
		}
		catch(Exception e)
		{
			System.out.println("FullScreen inner loop1 Catch Enter");
			Thread.sleep(1000);
			key.backDevice();
			key.backDevice();
			Thread.sleep(3000);
			FullScreen_OR.ContentName.isDisplayed();
			text=FullScreen_OR.ContentName.getText();
			System.out.println(text +"  is Zee5 Content Name");
		}
		
		Thread.sleep(3000);
		WatchlistShare();
		
		
	}
	

	public void FullScreen() throws Throwable 
	{
		try 
		{
			System.out.println("FullScreen main loop Enter");
			Thread.sleep(10000);
			
				try
				{
					FullScreen_OR.Playicon.isDisplayed();
					System.out.println("Content is playing");
					
					FullScreencommon();
				}
				catch(Exception e)
				{
					FullScreen_OR.clickonplayerscreen.click();
					System.out.println("Clicked on player screen");
					Thread.sleep(10000);
					
								try 
								{
									Thread.sleep(5000);
									FullScreen_OR.ContentName.isDisplayed();
									FullScreencommon();
												
								}
								catch(Exception x)
								{
									System.out.println("zee5 verify Inner Loop Catch");
									Thread.sleep(8000);
									key.Zee5();
									Thread.sleep(8000);
									
									Thread.sleep(3000);
									FullScreen_OR.PrintText.isDisplayed();
									text=FullScreen_OR.PrintText.getText();
									System.out.println(text +" -----Screen launched"); 
									
									key.backDevice();
									System.out.println("Home screen launched");
								}
				}
		}

		catch(Exception e)
		{
			System.out.println("FullScreen main loop Catch");
			//System.out.println(e);
			System.out.println(e);
			key.backDevice();
		}
	}

	
	public void WatchlistShare() throws Throwable 
	{
		Thread.sleep(8000);
		try
		{
			System.out.println("WatchlistShare Main loop Enter");
			Thread.sleep(3000);
			text=FullScreen_OR.ContentName.getText();	
			System.out.println(text +"  Content Name");

			Thread.sleep(1000);
			text=FullScreen_OR.ContentDescription.getText();	
			System.out.println(text +"  Content Description");

			Thread.sleep(2000);
			FullScreen_OR.ContentWatchlist.click();	
			text=FullScreen_OR.ContentName.getText();	
			System.out.println(text +" Content watchlisted ");

			Thread.sleep(3000);
			text=FullScreen_OR.ContentName.getText();	
			FullScreen_OR.Contentshare.click();
			System.out.println(  text+"  Content share");

			Thread.sleep(8000);
			FullScreen_OR.clickGmail.click();
			System.out.println("Successfully clicked on Gmail icon");

			Thread.sleep(3000);
			FullScreen_OR.toEmail.sendKeys("kravi@apalya.com");
			System.out.println("Successfully enter To Email");

			Thread.sleep(3000);
			FullScreen_OR.clickonSendicon.click();
			System.out.println("Successfully clicked on send icon");

		}
		catch(Exception e)
		{
			System.out.println("WatchList Main Loop Failed");
			Thread.sleep(3000);
			key.backDevice();
		}


		try
		{
			System.out.println("WatchlistShare  inner loop2 Enter");
			Thread.sleep(3000);
			FullScreen_OR.PrintText.isDisplayed();
			text=FullScreen_OR.PrintText.getText();
			System.out.println(text +" Screen launched"); 
			key.backDevice();
			System.out.println("Tapped on Back button");
			Thread.sleep(1000);
			key.backDevice();
			System.out.println("Tapped on Back button");
			Thread.sleep(1000);
			key.backDevice();
			System.out.println("Tapped on Back button");
		}
		catch(Exception e)
		{
			System.out.println("WatchlistShare inner loop2 catch");
			System.out.println(text +" screen not launched");

		}

	}

//-------------------------------------------------------------------------------------------------------
	public void TabsContent2() throws Throwable
	{

		try {
			System.out.println("Tabs Content Main Loop Enter");
			Thread.sleep(2000);
			key.verticalSwipeOnce();

			FullScreen_OR.clickViewall2.click();
			System.out.println("Clicked on More");

			Thread.sleep(3000);
			text=FullScreen_OR.PrintText.getText();
			System.out.println(text +" -----Screen launched"); 

			Thread.sleep(5000);
			//FullScreen_OR.clickonContent.click();//working
			//FullScreen_OR.Contentclick.click();
						try
						{
							Assert.assertTrue(FullScreen_OR.clickonContentnew.isDisplayed());
							Thread.sleep(5000);
							FullScreen_OR.clickonContentnew.click();//News & Tv 
							//FullScreen_OR.JustClick.click(); not working
							System.out.println("Clicked on  content... ");
			
						}
						catch(Exception e)
						{
							FullScreen_OR.Contentclick.click();//Movies & Originals
							//FullScreen_OR.JustClick.click(); not working
							System.out.println("Clicked on  content");
						}

			try 
			{
				Thread.sleep(5000);
				System.out.println("TabsContent Inner Loop Try");
				FullScreen_OR.ContentName.isDisplayed();
				text=FullScreen_OR.ContentName.getText();
				System.out.println("Content Name :--" +text );

				FullScreen();
				//WatchlistShare();

			}
			catch(Exception e)
			{
				System.out.println("TabsContent Inner Loop Catch");
				Thread.sleep(8000);
				key.Zee5();
				Thread.sleep(8000);
				
				try {
					FullScreen_OR.PrintText.isDisplayed();
					text=FullScreen_OR.PrintText.getText();
					System.out.println(text +" -----Screen launched"); 
					key.backDevice();
					
					Thread.sleep(5000);
					System.out.println("Home screen launched");
					
				}
				catch(Exception a)
				{
					Thread.sleep(5000);
					System.out.println("Home screen launched");
				}
				
				/*key.backDevice();
				Thread.sleep(3000);
				try {
					driver.findElement(By.id("android:id/button1")).click();

				}

				catch(Exception x)
				{
					System.out.println("alert not working");

				}


				FullScreen_OR.ContentName.isDisplayed();
				text=FullScreen_OR.ContentName.getText();
				System.out.println(text +"  Content Name");
				System.out.println("Zee5  Content Name");

				WatchlistShare();
				Thread.sleep(2000);
				key.backDevice();
				key.backDevice();*/
			}

		}
		catch(Exception e)
		{
			System.out.println("Tabs Content Main Loop Catch");
			System.out.println(text +"  ----Falied at this screen"); 
			Thread.sleep(8000);
			key.backDevice();
			//FullScreen_OR.txtHomeContentClick.click();
			System.out.println("Clicked on Home content");
		}

	}
	
//-------------------------------------------------------------------------------------------------------	

	public void TabsContent() throws Throwable
	{

		try {
			System.out.println("Tabs Content Main Loop Enter");
			Thread.sleep(2000);
			key.verticalSwipeOnce();

			FullScreen_OR.clickViewall.click();
			System.out.println("Clicked on More");

			Thread.sleep(3000);
			text=FullScreen_OR.PrintText.getText();
			System.out.println(text +" -----Screen launched"); 

			Thread.sleep(8000);
			//FullScreen_OR.clickonContent.click();//working
			//FullScreen_OR.Contentclick.click();
						try
						{
							Assert.assertTrue(FullScreen_OR.clickonContentnew.isDisplayed());
							//FullScreen_OR.clickonContentnew.click();//News & Tv 
							key.tap();
							System.out.println("Clicked on  content.. ");
			
						}
						catch(Exception e)
						{
							Assert.assertTrue(FullScreen_OR.Contentclick.isDisplayed());
							//FullScreen_OR.Contentclick.click();//Movies & Originals
							key.tap();
							System.out.println("Clicked on  content");
						}

			try 
			{
				Thread.sleep(3000);
				System.out.println("TabsContent Inner Loop Try");
				FullScreen_OR.ContentName.isDisplayed();
				text=FullScreen_OR.ContentName.getText();
				System.out.println("Content Name :--" +text );

				FullScreen();
				WatchlistShare();

			}
			catch(Exception e)
			{
				System.out.println("TabsContent Inner Loop Catch");
				//Thread.sleep(1000);
				key.backDevice();
				key.backDevice();
				Thread.sleep(3000);
				try {
					driver.findElement(By.id("android:id/button1")).click();

				}

				catch(Exception x)
				{
					System.out.println("alert not working");

				}


				FullScreen_OR.ContentName.isDisplayed();
				text=FullScreen_OR.ContentName.getText();
				System.out.println(text +"  Content Name");
				System.out.println("Zee5  Content Name");

				WatchlistShare();
				Thread.sleep(2000);
				key.backDevice();
				key.backDevice();
			}

		}
		catch(Exception e)
		{
			System.out.println("Tabs Content Main Loop Catch");
			System.out.println(text +"  ----Falied at this screen"); 
			Thread.sleep(8000);
			key.backDevice();
			//FullScreen_OR.txtHomeContentClick.click();
			System.out.println("Clicked on Home content");
		}

	}


	public void FullScreenPage() throws Throwable {
		try {

			System.out.println("---------->TestCase ID :39	Full Screen <------");
			Thread.sleep(5000);
			/*System.out.println("---------------Home Tab----------------");
			FullScreen_OR.Hometab.click();
			TabsContent();*/
			//WatchlistShare();
			//FullScreen();
			
			try { key.Exit(); }
			catch(Exception a)
			{}
			
			//--------News Tab
			Thread.sleep(3000);
			System.out.println("");
			System.out.println("---------------News Tab----------------");
			key.Exit();
			FullScreen_OR.Newstab.click();
			//TabsContent();
			TabsContent2();
			
			//--------TV Tab
			Thread.sleep(3000);
			System.out.println("");
			System.out.println("---------------TV Tab----------------");
			FullScreen_OR.TVtab.click();
			//TabsContent();
			TabsContent2();
			
			//--------Movies Tab
			Thread.sleep(3000);
			System.out.println("");
			System.out.println("---------------Movies Tab----------------");
			FullScreen_OR.Moviestab.click();
			TabsContent2();
			
			//--------News Tab
			/*Thread.sleep(3000);
			System.out.println("");
			System.out.println("---------------News Tab----------------");
			FullScreen_OR.Newstab.click();
			//TabsContent();
			TabsContent2();*/

			//--------Originals Tab
			Thread.sleep(3000);
			System.out.println("");
			System.out.println("---------------Originals Tab----------------");
			FullScreen_OR.Originalstab.click();
			TabsContent2();
		
	
			
	
			Thread.sleep(2000);
			System.out.println("---------->TestCase ID :39	Full Screen <----PASS--");
		}

		catch (Exception e) { e.printStackTrace(); }

	}

}