package extendDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BaiDuTest {
    private BaiduPage baiduPage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
//        this.driver = new ChromeDriver();
//        this.baiduPage = new BaiduPage(this.driver);
//        this.driver.manage().window().maximize();
        Driver my_driver = new Driver();
        this.driver  = my_driver.mydriver();
        this.baiduPage = new BaiduPage(this.driver);

    }

    @Test
    public void testcase1() throws InterruptedException {

        this.baiduPage.search("selenium");
        Thread.sleep(3000);
        assertEquals(2, 2);


    }

    @AfterClass
    public void tearDown() {
        this.driver.quit();
    }
}
