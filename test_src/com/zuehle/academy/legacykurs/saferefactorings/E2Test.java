package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.support.PasswordDB;
import org.junit.Test;

import static org.junit.Assert.*;

public class E2Test {

    @Test
    public void doSomething() {

        E2.doSomething();
        assertEquals(0, PasswordDB.getErrorCode());

    }

}
