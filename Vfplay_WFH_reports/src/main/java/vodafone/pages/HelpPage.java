package vodafone.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.HelpPage_OR;
import vodafone.pages.Applaunch;


public class HelpPage extends HelpPage_OR{
	public static AndroidDriver<AndroidElement> driver;  

	String text;
	Applaunch key = new Applaunch();
	
//private AndroidDriver<AndroidElement> driver;


	 public HelpPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	public void HelpPage() throws Throwable {
		try {
			
			System.out.println("---------->TestCase ID :38	Help page (Share app, Rate this app,My subscription)<------");
				Thread.sleep(3000);
				HelpPage_OR.clickHambergerMenu.click();
				System.out.println("Successfully clicked hamberger menu");
				
				Thread.sleep(3000);
				HelpPage_OR.clickHelptab.click();
				System.out.println("Successfully clicked on Help tab");
				
				Thread.sleep(3000);
				text=HelpPage_OR.PrintText.getText();
				System.out.println(text +" Screen launched");
				
				Thread.sleep(3000);
				HelpPage_OR.clickonSupport.click();
				System.out.println("Successfully clicked on Support page");
				
				Thread.sleep(3000);
				text=HelpPage_OR.PrintText.getText();
				System.out.println(text +" Screen launched");
					
				Thread.sleep(3000);
				HelpPage_OR.clickBackicon.click();
				System.out.println("Successfully clicked on Back icon");
				
				Thread.sleep(3000);
				HelpPage_OR.clickonFaq.click();
				System.out.println("Successfully clicked on FAQ page");
				Thread.sleep(3000);
				key.verticalSwipe();
				key.verticalDownSwipe();
				
				
				
				Thread.sleep(3000);
				text=HelpPage_OR.PrintText.getText();
				System.out.println(text +" Screen launched");
					
				Thread.sleep(3000);
				HelpPage_OR.clickBackicon.click();
				System.out.println("Successfully clicked on Back icon");
				
				Thread.sleep(2000);
				HelpPage_OR.clickShareapp.click();
				System.out.println("Successfully clicked on Share app page");
				
				Thread.sleep(10000);
				HelpPage_OR.clickGmail.click();
				System.out.println("Successfully clicked on Gmail icon");
				
				Thread.sleep(3000);
				HelpPage_OR.toEmail.sendKeys("kravi@apalya.com");
				System.out.println("Successfully enter To Email");
				
				Thread.sleep(3000);
				HelpPage_OR.clickonSendicon.click();
				System.out.println("Successfully clicked on send icon");
				
				/*Thread.sleep(5000);
				HelpPage_OR.clickonRatethisapp.click();
				System.out.println("Successfully clicked on rate this app");
				
				Thread.sleep(3000);
				HelpPage_OR.clickbackicononPlaystore.click();
				System.out.println("Successfully clicked on back icon");*/
				
				Thread.sleep(3000);
				HelpPage_OR.clickonFeedback.click();
				System.out.println("Successfully clicked on feedback");
				
				Thread.sleep(3000);
				HelpPage_OR.clickonSubmit.click();
				System.out.println("Successfully clicked on Submit button");
				
				Thread.sleep(7000);
				HelpPage_OR.clickMySubscription.click();
				System.out.println("Successfully clicked on My Subscription page");
				
				Thread.sleep(3000);
				text=HelpPage_OR.PrintText.getText();
				System.out.println(text +"Screen launched");
				
				Thread.sleep(3000);
				HelpPage_OR.clickBackicon.click();
				System.out.println("Successfully clicked on Back icon");
				
				Thread.sleep(3000);
				HelpPage_OR.clickBackicon.click();
				System.out.println("Successfully clicked on Back icon");
				
				Thread.sleep(3000);
				System.out.println("Help page test case pass");
				System.out.println("---------->TestCase ID :38	Help page (Share app, Rate this app,My subscription)<--PASS----");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	
}

}