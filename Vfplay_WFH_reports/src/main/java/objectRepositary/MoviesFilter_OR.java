package objectRepositary;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MoviesFilter_OR 
{
	public MoviesFilter_OR(AppiumDriver<AndroidElement> driver) 
	{

		PageFactory.initElements(new AppiumFieldDecorator(driver),this);	 

	}

	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Movies']")
	public static AndroidElement clickMovies;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Home']")
	public static AndroidElement clickHome;
	
	@AndroidFindBy(xpath="//*[@text='Originals']")
	public static AndroidElement clickOriginals;
	
	@AndroidFindBy(xpath="//*[@text='TV']")
	public static AndroidElement clickTV;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id='com.vodafone.vodafoneplay:id/action_filter']")
	public static AndroidElement clickFilter;
	
	@AndroidFindBy(xpath="//*[@text='Telugu']")
	public static AndroidElement clickTelugu;
	
	@AndroidFindBy(xpath="//*[@text='Hindi']")
	public static AndroidElement clickHindi;
	
	@AndroidFindBy(xpath="//*[@text='Apply']")
	public static AndroidElement clickApply;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.vodafone.vodafoneplay:id/tvFilterItem']")
	public static AndroidElement data;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/tvFilterItem")
	public static List<AndroidElement> list;
	
	//@AndroidFindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[@content-desc='Genres']")
	@AndroidFindBy(xpath="//*[@text='Genres']")
	public static AndroidElement Genres;
	
	@AndroidFindBy(xpath="//androidx.appcompat.app.ActionBar.Tab[@content-desc='Languages']")
	public static AndroidElement Languages;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.vodafone.vodafoneplay:id/tvFilterItem'])[1]")
	public static AndroidElement select1;
	
	@AndroidFindBy(xpath="(//*[@resource-id='com.vodafone.vodafoneplay:id/tvFilterItem'])[5]")
	public static AndroidElement select2;
	
	@AndroidFindBy(id="com.vodafone.vodafoneplay:id/toolbar_header_title")
	public static AndroidElement HeaderTitle;
	
	//*[@resource-id='com.vodafone.vodafoneplay:id/rvFilterItems']//
	//com.vodafone.vodafoneplay:id/tvFilterItem


}