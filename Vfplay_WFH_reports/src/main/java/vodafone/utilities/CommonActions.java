package vodafone.utilities;

import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import vodafone.pages.Applaunch;

import org.junit.Test;
import org.testng.annotations.*;
import vodafone.scripts.*;


public class CommonActions extends Applaunch {

	public static AndroidDriver<AndroidElement> driver;  

	//private AndroidDriver<AndroidElement> driver;


		 
	@SuppressWarnings("rawtypes")
	@Test
	public  void scrolldown() throws Exception
	{
		try {
		TouchAction ta=new TouchAction(driver);
		  WaitOptions wo=new WaitOptions();
		  wo.withDuration(Duration.ofSeconds(10));
		  ta.press(ElementOption.point(400,500)).waitAction().moveTo((PointOption)ElementOption.point(600,500 )).release().perform();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

}

}


