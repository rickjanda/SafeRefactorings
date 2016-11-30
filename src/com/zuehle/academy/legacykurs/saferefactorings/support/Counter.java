package com.zuehle.academy.legacykurs.saferefactorings.support;

public class Counter {

    private static boolean initialized = false;
    private int count;
    private static Counter instance = null;

    public Counter(int startWith) {
        count = startWith;
    }

    public static void initialize(int startWith ) {
        initialized = true;
        instance = new Counter(startWith);
    }

    public static Counter getInstance() {
        if (!initialized) {
            throw new RuntimeException("Counter not initialized");
        }
        return instance;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
