package vodafone.pages;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.AppSettings_OR;
import vodafone.pages.Applaunch;

public class AppSettings extends AppSettings_OR{
	public static AndroidDriver<AndroidElement> driver;  
	Applaunch key = new Applaunch();
	String text;


	public AppSettings(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	public void AppSettings() throws Throwable {
		try {

			System.out.println("--------->Test Case ID:28----App settings<----------");
			Thread.sleep(30000);
			
			Thread.sleep(5000);
			
			key.verticalDownSwipe();
			
			AppSettings_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");

			Thread.sleep(3000);
			AppSettings_OR.clickAppSettings.click();
			System.out.println("Successfully clicked on App Settings");

			Thread.sleep(3000);
			AppSettings_OR.clickVideoPlaybackQuality.click();
			System.out.println("Successfully clicked on Video Player Quality");

			Thread.sleep(3000);
			AppSettings_OR.clickradiobtnvideoplayback.click();
			System.out.println("Successfully clicked on Radio button for Video Player Quality");

			Thread.sleep(3000);
			AppSettings_OR.clickVideoPlaybackQuality.click();
			System.out.println("Successfully clicked on Video Player Quality");

			Thread.sleep(3000);
			AppSettings_OR.clickNotificationselectdeselected.click();
			System.out.println("Successfully Deselected Notification");

			Thread.sleep(3000);
			AppSettings_OR.clickNotificationselectdeselected.click();
			System.out.println("Successfully Selected Notification");

			Thread.sleep(3000);
			AppSettings_OR.clickAutoplayselectdeselected.click();
			System.out.println("Successfully DeSelected Autoplay");

			Thread.sleep(3000);
			AppSettings_OR.clickAutoplayselectdeselected.click();
			System.out.println("Successfully Selected Autoplay");

			Thread.sleep(3000);
			AppSettings_OR.clickDownloadselectdeselected.click();
			System.out.println("Successfully Selected Download on Wifi only");

			Thread.sleep(3000);
			AppSettings_OR.clickDownloadselectdeselected.click();
			System.out.println("Successfully DeSelected Download on Wifi only");

			Thread.sleep(3000);
			AppSettings_OR.clickAbout.click();
			System.out.println("Successfully Clicked on About");

			Thread.sleep(3000);
			text=AppSettings_OR.PrintText.getText();
			System.out.println(text +" Screen launched");

			Thread.sleep(3000);
			AppSettings_OR.clickAboutApp.click();
			System.out.println("Successfully Clicked on About App");
			
			Thread.sleep(3000);
			text=AppSettings_OR.VersionText.getText();
			System.out.println(" App version:---" +text );
			Thread.sleep(3000);
			key.verticalSwipe();
			key.verticalDownSwipe();
			

			Thread.sleep(3000);
			AppSettings_OR.clickAboutOk.click();
			System.out.println("Successfully Clicked on About App OK button");

			Thread.sleep(3000);
			AppSettings_OR.clickTnC.click();
			System.out.println("Successfully Clicked on Terms & Conditions");

			Thread.sleep(3000);
			text=AppSettings_OR.TnCtxt.getText();
			System.out.println(text +" T&C heading");
			Thread.sleep(3000);
			key.verticalSwipe();
			key.verticalDownSwipe();
			
			Thread.sleep(3000);
			AppSettings_OR.Backbutton.click();

			Thread.sleep(3000);
			AppSettings_OR.clickPP.click();
			System.out.println("Successfully Clicked on Privacy Policy");

			Thread.sleep(3000);
			text=AppSettings_OR.PrintText.getText();
			System.out.println(text +" Screen launched");
			Thread.sleep(3000);
			key.verticalSwipe();
			key.verticalDownSwipe();
			
			Thread.sleep(3000);
			AppSettings_OR.Backbutton.click();

			Thread.sleep(3000);
			AppSettings_OR.Backbutton.click();
			Thread.sleep(3000);
			AppSettings_OR.Backbutton.click();
			
			Thread.sleep(3000);
			System.out.println("App Settings test case pass");
			System.out.println("--------->Test Case ID:28----App settings<-------PASS---");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

			/*clickAbout
				clickAboutApp
				clickAboutTitle
				clickAboutOk
				clickTnC
				TnCtxt
				Backbutton
				clickPP
				PPheading*/


			/*Thread.sleep(3000);
				AppSettings_OR.clickParentalControl.click();
				System.out.println("Successfully Clicked parental control");

				Thread.sleep(3000);
				AppSettings_OR.clickParentalcontrolall.click();
				System.out.println("Successfully Selected radio button All Content for Parental control");

				Thread.sleep(3000);
				AppSettings_OR.txtPinEnter.sendKeys("1234");
				System.out.println("Successfully Enter Pin");

				Thread.sleep(3000);
				AppSettings_OR.btnOkay.click();
				System.out.println("Successfully clicked Okay button");

				Thread.sleep(3000);
				AppSettings_OR.txtPinEnter.sendKeys("1234");
				System.out.println("Successfully Enter confirm Pin");

				Thread.sleep(3000);
				AppSettings_OR.btnOkay.click();
				System.out.println("Successfully clicked Okay button");

				Thread.sleep(3000);
				AppSettings_OR.clickParentalcontroladult.click();
				System.out.println("Successfully Selected radio button Adult content for Parental control");

				Thread.sleep(3000);
				AppSettings_OR.txtPinEnter.sendKeys("1234");
				System.out.println("Successfully Enter Pin");

				Thread.sleep(3000);
				AppSettings_OR.btnOkay.click();
				System.out.println("Successfully clicked Okay button");

				Thread.sleep(3000);
				AppSettings_OR.txtPinEnter.sendKeys("1234");
				System.out.println("Successfully Enter Confirm Pin");

				Thread.sleep(3000);
				AppSettings_OR.btnOkay.click();
				System.out.println("Successfully clicked Okay button");

				Thread.sleep(3000);
				AppSettings_OR.clickSettingsBackbutton.click();
				System.out.println("Successfully click on Back button");
			 */
			




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

	System.out.println("Successfully clicked on Help back button");
 */

















