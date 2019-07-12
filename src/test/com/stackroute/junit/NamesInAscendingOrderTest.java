package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class NamesInAscendingOrderTest {
    NamesInAscendingOrder namesInAscendingOrder;
    @Before
    public void setUp(){
        namesInAscendingOrder=new NamesInAscendingOrder(); //creating an object
    }
    @Test
    public void givenArrayListMustReturnSortedListOfStrings(){
        List<String> input= new ArrayList<>() ;
        input.add("hello");
        input.add("apple");
        input.add("how");
        input.add("is");
        input.add("orange");
        List<String> output = new ArrayList<>();
        output.add("apple");
        output.add("hello");
        output.add("how");
        output.add("is");
        output.add("orange");
        ArrayList result=namesInAscendingOrder.sortInAscendingOrder(input);
        assertEquals(output,result);
    }
    @Test
    public void givenAnArrayListReturnsListOfStringsInAscendingOrder(){
        List<String> input= new ArrayList<>() ;
        input.add("Harry");
        input.add("Olive");
        input.add("Alice");
        input.add("Bluto");
        input.add("Eugene");
        List<String> output = new ArrayList<>();
        output.add("Alice");
        output.add("Bluto");
        output.add("Eugene");
        output.add("Harry");
        output.add("Olive");
        ArrayList result=namesInAscendingOrder.sortInAscendingOrder(input);
        assertEquals(output,result);
    }
    @Test
    public void givenEmptyArrayListReturnsNull(){
        List<String> input= new ArrayList<>() ;

        ArrayList result=namesInAscendingOrder.sortInAscendingOrder(input);
        assertEquals(null,result);
    }

    @After
    public void tearDown(){
        namesInAscendingOrder=null;
    }

}