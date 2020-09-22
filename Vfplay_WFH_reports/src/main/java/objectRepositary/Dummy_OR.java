package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Dummy_OR {

	public Dummy_OR(AppiumDriver<AndroidElement> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 

	}

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/arrow_view_all']")
	public static AndroidElement clickViewall;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
	public static AndroidElement clickonContent;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.vodafone.vodafoneplay:id/recycler_view_movie']//android.widget.FrameLayout[1]")
	public static AndroidElement Contentclick;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
	public static AndroidElement Moviestab;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
	public static AndroidElement txtHomeContentClick;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/otp_mobile_no']")
	public static AndroidElement txtMobileNumber;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_1']")
	public static AndroidElement txtContinuebutton1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Enter 6-digit OTP']")
	public static AndroidElement otpfield1;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/otp_btn_2']")
	public static AndroidElement otpbtn1;


//----------------------------------------------------------------------------------
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/qualitySelectionTV")
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
//---------------------------------------------------------------------------------------	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/contentLanguagesTitle")
	public static AndroidElement contentLanguage;
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/save_button")
	public static AndroidElement saveButton;
//-------------------------------------FFRR-----------------------------------------------------------
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/media_player_rewind_icon")
	public static AndroidElement rewind20;
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/media_player_fowrard_icon")
	public static AndroidElement forward20;
	
//-----------------------------------Miniplayer----------------------------------------------------	
	@AndroidFindBy(id = "com.android.systemui:id/expand")
	public static AndroidElement playerExpand;
	
		
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/back_nav_icon_layout_2")
	public static AndroidElement downarrow;
	
//-----------------------------------Like----------------------------------------------------		
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/detail_like_icon")
	public static AndroidElement Like;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/textViewName'])[7]")
	public static AndroidElement TeluguContentLanguage;
	
	
	
	
	
	

}
