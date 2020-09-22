package vodafone.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.BannersScrolling_OR;
import objectRepositary.CPicons_OR;
import objectRepositary.ExitApp_OR;
import vodafone.pages.Applaunch;


public class ExitappPage extends ExitApp_OR{
	public static AndroidDriver<AndroidElement> driver;  

	String text,text1;
	Applaunch key = new Applaunch();
	
//private AndroidDriver<AndroidElement> driver;


	 public ExitappPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	public void Exitapp() throws Throwable {
		System.out.println();
		System.out.println("----------Exit Popup Testcase-----------");
		Thread.sleep(5000);
		key.backDevice();
		key.backDevice();
		
				try {
					Assert.assertTrue(ExitApp_OR.Exitpopupheading.isDisplayed());
					System.out.println("Exit popup displaying");
					
					text=ExitApp_OR.Exitpopupheading.getText();
					System.out.println(text);
					
					text=ExitApp_OR.ExitpopupSubheading.getText();
					System.out.println(text);
					
					Thread.sleep(3000);
					ExitApp_OR.popupClose.click();
					System.out.println("Close the Exit popup");
					
					Thread.sleep(10000);
					}
					catch(Exception e)
					{
						System.out.println("Exit popup not displaying1");
					}
				
				//Show more button
				key.backDevice();
				System.out.println("Back button");
				try {
					Thread.sleep(5000);
					Assert.assertTrue(ExitApp_OR.Exitpopupheading.isDisplayed());
					System.out.println("Exit popup displaying");
					
					Thread.sleep(3000);
					ExitApp_OR.ShowMorebtn.click();
					Thread.sleep(5000);
					
					ExitApp_OR.PrintText.isDisplayed();
					text=ExitApp_OR.PrintText.getText();
					System.out.println(text +"---Screen launched"); 
					key.tap();
					System.out.println("Tapped on Content");
					ContentDetails();
					
					}
					catch(Exception e)
					{
						System.out.println("Exit popup not displaying2");
					}
				
				//Carousel content
				key.backDevice();
				key.backDevice();
				try {
					Thread.sleep(5000);
					Assert.assertTrue(ExitApp_OR.Exitpopupheading.isDisplayed());
					System.out.println("Exit popup displaying");
					
					Thread.sleep(3000);
					ExitApp_OR.Carosuelcontent.click();
					Thread.sleep(5000);
					
					/*ExitApp_OR.PrintText.isDisplayed();
					text=ExitApp_OR.PrintText.getText();
					System.out.println(text +"---Screen launched"); */
					key.tap();
					System.out.println("Tapped on Content");
					ContentDetails();
					
					}
					catch(Exception e)
					{
						System.out.println("Exit popup not displaying2");
					}
				
				//Exit Popup
				key.backDevice();
				key.backDevice();
				try {
					Thread.sleep(5000);
					Assert.assertTrue(ExitApp_OR.Exitpopupheading.isDisplayed());
					System.out.println("Exit popup displaying");
					
					Thread.sleep(3000);
					ExitApp_OR.Exitbtn.click();
					Thread.sleep(5000);
					
					System.out.println("----------Exit Popup Testcase-----PASS------");
															
					}
					catch(Exception e)
					{
						System.out.println("Exit popup not displaying2");
					}
					
	}
	
	
	public void ContentDetails()  throws Throwable
	{
		Thread.sleep(5000);
		try {
			key.tap();
			Thread.sleep(3000);
			text=ExitApp_OR.ContentTitle.getText();
			//System.out.println("Content title ---" +text);
			System.out.println(text);
		}
		catch (Exception e) {
			System.out.println(" Content title not displaying ");

		}

		try {
			text=ExitApp_OR.releaseDate.getText();
			text1=ExitApp_OR.Duration.getText();
			//System.out.println("Content Releasedate & Duration--- " +text + text1);
			System.out.println(text +" * " +text1);

		}
		catch (Exception e) {
			System.out.println(" Content duration not displaying ");
		}

		try {
			text=ExitApp_OR.Lang.getText();
			text1=ExitApp_OR.Genre.getText();
			//System.out.println("Content Genre & language--- " +text + text1);
			System.out.println(text +" * " +text1);
		}
		catch (Exception e) {
			System.out.println(" Content Genre & language not displaying ");

		}

		try {
			text=ExitApp_OR.ContentDescription.getText();
			//System.out.println("Content Description ----" +text);
			System.out.println(text);
		}
		catch (Exception e) 
		{
				System.out.println("-----App redirected to Zee5.....");
				key.Zee5();
				Thread.sleep(2000);
			}

		

//-----------------------------------------------------------------

		try
		{
			Thread.sleep(40000);
			ExitApp_OR.ContentDescription.isDisplayed();
			key.tap();
			try {
				Assert.assertTrue(ExitApp_OR.downarrow.isDisplayed());
				ExitApp_OR.downarrow.click();
			System.out.println("Dragged to Miniplayer icon");
			}
			catch(Exception e)
			{
				key.backDevice();
				System.out.println("Tapped on device Backkey");
			}
			
			Thread.sleep(5000);
			ExitApp_OR.PrintText.isDisplayed();
			text=ExitApp_OR.PrintText.getText();
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
	

}
