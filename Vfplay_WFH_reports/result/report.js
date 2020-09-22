$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/hema_workspace/hema_workspace/com.shoestore.org/src/test/resources/filepackage/featurefile.feature");
formatter.feature({
  "line": 1,
  "name": "Sign Up",
  "description": "",
  "id": "sign-up",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Shoestore App,",
  "description": "",
  "id": "sign-up;shoestore-app,",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch Appium server",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Do login with username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Click on men,Shoe items will be displayed and select the item",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Product Screen will be displayed, then select the quantity and add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Click on cart,Cart screen will be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on delivery,and fill the details to place the order",
  "rows": [
    {
      "cells": [
        "order_firstname",
        "order_lastname",
        "order_mailid",
        "order_phonenumber",
        "order_note"
      ],
      "line": 9
    },
    {
      "cells": [
        "ram",
        "rahul",
        "aaalll@gmail.com",
        "89456123077",
        "hello hai"
      ],
      "line": 10
    },
    {
      "cells": [
        "raji",
        "rajitha",
        "raji@gmail.com",
        "78945612300",
        "hello"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on logout",
  "keyword": "And "
});
formatter.match({
  "location": "GlueCode.verify_startAppiumServer()"
});
formatter.result({
  "duration": 118756958261,
  "status": "passed"
});
formatter.match({
  "location": "GlueCode.verify_loginApp()"
});
formatter.result({
  "duration": 16217576907,
  "status": "passed"
});
formatter.match({
  "location": "GlueCode.verify_MenScreen()"
});
formatter.result({
  "duration": 10835832956,
  "status": "passed"
});
formatter.match({
  "location": "GlueCode.verify_product_Screen()"
});
formatter.result({
  "duration": 15421064586,
  "status": "passed"
});
formatter.match({
  "location": "GlueCode.verify_Cart_Screen()"
});
formatter.result({
  "duration": 6392684548,
  "status": "passed"
});
formatter.match({
  "location": "GlueCode.verify_DeliveryScreen(DataTable)"
});
formatter.result({
  "duration": 38313570476,
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027PC019\u0027, ip: \u0027192.168.1.77\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {appActivity: com.gsrikar.ecommerce.MainA..., appPackage: com.gsrikar.ecommerce, browserName: , databaseEnabled: false, desired: {appActivity: com.gsrikar.ecommerce.MainA..., appPackage: com.gsrikar.ecommerce, browserName: , deviceName: 60c18edf, platformName: android, platformVersion: 8.1}, deviceManufacturer: Xiaomi, deviceModel: Redmi Note 5 Pro, deviceName: 60c18edf, deviceScreenSize: 1080x2160, deviceUDID: 60c18edf, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, platform: LINUX, platformName: Android, platformVersion: 8.1.0, takesScreenshot: true, warnings: {}, webStorageEnabled: false}\nSession ID: 1697499b-7676-4522-bdfd-a52759777b4d\n*** Element info: {Using\u003dxpath, value\u003d//*[@text\u003d\u0027First Name\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:231)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementByXPath(DefaultGenericMobileDriver.java:152)\r\n\tat io.appium.java_client.AppiumDriver.findElementByXPath(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementByXPath(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:58)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat shoestorepackage.Repository.deliveryScreen(Repository.java:246)\r\n\tat Gluepackage.GlueCode.verify_DeliveryScreen(GlueCode.java:43)\r\n\tat ✽.Then Click on delivery,and fill the details to place the order(D:/hema_workspace/hema_workspace/com.shoestore.org/src/test/resources/filepackage/featurefile.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "GlueCode.verify_logoutApp()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 200093721,
  "status": "passed"
});
});