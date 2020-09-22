package objectRepositary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class Viewall_OR {
	
	 public Viewall_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 
	 	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_view_all']")
	 	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/arrow_view_all']")
		public static AndroidElement clickViewall;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
		public static AndroidElement clickHometab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
		public static AndroidElement clickMoviestab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='News']")
		public static AndroidElement clickNewstab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TV']")
		public static AndroidElement clickTVtab;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Originals']")
		public static AndroidElement clickOriginalstab;
	 	
		
	 	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/cardmediasubitemvideo_play_icon']")
		public static AndroidElement clickPlayiconforTVshows;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']")
		public static AndroidElement clickBackbutton;
	 	
	 	//----
		@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
		public static AndroidElement Contentclick;
	 	//---------
	 	
	 	 	
	 	//@AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id='com.vodafone.vodafoneplay:id/layout_thumbnail'])[5]")
	 	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/overlay_ripple']")
	 	public static AndroidElement clickonContent;
	 	
	 	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/back_nav_icon']")
		public static AndroidElement clickMiniplayericon;
	 	
	 	
	 	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_1']")
		public static AndroidElement txtContinuebutton;

		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_2']")
		public static AndroidElement otpbtn;


		@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/otp_mobile_no']")
		public static AndroidElement txtMobileNumber;
	 	

	}