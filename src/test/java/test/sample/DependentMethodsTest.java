package test.sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
//测试方法依赖
public class DependentMethodsTest {
    @Test
    public void testAdd1(){
        assertEquals(3+1,5);
    }
    @Test(dependsOnMethods = {"testAdd1"})
    public void testAdd2(){
        assertEquals(2+2,4);
    }
}
