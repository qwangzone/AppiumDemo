package test.sample;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DependentGroupsTest {
    @Test(groups = {"funtest"})
    public void testAdd1(){
        System.out.println("before method========");
        assertEquals(3+1,4);
    }
    @Test(groups = {"funtest"})
    public void testAdd2(){
        assertEquals(3+2,5);
    }
    @Test(dependsOnGroups = {"funtest"})
    public void testAdd3(){
        assertEquals(5+1,6);
    }

}
