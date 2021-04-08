package com.streamliners.task1;

import java.util.Arrays;

public class SubTask2 {

    private static int totalWeight(String s, int[] weights) {
        //Write your code here!
        char ch[] = s.toCharArray();
        int sum = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();
        Arrays.sort(ch);
        int freq[] = new int[5];
        for(int i=0;i<s.length();i++){
            if(ch[i]!='\0'){
                freq[k] = 1;
                for(int j=i+1;j<s.length();j++){
                    if(ch[i]==ch[j]){
                        freq[k]++;
                        ch[j]='\0';
                    }
                }
                k++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(ch[i]!='\0' ){
                sb.append(ch[i]);
            }

        }
        String s2 = sb.toString();
        char ch2[] = s2.toCharArray();
        for(int i=0;i<s2.length();i++) {
            System.out.print("+(" + freq[i] + ch2[i] + "=" + freq[i] * weights[i] + ")");
            sum = sum + freq[i] * weights[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(totalWeight("EEDBCCAB", new int[] {4, 3, 2, 1, 5}));
    }



}
