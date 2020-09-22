package vodafone.pages;

import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.PageFactory;

import objectRepositary.ContinueWatching_OR;
import objectRepositary.LoginPage_OR;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContinueWatchingpage extends ContinueWatching_OR{
	public static AndroidDriver<AndroidElement> driver;  

//private AndroidDriver<AndroidElement> driver;


	 public ContinueWatchingpage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
 Applaunch key= new Applaunch();
 String text;
	public void ContinueWatching() throws Throwable {
		try {
			
			System.out.println("TestCase 22: Continue watching in home page tab.");
			
				Thread.sleep(1000);
				ContinueWatching_OR.clickHometab.click();
				System.out.println("Successfully clicked on Home tab");
				System.out.println("starting");
				key.ContinueWatchingSwipe();
				
				//swipe.swipeByElements(WatchLiveTvCarousel, ContinueWatchingCarousel);
				
				System.out.println("swipping");
				
						
				Thread.sleep(1000);
				ContinueWatching_OR.ContinueWatchingContentClick.click();
				System.out.println("Successfully clicked on Continue watching carousal play icon");
				
				Thread.sleep(5000);
				text=LoginPage_OR.ContentName.getText();
				System.out.println("Content Playback name is :"+ text);
				
				key.tap();
				System.out.println("Successfully tapped on content");
				
				Thread.sleep(100);
				ContinueWatching_OR.downarrow.click();
				System.out.println("Successfully clicked on Mini player icon");
				
				key.backDevice();
				
				Thread.sleep(500);
				
				key.verticalSwipe();
				
				Thread.sleep(1000);
				ContinueWatching_OR.clickDeleteicon.click();
				System.out.println("Successfully clicked on Delete movie icon in Continue watching carousal");
					
				Thread.sleep(500);
				System.out.println("TestCase 22: Continue watching in home page tab.----PASS");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	
}
	
	

}