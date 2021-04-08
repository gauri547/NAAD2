package com.streamliners.task0;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int n1 , n2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        int gcd =1;
        for(int i=1;i<= n1 && i<=n2;++i) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;


        }
        System.out.println("Gcd of"+n1 +"and"+n2+"is"+gcd);

    }


}
