package extendDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaiduPage extends BasePage {
    private String url = "";

    public BaiduPage(WebDriver driver) {
        super(driver);
    }

    //输入框
    public WebElement input() {
        return this.By_id("kw");
    }

    //点击按钮
    public WebElement click_button() {
        return this.By_id("su");
    }

    //搜索方法
    public void search(String input) throws InterruptedException {
        System.out.println(this.url);
        this.open(url);
        System.out.println(this.url);
        this.input().sendKeys(input);
        this.click_button().click();
    }
}
