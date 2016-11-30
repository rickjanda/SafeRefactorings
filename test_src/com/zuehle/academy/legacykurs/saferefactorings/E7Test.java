package com.zuehle.academy.legacykurs.saferefactorings;

import org.junit.Test;

import static org.junit.Assert.*;

public class E7Test {

    @Test
    public void doSomething() {
        final E7 e7 = new E7();

        assertEquals(15, e7.doSomething(3, 5, 7));
        assertEquals(15, e7.doSomething(3, 5, 7));
    }

}
