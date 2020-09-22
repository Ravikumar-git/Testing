package objectRepositary;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Home_OR {
	 
	//android.widget.Button
	//h2/a[contains(text(),'ViewAll')]
	//public static By click_Allowcalls =By.id("com.android.packageinstaller:id/permission_allow_button");
	/*public static By click_Allowcalls =By.xpath("//android.widget.Button[@text='ALLOW']");
	public static By click_Allowmedia=By.xpath("//android.widget.Button[@text='ALLOW']");
	public static By click_AllowLocation =By.xpath("//android.widget.Button[@text='ALLOW']");*/
	
	 public Home_OR(AppiumDriver<AndroidElement> driver) 
     {
		 
	  PageFactory.initElements(new AppiumFieldDecorator(driver),this);	 
		 
	 }
	    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Vodafone Play\"]")
		public static AndroidElement hambergermenu;
		
		/*@AndroidFindBy(xpath = "//*[@text='Originals']")
		public static AndroidElement txtheadertabOriginals;*/
		//driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Vodafone Play\"]")).click();
		    
}

/*@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
public static AndroidElement clickAllowCalls;   


@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
public static AndroidElement clickAllowMedia;
 
 
@AndroidFindBy(id="com.android.packageinstaller:id/permission_allow_button")
public static AndroidElement clickAllowLocation;*/
	    
	    /*
	    @AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
	    public static AndroidElement clickAllowMedia;
	    
	    @AndroidFindBy(xpath="//android.widget.Button[@text='ALLOW']")
	    public static AndroidElement clickAllowCalls;
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='TELUGU']")
	    public static AndroidElement clickTelugu;
	    
	    @AndroidFindBy(xpath = "//android.widget.Button[@text='NEXT']")
		public static AndroidElement clickNext;
	    
	    @AndroidFindBy(xpath="//android.widget.Button[@text='ACCEPT']")
	    public static AndroidElement clickAcceptSubscriber;
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='MOVIES']")
	    public static AndroidElement clickMovies;
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='Change content language']")
	    public static AndroidElement clickcontentlanguage;		
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='Change app language']")
	    public static AndroidElement clickapplanguage;	
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='Settings']")
	    public static AndroidElement clickSettingsinMenu;	
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='Video Quality']")
	    public static AndroidElement clickVideoQuality;
	    
	    @AndroidFindBy(xpath="//android.widget.TextView[@text='Feedback']")
	    public static AndroidElement clickFeedback;*/
	    
	
	 
	   
	



