package org.my.test.stars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.Message;
import java.util.ArrayList;
import java.util.List;

public class Planet {

    private static final Logger logger = LoggerFactory.getLogger(Message.class);
    List<Moon> moonsList=new ArrayList<>();
    String planetName;

    public Planet(String planetName){
        this.planetName=planetName;
    }

    public void addMoon(String moonName){
        Moon moon=new Moon(moonName);
        moonsList.add(moon);
        logger.info("Moon " + moonName + " created!");
    }

    @Override
    public String toString(){

        return planetName;
    }

}