package com.stackroute.junit;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PassValueToNextKey {
    public static HashMap keyValue(HashMap<String, String> hashMap) //replacing values of key
    {
        if (hashMap.isEmpty()) {
            return null;
        } else {
            Iterator<Map.Entry<String, String>> itr = hashMap.entrySet().iterator();
            String str = "";
            if (!hashMap.get("val1").equals(" ")) {
                str = hashMap.get("val1");
                hashMap.put("val1", " ");
            }
            hashMap.put("val2", str);
        }
        return hashMap;
    }
}
