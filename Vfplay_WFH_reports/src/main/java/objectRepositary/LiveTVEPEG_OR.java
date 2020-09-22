package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LiveTVEPEG_OR 
{
       public void AppSettings_OR(AppiumDriver<AndroidElement> driver) 
       {
		
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
   	
   	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/imageview_play_alarm_download']")
   	public static AndroidElement Epgalarm;
   	
   	
}