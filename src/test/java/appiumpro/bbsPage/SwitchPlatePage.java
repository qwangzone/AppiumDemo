package appiumpro.bbsPage;

import io.appium.java_client.TouchAction;
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
    //首页精选标题
    public String bbsTitle1() {
        String title = this.driver.findElement(By.xpath("//android.support.v7.app.a.c[1]/android.widget.TextView")).getText();
        return title;

    }

    //首页热帖标题
    public String bbsTitle2(){
        String title = this.driver.findElement(By.xpath("//android.support.v7.app.a.c[2]/android.widget.TextView")).getText();
        return title;
    }

    //精选按钮
    public void bbsTitle1Button(){
        this.driver.findElement(By.xpath("//android.support.v7.app.a.c[1]")).click();
    }

    //热帖按钮
    public void bbsTitle2Button(){
        WebElement name = this.driver.findElement(By.xpath("//android.support.v7.app.a.c[1]"));
        TouchAction action = new TouchAction(this.driver);
        action.tap().perform().release();
    }
     // 摄影按钮
    public void photographyButton() {
        /*List<WebElement> button = this.driver.findElements(By.id(BUTTONS));
        for(WebElement bt:button){
            System.out.println(bt);
        }
        button.get(0).click();*/
    }

    //摄影标题
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
