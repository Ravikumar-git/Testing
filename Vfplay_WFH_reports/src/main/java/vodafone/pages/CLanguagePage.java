package vodafone.pages;

import java.net.StandardSocketOptions;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import objectRepositary.CPicons_OR;
import objectRepositary.ContentLanguages_OR;
import vodafone.pages.Applaunch;

public class CLanguagePage extends ContentLanguages_OR{
	public static AndroidDriver<AndroidElement> driver;  
	Applaunch key = new Applaunch();
	String text;


	public CLanguagePage(AppiumDriver<AndroidElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void CLanguage() throws Throwable {

		Thread.sleep(10000);

		System.out.println("-------------------Content language testcase------------------------------------");
		ContentLanguages_OR.HambergerMenu.click();
		System.out.println("Tapped on Hamberger Menu");


		Thread.sleep(3000);
		ContentLanguages_OR.LanguageSettings.click();
		System.out.println("Tapped on Language Settings");
		Thread.sleep(1000);

		try {
			System.out.println("App Language screen");
			Common();

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		ContentLanguages_OR.ContentLanguages.click();
		System.out.println("Tapped on Content Languages");
		Thread.sleep(1000);

		try {
			Common1();

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		ContentLanguages_OR.Save.click();
		System.out.println("Tapped on SAVE button");

		//ContentLanguages_OR.AppLogo.isDisplayed();

		try {
			/*WebDriverWait wait = new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(ContentLanguages_OR.AppLogo));*/

			Thread.sleep(5000);
			System.out.println("Home tab contents");
			//loop();
			dummy();

			Thread.sleep(5000);
			ContentLanguages_OR.Moviestab.click();
			System.out.println("Clicked on Movies tab");
			dummy();

			Thread.sleep(5000);
			ContentLanguages_OR.Originalstab.click();
			System.out.println("Clicked on Originals tab");
			dummy();

			Thread.sleep(5000);
			ContentLanguages_OR.Newstab.click();
			System.out.println("Clicked on News tab");
			dummy();

			Thread.sleep(5000);
			ContentLanguages_OR.TVtab.click();
			System.out.println("Clicked on Tv tab");
			dummy();

			Thread.sleep(5000);
			ContentLanguages_OR.Hometab.click();
			
			Thread.sleep(3000);
			key.verticalDownSwipe();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	
	public void dummy() throws Throwable
	{
		Thread.sleep(5000);
		for(int i=1;i<=8;i++)
		{
			List<AndroidElement> Carousel=ContentLanguages_OR.Carousels;
			for (MobileElement mobileElement : Carousel) 
			{
				System.out.println(mobileElement.getText());
	
			}
			key.verticalSwipeOnce();
			key.verticalSwipeOnce();
		}
		Thread.sleep(5000);
		key.verticalDownSwipe();
		
	}
	
	
	public void loop() throws Exception 
	{
		List<AndroidElement> Carousel=ContentLanguages_OR.Carousels;
		for (MobileElement mobileElement : Carousel) 
		{
			System.out.println(mobileElement.getText());

		}
		
		for(int i=1;i<=8;i++)
		{
			Thread.sleep(5000);
			text=ContentLanguages_OR.Carousel1.getText();
			System.out.println(text+ "---Carousel title");
			Thread.sleep(5000);
			key.verticalSwipeOnce();
			key.verticalSwipeOnce();

			try
			{
				System.out.println("try inner carousel 2");
				Assert.assertTrue(ContentLanguages_OR.Carousel2.isDisplayed());
				text=ContentLanguages_OR.Carousel2.getText();
				System.out.println(text+ "---Carousel title");
				key.verticalSwipeOnce();
				System.out.println("-----------------try carousel 2");
			}
			catch(Exception e)
			{
				System.out.println("catch inner carousel 2");
				key.verticalSwipeOnce();
				
				try 
				{
					Assert.assertTrue(ContentLanguages_OR.Carousel2.isDisplayed());
					text=ContentLanguages_OR.Carousel2.getText();
					System.out.println(text+ "---Carousel title");
					System.out.println("-----------------Catch carousel 2");
				}
				catch(Exception c)
				{
					Assert.assertTrue(ContentLanguages_OR.Carousel1.isDisplayed());
					text=ContentLanguages_OR.Carousel1.getText();
					System.out.println(text+ "---Carousel title");
				}
			}

			try
			{
				System.out.println("try inner carousel 3");
				Assert.assertTrue(ContentLanguages_OR.Carousel3.isDisplayed());
				text=ContentLanguages_OR.Carousel3.getText();
				System.out.println(text+ "---Carousel title");
				key.verticalSwipeOnce();
				System.out.println("-----------------try carousel 3");

			}
				catch(Exception e)
				{
					System.out.println("catch inner carousel 3");
					key.verticalSwipeOnce();
					//key.verticalSwipeOnce();
				
						try {
							System.out.println("111");
						key.verticalSwipeOnce();
						Assert.assertTrue(ContentLanguages_OR.Carousel3.isDisplayed());
						text=ContentLanguages_OR.Carousel3.getText();
						System.out.println(text+ "---Carousel title");
						}
						catch(Exception a)
						{
							try 
							{
								System.out.println("222");
								key.verticalSwipeOnce();
								Assert.assertTrue(ContentLanguages_OR.Carousel2.isDisplayed());
								text=ContentLanguages_OR.Carousel2.getText();
								System.out.println(text+ "---Carousel title");
							}
							catch(Exception b)
							{
								System.out.println("333");
								key.verticalSwipeOnce();
								Assert.assertTrue(ContentLanguages_OR.Carousel1.isDisplayed());
								text=ContentLanguages_OR.Carousel1.getText();
								System.out.println(text+ "---Carousel title");
							}
						}
				
					System.out.println("-----------------catch carousel 3");
			}

			/*text=ContentLanguages_OR.Carousel3.getText();
		System.out.println(text+ "---Carousel title");*/
		}

		key.verticalDownSwipe();
	}



	public void Common1() throws Throwable 
	{
		Thread.sleep(5000);
		List<AndroidElement> list1=ContentLanguages_OR.CLanglist1;
		List<AndroidElement> list2=ContentLanguages_OR.CLanglist2;
				
		for (MobileElement mobileElement : list1) 
		{
			System.out.println(mobileElement.getText());

		}
		System.out.println("==========================================");
		for (MobileElement mobileElement : list2) 
		{
			System.out.println(mobileElement.getText());
		}

		Thread.sleep(3000);
		ContentLanguages_OR.CLanglistTelugu.click();
		text=ContentLanguages_OR.CLanglistTelugu.getText();
		System.out.println("Clicked on " +text);

		ContentLanguages_OR.CLanglistTamil.click();
		text=ContentLanguages_OR.CLanglistTamil.getText();
		System.out.println("Clicked on " +text);

		Thread.sleep(3000);

	}

	public void Common() throws Throwable 
	{
		Thread.sleep(5000);

		List<AndroidElement> list1=ContentLanguages_OR.AppLangList;

		for (MobileElement mobileElement : list1) 
		{
			System.out.println(mobileElement.getText());
		}

		Thread.sleep(3000);
		ContentLanguages_OR.AppLangEnglish.click();
		text=ContentLanguages_OR.AppLangEnglish.getText();
		System.out.println("Clicked on " +text);
		Thread.sleep(3000);
	}



}
