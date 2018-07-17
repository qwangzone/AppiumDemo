package junit.demo;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CountTest {
    @BeforeClass
    public static void setUp(){
        System.out.println("start test========");
    }
    @Before
    public void teststart(){
        System.out.println("method start");
    }
    @After
    public void testend(){
        System.out.println("method end");
    }
    @Test(timeout = 2000)
    public void testAdd() throws InterruptedException {
        Thread.sleep(1001);
        Count count = new Count();
        int result = count.add(3,3);
        assertEquals(result,6);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivi(){
        Count count = new Count();
        int result = count.division(4,0);
        assertEquals(result,2);
    }
    @Test
    //@Ignore
    public void testwq(){
        assertEquals(2+2,4);
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("end.........");
    }
}
