package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Download_OR 
{
	public void AppSettings_OR(AppiumDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Movies']")
	public static AndroidElement clickMovies;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Search']")
	public static AndroidElement searchIcon;
  	
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/search_src_text']")
	public static AndroidElement txtSearch;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id='com.vodafone.vodafoneplay:id/cardimage']")
	public static AndroidElement thumbnailimageClick1;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/carddetailbriefdescription_download_img']")
	public static AndroidElement clickDownload;
	
	@AndroidFindBy(xpath="//*[@text='DATA SAVER']")
	public static AndroidElement clickDatasaver;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	public static AndroidElement clickHamburgerMenu;
	
	@AndroidFindBy(xpath="//*[@text='My Downloads']")
	public static AndroidElement clickDownloadHamburger;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
  	public static AndroidElement PrintText;
	
	//---------------------------------------------------------------------
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/data_saver_button")
	public static AndroidElement Datasaver;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/data_saver_text")
	public static AndroidElement Datasavertext;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/good_button")
	public static AndroidElement Good;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/good_option_text")
	public static AndroidElement Goodtext;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/best_button")
	public static AndroidElement Best;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/best_option_text")
	public static AndroidElement Besttext;
	
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Movies']")
	public static AndroidElement MoviesinDwnld;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='TV Shows']")
	public static AndroidElement TvshowsinDwnld;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Videos']")
	public static AndroidElement VideosinDwnld;
		
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/toolbar_header_title")
	public static AndroidElement Headertitle;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/textview_title")
	public static AndroidElement DownloadTitle;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/genres")
	public static AndroidElement DownloadGenres;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/text_video_length")
	public static AndroidElement DownloadLength;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/status_text")
	public static AndroidElement DownloadStatus;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/download_btn_status_percent_text")
	public static AndroidElement DownloadPercent;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/deleteIcon")
	public static AndroidElement DownloadDelete;
	
		
}
