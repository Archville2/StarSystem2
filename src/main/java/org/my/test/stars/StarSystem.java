package org.my.test.stars;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    List<Star> starsList=new ArrayList<>();
    String starSystemName;

    public Star getStar(String starName){
        for (Star stars:starsList) {
            if (stars.starName.equals(starName)) {
                return stars;
            }
        }
        return null;
    }

    public StarSystem(String starSystemName){
        this.starSystemName=starSystemName;
        System.out.println("Star system " + starSystemName + " created!");
    }

    public void addStar(String starName){
        Star star=new Star(starName);
        this.starsList.add(star);
        System.out.println("Star " + starName + " created!");

    }

    @Override
    public String toString(){

        return starSystemName;
    }
}
