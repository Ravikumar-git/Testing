package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExitApp_OR {
	
	 public ExitApp_OR(AppiumDriver<AndroidElement> driver) {
		 
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
			 
		 }
		 	
		  	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/popup_headingTV")
			public static AndroidElement Exitpopupheading;
		  	
		  	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/popup_subheadingTV")
			public static AndroidElement ExitpopupSubheading;
		  	
		  	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/closeExitPopUp")
			public static AndroidElement popupClose;
		  	
		  	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/showMoreButton")
			public static AndroidElement ShowMorebtn;
		  	
		  	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/exitButton")
			public static AndroidElement Exitbtn;
		  	
		  	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie'])[3]")
			public static AndroidElement Carosuelcontent;
		  	
		  	
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
