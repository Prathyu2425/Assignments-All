package com.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Assignment3Test {
    Assignment3 m1;

    @BeforeEach
    void init() { m1 = new Assignment3();
    }

    @Test
    void test() {
        int actual = m1.withdraw(6000);

    }

}