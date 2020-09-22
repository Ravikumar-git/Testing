package objectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage_OR {

	public LoginPage_OR(AppiumDriver<AndroidElement> driver) 
	{

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);	 

	}
	// Page Objects Of Login Page 
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/contentLanguagesTitle")
	public static AndroidElement contentLanguage;
	
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/save_button")
	public static AndroidElement saveButton;

	//@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/overlay_ripple']")
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
	public static AndroidElement txtHomeContentClick;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/otp_mobile_no']")
	public static AndroidElement txtMobileNumber;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_1']")
	public static AndroidElement txtContinuebutton;


	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/otp_text_enter_otp']")
	public static AndroidElement txtenterotp;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_2']")
	public static AndroidElement otpbtn;

	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	public static AndroidElement downarrow;
	
	
	
	//@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/back_nav_icon_2']")
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/back_nav_icon_2")
	public static AndroidElement backarrow;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter 6-digit OTP']")
	public static AndroidElement otpfield;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/playerfullscreenimage']")
	public static AndroidElement clickFullScreenicon;
	
	//------------------VerifyingContentsinAlltabs
	
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
	
 	//------------------OTPresendOTP
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	public static AndroidElement invalidPopup;
 	
 	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/G1G2PopupButton")
	public static AndroidElement SwitchtoVodafone;
 	
 	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/g1g2_popup_message")
	public static AndroidElement SwitchtoVodafonemsg;
 	
 	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/closeG1G2Popup")
	public static AndroidElement SwitchtoVodafoneclose;
 	
 	
 	
 	
 	
 	
 	@AndroidFindBy(id = "android:id/message")
	public static AndroidElement invalidOTPpopup;
 	
 	@AndroidFindBy(id = "android:id/button1")
	public static AndroidElement invalidPopupOkbutton;
 	
 	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/otp_btn_1")
	public static AndroidElement resendOTP;
 	
 	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/otp_heading1")
	public static AndroidElement OTPmessage;
 	
 	//--------------------------Content details
 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename']")
	public static AndroidElement ContentName;
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_description']")
	public static AndroidElement ContentSynopsis;
 	
 	
 	//@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_view_all']")
 	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/arrow_view_all']")
	public static AndroidElement clickViewall;
	
 //	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
 	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.vodafone.vodafoneplay:id/recycler_view_movie']//android.widget.FrameLayout[1]")
	public static AndroidElement Contentclick;
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
  	public static AndroidElement PrintText;
 	
 	
 	
 	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Watchlist']")
	public static AndroidElement Watchlist;
 	
 	
 	
}
