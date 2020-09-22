package vodafone.pages;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import objectRepositary.LiveTVEPEG_OR;

public class LiveTVEPEGPage extends LiveTVEPEG_OR
{
	public static AndroidDriver<AndroidElement> driver;
	public LiveTVEPEGPage(AppiumDriver<AndroidElement> driver) 
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	Applaunch scroll=new Applaunch();
    public void LiveTVEPEGPage() throws Throwable 
    {
    	try
    	{     
            Thread.sleep(3000);   
    		LiveTVEPEG_OR.clickMovies.click();
    		System.out.println("clicked Movies");
    		
    		Thread.sleep(3000);
    		LiveTVEPEG_OR.searchIcon.click();
    		System.out.println("clicked search icon");
    		
    		Thread.sleep(3000);
    		LiveTVEPEG_OR.txtSearch.sendKeys(" dilli aaj tak");
    		System.out.println("clicked dilli aaj tak");
    		
    		Thread.sleep(3000);
    		LiveTVEPEG_OR.thumbnailimageClick1.click();
    		System.out.println("clicked dilli aaj tak");
    		
    		Thread.sleep(3000);
    		scroll.ScrollPage();
    		System.out.println("scrolled two times");
    		
    		Thread.sleep(6000);
    		LiveTVEPEG_OR.Epgalarm.click();
    		System.out.println("clicked epg alarm");
    		
    		  
    		
    	}
    			    		
    	catch (Exception e) 
    	{
    		e.printStackTrace();
    	}

     }
    
}
