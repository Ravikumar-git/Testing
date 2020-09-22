package vodafone.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.BannersScrolling_OR;
import objectRepositary.CPicons_OR;
import objectRepositary.LoginPage_OR;

public class BannersScrollingpage extends BannersScrolling_OR{
	public static AndroidDriver<AndroidElement> driver;  

	public BannersScrollingpage(AppiumDriver<AndroidElement> driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	Applaunch key= new Applaunch();
	
	String text,text1;
	
	/*public void zee5() throws Exception{
		System.out.println("aaa1");
		text=driver.findElement(By.id("android:id/button_once")).getText();
		System.out.println("sda");
		//driver.findElement(By.xpath("//*[@text='Open with ZEE5']")).getText();

		System.out.println(text);
		Thread.sleep(3000);
		text=driver.findElement(By.id("android:id/title")).getText();
		System.out.println(text);

	} */
	
	
	public void ContentDetails()  throws Throwable
	{
		Thread.sleep(5000);
		key.verticalDownSwipe();
		Thread.sleep(3000);
		for (int i=1; i<4; i++)
		{
			//BannersScrolling_OR.BannerContentClick.isDisplayed();
			key.horizontalSwipe();
			BannersScrolling_OR.BannerContentClick.click();
			System.out.println("Successfully clicked on Banner content");
			Thread.sleep(20000);
			
		try {
			key.tap();
			Thread.sleep(3000);
			text=BannersScrolling_OR.ContentTitle.getText();
			System.out.println(text);
		}
		catch (Exception e) {
			System.out.println("Content title not displaying ");

		}

		try {
			text=BannersScrolling_OR.releaseDate.getText();
			text1=BannersScrolling_OR.Duration.getText();
			System.out.println(text +" * " +text1);

		}
		catch (Exception e) {
			System.out.println("Content duration not displaying ");
		}

		try {
			text=BannersScrolling_OR.Lang.getText();
			text1=BannersScrolling_OR.Genre.getText();
			//System.out.println("Content Genre & language--- " +text + text1);
			System.out.println(text +" * " +text1);
		}
		catch (Exception e) {
			System.out.println("Content Genre & language not displaying ");

		}

		try {
			text=BannersScrolling_OR.ContentDescription.getText();
			//System.out.println("Content Description ----" +text);
			System.out.println(text);
			
			
			//------------------------------------------------------------------------------------
			try
			{
				Thread.sleep(40000);
				BannersScrolling_OR.ContentDescription.isDisplayed();
				try {
					//BannersScrolling_OR.ContentDescription.isDisplayed();
					key.tap();
					Thread.sleep(500);
					Assert.assertTrue(BannersScrolling_OR.downarrow.isDisplayed());
					BannersScrolling_OR.downarrow.click();
					System.out.println("Dragged to Miniplayer icon");
					Thread.sleep(5000);
					key.backDevice();
					System.out.println("Miniplayer closed");
					key.Later();
				}
				catch(Exception e)
				{
					BannersScrolling_OR.ContentDescription.isDisplayed();
					Thread.sleep(2000);
					key.backDevice();
					System.out.println("Tapped on device Backkey");
				}
				
				try {
					Thread.sleep(1000);
					key.verticalDownSwipe();
					Thread.sleep(2000);
					key.horizontalSwipe();
					System.out.println(i +"times swipe");
					//key.backDevice();
				}
				catch(Exception e)
				{
					System.out.println("Main screen launched1");
				}
			}
			catch(Exception e)
			{
				System.out.println("Main screen launched");
				//System.out.println(text +" screen not launched");
			}
			
			//------------------------------------------------------------------------------------
			
			
		}
		catch (Exception e) {
			System.out.println("-----App redirected to Zee5.....");
			key.Zee5();
			Thread.sleep(2000);
			
			try
			{
				Thread.sleep(40000);
				BannersScrolling_OR.ContentDescription.isDisplayed();
				
					//BannersScrolling_OR.ContentDescription.isDisplayed();
					key.backDevice();
					System.out.println("Main screen launched");
								
				try {
					Thread.sleep(1000);
					key.verticalDownSwipe();
					Thread.sleep(2000);
					key.horizontalSwipe();
					System.out.println(i +"times swipe");
					//key.backDevice();
				}
				catch(Exception a)
				{
					System.out.println("Main screen launched1");
				}
			}
			catch(Exception x)
			{
				System.out.println("Main screen launched");
				//System.out.println(text +" screen not launched");
			}
			
			
			//System.out.println("Content Description not displaying ");
		}

		

		//-----------------------------------------------------------------

		/*try
		{
			Thread.sleep(40000);
			BannersScrolling_OR.ContentDescription.isDisplayed();
			try {
				//BannersScrolling_OR.ContentDescription.isDisplayed();
				key.tap();
				Thread.sleep(500);
				Assert.assertTrue(BannersScrolling_OR.downarrow.isDisplayed());
				BannersScrolling_OR.downarrow.click();
				System.out.println("Dragged to Miniplayer icon");
				Thread.sleep(5000);
				key.backDevice();
				System.out.println("Miniplayer closed");
			}
			catch(Exception e)
			{
				BannersScrolling_OR.ContentDescription.isDisplayed();
				Thread.sleep(2000);
				key.backDevice();
				System.out.println("Tapped on device Backkey");
			}
			
			try {
				Thread.sleep(1000);
				key.verticalDownSwipe();
				Thread.sleep(2000);
				key.horizontalSwipe();
				System.out.println(i +"times swipe");
				//key.backDevice();
			}
			catch(Exception e)
			{
				System.out.println("Main screen launched1");
			}
		}
		catch(Exception e)
		{
			System.out.println("Main screen launched");
			//System.out.println(text +" screen not launched");
		}*/
		
		}//For loop

	}
	
			
	public void BannersScrolling() throws Throwable {
		try {
			
			//login();
						
			System.out.println("--------->Test Case ID:8	Banners for all tabs (Playback, Auto-Scrolling, Banner images).<----------");
			//--------------------Home
			Thread.sleep(2000);
			
			//-----------------News
			Thread.sleep(3000);
			BannersScrolling_OR.clickNewstab.click();
			System.out.println("");
			System.out.println("--------------------Clicked on News tab----------------");
			Thread.sleep(3000);
			 ContentDetails();

			
			//-----------------TV
			 Thread.sleep(3000);
			//key.backDevice();
			 System.out.println("");
			System.out.println("-------------------Clicked on Tv tab-----------------------");
			BannersScrolling_OR.clickTVtab.click();
			Thread.sleep(3000);
			 ContentDetails();
			
			//------------------Movies
			Thread.sleep(3000);
			//key.backDevice();
			System.out.println("");
			System.out.println("--------------------------Clicked on Movies tab-----------------------------");
			BannersScrolling_OR.clickMoviestab.click();
			Thread.sleep(3000);
			 ContentDetails();

			//--------------Originals
			Thread.sleep(3000);
			//key.backDevice();
			System.out.println("");
			System.out.println("-----------------------Clicked on Originals tab-----------------------------");
			BannersScrolling_OR.clickOriginalstab.click();
			Thread.sleep(3000);
			 ContentDetails();

			
			Thread.sleep(5000);
			/*BannersScrolling_OR.clickHometab.click();
			System.out.println("Clicked on Home tab");

			System.out.println("waiting");
			Thread.sleep(8000);
			key.backDevice();
			System.out.println("Mini player closed");*/
			Thread.sleep(3000);
			System.out.println("Banners scrolling test case pass");


			System.out.println("--------->Test Case ID:8	Banners for all tabs (Playback, Auto-Scrolling, Banner images).<----------");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("--------->FAIL--Banners for all tabs (Playback, Auto-Scrolling, Banner images).<----------");
		}

	}

}

