package extendDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private WebDriver driver;
    public WebDriver mydriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }
}
