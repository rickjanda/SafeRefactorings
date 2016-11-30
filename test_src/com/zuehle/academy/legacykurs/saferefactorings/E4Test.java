package com.zuehle.academy.legacykurs.saferefactorings;

import org.junit.Test;

import static org.junit.Assert.*;

public class E4Test {
    @Test
    public void doSomething() {
        assertEquals("Sum of 3 and 4 is 7", new E4().doSomething());
        assertEquals(17, new E4().sum());

    }

}
