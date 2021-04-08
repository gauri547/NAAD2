package com.streamliners.task1;

public class SubTask3 {

    private static boolean isDirectlyProportional(int[] x, int[] y) {
        //Write your code here!
        int count =0,count1=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(y[i]%x[j]==0){
                    count++;
                    break;
                }
            }
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++) {
                if (x[i]%y[j] == 0) {
                    count1++;
                    break;

                }
            }

        }
        if(count==x.length || count1==y.length){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isDirectlyProportional(new int[] {1,2,3,4}, new int[] {20,25,30,35}));
    }

}
