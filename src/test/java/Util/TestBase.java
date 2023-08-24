package Util;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.SupportsContextSwitching;

public class TestBase {

    public static RemoteWebDriver driver;

    @BeforeClass
    public RemoteWebDriver setup () throws MalformedURLException {

    	DesiredCapabilities capabilities = new DesiredCapabilities();
    	
    	capabilities.setCapability("deviceName","emulator-5554");
    	capabilities.setCapability("platformName","Android");
    	capabilities.setCapability("appium:automationName", "Flutter");
    	capabilities.setCapability("autoGrantPermissions", true);
    	capabilities.setCapability("appium:appPackage", "com.example.flutter_application_1");
    	capabilities.setCapability("appium:appActivity","com.example.flutter_application_1.MainActivity"); // This is Launcher activity of your app (you can get it from apk info app)
    	driver =  new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }




    @AfterClass
    public void tearDown() throws MalformedURLException {
        driver.quit();
    }
 

    public static void switchContext(String context) {
        ((SupportsContextSwitching) driver).getContext();
        Set<String> con = ((SupportsContextSwitching) driver).getContextHandles();
        for (String c : con) {
            if (c.contains(context)) {
                ((SupportsContextSwitching) driver).context(c);
                break;
            }
        }


    }
}
