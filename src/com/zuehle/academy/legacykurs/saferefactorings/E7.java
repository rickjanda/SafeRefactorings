package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.support.Adder;

public class E7 {

    public E7() {
    }

    // Make adder a field and add a test constructor in order to inject a adder mock for testing
    // Is this safe?
    // What do the tests say? And why?
    public int doSomething(int a, int b, int c) {
        Adder adder = new Adder();
        adder.addSummand(a);
        adder.addSummand(b);
        adder.addSummand(c);
        return adder.sum();
    }
}
