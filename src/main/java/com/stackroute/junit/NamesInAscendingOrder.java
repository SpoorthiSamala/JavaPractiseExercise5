package com.stackroute.junit;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class NamesInAscendingOrder {
    public static ArrayList sortInAscendingOrder(List<String> string) //arranging the names in ascending order
    {
        if(string.size()>0) {
            TreeSet<String> treeSets = new TreeSet<>();
            treeSets.addAll(string);
            ArrayList<String> result = new ArrayList<>(treeSets);
            return result;
        }
        else {
            return null;
        }
    }
}
