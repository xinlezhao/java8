package com.xinle.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8Learn5 {

    public static void main(String[] args) {

        Student student1 = new Student("zhangsan", 100, 20);
        Student student2 = new Student("lisi", 90, 30);
        Student student3 = new Student("wangwu", 80, 40);
        Student student4 = new Student("zhangsan", 80, 40);

        Student student5 = new Student("zhangsan",100,20);


        List<Student> studentList = Arrays.asList(student1, student2, student3, student4,student5);

        Map<String, List<Student>> map = studentList.stream().collect(Collectors.groupingBy(Student::getName));

        Map<Integer, List<Student>> map1 =  studentList.stream().collect(Collectors.groupingBy(Student::getScore));

        Map<String,Long> map2 = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.counting()));

        Map<String, Double> map3 = studentList.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingDouble(Student::getScore)));

        Map<Boolean,List<Student>> map4 = studentList.stream().collect(Collectors.partitioningBy(item -> item.getAge() > 20));

        System.out.println(map4);



    }






}
