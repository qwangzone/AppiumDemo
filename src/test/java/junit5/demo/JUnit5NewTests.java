package junit5.demo;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnit5NewTests {
    @BeforeEach
    @DisplayName("每条用例开始时执行")
    void start() {

    }

    @AfterEach
    @DisplayName("每条用例结束时执行")
    void end() {

    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Disabled("这条用例暂时跑不过，忽略")
    void myFailTest() {
        assertEquals(1, 2);
    }

//    @Test
//    @DisplayName("运行一组断言")
//    void assertAllCase() {
//        assertAll("person",
//                () -> assertEquals(2,1+1),
//                () -> assertTrue(1>0)
//
//        );
//    }

    @Test
    @DisplayName("依赖注入1")
    void testInfo(final TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }

    @Test
    @DisplayName("依赖注入2")
    void testReporter(final TestReporter testReporter) {
        testReporter.publishEntry("name", "Alex");
    }
}
