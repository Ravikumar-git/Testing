package vodafone.pages;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DateFormat;//for Video recording
import java.text.SimpleDateFormat;//for Video recording


import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import objectRepositary.BannersScrolling_OR;
import objectRepositary.ExitApp_OR;

import org.openqa.selenium.Dimension;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Applaunch 
{

	public static AndroidDriver<AndroidElement> driver;
	public static URL u;
	public static WebDriverWait wait;
	String destDir;
	DateFormat dateFormat;
	String text,text1;

	/*public static MobileActions mobileActions;

	    //Constructor
	    public Applaunch (AndroidDriver driver){
	        this.driver = driver;
	        mobileActions = new MobileActions(driver); //We are using MobileActions with this instance. Composition.
	        wait = new WebDriverWait(driver, 20);
	    }
	 */



	public void startAppiumServer() throws Exception {

		// Launch app in ARD through appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
		u = new URL("http://127.0.0.1:4723/wd/hub");

		// Maintain details base for app and ARD
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		//dc.setCapability("deviceName", "fca36521");
		//dc.setCapability("deviceName", "c383c27f0704");//Mi
		//dc.setCapability("deviceName", "3300a3507068a481");//samsung
		//dc.setCapability("deviceName", "9632f2447d53");//Mi

		//dc.setCapability("deviceName", "udid");
		dc.setCapability("deviceName", "42009305d320a4a5");//samsung big

		dc.setCapability("platformName", "android");
		//dc.setCapability("platformVersion", "6.0.1");
		//dc.setCapability("platformVersion", "9");
		dc.setCapability("platformVersion", "8.1.0");//samsung
		dc.setCapability("skipUnlock","true");
		//dc.setCapability("app", System.getProperty("user.dir")+"C:\\Users\\Apalya\\Downloads\\app-productionvodafone-debug.apk");
		dc.setCapability("appPackage", "com.vodafone.vodafoneplay");
		dc.setCapability("appActivity", "com.myplex.vodafone.ui.activities.LoginActivity");
		dc.setCapability("noReset","false");
		driver = new AndroidDriver<AndroidElement>(u, dc);
		wait = new WebDriverWait(driver, 20);
	}

	public void clickalltabs() throws Exception
	{
		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		Thread.sleep(5000);
	/*	driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
		Thread.sleep(5000);*/
		//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Vodafone Play\"]")).click();
	}


	public void backDevice() throws InterruptedException,IOException
	{

		driver.pressKeyCode(AndroidKeyCode.BACK);
	}



	//BrightnessSwipe by percentages
	@SuppressWarnings("rawtypes")
	public  void BrightnessSwipe() throws Exception
	{
		try {
			TouchAction tap=new TouchAction(driver);
			for(int i=0; i<=2; i++)
			{
				WaitOptions wo=new WaitOptions();
				wo.withDuration(Duration.ofSeconds(10));
				//tap.press(ElementOption.point(615,400)).waitAction().moveTo((PointOption)ElementOption.point(615,900)).release().perform(); for low brightness
				tap.press(ElementOption.point(615,900)).waitAction().moveTo((PointOption)ElementOption.point(615,200)).release().perform(); //for high brightness
				System.out.println(i+"brightness");
			}
		} 
		catch (Exception e) { e.printStackTrace(); }
	}


	//VolumeSwipe by percentages
	@SuppressWarnings("rawtypes")
	public  void VolumeSwipe() throws Exception
	{
		try {
			TouchAction tap=new TouchAction(driver);
			for(int i=0; i<=2; i++)
			{
				WaitOptions wo=new WaitOptions();
				wo.withDuration(Duration.ofSeconds(10));
				tap.press(ElementOption.point(900,305)).waitAction().moveTo((PointOption)ElementOption.point(615,305)).release().perform(); //for high brightness
				System.out.println(i+"Volume");
			}
		} 
		catch (Exception e) { e.printStackTrace(); }
	}


	//SeekbarSwipe by percentages
	@SuppressWarnings("rawtypes")
	public  void SeekbarSwipe() throws Exception
	{
		try {
			TouchAction tap=new TouchAction(driver);
			for(int i=0; i<=5; i++)
			{
				WaitOptions wo=new WaitOptions();
				wo.withDuration(Duration.ofSeconds(10));
				tap.press(ElementOption.point(300,800)).waitAction().moveTo((PointOption)ElementOption.point(750,800)).release().perform();
				System.out.println(i+"Seekbar");
			}
		}

		catch (Exception e) { e.printStackTrace(); }
	}		


	//Vertical Up Swipe by percentages
	@SuppressWarnings("rawtypes")
	public  void verticalSwipe() throws Exception
	{
		/*WebElement fromElement= driver.findElement(By.xpath("//android.widget.TextView[@text='Men's club']"));
		TouchAction action = new TouchAction(driver);
		action.scroll(fromElement, 10, 100);
		action.perform();*/

		//.xpath(“scroll from element name”)
		//System.out.println("Verifying contents in Home page");
		TouchAction tap=new TouchAction(driver);
		for(int i=0; i<10; i++)
		{
			WaitOptions wo=new WaitOptions();
			wo.withDuration(Duration.ofSeconds(20));
			tap.press(ElementOption.point(500,600)).waitAction().moveTo((PointOption)ElementOption.point(500,50)).release().perform();
		}
	}
	
	
	//Vertical Down Swipe by percentages
		@SuppressWarnings("rawtypes")
		public  void verticalDownSwipe() throws Exception
		{
			TouchAction caps=new TouchAction(driver);
			for(int i=0; i<=10; i++)
			{
				WaitOptions wo=new WaitOptions();
				wo.withDuration(Duration.ofSeconds(10));
				caps.press(ElementOption.point(500,500)).waitAction().moveTo((PointOption)ElementOption.point(500,1300)).release().perform();
			}
		}
	
		
	//Vertical Up Swipe by percentages
	@SuppressWarnings("rawtypes")
	public  void ContinueWatchingSwipe() throws Exception
	{
		TouchAction tap=new TouchAction(driver);
		for(int i=0; i<3; i++)
		{
			WaitOptions wo=new WaitOptions();
			wo.withDuration(Duration.ofSeconds(20));
			tap.press(ElementOption.point(500,600)).waitAction().moveTo((PointOption)ElementOption.point(500,50)).release().perform();
		}
	}


	//Vertical Up Swipe by percentages
	@SuppressWarnings("rawtypes")
	public  void verticalSwipeOnce() throws Exception
	{
		TouchAction tap=new TouchAction(driver);
		WaitOptions wo=new WaitOptions();
		wo.withDuration(Duration.ofSeconds(20));
		tap.press(ElementOption.point(500,800)).waitAction().moveTo((PointOption)ElementOption.point(500,50)).release().perform();//changed 600
	}

	@SuppressWarnings("rawtypes")
	public  void Later() throws Exception
	{
		try {
		driver.findElement(By.xpath("//*[@text='LATER']")).click();
		}
		catch(Exception e) 
		{}
	}
	


	//Tap by percentage
	@SuppressWarnings("rawtypes")
	public  void tap() throws Exception
	{
		TouchAction tap=new TouchAction(driver);
		tap.press(ElementOption.point(400,400)).release().perform();
	}


	//Horizontal Swipe by percentages
	@SuppressWarnings("rawtypes")
	public void horizontalSwipe() throws Exception
	{
		TouchAction tap=new TouchAction(driver);
		tap.press(ElementOption.point(800,400)).waitAction().moveTo((PointOption)ElementOption.point(400,400)).release().perform();
	}


	//Swipe by elements
	@SuppressWarnings("rawtypes")
	public void swipeByElements (AndroidElement startElement, AndroidElement endElement)
	{
		int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
		int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
		int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
		int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);

		new TouchAction(driver)
		.press(point(startX,startY))
		.waitAction(waitOptions(ofMillis(1000)))
		.moveTo(point(endX, endY))
		.release().perform();
	}


	@SuppressWarnings("rawtypes")
	public  void ScrollPage() throws Exception
	{
		TouchAction ta=new TouchAction(driver);
		for(int i=0; i<3; i++)
		{
			WaitOptions wo=new WaitOptions();
			wo.withDuration(Duration.ofSeconds(10));
			ta.press(ElementOption.point(50,1200)).waitAction().moveTo((PointOption)ElementOption.point(90,800)).release().perform();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public  void Screenshot() throws Exception
	{
		/*File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in d drive with name "screenshot.png"
		timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		screenShotName = new File("D:\\MyTest\\Screenshots\\"+timeStamp+".png");
		FileUtils.copyFile(scrFile, screenShotName);*/
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy_HH-mm");
		Date date = new Date();
		
		Thread.sleep(5000);
		destDir = "screenshots";// Set folder name to store screenshots.D:\eclipse-workspace\Vfplay_WFH\screenshots
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// Capture screenshot.
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");// Set date format to set It as screenshot file name.
		new File(destDir).mkdirs();// Create folder under project with name "screenshots" provided to destDir.
		String destFile = dateFormat.format(new Date()) + ".png";// Set file name using current date time.

		try 
		{
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
			
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void Exit() throws Throwable
	{
	try {
		Thread.sleep(2000);
		driver.findElement(By.id("com.vodafone.vodafoneplay:id/popup_headingTV")).isDisplayed();
		Thread.sleep(2000);
		driver.findElement(By.id("com.vodafone.vodafoneplay:id/closeExitPopUp")).click();
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			//System.out.println("Exit popup not displaying1");
		}
	
	}
	
	//Vertical Down Swipe by percentages
	@SuppressWarnings("rawtypes")
	public  void Zee5() throws Exception
	{
		
		try {
			
		Thread.sleep(10000);
		driver.findElement(By.id("com.graymatrix.did:id/txt_enter_pin")).isDisplayed();
		text=driver.findElement(By.id("com.graymatrix.did:id/txt_enter_pin")).getText();
		System.out.println(text+ "----popup displaying");	
		backDevice();
		}//try close
		catch(Exception e)
		{
		System.out.println("");
		}
		
		
		
		try {
			Thread.sleep(10000);
			driver.findElement(By.id("com.graymatrix.did:id/back_to_partner_text")).isDisplayed();
			text=driver.findElement(By.id("com.graymatrix.did:id/back_to_partner_text")).getText();
			System.out.println(text+ "----button displaying");	
			
			try {
				//key.tap();
				Thread.sleep(3000);
				text=driver.findElement(By.id("com.graymatrix.did:id/item_primary_text")).getText();
				System.out.println(text);
			}
			catch (Exception e) {
				System.out.println("Content title not displaying ");

			}

							try {
								text=driver.findElement(By.id("com.graymatrix.did:id/main_genre_tv")).getText();
								text1=driver.findElement(By.id("com.graymatrix.did:id/release_year_tv")).getText();
								System.out.println(text +" * " +text1);
				
							}
							catch (Exception e) {
								System.out.println("Content GenreTv & Year not displaying ");
							}

			try {
				text=driver.findElement(By.id("com.graymatrix.did:id/duration_tv")).getText();
				text1=driver.findElement(By.id("com.graymatrix.did:id/genresTv")).getText();
				//System.out.println("Content Genre & language--- " +text + text1);
				System.out.println(text +" * " +text1);
			}
			catch (Exception e) {
				System.out.println("Content Duration & Genres not displaying ");

			}

						try {
							text=driver.findElement(By.id("com.graymatrix.did:id/ageRatingTv")).getText();
							//System.out.println("Content Description ----" +text);
							System.out.println(text);
						}
						catch (Exception e) {
							System.out.println("Age rating not displaying ");
						}
						
						driver.findElement(By.id("com.graymatrix.did:id/back_to_partner_text")).click();
						System.out.println("Clicked on Back to Vodafone Play");
						Thread.sleep(5000);
						

						try {
							driver.findElement(By.id("com.graymatrix.did:id/verify_account_desc")).isDisplayed();
							text=driver.findElement(By.id("com.graymatrix.did:id/verify_account_desc")).getText();
							System.out.println(text +"-------Popup displaying");
							driver.findElement(By.id("com.graymatrix.did:id/btn_exit_yes")).click();
							Thread.sleep(5000);
						}
						catch (Exception e) {
							
						}
								
			}
			catch(Exception e)
			{
				System.out.println("");
				}
		

	}//zee method close
	
	
}

