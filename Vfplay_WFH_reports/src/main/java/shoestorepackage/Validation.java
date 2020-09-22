package shoestorepackage;

import java.sql.Driver;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Validation
{
	
	public static Boolean b;
	//start server
	public static Boolean isServerStarted(AndroidDriver driver,String signin)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='SIGN IN']")).getText().contains(signin);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	//create account
	public static Boolean isCreateAppScreenDisplayed(AndroidDriver driver,String account)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='CREATE ACCOUNT']")).getText().contains(account);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	public static Boolean isLoginSuccessfull(AppiumDriver driver,String men)
	{
		try
		{
			
		b=driver.findElement(By.xpath("//*[@text='MEN']")).getText().contains(men);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	public static Boolean isMenScreenDisplayed(AndroidDriver driver,String men)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='MEN']")).getText().contains(men);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	public static Boolean isProductScreenDisplayed(AppiumDriver driver,String product)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='Product']")).getText().contains(product);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	public static Boolean isCartScreenDisplayed(AndroidDriver driver,String cart)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='Cart']")).getText().contains(cart);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	public static Boolean isDeliveryScreenDisplayed(AndroidDriver driver,String delivery)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='Delivery']")).getText().contains(delivery);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	public static Boolean isLogoutScreenDisplayed(AndroidDriver driver,String forgotpwd)
	{
		try
		{
		b=driver.findElement(By.xpath("//*[@text='Forgot Password?']")).getText().contains(forgotpwd);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return b;
	}
	
	
}
