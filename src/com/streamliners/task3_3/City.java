package com.streamliners.task3_3;

import java.util.ArrayList;
import java.util.List;

public class City {
    String name;
    String state;
    List<TouristPlace> touristPlaces;
    City(String name, String states){
        this.name=name;
        this.state=state;
        touristPlaces = new ArrayList<>();
    }


}
