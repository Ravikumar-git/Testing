package vodafone.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import objectRepositary.CPicons_OR;
import objectRepositary.ContentLanguages_OR;
import objectRepositary.FullScreen_OR;
import objectRepositary.HelpPage_OR;
import objectRepositary.Search_OR;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import vodafone.pages.Applaunch;
import vodafone.pages.SearchPage;


public class CPiconsPage extends CPicons_OR{
	public static AndroidDriver<AndroidElement> driver;
	String text,text1;

	Applaunch key =new Applaunch();	

	public CPiconsPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	public void CPicons() throws Throwable {
		Thread.sleep(8000);

		try {

			System.out.println("---------->TestCase ID 	CPicons<------");
			
			Thread.sleep(3000);
			key.verticalDownSwipe();
			CPicons_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");
			Thread.sleep(2000);
			System.out.println("");
			CPicons_OR.Shemaroo.click();
			System.out.println("Successfully clicked Shemaroo in Cpicons");
			Common();
			key.backDevice();
			
			Thread.sleep(3000);
			key.verticalDownSwipe();
			CPicons_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");
			Thread.sleep(2000);
			System.out.println("");
			CPicons_OR.hoichoi.click();
			System.out.println("Successfully clicked hoichoi in Cpicons");
			Common();
			key.backDevice();
			
						
			key.verticalDownSwipe();
			Thread.sleep(3000);
			CPicons_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");
			Thread.sleep(2000);
			System.out.println("");
			CPicons_OR.Sunnxt.click();
			System.out.println("Successfully clicked Sunnxt in Cpicons");
			Common();
			key.backDevice();
			
			
			Thread.sleep(3000);
			key.verticalDownSwipe();
			CPicons_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");
			Thread.sleep(2000);
			System.out.println("");
			CPicons_OR.Sonyliv.click();
			System.out.println("Successfully clicked Sonyliv in Cpicons");
			Common();
			key.backDevice();
			
			Thread.sleep(3000);
			key.verticalDownSwipe();
			CPicons_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");
			Thread.sleep(2000);
			System.out.println("");
			CPicons_OR.Lionsgate.click();
			System.out.println("Successfully clicked Lionsgate in Cpicons");
			Common();
			key.backDevice();
				

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


	public void ContentDetails()  throws Throwable
	{
		Thread.sleep(5000);
		try {
			key.tap();
			Thread.sleep(3000);
			text=CPicons_OR.ContentTitle.getText();
			//System.out.println("Content title ---" +text);
			System.out.println(text);
		}
		catch (Exception e) {
			System.out.println(" Content title not displaying ");

		}

		try {
			text=CPicons_OR.releaseDate.getText();
			text1=CPicons_OR.Duration.getText();
			//System.out.println("Content Releasedate & Duration--- " +text + text1);
			System.out.println(text +" * " +text1);

		}
		catch (Exception e) {
			System.out.println(" Content duration not displaying ");
		}

		try {
			text=CPicons_OR.Lang.getText();
			text1=CPicons_OR.Genre.getText();
			//System.out.println("Content Genre & language--- " +text + text1);
			System.out.println(text +" * " +text1);
		}
		catch (Exception e) {
			System.out.println(" Content Genre & language not displaying ");

		}

		try {
			text=CPicons_OR.ContentDescription.getText();
			//System.out.println("Content Description ----" +text);
			System.out.println(text);
		}
		catch (Exception e) {
			System.out.println(" Content Description not displaying ");
		}

		

		//-----------------------------------------------------------------

		try
		{
			Thread.sleep(30000);
			key.tap();
			//key.tap();
			
				try {
					Assert.assertTrue(CPicons_OR.downarrow.isDisplayed());
					CPicons_OR.downarrow.click();
					System.out.println("Dragged to Miniplayer icon");
				}
				catch(Exception e)
				{
					key.backDevice();
					System.out.println("Tapped on back key");
				}
			
				
			/*CPicons_OR.downarrow.click();
			System.out.println("Dragged to Miniplayer icon");*/

			Thread.sleep(5000);
			CPicons_OR.PrintText.isDisplayed();
			text=CPicons_OR.PrintText.getText();
			System.out.println(text +"---Screen launched"); 
			Thread.sleep(1000);
			key.backDevice();
			Thread.sleep(1000);
			//key.backDevice();
		}
		catch(Exception e)
		{
			System.out.println("Main screen launched");
			//System.out.println(text +" screen not launched");
		}

	}

	
	
	public void Common() throws Throwable {

		Thread.sleep(5000);
		CPicons_OR.Banner.click();
		System.out.println("Successfully clicked on Banner");
		Thread.sleep(5000);
		key.tap();
		System.out.println("Tapped on screen");
		ContentDetails();
		//Common();

		/*Thread.sleep(5000);
		text=CPicons_OR.Carousel1.getText();
		System.out.println(text+ "---Carousel title");
		CPicons_OR.Carousel1.click();
		Thread.sleep(5000);
		CPicons_OR.PrintText.isDisplayed();
		text=CPicons_OR.PrintText.getText();
		System.out.println(text +"---Screen launched"); 
		key.tap();
		System.out.println("Tapped on screen");
		ContentDetails();
		//Common();
		key.verticalSwipeOnce();*/

		Thread.sleep(5000);
		text=CPicons_OR.Carousel2.getText();
		System.out.println(text+ "---Carousel title");
		CPicons_OR.Carousel2.click();
		Thread.sleep(5000);
		CPicons_OR.PrintText.isDisplayed();
		text=CPicons_OR.PrintText.getText();
		System.out.println(text +"---Screen launched"); 
		key.tap();
		System.out.println("Tapped on screen");
		ContentDetails();
		//Common();
		key.verticalSwipeOnce();

		Thread.sleep(5000);
		text=CPicons_OR.Carousel3.getText();
		System.out.println(text+ "---Carousel title");
		CPicons_OR.Carousel3.click();
		Thread.sleep(5000);
		CPicons_OR.PrintText.isDisplayed();
		text=CPicons_OR.PrintText.getText();
		System.out.println(text +"---Screen launched"); 
		key.tap();
		System.out.println("Tapped on screen");
		ContentDetails();
		//Common();
		key.verticalSwipeOnce();
	}
}
