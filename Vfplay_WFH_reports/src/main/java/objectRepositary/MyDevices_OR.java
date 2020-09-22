package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyDevices_OR {
	
	 public MyDevices_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 
	 	
	 	
	 	@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement clickHambergerMenu;
	 
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@text='My Devices']")
		public static AndroidElement clickMyDevicestab;
	  		  	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
	  	public static AndroidElement PrintText;
	  	
	   	//@AndroidFindBy(xpath = "(//android.view.View[@text='Deregister'])[1]")
	   	
		@AndroidFindBy(xpath = "(//*[@text='Deregister'])[1]")
		public static AndroidElement clickonDeregister;
	  	
	  	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']")
		public static AndroidElement clickBackicon;
	  	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@text='More Apps']")
		public static AndroidElement clickMoreApps;
	  	
	
	  	@AndroidFindBy(xpath = "//android.webkit.WebView//android.view.View[3]")
	    public static AndroidElement clickonMyVodafoneApp;
	  	
	  	  	
	  	@AndroidFindBy(xpath ="//*[@text='Vodafone Live One-stop destination for managing your vodafone account. bill payment, mobile recharges, bonus card checking usage, etc.']")
	  	public static AndroidElement clickonMyVodafoneLive;
	  	
	  		  	
	  	@AndroidFindBy(xpath = "//*[@text='Vodafone Callertunes Discovery, preview & set exciting tunes for your callers. With the app you change & set different caller tunes for different people on the go!']")
	  	public static AndroidElement clickonMyVodafoneCallertunes;
	  	
	  	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_support']")
		public static AndroidElement clickonSupport;
	  	
	  	
	  //*[@text='Vodafone Callertunes']
	  	
	  	@AndroidFindBy(xpath = "//*[@text='Callertunes']")
	    public static AndroidElement Callertunes;
	  	
	  	@AndroidFindBy(xpath = "//*[@text='vfLive']")
	    public static AndroidElement Vflive;
	  	
	 
	  	
	  	
	  	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_faq']")
		public static AndroidElement clickonFaq;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_share_app']")
		public static AndroidElement clickShareapp;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gmail']")
		public static AndroidElement clickGmail;
		
		@AndroidFindBy(xpath = "//android.widget.MultiAutoCompleteTextView[@resource-id='com.google.android.gm:id/to']")
		public static AndroidElement toEmail;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.google.android.gm:id/send']")
		public static AndroidElement clickonSendicon;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_rate_app']")
		public static AndroidElement clickonRatethisapp;
		
		@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
		public static AndroidElement clickbackicononPlaystore;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_feedback']")
		public static AndroidElement clickonFeedback;
		
		@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='com.vodafone.vodafoneplay:id/feedback_ok_button']")
		public static AndroidElement clickonSubmit;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='My subscription']")
		public static AndroidElement clickMySubscription;
		
		
		
}



