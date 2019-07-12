package com.stackroute.junit;

import java.util.HashMap;
import java.util.Map;

public class FindWordOccurence {
    public Map findTheWordFrequency(String[] input) //find the frequency of each word
    {
        Map<String, Integer> map = new HashMap<>();
        if (input == null) {
            map=null;
        }
        for (String each : input) {
            if (map.containsKey(each)) {

                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        Map<String, Boolean> list = new HashMap<>();
        for(String each:input)
        {
            if(map.get(each)>=2) //check whether the frequency is 2 or more than 2
            {
                list.put(each,true);
            }
            else
            {
                list.put(each,false);
            }
        }
        return list;
    }
}
