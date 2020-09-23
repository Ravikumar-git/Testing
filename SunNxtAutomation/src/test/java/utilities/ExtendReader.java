package utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReader 
{
		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static Map<Long, ExtentTest> testMap = new HashMap<Long, ExtentTest>();
		public static void startReport() {
			if (htmlReporter == null) {
				
				String timeStamp = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss").format(new Date());
				String dateStamp = new SimpleDateFormat("dd.MM.yyyy").format(new Date());
				
				/*SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy.hh.mm");  
			    Date date = new Date();  
			    String currentDate=formatter.format(date);
			    System.out.println("currentDate:"+currentDate);*/
				htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/"+dateStamp+"/"+"Reliance-"+timeStamp+".html");
				// Create an object of Extent Reports
				extent = new ExtentReports();
				extent.attachReporter(htmlReporter);
				extent.setSystemInfo("Host Name", "");
				extent.setSystemInfo("Environment", "");
				extent.setSystemInfo("User Name", "");
				htmlReporter.config().setDocumentTitle("SunNxt");
				// Name of the report
				htmlReporter.config().setReportName("SunNxt mobile application");
				htmlReporter.config().enableTimeline(true);
				htmlReporter.config().setAutoCreateRelativePathMedia(true);
				// Dark Theme
				htmlReporter.config().setTheme(Theme.STANDARD);

			}
		}

		public static void startTest(String testName, String description, String categories) 
	        {

			ExtentTest test = extent.createTest(testName, description);
			test.assignCategory(categories);
			testMap.put(Thread.currentThread().getId(), test);

		}

		public static void logPass(String message) {
			getCurrentTest().log(Status.PASS, message);

		}

		
		public static void logFail(String message) {
			getCurrentTest().log(Status.FAIL, message);
		}
		
		public static void logSkipp(String message) {
			getCurrentTest().log(Status.SKIP, message);
		}
		
		public static void logScreenshot(WebDriver driver, String message) throws IOException
	       {
		getCurrentTest().addScreenCaptureFromBase64String(takeScreenshot(driver), message);

		}

		
		public static String takeScreenshot(WebDriver driver) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
	        String source = ts.getScreenshotAs(OutputType.BASE64);            
	        return source;
		}


	

		public static void logInfo(String message) {
			getCurrentTest().log(Status.INFO, message);

		}

		public static void endCurrentTest() {
			getCurrentTest().getExtent().flush();

			testMap.remove(Thread.currentThread().getId());
		}


		public static ExtentTest getCurrentTest() {
			return testMap.get(Thread.currentThread().getId());

		}

		public static void endReport() {

			extent.flush();
		}

	}

	
	
	
	
	
	
	

