package test.sample;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test(groups = {"功能测试"})
    public class TagTest {
        @Test(groups = {"高","正常"})
        public void testCase1(){
        System.out.println("testcase1=============");
    }
    @Test(groups = {"高", "正常"})
    public void testCase2(){
        System.out.println("testcase2=============");
    }
    @Test(groups = {"中", "正常"})
    public void testCase3(){
        System.out.println("testcase3=============");
    }
    @Test(groups = {"低", "异常"})
    public void testCase4(){
        assertEquals(2/0, 1);
    }

}
