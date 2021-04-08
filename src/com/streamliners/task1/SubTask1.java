package com.streamliners.task1;

public class SubTask1 {
    private static String modify(String s, String replacements) {
        char ch1[] = s.toCharArray();
        char ch2[] = replacements.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for(int j=replacements.length()-1;j>=0;j--){
                if(ch1[i] == ch2[j]){
                    ch1[i] = ch2[j+1];

                    sb.append(ch1[i]);
                }
            }
        }
        String stringAfterReplacements = sb.toString();
        return stringAfterReplacements;
    }
    public static void main(String[] args) {
        System.out.println(modify("12332321" ,"2R3S1T4D"));
    }

}
