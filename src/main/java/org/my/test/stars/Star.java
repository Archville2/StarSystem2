package org.my.test.stars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.Message;
import java.util.ArrayList;
import java.util.List;

public class Star {

    private static final Logger logger = LoggerFactory.getLogger(Message.class);
    List<Planet> planetsList=new ArrayList<>();
    String starName;

    public Star(String starName){
        this.starName=starName;
    }

    public Planet getPlanet(String planetName) throws NameNotFoundException {
        for (Planet planets: planetsList) {
            if (planets.planetName.equals(planetName)) {
                return planets;
            }
        }
        throw new NameNotFoundException(planetName);
    }

    public void addPlanet(String planetName){
        Planet planet=new Planet(planetName);
        planetsList.add(planet);
        logger.info("Planet " + planetName + " created!");
    }

    @Override
    public String toString(){

        return starName;
    }
}