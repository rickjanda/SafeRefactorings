package com.zuehle.academy.legacykurs.saferefactorings;

public class E6 {

    // 1. make this static.
    // Is this save? What happens with the tests?
    private int count = 0;

    // 2. remove the static from the count field again
    // Make doSomething static
    // Is this safe?
    public int doSomething(int a, int b, int c) {
        count += a;
        count += multiply(b,c);
        return count;
    }

    // 3. Make this static
    // Is this safe
    int multiply(int b, int c) {
        return b*c;
    }
}
