package objectRepositary;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class ContinueWatching_OR {
	
	 public ContinueWatching_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
		public static AndroidElement clickHometab;
	  		  	
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie_play_continue_watching']")
		public static AndroidElement clickonContinueWatching;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/back_nav_icon']")
		public static AndroidElement clickMiniplayer;
		
		@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement downarrow;
		
			
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie_delete_icon'])[1]")
		public static AndroidElement clickDeleteicon;

		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
		public static AndroidElement txtHomeContentClick;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Continue Watching']")
		public static AndroidElement ContinueWatchingCarousel;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watch Live TV']")
		public static AndroidElement WatchLiveTvCarousel;
		
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie_play_continue_watching'])[1]")
		public static AndroidElement ContinueWatchingContentClick;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename")
		public static AndroidElement ContentName;
		
		//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie_play_continue_watching']
}
