package junit.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CountTest.class,
        RuleTestDemo.class,
        JunitTestCase.class,
        TestRunSequence.class,
})
public class runAllTest {

}
