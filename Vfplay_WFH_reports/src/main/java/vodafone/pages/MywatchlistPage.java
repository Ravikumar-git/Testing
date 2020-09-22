package vodafone.pages;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.Bitrates_OR;
import objectRepositary.CPicons_OR;
import objectRepositary.MyWatchlistAddingRemoving_OR;



public class MywatchlistPage extends MyWatchlistAddingRemoving_OR   {
	public static AndroidDriver<AndroidElement> driver;  

	//private AndroidDriver<AndroidElement> driver;


	Applaunch key= new Applaunch();
	String text;
	public MywatchlistPage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}


	public void WatchList() throws Throwable 
	{
		key.verticalDownSwipe();
		for(int i=0; i<=5; i++)
		{
				Thread.sleep(1000);
				key.horizontalSwipe();
				MyWatchlistAddingRemoving_OR.Watchlist.click();
				System.out.println("Successfully clicked on Watclist icon");
		}
	}


	public void Mywatchlist() throws Throwable {
		try {

			//-----------------------------------------------
			
			//-----------------------------------------------------------------



			/*Thread.sleep(3000);
				MyWatchlistAddingRemoving_OR.clickMoviestab.click();
				System.out.println("Successfully clicked on Movies tab");

				Thread.sleep(3000);
				MyWatchlistAddingRemoving_OR.clickonContent.click();
				System.out.println("Successfully clicked on Movie Thumbnail");

				Thread.sleep(3000);
				MyWatchlistAddingRemoving_OR.clickMywatchlisticon.click();
				System.out.println("Successfully clicked on watchlist icon to Remove/add movie in My watchlist page");

				Thread.sleep(3000);
				MyWatchlistAddingRemoving_OR.clickMiniplayer.click();
				System.out.println("Successfully clicked on Mini Player");*/
			System.out.println("---------->TestCase ID :17	Watch list adding and removing for all contents in all tabs.<------");

			Thread.sleep(5000);
			MyWatchlistAddingRemoving_OR.Hometab.click();
			WatchList();

			Thread.sleep(2000);
			MyWatchlistAddingRemoving_OR.clickNewstab.click();
			System.out.println("Successfully clicked on News tab");
			WatchList();

			Thread.sleep(2000);
			MyWatchlistAddingRemoving_OR.clickMoviestab.click();
			System.out.println("Successfully clicked on Movies tab");
			WatchList();

			Thread.sleep(2000);
			MyWatchlistAddingRemoving_OR.clickOriginalstab.click();
			System.out.println("Successfully clicked on Originals tab");
			WatchList();

			Thread.sleep(2000);
			MyWatchlistAddingRemoving_OR.clickTVtab.click();
			System.out.println("Successfully clicked on TV tab");
			WatchList();


			Thread.sleep(2000);
			MyWatchlistAddingRemoving_OR.clickHambergerMenu.click();
			System.out.println("Successfully clicked on Hamberger menu");

			Thread.sleep(2000);
			MyWatchlistAddingRemoving_OR.clickMyWatchlisttab.click();
			System.out.println("Successfully clicked on My watchlist tab");			

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickMovies.click();
			System.out.println("Successfully clicked on Movies");

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickTVShows.click();
			System.out.println("Successfully clicked on Tv Shows");

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickLiveTV.click();
			System.out.println("Successfully clicked on Live TV");

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickVideos.click();
			System.out.println("Successfully clicked on Videos");

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickTrailer.click();
			System.out.println("Successfully clicked on Trailer");

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickMovies.click();
			System.out.println("Successfully clicked on Movies");

			Thread.sleep(1000);
			MyWatchlistAddingRemoving_OR.clickonMoviethumbnailinMywatchlist.click();
			System.out.println("Successfully clicked on watchlist icon to Remove/add movie in My watchlist page");
			
			Thread.sleep(5000);
			key.backDevice();
			System.out.println("Back 1");
			
			Thread.sleep(2000);
			key.backDevice();
			System.out.println("Back 2");
			
			try {
				Thread.sleep(5000);
				Assert.assertTrue(MyWatchlistAddingRemoving_OR.PrintText.isDisplayed());
				//CPicons_OR.PrintText.isDisplayed();
				text=MyWatchlistAddingRemoving_OR.PrintText.getText();
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
			
			
			Thread.sleep(3000);
			System.out.println("My watchlist test case pass");

			System.out.println("---------->TestCase ID :17	Watch list adding and removing for all contents in all tabs.<----PASS--");


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}