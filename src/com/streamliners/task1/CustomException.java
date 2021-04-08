package com.streamliners.task1;

import java.util.Scanner;

class InvalidReplacementException extends Exception{
    @Override
    public String toString(){
        return super.toString()+"Invalid Replacement Exception";
    }
}

public class CustomException {
    public static void main(String[] args) {
        String str1;
        String regex = "([0-9] [A-Z]) * $";
        Scanner sc = new Scanner(System.in);
        str1 = sc.next();
        if(str1.matches(regex)){
            System.out.println("Given expression is valid:");
        }
        else{
            try{
                throw new InvalidReplacementException();
            }catch (Exception e){
                System.out.println(e);
                e.printStackTrace();
            }

        }
    }
}
