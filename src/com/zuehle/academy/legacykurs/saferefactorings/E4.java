package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.support.E4Parent;

public class E4 extends E4Parent {

    // extract "(3+4)" in package scope method "sum"
    // is this safe?
    // what happens, if you extract it in a public method instead?

    public String doSomething() {
        String retval = "Sum of 3 and 4 is " + (3 + 4);
        System.out.println(retval);
        return retval;
    };

}
