package com.zuehle.academy.legacykurs.saferefactorings;

import com.zuehle.academy.legacykurs.saferefactorings.support.PasswordDB;

public class E2 {

    // extract PasswordDB.getPasswordFor("KNOWN_USER") in a variable
    // Is this safe?
    // Check by running the tests

    public static void doSomething() {

        System.out.println(PasswordDB.getPasswordFor("unknownUser") + PasswordDB.getPasswordFor("KNOWN_USER"));
    }
}
