package objectRepositary;


import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class CPicons_OR {

	public CPicons_OR(AppiumDriver<AndroidElement> driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
	}

	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	public static AndroidElement clickHambergerMenu;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/cp_logo'])[2]")
	public static AndroidElement Sunnxt;

	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/cp_logo'])[3]")
	public static AndroidElement Sonyliv;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/cp_logo'])[4]")
	public static AndroidElement Lionsgate;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/cp_logo'])[5]")
	public static AndroidElement hoichoi;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/cp_logo'])[6]")
	public static AndroidElement Shemaroo;
	
	
	
	
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/toolbar_settings_button")
	public static AndroidElement Back;

	//@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/slider_image'])[1]")
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/pager_ottapps")
	public static AndroidElement Banner;

	//(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[1]
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/arrow_view_all'])[1]")
	public static AndroidElement clickViewall;

	@AndroidFindBy(xpath = "(//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[1]")
	public static AndroidElement clickonMovieContent;

	//(//androidx.recyclerview.widget.RecyclerView[@resource-id='com.vodafone.vodafoneplay:id/recycler_view_movie']//android.widget.FrameLayout[1])[1]
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id='com.vodafone.vodafoneplay:id/recycler_view_movie']//android.widget.FrameLayout[1]")
	public static AndroidElement Contentclick;
							
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[2]")
	public static AndroidElement Carousel1;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[2]")
	public static AndroidElement Carousel2;

	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[3]")
	public static AndroidElement Carousel3;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
  	public static AndroidElement PrintText;

	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename']")
	public static AndroidElement ContentTitle;

	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/back_nav_icon_layout_2")
	public static AndroidElement downarrow;

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


