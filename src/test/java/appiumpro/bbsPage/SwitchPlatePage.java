package appiumpro.bbsPage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SwitchPlatePage {
    private AndroidDriver driver;
    public static final String BUTTONS = "com.meizu.mzbbs:id/f9";

    public SwitchPlatePage(AndroidDriver driver) {
        this.driver = driver;
    }

    //首页按钮
    public void indexButton(){
        List<WebElement> button = this.driver.findElements(By.id(BUTTONS));
        button.get(0).click();
    }
    public String bbsTitle() {
//            String title = this.driver.findElement(By.xpath("//android.widget.LinearLayout/android.support.v7.a.a\" +\n" +
//                    "\".c[1]/android.widget.TextView")).getText();
        String title = this.driver.findElement(By.xpath("//android.widget.LinearLayout/" +
                "android.support.v7.app.a.c[1]/android.widget.TextView")).getText();
//            String title = this.driver.findElementByAndroidUIAutomator("text(\"精选\")").getText();
        return title;

    }

    // 摄影按钮
    public void photographyButton() {
        List<WebElement> button = this.driver.findElements(By.id(BUTTONS));
        for(WebElement bt:button){
            System.out.println(bt);
        }
        button.get(1).click();
    }

    public String photographyTitle() {
        String title = this.driver.findElement(By.xpath("android.widget.LinearLayout/" +
                "android.support.v7.app.a.c[1]/android.widget.TextView")).getText();
        return title;
    }

    public void TryPlayButton() {
        this.driver.findElement(By.xpath("//android.widget.FrameLayout/android.widget.LinearLayout/" +
                "android.widget.FrameLayout[3]/android.widget.ImageView")).click();
    }

    public String TryPlayTitle() {
        return null;
    }

    public void UserButton() {
    }

    public String Username() {
        return null;
    }

}
