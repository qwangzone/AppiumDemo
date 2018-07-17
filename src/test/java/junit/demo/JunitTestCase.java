package junit.demo;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class JunitTestCase {
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
    @Test
    public void testAdd(){
        Count count = new Count();
        int result = count.add(3,3);
        assertEquals(result,6);
    }
    @Test
    public void testDivi(){
        Count count = new Count();
        int result = count.division(4,2);
        assertEquals(result,2);
    }
    @Test
    public void testwq(){
        assertEquals(2+2,4);
    }
    @AfterClass
    public static void tearDown(){
        System.out.println("end.........");
    }
}
