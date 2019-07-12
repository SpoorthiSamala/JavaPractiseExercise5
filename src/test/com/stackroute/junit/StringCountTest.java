package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCountTest {
    StringCount stringcount;
    @Before
    public void setup()
    {
        stringcount=new StringCount(); //creating object for class StringCount
    }
    @Test
    public void checkTheFrequencyOfWordInTheGivenInput()

    {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        Map result=stringcount.checkFrequency("one one one one two three two three one");
        assertEquals(map,result);
    }
    @Test
    public void checkFrequencyOfEachWordInTheGivenString()
    {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",3);
        map.put("two",2);
        Map result=stringcount.checkFrequency("one one one two two three");
        assertNotEquals(map,result);
    }
    @Test
    public void givenAMapWithNullItemsReturnsNull()
    {
        Map<String,Integer> map=new HashMap<>();
        Map result=stringcount.checkFrequency(" ");
        assertEquals(map,result);
    }
    @After
    public void tearDown(){
        stringcount=null;
    }

}