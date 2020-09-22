package objectRepositary;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class Bitrates_OR {
	
	 public Bitrates_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 
	 @AndroidFindBy(id = "com.vodafone.vodafoneplay:id/back_nav_icon_layout_2")
		public static AndroidElement downarrow;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
		public static AndroidElement Moviestab;
	  	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='News']")
		public static AndroidElement clickNewstab;
	 	
	
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
		public static AndroidElement Hometab;
	 	
		//@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/overlay_ripple']")
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
		public static AndroidElement clickonContent;
		
		//@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/playerquality']")
		//(//android.widget.ImageView[@content-desc="hello_world"])[1]
			//	com.vodafone.vodafoneplay:id/qualitySelectionTV
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"hello_world\"])[1]")
		public static AndroidElement clickBitrateicon;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='High']")
		public static AndroidElement Selecthighbitrate;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Low']")
		public static AndroidElement Selectlowbitrate;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Medium']")
		public static AndroidElement Selectmediumbitrate;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Auto']")
		public static AndroidElement Selectautobitrate;
		
			
		@AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='1']")
		public static AndroidElement Clickonplayer;
		
		
		/*@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement downarrow;*/
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
	  	public static AndroidElement PrintText;
		
		//----------------------------
		
		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_1']")
		public static AndroidElement txtContinuebutton;

		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_2']")
		public static AndroidElement otpbtn;


		@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/otp_mobile_no']")
		public static AndroidElement txtMobileNumber;


		//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_view_all']")
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/arrow_view_all']")
		public static AndroidElement clickViewall;
		
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/arrow_view_all'])[2]")
		public static AndroidElement clickViewall2;
		
		@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[3]")
		public static AndroidElement Carousel3;
		
		@AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id='com.vodafone.vodafoneplay:id/layout_thumbnail'])[5]")
		public static AndroidElement clickonContent1;

		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
		public static AndroidElement Contentclick;
	
		
	}