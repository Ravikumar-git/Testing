package utilities;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import mobileutil.MobileKeywords;

/**
 * This DriverUtil class refer to browsers, os details, browser versions and
 * will close all browsers
 *
 */

public class DriverUtil {

	public static int row;
	public static String NDevice_Name = null;
	public static String ODevice_Name;
	public static String username;

	public static final String IE = "IE";
	public static final String REMOTE = "Remote";
	public static final String EDGE = "edge";
	public static final String CHROME = "Chrome";
	public static final String FIREFOX = "Firefox";
	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	// public static AndroidDriver<MobileElement> Mdriver;

	private static HashMap<String, String> checkLogin = new HashMap<String, String>();
	public static String appium_ip_address = mobileutil.MobileKeywords.GetValue("appium_ip_address");
	public static String appium_port = mobileutil.MobileKeywords.GetValue("appium_port");
	public static DesiredCapabilities capabilities = new DesiredCapabilities();

	public static XSSFWorkbook wb;
	public static XSSFSheet sheet1;

	private DriverUtil() {

	}

	public static AndroidDriver<AndroidElement> getMobileApp() throws Exception {

		try {
            Thread.sleep(5000);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobileKeywords.GetValue("platformName"));
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					MobileKeywords.GetValue("platformVersion"));
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, MobileKeywords.GetValue("DeviceName"));
			//capabilities.setCapability(MobileCapabilityType.APP, MobileKeywords.GetValue("apkFilePath"));
			capabilities.setCapability(MobileCapabilityType.UDID, MobileKeywords.GetValue("udid"));
			 capabilities.setCapability("appPackage", "com.suntv.sunnxt");
			 capabilities.setCapability("appActivity", "com.android.myplex.ui.sun.activities.MainActivity");

			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

			try {
				GlobalUtil.mdriver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
			} catch (Exception e) {
				e.printStackTrace();
			}
			GlobalUtil.mdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return GlobalUtil.mdriver;

	}

	public static void closeAllDriver() {

		drivers.entrySet().forEach(key -> {
			key.getValue().quit();
			key.setValue(null);
		});

		LogUtil.infoLog(DriverUtil.class, "Closing Browsers");
	}

}
