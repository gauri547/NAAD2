package com.streamliners.task2;

import java.util.Arrays;
import java.util.HashMap;

public class SubTask2 {
    public static void main(String[] args) {
        System.out.println(getOccurrencesHashMap("1;2;2;2;3;1"));
    }
    private static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        //Write your code here!
        HashMap<Integer, Integer> hm = new HashMap<>();
        int previous = -1;
        String[] stringArray = s.split(";");
        int[] array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(array);
        for (int next : array) {
            if (next != previous) {
                hm.put(next, 1);
            } else {
                hm.replace(next, hm.get(next) + 1);
            }
            previous = next;
        }

        return hm;
    }



}
