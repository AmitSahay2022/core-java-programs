package com.unitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineGradeTest {
    @Test
    void testGrade(){
        assertEquals('C',DetermineGrade.grade(65));
    }
    @Test
    void testThrow(){
        assertThrows(IllegalArgumentException.class,()->DetermineGrade.grade(120));
    }
}