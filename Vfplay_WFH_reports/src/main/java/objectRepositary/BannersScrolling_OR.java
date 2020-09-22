package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BannersScrolling_OR {

	public BannersScrolling_OR(AppiumDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
	}

	//@AndroidFindBy(xpath="(//android.widget.LinearLayout[#resource-id='com.vodafone.vodafoneplay:id/recyclerIndicator'])[5]")

	@AndroidFindBy(xpath="(//android.view.View)[5]")
	public static AndroidElement Bannerchange;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/tv_play")
	public static AndroidElement BannerContentClick;

	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Home']")
	public static AndroidElement clickHometab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='News']")
	public static AndroidElement clickNewstab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies']")
	public static AndroidElement clickMoviestab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TV']")
	public static AndroidElement clickTVtab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Originals']")
	public static AndroidElement clickOriginalstab;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/back_nav_icon_layout_2")
	public static AndroidElement downarrow;
	
	//@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename")
	//public static AndroidElement ContentName;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename']")
	public static AndroidElement ContentName;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/cardmediasubitemvideo_play_icon']")//not used
	public static AndroidElement clickPlayiconforTVshows;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']")//not used
	public static AndroidElement clickBackbutton;

	@AndroidFindBy(xpath = "(//android.widget.RelativeLayout[@resource-id='com.vodafone.vodafoneplay:id/layout_thumbnail'])[5]")//not used
	public static AndroidElement clickonContent;

	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/back_nav_icon']")//not used
	public static AndroidElement clickMiniplayericon;


	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.vodafone.vodafoneplay:id/grdient_container']")//not used
	public static AndroidElement clickOnBanner;
	
	//---------------------
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename']")
	public static AndroidElement ContentTitle;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
  	public static AndroidElement PrintText;
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/carddetailbriefdescription_language")
	public static AndroidElement  Lang;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/genre_lang_container")
	public static AndroidElement GenreLang;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/carddetailbriefdescription_genre")
	public static AndroidElement Genre;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbriefdescription_description']")
	public static AndroidElement ContentDescription;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/year_duration_container")
	public static AndroidElement durationContainer;

	@AndroidFindBy(id ="com.vodafone.vodafoneplay:id/carddetailbriefdescription_releasedate")
	public static AndroidElement releaseDate;
	
	@AndroidFindBy(id ="com.vodafone.vodafoneplay:id/carddetailbriefdescription_duration")
	public static AndroidElement Duration;
	

}

/*@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/viewpager_right_arrow']")
public static AndroidElement clickRightarrow;

@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/viewpager_left_arrow']")
public static AndroidElement clickLeftarrow;*/