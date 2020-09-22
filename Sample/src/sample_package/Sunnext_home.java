package sample_package;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;



public class Sunnext_home {

	public static void main(String[] args) throws Exception 
	{
		
				       DesiredCapabilities dc = new DesiredCapabilities();
			            //dc.setCapability(MobileCapabilityType.DEVICE_NAME, "");
			            dc.setCapability(CapabilityType.BROWSER_NAME,"");
			            dc.setCapability("deviceName", "c14f70ff");
				        dc.setCapability("platformName", "android");
				        dc.setCapability("platformVersion", "9");
				        dc.setCapability("appPackage", "com.suntv.sunnxt");
				        dc.setCapability("appActivity", "com.android.myplex.ui.sun.activities.SplashActivity");
				        
				        



				       Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
				       URL u=new URL("http://127.0.0.1:4723/wd/hub");
				       
				     AndroidDriver driver;
				     while(2>1)
				     {
				         try
				         {
				           driver=new AndroidDriver(u,dc);
				           break;
				         }
				     catch(Exception ex)
				     {
				     }
				     }  
				     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
				       //   driver.findElementByXPath("//*[@text='ALLOW']").click();
					      System.out.println("clicked on ballon 1");
					      Thread.sleep(3000);
					      
					      driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
					      System.out.println("clicked on ballon 2");
					      
					      
					      driver.findElement(By.id("com.suntv.sunnxt:id/action_settings")).click();
					      
					   //   driver.findElement(By.id("//*[@resource-id='com.suntv.sunnxt:id/root1']")).click();	    

					      driver.findElement(By.xpath("//*[@resource-id	='com.suntv.sunnxt:id/root1']")).click();
	}

}
