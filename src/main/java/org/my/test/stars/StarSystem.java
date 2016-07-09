package org.my.test.stars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.Message;
import java.util.ArrayList;
import java.util.List;

public class StarSystem {

    private static final Logger logger = LoggerFactory.getLogger(Message.class);
    List<Star> starsList=new ArrayList<>();
    String starSystemName;

    public Star getStar(String starName) throws NameNotFoundException {
        for (Star stars : starsList) {
            if (stars.starName.equals(starName)) {
                return stars;
            }
        }
        throw new NameNotFoundException(starName);
    }

    public StarSystem(String starSystemName){
        this.starSystemName=starSystemName;
        logger.info("Star system " + starSystemName + " created!");
    }

    public void addStar(String starName){
        Star star=new Star(starName);
        this.starsList.add(star);
        logger.info("Star " + starName + " created!");

    }
}
