package appiumpro.bbsPage;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SwitchPlatePage {
    private AndroidDriver driver;

    public SwitchPlatePage(AndroidDriver driver){
        this.driver = driver;
    }

    public String bbsTitle(){
        String title = this.driver.findElement(By.xpath("//android.widget.LinearLayout/android.support.v7.a.a\" +\n" +
                "\".c[1]/android.widget.TextView")).getText();
        return title;

    }
    public void photographyButton(){
        this.driver.findElement(By.xpath("//android.widget.LinearLayout/android.widget.FrameLayout[2]/" +
                "android.widget.ImageView")).click();
    }

    public String photographyTitle(){
        return null;
    }
    public void TryPlayButton(){}

    public String TryPlayTitle(){
        return null;
    }
    public void UserButton(){}

    public String Username(){
        return null;
    }

}
