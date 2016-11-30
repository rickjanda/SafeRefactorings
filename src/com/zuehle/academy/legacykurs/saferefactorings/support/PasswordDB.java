package com.zuehle.academy.legacykurs.saferefactorings.support;

import java.util.HashMap;
import java.util.Map;

public class PasswordDB {

    private static final Map<String, String> userPasswordMap = new HashMap<String, String>(){{
        put("knownUser", "password");
        put("anotherUser", "otherpassword");
    }};

    private static int errorCode = 0;

    public static String getPasswordFor(String user) {
        if (userPasswordMap.containsKey(user)) {
            errorCode = 0;
            return userPasswordMap.get(user);
        } else {
            errorCode = -1;
            return null;
        }
    }

    public static int getErrorCode() {
        return errorCode;
    }
}
