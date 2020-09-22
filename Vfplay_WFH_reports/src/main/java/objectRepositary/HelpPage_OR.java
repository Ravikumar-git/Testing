package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HelpPage_OR {
	
	 public HelpPage_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 	
	 	@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement clickHambergerMenu;
	 
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Help']")
		public static AndroidElement clickHelptab;
	  		  	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_support']")
		public static AndroidElement clickonSupport;
	  	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
	  	public static AndroidElement PrintText;
	  	
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
		
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']")
		public static AndroidElement clickBackicon;
		
}



