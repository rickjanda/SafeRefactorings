package com.zuehle.academy.legacykurs.saferefactorings.support;

import java.util.ArrayList;
import java.util.List;

public class Adder {

    private final List<Integer> summands = new ArrayList<>();
    private int callCounter = 0;

    public Adder() {
    }

    public Adder(int a, int b) {
        summands.add(a);
        summands.add(b);
    }

    public void addSummand(int summand) {
        summands.add(summand);
    }

    public int sum() {
        callCounter++;
        int sum = 0;
        for (Integer summand : summands) {
            sum+= summand;
        }
        return sum;
    }

    public int getCallCounter() {
        return callCounter;
    }
}
