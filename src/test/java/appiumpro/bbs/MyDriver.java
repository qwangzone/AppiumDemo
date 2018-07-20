package appiumpro.bbs;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MyDriver {
    private AndroidDriver driver;
    public AndroidDriver mydriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "MAX");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("appPackage", "com.meizu.mzbbs");
        capabilities.setCapability("appActivity", ".ui.LoadingActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        return driver;
    }
}
