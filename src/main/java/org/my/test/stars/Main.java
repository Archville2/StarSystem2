package org.my.test.stars;

public class Main {

    public static void main(String[] args){

        StarSystem starSystem=new StarSystem("SolSystem");
        Print print=new Print();

        starSystem.addStar("Sol");
        starSystem.getStar("Sol").addPlanet("Earth");
        starSystem.getStar("Sol").addPlanet("Mars");
        starSystem.getStar("Sol").addPlanet("Saturn");
        starSystem.getStar("Sol").getPlanet("Earth").addMoon("Moon");
        starSystem.getStar("Sol").getPlanet("Saturn").addMoon("Encelad");
        starSystem.getStar("Sol").getPlanet("Mars").addMoon("Phobos");
        starSystem.getStar("Sol").getPlanet("Mars").addMoon("Deimos");

        print.printAllObjects(starSystem);
        print.printDetailedInfo(starSystem, "Sol");
        print.countAllObjects(starSystem);
    }
}
