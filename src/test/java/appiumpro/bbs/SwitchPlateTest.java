package appiumpro.bbs;

import appiumpro.bbsPage.SwitchPlatePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SwitchPlateTest {
    private  AndroidDriver driver;
    private  SwitchPlatePage switchPlatePage;

    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "MAX");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.0");
        capabilities.setCapability("noReset",true);
        capabilities.setCapability("appPackage", "com.meizu.mzbbs");
        capabilities.setCapability("appActivity", ".ui.LoadingActivity");
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.switchPlatePage = new SwitchPlatePage(driver);
    }
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        SwitchPlateTest sw = new SwitchPlateTest();
        sw.setUp();

        Thread.sleep(6000);
        String wq = sw.switchPlatePage.bbsTitle();
        Thread.sleep(6000);
        System.out.println(wq);
        Thread.sleep(3000);
        sw.switchPlatePage.photographyButton();
        Thread.sleep(8000);
    }

}

