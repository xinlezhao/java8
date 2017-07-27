package com.xinle.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Learn4 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Hi", "Hello", "你好");

        List<String> list2 = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        List<String> list3 =  list.stream().flatMap(item -> list2.stream().map(item2 -> item + " " +item2)).collect(Collectors.toList());


        list3.forEach(System.out::println);



    }


}
