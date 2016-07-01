package org.my.test.stars;

import java.util.ArrayList;
import java.util.List;

public class Star {
    List<Planet> planetsList=new ArrayList<>();
    String starName;

    public Star(String starName){
        this.starName=starName;
    }

    public Planet getPlanet(String planetName){
        for (Planet planets: planetsList) {
            if (planets.planetName.equals(planetName)) {
                return planets;
            }
        }
        return null;
    }

    public void addPlanet(String planetName){
        Planet planet=new Planet(planetName);
        planetsList.add(planet);
        System.out.println("Planet " + planetName + " created!");
    }

    @Override
    public String toString(){

        return starName;
    }
}