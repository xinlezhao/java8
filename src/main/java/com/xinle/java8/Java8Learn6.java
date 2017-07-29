package com.xinle.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Learn6 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("hello", "world", "welcome", "nihao", "hello world");


//        Collections.sort(list, (item1, item2) -> item1.length() - item2.length());
//        Collections.sort(list, (item1, item2) -> item2.length() - item1.length());


//        Collections.sort(list, Comparator.comparingInt(String::length).reversed());

//        Collections.sort(list,Comparator.comparingInt(String::length).reversed());

//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));


//        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing((item1, item2) -> item1.toLowerCase() .compareTo(item2.toLowerCase())));

        Collections.sort(list, Comparator.comparingInt(String::length).thenComparing(Comparator.comparing(String::toLowerCase)));



        System.out.println(list);




    }


}
