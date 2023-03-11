package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtil {

    public static List<String> sortList(List<String> list, Compare compare){
        List<String> res = new ArrayList<>();

           for (String s : list){
               res.add(compare.compare(s));
           }
           return res;
    }
}

@FunctionalInterface
interface Compare {
    String compare(String str1);
}