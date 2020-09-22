package vodafone.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.MoviesFilter_OR;
import vodafone.pages.Applaunch;



public class MoviesFilterPage extends MoviesFilter_OR
{
	public static AndroidDriver<AndroidElement> driver;
	Applaunch key = new Applaunch();
	String text;
	
	public MoviesFilterPage(AppiumDriver<AndroidElement> driver) 
	{
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	
	public void Common() throws Throwable 
	{
		
	
		Thread.sleep(5000);
		List<AndroidElement> list1=MoviesFilter_OR.list;
		for (int i =0; i<2;i++)
		{
				for (MobileElement mobileElement : list1) 
					{
					System.out.println(mobileElement.getText());
					}
				key.verticalSwipe();
		}
		key.verticalDownSwipe();
		
		Thread.sleep(3000);
		MoviesFilter_OR.select1.click();
		text=MoviesFilter_OR.select1.getText();
		System.out.println("Clicked on " +text);
		Thread.sleep(3000);
		MoviesFilter_OR.select2.click();
		text=MoviesFilter_OR.select2.getText();
		System.out.println("Clicked on " +text);
	}
	
	
	public void MoviesFilter() throws Throwable 
	{
		Thread.sleep(20000);

		try {		
		key.Exit();
		}
		catch(Exception e)
		{}
		
		try {
			Thread.sleep(5000);
			MoviesFilter_OR.clickMovies.click();
			System.out.println("Clicked on movies");
			Thread.sleep(3000);
			MoviesFilter_OR.clickFilter.click();
			System.out.println("Clicked on filter");
			Thread.sleep(3000);
			Common();
						
			Thread.sleep(3000);
			MoviesFilter_OR.Genres.click();
			System.out.println("Clicked on Genres");
			Common();
	
			MoviesFilter_OR.clickApply.click();
			System.out.println("Clicked on Apply");
			Thread.sleep(2000);
			text=MoviesFilter_OR.HeaderTitle.getText();
			System.out.println(text+ "--Screen launched");
			
			key.verticalSwipe();
			key.verticalSwipe();
			
			Thread.sleep(2000);
			key.backDevice();
			System.out.println("Successfully clicked Back");
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
     
		
		try {
			MoviesFilter_OR.clickOriginals.click();
			System.out.println("Successfully clicked Originals");
			Thread.sleep(3000);
			MoviesFilter_OR.clickFilter.click();
			System.out.println("Clicked on filter");
			Thread.sleep(3000);
			Common();
						
			Thread.sleep(3000);
			MoviesFilter_OR.Genres.click();
			System.out.println("Clicked on Genres");
			Common();
	
			MoviesFilter_OR.clickApply.click();
			System.out.println("Clicked on Apply");
			Thread.sleep(2000);
			text=MoviesFilter_OR.HeaderTitle.getText();
			System.out.println(text+ "--Screen launched");
			
			key.verticalSwipe();
			key.verticalSwipe();
			
			Thread.sleep(2000);
			key.backDevice();
			System.out.println("Successfully clicked Back");
			Thread.sleep(2000);
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			
			
		try {
			MoviesFilter_OR.clickTV.click();
			System.out.println("Successfully clicked TV");
			Thread.sleep(3000);
			MoviesFilter_OR.clickFilter.click();
			System.out.println("Clicked on filter");
			Thread.sleep(3000);
			Common();
						
			Thread.sleep(3000);
			MoviesFilter_OR.Genres.click();
			System.out.println("Clicked on Genres");
			Common();
	
			MoviesFilter_OR.clickApply.click();
			System.out.println("Clicked on Apply");
			Thread.sleep(2000);
			text=MoviesFilter_OR.HeaderTitle.getText();
			System.out.println(text+ "--Screen launched");
			
			key.verticalSwipe();
			key.verticalSwipe();
			
			Thread.sleep(2000);
			key.backDevice();
			System.out.println("Successfully clicked Back");
			Thread.sleep(2000);
			
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			MoviesFilter_OR.clickHome.click();
			System.out.println("Successfully clicked on Home");
								
            }
		
		
		
}

