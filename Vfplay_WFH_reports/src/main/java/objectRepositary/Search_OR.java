package objectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class Search_OR {
	
	 public Search_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 	
	  	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Search']")
		public static AndroidElement searchIcon;
	  	
		@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/search_src_text']")
		public static AndroidElement txtSearch;
		
		@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/cardimage']")
		public static AndroidElement thumbnailimageClick1;
		
		@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_layout']//android.widget.FrameLayout[1]")
		public static AndroidElement thumbnailClick;
		
		
		/*@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/thumbnailimage']")
		public static AndroidElement thumbnailimageClick;*/
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/cardmediasubitemvideo_play_icon']")
		public static AndroidElement playIcon;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbreifdescription_movename']")
		public static AndroidElement ContentTitle;
		
		
		
		//@AndroidFindBy(xpath = "//android.widget.ImageButton")
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/back_nav_icon_layout_2")
		public static AndroidElement downarrow;
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/back_nav_icon']")
		public static AndroidElement clickMiniPlayer;
		
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Close']")
		public static AndroidElement MiniPlayerClose;
	//-------------------------------------------------------------
		
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

		//---------------------------------------------------
}