package extendDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;

public class BasePage {
    private WebDriver driver;
    private static final String BASEURL = "https://www.baidu.com";

    //public String url;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
//    public BasePage(WebDriver driver){
//        this(driver,"https://www.baidu.com");
//}

    public void open(String url) {
        //System.out.println(this.url);
        String url_sa = BASEURL + url;
        driver.get(url_sa);
        System.out.println(url_sa);
    }



    public WebElement By_id(String id) {
        return driver.findElement(By.id(id));
    }
}
