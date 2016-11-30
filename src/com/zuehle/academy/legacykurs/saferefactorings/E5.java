package com.zuehle.academy.legacykurs.saferefactorings;

import java.io.IOException;
import java.util.Date;

public class E5 {

    private Date today = new Date();


    // Create a new constructor with a single Date parameter in order to inject today for testing
    // is this safe?


    public void doSomething() throws IOException {
        System.out.println("Today: " + today);
    }


}
