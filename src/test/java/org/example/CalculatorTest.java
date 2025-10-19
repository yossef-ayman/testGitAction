package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAdd() {
        Mathtest mat = new Mathtest();
        int result = mat.add(2, 3);
        Assertions.assertEquals(5, result, "Addition should be correct");
    }
    @Test
    void testSubtract() {
        Mathtest mat = new Mathtest();
        int r = mat.sub(5,1 );
        Assertions.assertEquals(4, r, "Subtraction should be correct");
    }
    @Test

    void testMultiply() {
        Mathtest mat = new Mathtest();
        int r= mat.mul(5,2);
        Assertions.assertEquals(10, r, "Multiplication should be correct");
    }
//    @Test

//    void testDivide() {
//        Mathtest mat = new Mathtest();
//        double r= mat.div(10,2);
//        Assertions.assertEquals(1, r, "Division should be correct");
//
//    }
    @Test
    void testMod() {
        Mathtest mat = new Mathtest();
        int r= mat.mod(5,2);
        Assertions.assertEquals(1, r, "Mod should be correct");

    }
}
