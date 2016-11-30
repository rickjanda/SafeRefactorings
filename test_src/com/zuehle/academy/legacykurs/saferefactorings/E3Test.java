package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.E3;
import com.zuehle.academy.legacykurs.saferefactorings.support.Counter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E3Test {
    @Test
    public void doSomething() {
        E3 e3 = new E3();
        Counter.initialize(7);
        e3.doSomething();
        assertEquals(8, Counter.getInstance().getCount());
    }

}
