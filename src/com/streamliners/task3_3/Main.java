package com.streamliners.task3_3;

public class Main {
    public static void main(String[] args) {
        TouristPlace jaipur = new TouristPlace("Nhargardh","10:00Am to 6:00Pm",150);
        jaipur.addFamousFor("Historical Places")
              .addFamousFor("Lakes")
              .addFamousFor("mountains");
        jaipur.rate(5);
        jaipur.rate(4);
        jaipur.rate(3);
        System.out.println(jaipur.starRating);
    }
}
