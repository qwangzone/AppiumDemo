import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class JunitDemo {
    @Test
    public void MyFirstTest(){
        assertEquals(2+2,4);
    }
}
