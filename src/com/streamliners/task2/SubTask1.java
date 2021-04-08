package com.streamliners.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubTask1{
    private static List<Integer> getList(String s) {
        //Write your code here!
        List<Integer> list = new ArrayList<>();
        String[] StringList = s.split(";");
        for (String x : StringList) {
            list.add(Integer.parseInt(x));
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(getList("1;2;3;4"));

    }

}
