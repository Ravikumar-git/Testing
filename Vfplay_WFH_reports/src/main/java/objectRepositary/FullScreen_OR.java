package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class FullScreen_OR {

	public FullScreen_OR(AppiumDriver<AndroidElement> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 

	}


	

	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[1]")
	public static AndroidElement PartnerName;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_1']")
	public static AndroidElement txtContinuebutton1;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter 6-digit OTP']")
	public static AndroidElement otpfield1;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_2']")
	public static AndroidElement otpbtn1;
	
	
	//id	com.vodafone.vodafoneplay:id/back_nav_icon_2
	//class	android.widget.ImageView

	//	 	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/overlay_ripple']")
	//		public static AndroidElement clickonContent;

	//androidx.recyclerview.widget.RecyclerView[@resource-id='com.vodafone.vodafoneplay:id/recycler_view_movie']/android.widget.FrameLayout[1]

	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.vodafone.vodafoneplay:id/recycler_view_movie']//android.widget.FrameLayout[1]")
	public static AndroidElement clickonContentnew;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
	public static AndroidElement Contentclick;

	//@AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id='com.vodafone.vodafoneplay:id/layout_thumbnail'])[5]")
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
	public static AndroidElement clickonContent;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
	public static AndroidElement JustClick;
	
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
	public static AndroidElement clickonContent1;

	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	public static AndroidElement downarrow;


	
	

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
	public static AndroidElement txtHomeContentClick;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename']")
	public static AndroidElement ContentName;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/playerfullscreenimage']")
	public static AndroidElement clickFullScreenicon;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/app_logo']")
	public static AndroidElement clickFullScreeniconinPlayer;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"hello_world\"])[2]") 
	public static AndroidElement clickFullScreen;
	

	
	
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

	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/media_player_play_pause_icon")
	public static AndroidElement Playicon;
	
	//------------------

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/subtitles_view")
	public static AndroidElement clickonplayerscreen;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbriefdescription_description']")
	public static AndroidElement ContentDescription;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbriefdescription_share_img']")
	public static AndroidElement Contentshare;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbriefdescription_favourite_img']")
	public static AndroidElement ContentWatchlist;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gmail']")
	public static AndroidElement clickGmail;

	@AndroidFindBy(xpath = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']")
	public static AndroidElement toEmail;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.gm:id/send']")
	public static AndroidElement clickonSendicon;

	//----------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	public static AndroidElement Hometab;
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
	public static AndroidElement Moviestab;
 	
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='News']")
	public static AndroidElement Newstab;
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TV']")
	public static AndroidElement TVtab;
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Originals']")
	public static AndroidElement Originalstab;

 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
  	public static AndroidElement PrintText;
 	
}
