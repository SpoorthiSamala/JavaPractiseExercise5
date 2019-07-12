package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class PassValueToNextKeyTest {
    PassValueToNextKey passValueToNextKey;
    @Before
    public void setUp()
    {
        passValueToNextKey=new PassValueToNextKey(); //creating an object
    }
    @Test
    public void givenHashMapMustReturnsValue1AsEmptyAndValue2AsValue1(){
        HashMap<String, String> hashMap= new HashMap<>();
        hashMap.put("val1","hello");
        hashMap.put("val2","hii");
        HashMap<String, String> output = new HashMap<>();
        output.put("val1"," ");
        output.put("val2","hello");
        HashMap result=passValueToNextKey.keyValue(hashMap);
        assertEquals(output,result);
    }
    @Test
    public void givenHashmapReturnsEmptyValue1AndValue1AsValu2(){
        HashMap<String, String> hashMap= new HashMap<>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        HashMap<String, String> output = new HashMap<>();
        output.put("val1"," ");
        output.put("val2","java");
        HashMap result=passValueToNextKey.keyValue(hashMap);
        assertEquals(output,result);
    }
    @Test
    public void gvenEmptyHashmapMustReturnNull(){
        HashMap<String, String> hashMap= new HashMap<>();

        HashMap result=passValueToNextKey.keyValue(hashMap);
        assertEquals(null,result);
    }


    @After
    public void tearDown(){
        passValueToNextKey=null;
    }

}