package org.my.test.stars;

import java.util.ArrayList;
import java.util.List;

public class Planet {
    List<Moon> moonsList=new ArrayList<>();
    String planetName;

    public Planet(String planetName){
        this.planetName=planetName;
    }

    public void addMoon(String moonName){
        Moon moon=new Moon(moonName);
        moonsList.add(moon);
        System.out.println("Moon " + moonName + " created!");
    }

    @Override
    public String toString(){

        return planetName;
    }

}