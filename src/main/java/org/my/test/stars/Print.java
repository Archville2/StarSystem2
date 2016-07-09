package org.my.test.stars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.Message;

public class Print {

    private static final Logger logger = LoggerFactory.getLogger(Message.class);
    String text="";

    public void printAllObjects(StarSystem starSystem){
        logger.info("Star system name: " + starSystem.starSystemName);

        text=("Star(s) name(s): ");
        for (Star stars:starSystem.starsList){
            text+=(stars + " ");
        }
        logger.info(text);

        text=("Planet(s) name(s): ");
        for (Star stars:starSystem.starsList){
            for (Planet planets:stars.planetsList){
                text+=(planets + " ");
            }
        }
        logger.info(text);

        text=("Moon(s) name(s): ");
        for (Star stars:starSystem.starsList) {
            for (Planet planets : stars.planetsList) {
                for (Moon moons : planets.moonsList) {
                    text+=(moons + " ");
                }
            }
        }
        logger.info(text);

    }

    public void printDetailedInfo(StarSystem starSystem,String starName){
        for (Star stars:starSystem.starsList) {
            if (stars.starName.equals(starName)) {
                for (Planet planets : stars.planetsList) {
                    text=("Planet " + planets + " has ");
                    for (Moon moons : planets.moonsList) {
                        text+=(moons + " ");
                    }
                    logger.info(text);
                }
            }
        }
    }

    public void countAllObjects(StarSystem starSystem){
        int totalMoons=0;
        int totalPlanets=0;
        int totalStars=0;

        for (Star stars:starSystem.starsList) {
            totalStars=starSystem.starsList.size();
            for (Planet planets : stars.planetsList) {
                totalPlanets=stars.planetsList.size();
                totalMoons+=planets.moonsList.size();
            }
        }

        logger.info("Star system "+starSystem.starSystemName+" has "+totalStars+" star(s), "+totalPlanets+" planet(s) and "+totalMoons+" moon(s).");
    }
}
