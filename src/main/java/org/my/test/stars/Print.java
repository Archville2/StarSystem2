package org.my.test.stars;

public class Print {

    public void printAllObjects(StarSystem starSystem){
        System.out.println("\nStar system name: " + starSystem.starSystemName);

        System.out.print("Star(s) name(s): ");
        for (Star stars:starSystem.starsList){
            System.out.print(stars+" ");
        }

        System.out.print("\nPlanet(s) name(s): ");
        for (Star stars:starSystem.starsList){
            for (Planet planets:stars.planetsList){
                System.out.print(planets+" ");
            }
        }

        System.out.print("\nMoon(s) name(s): ");
        for (Star stars:starSystem.starsList) {
            for (Planet planets : stars.planetsList) {
                for (Moon moons : planets.moonsList) {
                    System.out.print(moons + " ");
                }
            }
        }
        System.out.print("\n");
    }

    public void printDetailedInfo(StarSystem starSystem,String starName){
        for (Star stars:starSystem.starsList) {
            if (stars.starName.equals(starName)) {
                for (Planet planets : stars.planetsList) {
                    System.out.print("\nPlanet " + planets + " has ");
                    for (Moon moons : planets.moonsList) {
                        System.out.print(moons + " ");
                    }
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

        System.out.println("\n\nStar system "+starSystem.starSystemName+" has "+totalStars+" star(s), "+totalPlanets+" planet(s) and "+totalMoons+" moon(s).");
    }
}
