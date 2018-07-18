package junit.demo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

    public class RuleTestDemo {
        //使用timeout这个rule
        @Rule
        public Timeout timeout = new Timeout(2000);

        //使用自定义的rule
        @Rule
        public MethodNameRule methodNameRule = new MethodNameRule();

    @Test
    public void testMethod1() throws InterruptedException {
        Thread.sleep(1001);
    }

    @Test
    public void testMethod2() throws InterruptedException {
        Thread.sleep(999);
    }

}
