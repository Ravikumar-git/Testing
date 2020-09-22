package vodafone.pages;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import objectRepositary.FullScreen_OR;
import objectRepositary.Search_OR;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import vodafone.pages.Applaunch;
import java.util.concurrent.TimeUnit;


public class SearchPage extends Search_OR{
	public static AndroidDriver<AndroidElement> driver;
String text,text1;

Applaunch key =new Applaunch();	

//private AndroidDriver<AndroidElement> driver;


	 public SearchPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
 

	public void Searchkey() throws InterruptedException  {
		try {
			System.out.println("---------->TestCase ID :11	Search and filter in live and movies section..<------");
			//"Queen","Piku","Jurassic Park","Dosti", "India News UP","News 9", "Zee News","hello","paanch namune","line of duty"
			String x[]={ "118", "NDTV","Damaged2"};
						
			/*int size=x.length;
			System.out.println(size);*/
			Thread.sleep(5000);
			for (int i=0; i<x.length; i++)
			{
				Thread.sleep(3000);
				key.verticalDownSwipe();
				Thread.sleep(3000);
				Search_OR.searchIcon.click();
				System.out.println("Successfully clicked on Search Icon");
					
				Thread.sleep(3000);
				
				
				Search_OR.txtSearch.sendKeys(x[i]);
				System.out.println("Successfully entered "+x[i]+" in search field");
				
				Thread.sleep(10000);
				//Assert.assertTrue(Search_OR.thumbnailClick.isDisplayed());
				
				Search_OR.thumbnailClick.click();
				System.out.println("Successfully clicked on Movie thumbnail in search results");
				
				Thread.sleep(5000);
				key.tap();
				System.out.println("Tapped on screen");
				ContentDetails();
					
				Thread.sleep(30000);
				key.tap();
				
				try {
					Thread.sleep(500);
					Assert.assertTrue(Search_OR.downarrow.isDisplayed());
					Search_OR.downarrow.click();
					System.out.println("Dragged to Miniplayer icon");
				}
				catch(Exception e)
				{
					Thread.sleep(3000);
					key.backDevice();
					System.out.println("Tapped on back option");
				}
				
			//------------------------------	
						try {
							Thread.sleep(2000);
							Search_OR.ContentDescription.isDisplayed();
							key.backDevice();
							
							}
						catch(Exception e)
						{
							
						}
			//-------------------------------	
				
			
				
			}
			
			Thread.sleep(1000);
			key.backDevice();
							
				Thread.sleep(3000);
				System.out.println("Search test case pass");
				key.backDevice();
				System.out.println("mini player close");
								
			} catch (Exception e) {
				e.printStackTrace();
			}
}
	
	
	
	public void ContentDetails()  throws InterruptedException 
	{
		
		Thread.sleep(5000);
					
		try {
			
			Thread.sleep(3000);
			text=Search_OR.ContentTitle.getText();
			//System.out.println("Content title ---" +text);
			System.out.println(text);
			}
			catch (Exception e) {
				System.out.println(" Content title not displaying ");
				
			}
		
		try {
			text=Search_OR.releaseDate.getText();
			text1=Search_OR.Duration.getText();
			//System.out.println("Content Releasedate & Duration--- " +text + text1);
			System.out.println(text +" * " +text1);
			
			}
			catch (Exception e) {
				System.out.println(" Content duration not displaying ");
				
			}
		
		try {
			text=Search_OR.Lang.getText();
			text1=Search_OR.Genre.getText();
			//System.out.println("Content Genre & language--- " +text + text1);
			System.out.println(text +" * " +text1);
			}
			catch (Exception e) {
				System.out.println(" Content Genre & language not displaying ");
				
			}
		
		try {
			text=Search_OR.ContentDescription.getText();
			//System.out.println("Content Description ----" +text);
			System.out.println(text);
			}
			catch (Exception e) {
				System.out.println(" Content Description not displaying ");
				
			}
		
		System.out.println();
		
		
	}

}
