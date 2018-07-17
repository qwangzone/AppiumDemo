package junit.demo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JunitDemo {

    @Test
    public void MyFirstTest() {
        System.out.println("start======");
        assertEquals(2 + 2, 4);
    }
}
