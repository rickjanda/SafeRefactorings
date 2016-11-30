package com.zuehle.academy.legacykurs.saferefactorings;

import org.junit.Test;

import static org.junit.Assert.*;

public class E6Test {

    @Test
    public void doSomething() {
        E6 e6 = new E6();
        assertEquals(38, e6.doSomething(3, 5, 7));
    }

    @Test
    public void doSomething2() {
        E6 e6_1 = new E6();
        E6 e6_2 = new E6();
        assertEquals(38, e6_1.doSomething(3, 5, 7));
        assertEquals(22, e6_2.doSomething(7, 5, 3));
    }

}
