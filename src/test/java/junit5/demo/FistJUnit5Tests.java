package junit5.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FistJUnit5Tests {
    @Test
    void FirstTest() {
        System.out.println("start======");
        assertEquals(2 + 2, 4);
    }

}
