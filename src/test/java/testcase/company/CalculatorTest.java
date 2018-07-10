package testcase.company;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import po.test.CalculatorPage;

import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {
    private AndroidDriver driver;
    private CalculatorPage calculatorPage;

    @BeforeClass
    public void startApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","6.0");
        capabilities.setCapability("appPackage","com.android.calculator2");
        capabilities.setCapability("appActivity",".Calculator");
        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.calculatorPage = new CalculatorPage(this.driver);

    }
    //关闭app
    @AfterClass
    public void closeapp(){
        this.driver.quit();
    }

    //清空结果
    @AfterMethod
    public void clearResult(){
        this.calculatorPage.clear();
    }

    @Test
    public void addCase1() throws InterruptedException {
        this.calculatorPage.number_1();
        this.calculatorPage.plus();
        this.calculatorPage.number_1();
        this.calculatorPage.equals();
        Thread.sleep(1000);
        String result = this.calculatorPage.result();
        assertEquals(result,"2");
    }

    @Test
    public void addCase2() throws InterruptedException {
        this.calculatorPage.number_2();
        this.calculatorPage.plus();
        this.calculatorPage.number_2();
        this.calculatorPage.equals();
        Thread.sleep(1000);
        String result = this.calculatorPage.result();
        assertEquals(result,"4");
    }

    @Test
    public void subCase1() throws InterruptedException {
        this.calculatorPage.number_5();
        this.calculatorPage.minus();
        this.calculatorPage.number_2();
        this.calculatorPage.equals();
        Thread.sleep(1000);
        String result = this.calculatorPage.result();
        assertEquals(result,"3");
    }
}
