import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClaculatorTest {


    Claculator calc = new Claculator();
    @Test
    void testMultiply() {
        assertEquals(30,calc.multiply(6,5));
    }

    @Test
    void testOverloadedMult(){
        assertEquals(30,calc.multiply(2,5,3));
    }
}