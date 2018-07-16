package test.sample;

import org.testng.annotations.*;

public class FixtureTest {
    //在当前测试类开始时运行
    @BeforeClass
    public static void beforclass(){
        System.out.println("-----------beforclass");
    }
    //在当前测试类结束时运行
    @AfterClass
    public static void afterclass(){
        System.out.println("----------afterclass");
    }
    //在每个测试方法运行之前运行
    @BeforeMethod
    public static void before(){
        System.out.println("--------beformethod");
    }
    //每个测试方法运行结束后运行
    @AfterMethod
    public static void after(){
        System.out.println("------aftermethod");
    }
    @Test
    public void testcase1(){
        System.out.println("test case1");
    }
    @Test
    public void testcase2(){
        System.out.println("test case2");
    }
}
