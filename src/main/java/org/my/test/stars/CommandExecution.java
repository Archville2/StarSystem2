package org.my.test.stars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.Message;

public class CommandExecution {

    private static final Logger logger = LoggerFactory.getLogger(Message.class);
    StarSystem starSystem=new StarSystem("SolSystem");
    Print print = new Print();
    String message="";

    public void execute(String command){
        try {
            String[] words = command.trim().split("\\s+");

            if (words[0].equals("AddStar") && words.length==2){
                starSystem.addStar(words[1]);
                return;
            }
            if (words[0].equals("AddPlanet") && words.length==3){
                starSystem.getStar(words[1]).addPlanet(words[2]);
                return;
            }
            if (words[0].equals("AddMoon") && words.length==4){
                starSystem.getStar(words[1]).getPlanet(words[2]).addMoon(words[3]);
                return;
            }
            if (words[0].equals("PrintAllObjects")){
                print.printAllObjects(starSystem);
                return;
            }
            if (words[0].equals("PrintDetailedInfo") && words.length==2){
                print.printDetailedInfo(starSystem, words[1]);
                return;
            }
            if (words[0].equals("CountAllObjects")){
                print.countAllObjects(starSystem);
                return;
            }
            message="Error! Incorrect command!";
            //System.out.println(message);
            logger.info(message);

        } catch (NameNotFoundException e) {
            logger.info("Error! Can't create object. Unknown name: "+e.getMessage());
        }
    }

}
