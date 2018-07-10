package po.test;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalculatorPage {
    private AndroidDriver driver;
    //String driver;

    // 构造方法
    public CalculatorPage(AndroidDriver driver) {
        this.driver = driver;
    }

    //加号
    public void plus() {
        this.driver.findElementByAndroidUIAutomator("text(\"+\")").click();
    }

    //减号
    public void minus() {
        this.driver.findElementByAccessibilityId("minus").click();
    }

    //乘号
    public void times() {
        this.driver.findElementByAndroidUIAutomator("text(\"*\")").click();
    }

    //除号
    public void division() {
        this.driver.findElementByAndroidUIAutomator("text(\"/\")").click();
    }

    //等号
    public void equals() {
        this.driver.findElementByAndroidUIAutomator("text(\"=\")").click();
    }

    //结果
    public String result() {
        return this.driver.findElement(By.id("com.android.calculator2:id/formula")).getText();
    }

    //清空结果
    public void clear() {
        this.driver.findElementByAndroidUIAutomator("text(\"clr\")").click();
    }

    //1
    public void number_1() {
        this.driver.findElementByAndroidUIAutomator("text(\"1\")").click();
    }

    //2
    public void number_2() {
        this.driver.findElementByAndroidUIAutomator("text(\"2\")").click();
    }

    //3
    public void number_3() {
        this.driver.findElementByAndroidUIAutomator("text(\"3\")").click();
    }

    //4
    public void number_4() {
        this.driver.findElementByAndroidUIAutomator("text(\"4\")").click();
    }

    //5
    public void number_5() {
        this.driver.findElementByAndroidUIAutomator("text(\"5\")").click();
    }

    //6
    public void number_6() {
        this.driver.findElementByAndroidUIAutomator("text(\"6\")").click();
    }

    //7
    public void number_7() {
        this.driver.findElementByAndroidUIAutomator("text(\"7\")").click();
    }

    //8
    public void number_8() {
        this.driver.findElementByAndroidUIAutomator("text(\"8\")").click();
    }

    //9
    public void number_9() {
        this.driver.findElementByAndroidUIAutomator("text(\"9\")").click();
    }

    //0
    public void number_0() {
        this.driver.findElementByAndroidUIAutomator("text(\"0\")").click();
    }
}
