package vodafone.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.springframework.util.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.MyDevices_OR;
import vodafone.pages.Applaunch;

public class MyDevicesPage extends MyDevices_OR{
	public static AndroidDriver<AndroidElement> driver;  
	Applaunch key = new Applaunch();
	String text;
//private AndroidDriver<AndroidElement> driver;


	 public MyDevicesPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	 
	public void MyDevices() throws Throwable {
		try {
			Thread.sleep(40000);
			System.out.println("");
				System.out.println("---------->My Devices & More Apps test case <------");
				Thread.sleep(3000);
				MyDevices_OR.clickHambergerMenu.click();
				System.out.println("Successfully clicked hamberger menu");
				
				Thread.sleep(3000);
				MyDevices_OR.clickMyDevicestab.click();
				System.out.println("Successfully clicked on MyDevices tab");
				
				Thread.sleep(3000);
				text=MyDevices_OR.PrintText.getText();
				System.out.println(text +" Screen launched");
				
				for(int i=0; i<4;i++)
				{
							try 
							{
								Thread.sleep(5000);
								MyDevices_OR.clickonDeregister.isDisplayed();
								MyDevices_OR.clickonDeregister.click();
								System.out.println("Clicked on Deregister the Device");
								System.out.println("Successfully Deregistered one Device");
							}
							 catch(Exception e)
							{
								 System.out.println("Only one Device Exist");
							}
							
				}
												
				Thread.sleep(3000);
				MyDevices_OR.clickBackicon.click();
				System.out.println("Clicked on Back icon");
				
				/*System.out.println("");
				//--------More apps
				Thread.sleep(3000);
				MyDevices_OR.clickHambergerMenu.click();
				System.out.println("Successfully clicked hamberger menu");
				
				Thread.sleep(3000);
				MyDevices_OR.clickMoreApps.click();
				System.out.println("Successfully clicked on MoreApps tab");
				
				Thread.sleep(3000);
				text=MyDevices_OR.PrintText.getText();
				System.out.println(text +" Screen launched");
				
				Thread.sleep(3000);
				MyDevices_OR.clickonMyVodafoneApp.click();
				System.out.println("Clicked on My Vodafone App");
				
				Thread.sleep(10000);
				//MyDevices_OR.clickBackicon.click();
				key.backDevice();
				System.out.println("Clicked on Back icon");
				
				//---------------
				//common();
				
				Thread.sleep(3000);
				text=MyDevices_OR.PrintText.getText();
				System.out.println(text +" ---Screen launched");
				
				Thread.sleep(8000);
				MyDevices_OR.Callertunes.click();
				System.out.println("Clicked on My Vodafone Callertunes ");
				
				Thread.sleep(3000);
				MyDevices_OR.clickBackicon.click();
				System.out.println("Clicked on Back icon");
				
				//-------------------
				common();
				
				Thread.sleep(3000);
				text=MyDevices_OR.PrintText.getText();
				System.out.println(text +" Screen launched");
				
				Thread.sleep(3000);
				MyDevices_OR.Vflive.click();
				System.out.println("Clicked on My Vodafone Live");
				
				Thread.sleep(4000);
				//MyDevices_OR.clickBackicon.click();
				key.backDevice();
				//key.backDevice();
				System.out.println("Clicked on Back icon");*/
				
				
				Thread.sleep(3000);
				System.out.println("---------->My Devices test case <--PASS----");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
}
	
	public void common() throws Throwable{
		try {
			Thread.sleep(6000);
			MyDevices_OR.clickHambergerMenu.isDisplayed();
			MyDevices_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked hamberger menu");
			
			Thread.sleep(5000);
			MyDevices_OR.clickMoreApps.click();
			System.out.println("Successfully clicked on MoreApps tab");
			}
			catch(Exception e)
			{}
	}

}