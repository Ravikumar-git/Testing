package vodafone.utilities;




import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;


/*public class BaseClass {
	public static AndroidDriver<AndroidElement> driver; */ 

	public class BaseClass 
	{
		
		public static AndroidDriver driver;
		public static URL u;
		public static WebDriverWait wait;
		
		
			public static void main() throws Exception {

			// Launch app in ARD through appium server

			Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
			 u = new URL("http://127.0.0.1:4723/wd/hub");

			// Maintain details base for app and ARD

			DesiredCapabilities dc = new DesiredCapabilities();

			/*dc.setCapability(CapabilityType.BROWSER_NAME,"");
			//dc.setCapability("deviceName", "J8AAGF09C962PVE");
			dc.setCapability("deviceName", "3300a3507068a481");
			dc.setCapability("platformName", "android");
			dc.setCapability("platformVersion", "8");
			dc.setCapability("appPackage", "com.suntv.sunnxt");
			dc.setCapability("appActivity", "com.android.myplex.ui.sun.activities.MainActivity");
			*/
			/*dc.setCapability(CapabilityType.BROWSER_NAME,"");
			dc.setCapability("deviceName", "42009305d320a4a5");
			dc.setCapability("platformName", "android");
			dc.setCapability("platformVersion", "8.1");
			dc.setCapability("appPackage", "com.vodafone.vodafoneplay");
		    dc.setCapability("appActivity", "com.myplex.vodafone.ui.activities.MainActivity");
		    dc.setCapability("autoGrantPermissions",true);
			dc.setCapability("autoAcceptAlerts",true);*/

			dc.setCapability(CapabilityType.BROWSER_NAME,"");
			dc.setCapability("deviceName", "fca36521");
			dc.setCapability("platformName", "android");
			dc.setCapability("platformVersion", "9");
			dc.setCapability("appPackage", "com.vodafone.vodafoneplay");
		    dc.setCapability("appActivity", "com.myplex.vodafone.ui.activities.MainActivity");
		    dc.setCapability("autoGrantPermissions",true);
			dc.setCapability("autoAcceptAlerts",true);
			
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(8000);			
			
			
			
			while (2 > 1)
			{
				try 
				{
					driver = new AndroidDriver(u, dc);
					break;
				} catch (Exception ex) 
				{
				}
				
			}
			
			
		}
    /* @Before
	 public static void beforeMethod() throws InterruptedException, IOException 
     {
	     System.out.println("in Before method");
	     File appDir = new File("src");
	     DesiredCapabilities capabilities = new DesiredCapabilities();
	     //capabilities.setCapability("noReset", "true");
	     //capabilities.setCapability("fullReset", "false");
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "c14f70ff");
	     //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	     capabilities.setCapability("appPackage", "com.suntv.sunnxt");
	     capabilities.setCapability("appActivity", "com.android.myplex.ui.sun.activities.MainActivity");
	     driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	     driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	     System.out.println("App Launched Successfully");
     }	
     */
     //com.suntv.sunnxt
	/*  public static void  backOnDevice() throws InterruptedException,IOException
	      {
	          driver.pressKeyCode(AndroidKeyCode.BACK);
	          driver.pressKeyCode(AndroidKeyCode.KEYCODE_APP_SWITCH);
	          Thread.sleep(3000);
	          driver.findElementByXPath("//*[@index='0']").click();
			  System.out.println("clicked on ballon 2");
			  Thread.sleep(3000);
              driver.findElementByXPath("//*[@index='0']").click();
			  System.out.println("clicked on ballon 3");
			  Thread.sleep(5000);
	      }
	 public static void clickonBackApp() throws InterruptedException,IOException
	  {
		  driver.pressKeyCode(AndroidKeyCode.BACK);
	  }
	 public static void clickSettings() throws InterruptedException,IOException
	 {
		 driver.findElement(By.xpath("//android.widget.TextView[@index='3']")).click();
	 }
	 
	 public static void scrollMethod()
	 {
	 	TouchAction taa = new TouchAction(driver);
	 	
	 	int h=driver.manage().window().getSize().getHeight();
	      int w=driver.manage().window().getSize().getWidth();
	      System.out.println(h);
	      System.out.println(w);
	      
	      int x1=(int)(w/2);
	      int y1=(int)(h*0.7);
	      int x2=(int)(w/2);
	      int y2=(int)(h*0.2);
	      
	      
	      taa.press(x1,y1).waitAction(10).moveTo(x2,y2).release().perform();
	      
	 }*/
}