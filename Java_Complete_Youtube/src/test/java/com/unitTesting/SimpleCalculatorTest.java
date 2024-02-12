package com.unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {  //ctrl+shift+t to generate Test class
    @Test
    void addTest(){
        assertEquals(4,SimpleCalculator.add(2,2));
    }

}