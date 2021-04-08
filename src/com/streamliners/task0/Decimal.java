package com.streamliners.task0;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Decimal {
    public static void main(String[] args) {
        double num = 2.732;
        DecimalFormat df =new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(df.format(num));
    }
}
