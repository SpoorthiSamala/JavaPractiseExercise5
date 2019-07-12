package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class FindWordOccurenceTest {
    FindWordOccurence findwordoccurence;
    @Before
    public void setup()
    {
        findwordoccurence=new FindWordOccurence(); //creating an object for class FindWordOccurence
    }
    @Test
    public void givenAStringArrayReturnsTheOccurenceOfAWord(){
        String  arr[] = {"a","b","c","d","a","c","c"};
        Map result=findwordoccurence.findTheWordFrequency(arr);

        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,result);
    }
    @Test
    public void givenAStringArrayReturnsFrequencyOfWords(){
        String  arr[] = {"a","b","c","d","a","c","c","a","d","b"};
        Map result=findwordoccurence.findTheWordFrequency(arr);
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",true);
        map.put("d",true);
        assertEquals(map,result);

    }
    @Test
    public void givenAStringArrayReturnsPassedUsingAssertNotEquals() {
        String arr[] = {"a", "b", "c", "d", "a", "c", "c"};
        Map result = findwordoccurence.findTheWordFrequency(arr);
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",true);
        map.put("c",true);
        map.put("d",true);
        assertNotEquals(map, result);
    }
    @After
    public void tearDown()
    {
        findwordoccurence=null;
    }

}