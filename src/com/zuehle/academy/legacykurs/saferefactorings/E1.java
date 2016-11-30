package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.support.Adder;

public class E1 {

    // extract the duplicated adder.getSum() call in a local variable
    // Is this safe?
    // Check by running the tests

    public static String doSomething() {

        Adder adder = new Adder(1, 2);

        System.out.println("Sum is " + adder.sum());

        Adder adder2 = new Adder(adder.sum(), 3);

        return "Sum2 = " + adder2.sum() + "; Call counter = " + adder.getCallCounter();
    }
}
