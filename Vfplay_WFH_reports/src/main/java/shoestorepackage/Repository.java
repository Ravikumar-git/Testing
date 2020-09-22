package shoestorepackage;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import cucumber.api.DataTable;
//import cucumber.api.Scenario;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class Repository 
{
	public static AndroidDriver driver;
	public static URL u;
	public static WebDriverWait wait;
//	public static Scenario s;
		public static void startAppiumServer() throws Exception {

		// Launch app in ARD through appium server

		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
		 u = new URL("http://127.0.0.1:4723/wd/hub");

		// Maintain details base for app and ARD

		DesiredCapabilities dc = new DesiredCapabilities();

		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "60c18edf");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "8.1");
		dc.setCapability("appPackage", "com.gsrikar.ecommerce");
		dc.setCapability("appActivity", "com.gsrikar.ecommerce.MainActivity");

		while (2 > 1)
		{
			try 
			{
				driver = new AndroidDriver(u, dc);
				break;
			} catch (Exception ex) 
			{
			}
			
		}
		
		if(Validation.isServerStarted(driver,"SIGN IN"))
		{
			System.out.println("Visibility of sign in screen test passed");
		}else
		{
			System.out.println("Visibility of sign in screen test failed");
		}

	}
		
		public void CreateAccount() throws Exception 
		{
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_create_acc));
			driver.findElement(Locators.Acc_create_acc).click();
			// full name
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_full_name));
			driver.findElement(Locators.Acc_full_name).sendKeys(TestData.Acc_full_name);
			// gender
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_gender));
			driver.findElement(Locators.Acc_gender).click();
			// dob
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_dob));
			driver.findElement(Locators.Acc_dob).click();
			// datepicker
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_date));
			// click 15
			driver.findElement(Locators.Acc_date).click();
			// click ok
			//wait.until(ExpectedConditions.elementToBeClickable(Locators.Acc_cal_ok));
			driver.findElement(Locators.Acc_cal_ok).click();
			// send phonenumber
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_country_code));
			driver.findElement(Locators.Acc_country_code).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_country_search));
			driver.findElement(Locators.Acc_country_search).sendKeys(TestData.Acc_country_search);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Prof_cntry_text));
			driver.findElement(Locators.Prof_cntry_text).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_phone_number));
			driver.findElement(Locators.Acc_phone_number).sendKeys(TestData.Acc_phone_number);
			// send mailid
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_emailid));
			driver.findElement(Locators.Acc_emailid).sendKeys(TestData.Acc_emailid);
			TouchAction ta=new TouchAction(driver);
			WaitOptions wo=new WaitOptions();
			wo.withDuration(Duration.ofSeconds(10));
			ta.press(ElementOption.point(1000,1200)).waitAction(wo)
			.moveTo(ElementOption.point(1000,800 )).release().perform();
			// password0
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_password));
			driver.findElement(Locators.Acc_password).sendKeys(TestData.Acc_password);
			// i accept check box
			//wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_checkbox));
			driver.findElement(Locators.Acc_checkbox).click();
			// click create account
			Thread.sleep(5000);
			//wait.until(ExpectedConditions.elementToBeClickable(Locators.Acc_account));
			driver.findElement(Locators.Acc_account).click();
			Thread.sleep(3000);
		if(Validation.isCreateAppScreenDisplayed(driver,"CREATE ACCOUNT"))
		{
			System.out.println("Visibility of create account test passed");
		}else
		{
			System.out.println("Visibility of create account test failed");
		}

		}

	public static void loginApp() throws Exception 
	{
		//total context
		Set context=driver.getContextHandles();
		System.out.println("context of android are"+context);
		//app context
		String present_context=driver.getContext();
		System.out.println("present context of app is:"+present_context);
		//get port address,protocal,path
		int port=driver.getRemoteAddress().getPort();
		String protocal=driver.getRemoteAddress().getProtocol();
		String path=driver.getRemoteAddress().getPath();
		System.out.println("port \t protocal \t path");
		System.out.println(port+"      "+protocal+"            "+path);
		//Get activity and package
		String app_activity = driver.currentActivity();
		String app_package= driver.getCurrentPackage();
		System.out.println("app activity is:"+app_activity+"\t"+"app package is:"+app_package );
		//device time
		String devicetime=driver.getDeviceTime("hh-mm-DD-MM-YYYY");	
		System.out.println("the time at present is:"+devicetime);
		//density of device
		long density=driver.getDisplayDensity();
		System.out.println("display density is:"+density);
		//waiting
		wait = new WebDriverWait(driver, 30);

		// emailid
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Ls_Emailid));
		driver.findElement(Locators.Ls_Emailid).sendKeys(TestData.Ls_Emailid);
		// password
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ls_pwd));
		driver.findElement(Locators.Ls_pwd).sendKeys(TestData.Ls_pwd);
		// sign in
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Ls_signin));
		driver.findElement(Locators.Ls_signin).click();
		Thread.sleep(3000);
		if(Validation.isLoginSuccessfull(driver,"MEN"))
		{
			System.out.println("Visibility of Home screen test passed");
		}else
		{
			System.out.println("Visibility of Home screen test failed");
		}

	}
	

	public void menScreen() throws Exception
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ms_selectmen));
		driver.findElement(Locators.Ms_selectmen).click();
		// select item
		if (driver.isKeyboardShown()) 
		{

			driver.hideKeyboard();

		}
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Ms_item));
		Thread.sleep(5000);
		driver.findElement(Locators.Ms_item).click();
		
		if(Validation.isProductScreenDisplayed(driver,"Product"))
		{
			System.out.println("Visibility of Product screen test passed");
		}else
		{
			System.out.println("Visibility of Product screen test failed");
		}

	}

	public void product_Screen() throws Exception {

		// product page
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Prod_text));
		WebElement e1 = driver.findElement(Locators.Prod_img);
		WaitOptions wo = new WaitOptions();
		wo.withDuration(Duration.ofMillis(100));
		// tap the element
		TouchAction ta1 = new TouchAction(driver);
		ta1.tap(ElementOption.element(e1));
		TouchAction ta2 = new TouchAction(driver);
		ta2.waitAction(wo).tap(ElementOption.element(e1));
		// double tap(zoom-out)
		MultiTouchAction ma1 = new MultiTouchAction(driver);
		ma1.add(ta1).add(ta2).perform();
		if (driver.isKeyboardShown()) {

			driver.hideKeyboard();

		}
		// Mandatory waiting
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(Locators.Prod_zoom);
		// tap the element
		TouchAction ta3 = new TouchAction(driver);
		ta3.tap(ElementOption.element(e2)).perform();
		// keyboard
		if (driver.isKeyboardShown()) {

			driver.hideKeyboard();

		}
		// quantity
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Prod_quantity));
		driver.findElement(Locators.Prod_quantity).click();

		// cart
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Prod_add_cart));
		driver.findElement(Locators.Prod_add_cart).click();
		// tap on cart
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Prod_cart_list));
		WebElement e3 = driver.findElement(Locators.Prod_cart_list);
	    TouchAction ta5 = new TouchAction(driver);
		ta5.tap(ElementOption.element(e3)).perform();
		Thread.sleep(3000);
		if(Validation.isCartScreenDisplayed(driver,"Cart"))
		{
			System.out.println("Visibility of Cart test passed");
		}else
		{
			System.out.println("Visibility of Cart test failed");
		}
	}

	public void cart_Screen() throws Exception
	{
		// cart screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.cs_cart_text));
		// click on order
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.cs_product_order));	
		driver.findElement(Locators.cs_product_order).click();
		Thread.sleep(3000);
		if(Validation.isDeliveryScreenDisplayed(driver,"Delivery"))
		{
			System.out.println("Visibility of Delivery Screen test passed");
		}else
		{
			System.out.println("Visibility of Delivery Screen test failed");
		}
	}

	/*public void deliveryScreen(DataTable dt) throws Exception
	{
		
			wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_deliverText));

			List<List<String>> data=dt.asLists(String.class);
			for(int i=1;i<data.size();i++)
			{
				driver.findElement(Locators.Ds_fill_Firstname).sendKeys(data.get(i).get(0));
				driver.findElement(Locators.Ds_fill_lastname).sendKeys(data.get(i).get(1));
				driver.findElement(Locators.Ds_fill_EmailAddress).sendKeys(data.get(i).get(2));
				TouchAction ta=new TouchAction(driver);
				WaitOptions wo=new WaitOptions();
				wo.withDuration(Duration.ofSeconds(10));
				ta.press(ElementOption.point(1000,1200)).waitAction(wo)
				.moveTo(ElementOption.point(1000,800 )).release().perform();
				driver.findElement(Locators.Ds_fill_PhoneNum).sendKeys(data.get(i).get(3));
				driver.findElement(Locators.Ds_fill_Note).sendKeys(data.get(i).get(4));
			
				if (driver.isKeyboardShown()) 
				{

					driver.hideKeyboard();

				}
				
				// submit order
				wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_click_SubmitOrder));
				driver.findElement(Locators.Ds_click_SubmitOrder).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_order_successmsg));
				driver.findElement(Locators.Ds_order_successmsg).click();
			}
			if(Validation.isLoginSuccessfull(driver,"MEN"))
			{
				System.out.println("Visibility of Home screen test passed");
			}else
			{
				System.out.println("Visibility of Home screen test failed");
			}
			

		// delivery screen
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_deliverText));
		// order details
		// firstname
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_fill_Firstname));
		driver.findElement(Locators.Ds_fill_Firstname).sendKeys(TestData.Ds_fill_Firstname);
		// last name
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_fill_lastname));
		driver.findElement(Locators.Ds_fill_lastname).sendKeys(TestData.Ds_fill_lastname);
		// emailid
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_fill_EmailAddress));
		driver.findElement(Locators.Ds_fill_EmailAddress).sendKeys(TestData.Ds_fill_EmailAddress);
		// phone number
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_fill_PhoneNum));
		driver.findElement(Locators.Ds_fill_PhoneNum).sendKeys(TestData.Ds_fill_PhoneNum);
		// note
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_fill_Note));
		driver.findElement(Locators.Ds_fill_Note).sendKeys(TestData.Ds_fill_Note);
		if (driver.isKeyboardShown()) 
		{

			driver.hideKeyboard();

		}
		// submit order
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_click_SubmitOrder));
		driver.findElement(Locators.Ds_click_SubmitOrder).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Ds_order_successmsg));
		driver.findElement(Locators.Ds_order_successmsg).click();
		if(Validation.isDeliveryScreenDisplayed(driver,"Delivery"))
		{
			System.out.println("test passed");
		}else
		{
			System.out.println("test failed");
		}
	}*/

	public void logoutApp()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Prof_Menu));
		driver.findElement(Locators.Prof_Menu).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Menu_Signout));
		driver.findElement(Locators.Menu_Signout).click();
		if(Validation.isLogoutScreenDisplayed(driver,"Forgot Password?"))
		{
			System.out.println("Visibility of Forgot password screen test passed");
		}else
		{
			System.out.println("Visibility of Forgot password screen test failed");
		}
	}
	
	public void My_Account() {
		
		// full name
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_full_name));
		driver.findElement(Locators.Acc_full_name).sendKeys(TestData.Acc_full_name);
		// gender
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_gender));
		driver.findElement(Locators.Acc_gender).click();
		// dob
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_dob));
		driver.findElement(Locators.Acc_dob).click();
		// datepicker
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_date));
		// click 15
		driver.findElement(Locators.Acc_date).click();
		// click ok
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Acc_cal_ok));
		driver.findElement(Locators.Acc_cal_ok).click();
		// send phonenumber
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_country_code));
		driver.findElement(Locators.Acc_country_code).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_country_search));
		driver.findElement(Locators.Acc_country_search).sendKeys(TestData.Acc_country_search);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Prof_cntry_text));
		driver.findElement(Locators.Prof_cntry_text).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_phone_number));
		driver.findElement(Locators.Acc_phone_number).sendKeys(TestData.Acc_phone_number);
		// send mailid
		wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.Acc_emailid));
		driver.findElement(Locators.Acc_emailid).sendKeys(TestData.Acc_emailid);
		//Update
		wait.until(ExpectedConditions.elementToBeClickable(Locators.Myaccount_update));
		driver.findElement(Locators.Myaccount_update).click();

		
	}

	public void StopAppiumServer() throws Exception 
	{

		// close app
		driver.closeApp();
		// Stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}

}
