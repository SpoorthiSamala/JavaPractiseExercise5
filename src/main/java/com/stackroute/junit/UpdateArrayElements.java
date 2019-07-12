package com.stackroute.junit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpdateArrayElements {

    public static List<String> replacesArrayElements(List<String> list,int[] index,String[] replace)
    //replacing the one element with another element
    {
        for (int i = 0; i < index.length; i++) {
            list.set(index[i], replace[i]);
        }
        return list;
    }
    //clearing the list
        public static List<String> clearsTheArrayList(List<String> list) {

            list.clear();
            return list;
        }
    }

