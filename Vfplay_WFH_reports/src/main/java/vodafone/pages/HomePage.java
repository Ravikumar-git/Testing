package vodafone.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.Home_OR;

public class HomePage extends Home_OR 
{
	public static AndroidDriver<AndroidElement> driver;  
	
	public HomePage(AppiumDriver<AndroidElement> driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}

	

	public void HomePageElements() throws Throwable {

		try {

			Thread.sleep(5000);
			Home_OR.hambergermenu.click();
			System.out.println("successfully clicked on Menu");


			/*Thread.sleep(2000);
			  //  Home_OR.clickAllowCalls.click();
			    System.out.println("Successfully clicked on Calls");


			    click(Home_OR.clickAllowCalls, "carousel ViewAll MusicVideos");


			    Thread.sleep(2000);
			    Home_OR.clickAllowMedia.click();
			    System.out.println("successfully clicked on Media");

			    Thread.sleep(3000);
				Home_OR.clickAllowLocation.click();
				System.out.println("successfully clicked on Location");*/

			/*Thread.sleep(3000);
				Home_OR.clickNext.click();
				System.out.println("Successfully clicked on Next");

				Thread.sleep(2000);
				Home_OR.clickAcceptSubscriber.click();
				System.out.println("Successfully Clicked on Subscriber");*/

			/*          BaseClass.backOnDevice();
                System.out.println("Home Screen displayed");

                Thread.sleep(4000);
				Home_OR.clickMovies.click();
				System.out.println("clicked on Movies");

				BaseClass.clickSettings();
				System.out.println("successfuully clicked on settings");

				Home_OR.clickcontentlanguage.click();
				System.out.println("click content language");

				BaseClass.clickonBackApp();
				System.out.println("clicked back on app");

				BaseClass.clickSettings();
				System.out.println("successfully clicked on settings");

				Home_OR.clickapplanguage.click();
				System.out.println("clicked app language");

				BaseClass.clickonBackApp();
                System.out.println("clicked back on app");

                BaseClass.clickSettings();

                Home_OR.clickSettingsinMenu.click();
                System.out.println("successfully clicked on settingsmenu");

                Thread.sleep(2000);
                Home_OR.clickVideoQuality.click();
                System.out.println("successfully clicked on video quality");

                BaseClass.clickonBackApp();

                Thread.sleep(2000);
                Home_OR.clickFeedback.click();
                System.out.println("successfully clicked on Feedback");

                BaseClass.clickonBackApp();

                BaseClass.clickonBackApp();

                BaseClass.scrollMethod();

			 */


		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}
}

