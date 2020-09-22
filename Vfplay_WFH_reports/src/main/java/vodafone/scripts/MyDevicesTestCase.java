package vodafone.scripts;

import org.testng.annotations.*;
import vodafone.pages.MyDevicesPage;
import vodafone.pages.Applaunch;


public class MyDevicesTestCase extends Applaunch{

	  // TODO Auto-generated method stub
	  @Test
	  public void MyDevicesPage() throws Throwable {
	  
	  //Launch chrome browser
	  //logger=extent.createTest("navigation test case");
		  MyDevicesPage devices = new MyDevicesPage(driver);
		  devices.MyDevices();

	  }
	  
}