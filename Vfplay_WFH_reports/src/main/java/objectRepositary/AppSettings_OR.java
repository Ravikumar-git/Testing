package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class AppSettings_OR {
	
	 public AppSettings_OR(AppiumDriver<AndroidElement> driver) {
		 
	 PageFactory.initElements(new AppiumFieldDecorator(driver), this);	 
		 
	 }
	 
	 //com.vodafone.vodafoneplay:id/otp_mobile_no
	 
	 	/*@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement clickHambergerMenu;*/
	 	
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_header_title']")
	 	public static AndroidElement PrintText;
	 
	 	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/about_title']")
	 	public static AndroidElement VersionText;
	 	
	 	
	 	
	 	
	 	
	 	
	 	//@AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Vodafone Play\"]")
	 	@AndroidFindBy(xpath = "//android.widget.ImageButton")
		public static AndroidElement clickHambergerMenu;
	 	
	  	@AndroidFindBy(xpath = "//android.widget.TextView[@text='App Settings']")
		public static AndroidElement clickAppSettings;
	  		  	
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Video Playback Quality']")
		public static AndroidElement clickVideoPlaybackQuality;
		
		@AndroidFindBy(xpath = "//android.widget.RadioButton[@resource-id='com.vodafone.vodafoneplay:id/radio_button_quality_auto']")
		public static AndroidElement clickradiobtnvideoplayback;
		
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/checkbox_notification_toggle")
		public static AndroidElement clickNotificationselectdeselected;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/checkbox_auto_play_toggle")
		public static AndroidElement clickAutoplayselectdeselected;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/checkbox_download_on_wifi_toggle")
		public static AndroidElement clickDownloadselectdeselected;
		
		
		//About screen
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/text_about")
		public static AndroidElement clickAbout;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/text_about_app")
		public static AndroidElement clickAboutApp;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/about_title")
		public static AndroidElement clickAboutTitle;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/about_ok_txt")
		public static AndroidElement clickAboutOk;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/text_tnc")
		public static AndroidElement clickTnC;
		
		@AndroidFindBy(xpath = "//android.view.View[@text='Terms and Conditions for the Vi Movies and TV App']")
		public static AndroidElement TnCtxt;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/toolbar_settings_button")
		public static AndroidElement Backbutton;
		
		@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/text_privacy_policy")
		public static AndroidElement clickPP;
	
		/*@AndroidFindBy(id = "com.vodafone.vodafoneplay:id/toolbar_header_title")
		public static AndroidElement PPheading;*/
		
		//com.vodafone.vodafoneplay:id/checkbox_notification_toggle
		//com.vodafone.vodafoneplay:id/checkbox_auto_play_toggle
		//com.vodafone.vodafoneplay:id/checkbox_download_on_wifi_toggle
		//com.vodafone.vodafoneplay:id/text_about

		//com.vodafone.vodafoneplay:id/text_about_app
		//com.vodafone.vodafoneplay:id/about_title
		//com.vodafone.vodafoneplay:id/about_ok_txt

		

		//com.vodafone.vodafoneplay:id/text_tnc
		//Terms and Conditions for the Vodafone Play App
		//com.vodafone.vodafoneplay:id/toolbar_settings_button   (back button)
		
		//com.vodafone.vodafoneplay:id/text_privacy_policy
		//Privacy Policy

		//com.vodafone.vodafoneplay:id/toolbar_header_title   Privacy Policy
		//com.vodafone.vodafoneplay:id/toolbar_settings_button

		//com.vodafone.vodafoneplay:id/toolbar_settings_button
		//com.vodafone.vodafoneplay:id/toolbar_settings_button

		//com.vodafone.vodafoneplay:id/search_button
		// //android.widget.ImageView[@content-desc="Search"]


		/*@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_notification_toggle']")
		public static AndroidElement clickNotificationselectdeselected;

		
		@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_auto_play_toggle']")
		public static AndroidElement clickAutoplayselectdeselected;
		
		@AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_download_on_wifi_toggle']")
		public static AndroidElement clickDownloadselectdeselected;*/
		
		@AndroidFindBy(xpath = "android.widget.RadioButton[@index='1']")
		public static AndroidElement clickParentalcontrolall;
		
		@AndroidFindBy(xpath = "android.widget.RadioButton[@index='2']")
		public static AndroidElement clickParentalcontroladult;
			
		@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']")
		public static AndroidElement clickSettingsBackbutton;
		
		@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='com.vodafone.vodafoneplay:id/txt_pin_entry']")
		public static AndroidElement txtPinEnter;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/positive_button']")
		public static AndroidElement btnOkay;
		
		@AndroidFindBy(xpath = "//android.widget.TextView[@text='Parental Control']")
		public static AndroidElement clickParentalControl;
		
		
}





/*//Click on App settings
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.TextView[@text='App Settings']").click();
			
	System.out.println("Successfully clicked on App settings");
	
	//Click on Video quality
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.TextView[@text='Video Playback Quality']").click();
	
	//Select Video quality
	driver.findElementByXPath("//android.widget.RadioButton[@resource-id='com.vodafone.vodafoneplay:id/radio_button_quality_auto']").click();
	
	System.out.println("Successfully changed content quality to auto");
	
	//Notification selection
	driver.findElementByXPath("//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_notification_toggle']").click();
	
	driver.findElementByXPath("//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_notification_toggle']").click();

	System.out.println("Successfully selected and deselected for App Notification");
	
	//Autoplay back selection
	driver.findElementByXPath("//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_auto_play_toggle']").click();
	
	driver.findElementByXPath("//android.widget.CheckBox[@resource-id='com.vodafone.vodafoneplay:id/checkbox_auto_play_toggle']").click();

	System.out.println("Successfully selected and deselected for Autoplayback");
			
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']").click();

	System.out.println("Successfully clicked on App settings back button");
			
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.ImageButton").click();
			
	System.out.println("Successfully clicked on Hamberger menu");
			
			
	//Click on About
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.TextView[@text='About']").click();
			
	System.out.println("Successfully clicked on About link");
	
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_about_app']").click();
	
	System.out.println("Successfully opened About page");
	
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/about_ok_txt']").click();
	
	//Terms and conditions
	
	//Thread.sleep(3000);
	//driver.findElementByXPath("//android.widget.TextView[@text='Terms and Conditions']").click();
	
	//System.out.println("Successfully opened Terms and conditions page");
	
	//Thread.sleep(3000);
	//driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']").click();
	
	//Privacy Policy
	//Thread.sleep(3000);
	//driver.findElementByXPath("//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/text_privacy_policy']").click();
		
	//System.out.println("Successfully opened Privacy and policy page");
	
	//Thread.sleep(3000);
	//driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']").click();
			
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']").click();
			
	System.out.println("Successfully clicked on about back button");
			
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.ImageButton").click();
			
	System.out.println("Successfully clicked on Hamberger menu");
			
	//Click on Help
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.TextView[@text='Help']").click();
			
	System.out.println("Successfully clicked on Help link");
			
	Thread.sleep(3000);
	driver.findElementByXPath("//android.widget.ImageView[@resource-id='com.vodafone.vodafoneplay:id/toolbar_settings_button']").click();
			
	System.out.println("Successfully clicked on Help back button");*/