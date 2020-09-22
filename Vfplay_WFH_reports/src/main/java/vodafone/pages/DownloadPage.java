package vodafone.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.Download_OR;
import objectRepositary.MyWatchlistAddingRemoving_OR;


public class DownloadPage extends Download_OR
{
	public static AndroidDriver<AndroidElement> driver;
	public DownloadPage(AppiumDriver<AndroidElement> driver) 
	{
		super();
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		
	}
	Applaunch key=new Applaunch();
	String text;
	
	
	public void DownloadScreen() throws Throwable
	{
		String x[]={"Vivah", "Johnwick", "Lucy"};
		try
		{
			
			Download_OR.clickMovies.click();
			System.out.println("clicked Movies");
			for (int i=0; i<=2; i++)
			{
				
			
			Thread.sleep(3000);
			Download_OR.searchIcon.click();
			System.out.println("clicked Search icon");
			Thread.sleep(3000);
			Download_OR.txtSearch.sendKeys(x[i]);
			System.out.println("Entered text "+ x[i]);
			Thread.sleep(3000);
			Download_OR.thumbnailimageClick1.click();
			System.out.println("Clicked on " +x[i]);
			Thread.sleep(5000);
			Download_OR.clickDownload.click();
			System.out.println("Clicked on download option");
			
			
			
				try {
					Thread.sleep(15000);
					System.out.println("Verifying download options");
					
					text=Download_OR.Datasaver.getText();
					System.out.println(text);
					text=Download_OR.Datasavertext.getText();
					System.out.println(text);
					
					text=Download_OR.Good.getText();
					System.out.println(text);
					text=Download_OR.Goodtext.getText();
					System.out.println(text);
					
					text=Download_OR.Best.getText();
					System.out.println(text);
					text=Download_OR.Besttext.getText();
					System.out.println(text);
					
					Thread.sleep(2000);
					Download_OR.clickDatasaver.click();
					System.out.println("Clicked datasaver");
					Thread.sleep(5000);
					key.backDevice();
					System.out.println("Clicked back in device");
				}
				catch(Exception e)
				{
					System.out.println("Download option not dipslaying");
					Thread.sleep(5000);
					key.backDevice();
					System.out.println("Clicked back in device");
				}
			}
				
			
			Thread.sleep(3000);
			Download_OR.clickHamburgerMenu.click();
			System.out.println("ClickedHamburgermenu");
			Thread.sleep(3000);
			Download_OR.clickDownloadHamburger.click();
			System.out.println("Clicked download hamburger menu");
			
			text=Download_OR.Headertitle.getText();
			System.out.println(text+ "----Screen launched");
			
			Thread.sleep(2000);
			
				try {
				Download_OR.TvshowsinDwnld.click();
				System.out.println("Clicked on TvShows");
				
				Download_OR.DownloadTitle.isDisplayed();
				System.out.println("Contents available in TvShows");
				
				DownloadContents();
				}
				
				catch(Exception e)
				{
					System.out.println("Contents not available in TvShows");
				}
			
			
			try {
				Download_OR.VideosinDwnld.click();
				System.out.println("Clicked on Videos");
				
				Download_OR.DownloadTitle.isDisplayed();
				System.out.println("Contents available in Videos");
				DownloadContents();
				}
				
				catch(Exception e)
				{
					System.out.println("Contents not available in Videos");
				}
			
			
			try {
				Download_OR.MoviesinDwnld.click();
				System.out.println("Clicked on Movies");
				
				Download_OR.DownloadTitle.isDisplayed();
				System.out.println("Contents available in Movies");
				DownloadContents();
				}
				
				catch(Exception e)
				{
					System.out.println("Contents not available in Movies");
				}

			
			Thread.sleep(5000);
			key.backDevice();
            System.out.println("Successfully clicked back");
            Thread.sleep(3000);
            try {
				Thread.sleep(5000);
				Assert.assertTrue(Download_OR.PrintText.isDisplayed());
				//CPicons_OR.PrintText.isDisplayed();
				text=Download_OR.PrintText.getText();
				System.out.println(text +"---Screen launched"); 
				Thread.sleep(1000);
				key.backDevice();
				Thread.sleep(1000);
				//key.backDevice();
				}
				catch(Exception e)
				{
					System.out.println("Main screen launched1");
				}
            
            System.out.println("Download testcase -------PASS-------------------");
            
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	

	public void DownloadContents() throws Throwable
	{
		Thread.sleep(3000);
		text=Download_OR.DownloadTitle.getText();
		System.out.println("Downloaded Content Title :--" +text);
		
		text=Download_OR.DownloadGenres.getText();
		System.out.println("Downloaded Content Genre is:--" +text);
		
		text=Download_OR.DownloadLength.getText();
		System.out.println("Downloaded Content Length is:--" +text);
		
		text=Download_OR.DownloadStatus.getText();
		System.out.println("Downloaded Content status is:--" +text);
		
		text=Download_OR.DownloadPercent.getText();
		System.out.println("Downloaded Content % is:--" +text);
		
	}
	



}
