package com.junit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMaxFinderTest {
    MinMaxFinder m1;
    @BeforeEach
    void init() { m1 = new MinMaxFinder(); }
    @Test
    void findMixMax()
    {
        int[] sample={33,7,1,9};
        int[] expected={1,33};
        int[] actual =m1.findMinMax(sample);
        assertArrayEquals(expected,actual);
    }
    @Test
    void findMax(){
        int[] sample = {33,7,1,9};
        int expected = 1;
        int actual=m1.minimum(sample);
        assertEquals(expected,actual);
    }

}
