package vodafone.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.Viewall_OR;

public class ViewallPage extends Viewall_OR{
	public static AndroidDriver<AndroidElement> driver;  

	
	Applaunch key = new Applaunch();
//private AndroidDriver<AndroidElement> driver;


	 public ViewallPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	 public void CommonActions() throws Throwable
	 {
		 	Thread.sleep(3000);
			Viewall_OR.clickViewall.click();
			System.out.println("Clicked on View all");
			
			Thread.sleep(3000);
			Viewall_OR.clickonContent.click();
			System.out.println("Clicked on Content");
			
			Thread.sleep(3000);
			Viewall_OR.clickMiniplayericon.click();
			System.out.println("Clicked on Mini player");
			
			Thread.sleep(3000);
			key.backDevice();
			System.out.println("Clicked on back icon");
			
			Thread.sleep(1000);
			key.backDevice();
			System.out.println("Clicked on back icon");
			 
	 }
	 
	 
	 
	public void ViewallPage() throws Throwable {
		try {
			/*
			//-----------------------------------------------
			Thread.sleep(8000);
			try {
				key.verticalSwipeOnce();
				
				Viewall_OR.clickViewall.click();
			System.out.println("Clicked on More");
			
			Thread.sleep(1000);
			Viewall_OR.Contentclick.click();
			System.out.println("Clicked on  content");
			}
			catch(Exception e)
			{
				System.out.println("asaaa");
				Thread.sleep(8000);
				Viewall_OR.clickonContent.click();
				System.out.println("Clicked on Home content");
			}
			
			Thread.sleep(2000);
			//LoginPage_OR.txtMobileNumber.sendKeys("9160508889");
			//FullScreen_OR.txtMobileNumber.sendKeys("8886606109");
			//FullScreen_OR.txtMobileNumber.sendKeys("8886681792");
			Viewall_OR.txtMobileNumber.sendKeys("8886604963");
			System.out.println("Entered valid mobile number");
			

			Thread.sleep(2000);
			Viewall_OR.txtContinuebutton.click();
			System.out.println("Clicked on Continue button");


			Thread.sleep(30000);
			Viewall_OR.otpbtn.click();
			System.out.println("Successfully clicked on OTP button");
			
			Thread.sleep(8000);
			key.backDevice();
			Thread.sleep(3000);
			key.backDevice();
			//-----------------------------------------------------------------*/
			
				
			
			System.out.println("---------->TestCase ID :13	More for all tabs carousals.(Layout types)..<------");
				Thread.sleep(3000);
				Viewall_OR.clickHometab.click();
				System.out.println("Successfully clicked on Home tab");
				CommonActions();
				Thread.sleep(3000);
				key.verticalSwipe();
				CommonActions();
				
				//--------------------------------	
				Thread.sleep(3000);
				Viewall_OR.clickNewstab.click();
				System.out.println("Successfully clicked on News tab");
			
				CommonActions();
				
				//--------------------------------
				Thread.sleep(3000);
				Viewall_OR.clickMoviestab.click();
				System.out.println("Successfully clicked on Movies tab");
				CommonActions();
							
				//--------------------------------
				Thread.sleep(3000);
				Viewall_OR.clickTVtab.click();
				System.out.println("Successfully clicked on Live TV tab");
				
				CommonActions();
				//--------------------------------
				Thread.sleep(3000);
				Viewall_OR.clickOriginalstab.click();
				System.out.println("Successfully clicked on Originals tab");
				
				Thread.sleep(3000);
				Viewall_OR.clickViewall.click();
				System.out.println("Successfully clicked on View all");
				
				Thread.sleep(3000);
				Viewall_OR.clickonContent.click();
				System.out.println("Successfully clicked on Content");
				
				Thread.sleep(3000);
				Viewall_OR.clickPlayiconforTVshows.click();
				System.out.println("Successfully clicked on play icon");
				
				Thread.sleep(3000);
				key.backDevice();
				System.out.println("Successfully clicked on Mini player");
				
				Thread.sleep(3000);
				key.backDevice();
				System.out.println("Successfully clicked on back icon");
				
				Thread.sleep(3000);
				key.backDevice();
				System.out.println("Successfully clicked on back icon");
				
				
				Thread.sleep(3000);
				System.out.println("View all test case pass");
				
				Thread.sleep(3000);
				Viewall_OR.clickHometab.click();
				System.out.println("Successfully clicked on Home tab");
				
				//driver.closeApp();
				System.out.println("---------->TestCase ID :13	More for all tabs carousals.(Layout types)..<----PASS--");
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	
}

}