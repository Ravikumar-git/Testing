package objectRepositary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ContentLanguages_OR {

	public ContentLanguages_OR(AppiumDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
}
		
	//@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Vodafone Play\"]")
	@AndroidFindBy(xpath = "//android.widget.ImageButton")
	public static AndroidElement HambergerMenu;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
 	public static AndroidElement PrintText;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/txtNavDrawerItemTitle'])[1]")
	public static AndroidElement LanguageSettings;
	
	@AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='App Language']/android.widget.TextView")
	public static AndroidElement AppLanguage;
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/save_button")
	public static AndroidElement Save;

	//===============================================================================
	@AndroidFindBy(xpath = "//*[@resource-id='com.vodafone.vodafoneplay:id/text1']")
	public static List<AndroidElement> AppLangList;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/text1'])[1]")
	public static AndroidElement AppLangEnglish;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/text1'])[7]")
	public static AndroidElement AppLangTelugu;
	
	
	
	//===============================================================================
	//@AndroidFindBy(xpath = "//androidx.appcompat.app.ActionBar.Tab[@content-desc='Content Languages']/android.widget.TextView")
	@AndroidFindBy(xpath="//*[@text='Content Languages']")
	public static AndroidElement ContentLanguages;
	
	@AndroidFindBy(xpath = "//*[@resource-id='com.vodafone.vodafoneplay:id/textView']")
	public static List<AndroidElement> CLanglist1;
	
	@AndroidFindBy(xpath = "//*[@resource-id='com.vodafone.vodafoneplay:id/textViewRegional']")
	public static List<AndroidElement> CLanglist2;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/textViewRegional'])[3]")
	public static AndroidElement CLanglistTamil;
	
	@AndroidFindBy(xpath = "(//*[@resource-id='com.vodafone.vodafoneplay:id/textViewRegional'])[7]")
	public static AndroidElement CLanglistTelugu;
	
	//---------------------------------------
	
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
	
	
	@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/app_logo")
	public static By AppLogo;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])")
	public static List<AndroidElement> Carousels;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[1]")
	public static AndroidElement Carousel1;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[2]")
	public static AndroidElement Carousel2;
	
	@AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/textview_genre_title'])[3]")
	public static AndroidElement Carousel3;
}
