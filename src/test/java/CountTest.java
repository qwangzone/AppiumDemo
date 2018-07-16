import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CountTest {
    @BeforeClass
    public void setUp(){
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
    @Ignore
    public void testAdd(){
        Count count = new Count();
        int result = count.add(3,4);
        assertEquals(result,7);
    }
    @Test
    public void testDivi(){
        Count count = new Count();
        int result = count.division(3,4);
        assertEquals(result,0);
    }
    @AfterClass
    public void tearDown(){
        System.out.println("end.........");
    }
}
