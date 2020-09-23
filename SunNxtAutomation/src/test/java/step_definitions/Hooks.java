package step_definitions;

import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.ConfigReader;
import utilities.GlobalUtil;
import utilities.HTMLReportUtil;
import utilities.KeywordUtil;
import utilities.LogUtil;

public class Hooks {

	String imagePath;
	String pathForLogger;
	String testCaseDescription;

	@Before("@MobileTest")
	public void beforeMobileMethod(Scenario scenario) 
	{

		if (scenario.getName().contains("_"))
			testCaseDescription = scenario.getName().split("_")[1];
		else
			testCaseDescription = scenario.getName();
		RunCukesTest.logger = RunCukesTest.extent.startTest(testCaseDescription);

		LogUtil.infoLog(getClass(),
				"\n+----------------------------------------------------------------------------------------------------------------------------+");
		LogUtil.infoLog(getClass(), "Mobile Tests Started: " + scenario.getName());

		LogUtil.infoLog("Mobile Test Environment",
				"Mobile Test is executed in OS: " + GlobalUtil.getCommonSettings().getAndroidName());

		// GlobalUtil.setMDriver(DriverUtil.getMobileApp());
		// GlobalUtil.setMDriver(DriverUtil.getMobileApp(GlobalUtil.getCommonSettings().getExecutionEnv()));
	}

	@After("@MobileTest")
	public void afterMobileMethod(Scenario scenario) 
	{
		//String testName = scenario.getName().split("_")[0].trim();
		if (scenario.isFailed()) {
			try {
				String scFileName = "ScreenShot_" + System.currentTimeMillis();
				String screenshotFilePath = ConfigReader.getValue("screenshotPath") + "\\" + scFileName + ".png";

				 imagePath = HTMLReportUtil.testFailMobileTakeScreenshot(screenshotFilePath);
				 pathForLogger = RunCukesTest.logger.addScreenCapture(imagePath);
				 RunCukesTest.logger.log(LogStatus.FAIL,
				 HTMLReportUtil.failStringRedColor("Failed at point: " + pathForLogger) +
				 GlobalUtil.e);

				 scenario.write("Current Page URL is " +
				 GlobalUtil.getMDriver().getCurrentUrl());

				 byte[] screenshot = KeywordUtil.takeMobileScreenshot(screenshotFilePath);

				 scenario.embed(screenshot, "image/png");

			

			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		else
		{

			LogUtil.infoLog("TestEnded",
					"Test has ended closing Application: " + GlobalUtil.getCommonSettings().getAndroidName());

		}

		GlobalUtil.getMDriver().quit();
		//GlobalUtil.getMDriver().close();
		RunCukesTest.extent.endTest(RunCukesTest.logger);
	}

}