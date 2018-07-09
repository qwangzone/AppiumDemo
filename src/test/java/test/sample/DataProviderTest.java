package test.sample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class DataProviderTest {
    @Test
    @Parameters({"add1","add2","add3"})
    public void testAdd1(int add1,int add2,int add3){
        assertEquals(add1+add2,add3);
    }
    //定义对象数组
    @DataProvider(name="add")
    public Object[][] Users(){
        return new Object[][]{
                {3,2,5},
                {2,2,4},
                {3,3,6},
        };
    }
    @Test(dataProvider = "add")
    public void testAdd2(int add1,int add2,int add3){
        assertEquals(add1+add2,add3);
    }
}
