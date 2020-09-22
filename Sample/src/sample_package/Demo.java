package sample_package;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Demo {

	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		   System.out.println("test111");
		
				     DesiredCapabilities dc = new DesiredCapabilities();
			            //dc.setCapability(MobileCapabilityType.DEVICE_NAME, "");
			            dc.setCapability(CapabilityType.BROWSER_NAME,"");
			            dc.setCapability("deviceName", "J8AAGF09C962PVE");
				        dc.setCapability("platformName", "android");
				        dc.setCapability("platformVersion", "9");
				        //dc.setCapability("appPackage", "com.suntv.sunnxt");
				       // dc.setCapability("appActivity", "com.android.myplex.ui.sun.activities.SplashActivity");
				       // dc.setCapability("appActivity", "com.android.myplex.ui.sun.activities.MainActivity");
				       // com.suntv.sunnxt/com.android.myplex.ui.sun.activities.SplashActivity
				        //com.android.myplex.ui.sun.activities.MainActivity
				        //com.vodafone.vodafoneplay
				        //com.android.myplex.ui.sun.activities.SplashActivity
				        //com.android.myplex
				        
				        dc.setCapability("appPackage", "com.vodafone.vodafoneplay");
				        System.out.println("test1");
				        dc.setCapability("appActivity", "com.myplex.vodafone.ui.activities.MainActivity");
				        System.out.println("test2");
				        
				       Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
				       URL u=new URL("http://127.0.0.1:4723/wd/hub");
				       
				      AndroidDriver driver;
				     while(2>1)
				     {
				         try
				         {
				        	 System.out.println("rrr");
				           driver=new AndroidDriver(u,dc);
				           break;
				         }
				     catch(Exception ex)
				     {
				    	 System.out.println(ex);
				     }
				     }  
				       
				          driver.findElementByXPath("//*[@text='ALLOW']").click();
					      System.out.println("clicked on ballon 1");
					      Thread.sleep(3000);
				            
					      driver.findElementByXPath("//*[@text='ALLOW']").click();
						  System.out.println("clicked on ballon 2");
						  Thread.sleep(3000);
						  driver.findElementByXPath("//*[@text='ALLOW']").click();
						  System.out.println("clicked on ballon 3");                                                                                                         
						  Thread.sleep(10000);
					  
						  
						    TouchAction ta=new TouchAction(driver);
							WaitOptions wo=new WaitOptions();
							wo.withDuration(Duration.ofSeconds(10));
							ta.press(ElementOption.point(1000,1200)).waitAction(wo).moveTo(ElementOption.point(1000,600 )).release().perform();
						        
		                     driver.findElementByXPath("//*[@resource-id='com.vodafone.vodafoneplay:id/thumbnail_movie']").click();
			
		                     
	}//method	

	}//class		
