package objectRepositary;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class MyWatchlistAddingRemoving_OR {
	
	 public MyWatchlistAddingRemoving_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
		public static AndroidElement clickMoviestab;
	  		  	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='News']")
		public static AndroidElement clickNewstab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Originals']")
		public static AndroidElement clickOriginalstab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TV']")
		public static AndroidElement clickTVtab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
		public static AndroidElement Hometab;
	 	
	//	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/overlay_ripple']")
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
		public static AndroidElement clickonContent;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlist']")
		public static AndroidElement Watchlist;
		
			
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/back_nav_icon']")
		public static AndroidElement clickMiniplayer;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbriefdescription_favourite_img']")
		public static AndroidElement clickMywatchlisticon;
	 	
	  	@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement clickHambergerMenu;
	 
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My WatchList']")
		public static AndroidElement clickMyWatchlisttab;
	  	
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
		public static AndroidElement clickMovies;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='TV Shows']")
		public static AndroidElement clickTVShows;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Live TV']")
		public static AndroidElement clickLiveTV;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Videos']")
		public static AndroidElement clickVideos;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Trailer']")
		public static AndroidElement clickTrailer;
		
		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/overlay_ripple']")
		public static AndroidElement clickonMoviethumbnailinMywatchlist;
			
		
		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_1']")
		public static AndroidElement txtContinuebutton;

		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_2']")
		public static AndroidElement otpbtn;


		@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/otp_mobile_no']")
		public static AndroidElement txtMobileNumber;


		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_view_all']")
		public static AndroidElement clickViewall;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
	  	public static AndroidElement PrintText;
		
		
}
