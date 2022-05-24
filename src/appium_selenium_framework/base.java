package appium_selenium_framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities cap= new DesiredCapabilities();

		File appDir = new File("src");

		File app = new File(appDir, "ApiDemos-debug.apk");


		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "khemlall");



		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
	
	}

}
