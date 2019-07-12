package com.stackroute.junit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringCount {
    public Map checkFrequency(String input)
    {
        List<String> listitems= Arrays.asList(input.split(" ")); //splitting the string
        Map<String,Integer> map=new HashMap<>();
        if(listitems==null)
        {
            map=null;
        }
        for(String each:listitems)
        {
            if(map.containsKey(each)) {

                map.replace(each, map.get(each)+1);
            }
            else
            {
                map.put(each,1);
            }
        }
        return map;

    }
}
