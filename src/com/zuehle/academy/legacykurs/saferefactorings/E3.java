package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.support.Counter;

public class E3 {

    // make Counter.getIntance() a field with initialization in the constructor
    // in order to create a second constructor where you could inject a mock counter instance
    // Is this safe?
    // Check by running the tests


    public void doSomething() {
        Counter.getInstance().count();
    }

}
