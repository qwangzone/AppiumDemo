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
        MyDriver myDriver = new MyDriver();
        this.driver = myDriver.mydriver();
        this.switchPlatePage = new SwitchPlatePage(this.driver);
    }
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        SwitchPlateTest sw = new SwitchPlateTest();
        sw.setUp();
        Thread.sleep(6000);
        String wq = sw.switchPlatePage.bbsTitle1();
        Thread.sleep(3000);
        System.out.println(wq);
        Thread.sleep(3000);
        String w = sw.switchPlatePage.bbsTitle2();
        Thread.sleep(3000);
        System.out.println(w);
//        sw.switchPlatePage.bbsTitle2Button();
//        Thread.sleep(3000);
//        sw.switchPlatePage.bbsTitle1Button();
    }

}

