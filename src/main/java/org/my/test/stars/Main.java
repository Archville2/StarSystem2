package org.my.test.stars;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.plugin2.message.Message;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Message.class);

    public static void main(String[] args){

        CommandExecution commandExecution=new CommandExecution();

        List<String> commandsList=new ArrayList<>();

        commandsList.add("AddStar Sol");
        commandsList.add("AddPlanet Sol Earth");
        commandsList.add("AddPlanet Sool Mars");
        commandsList.add("AddPlanet Sol Mars");
        commandsList.add("AddPlanet Sol Saturn");
        commandsList.add("AddMoon Sol Earth Moon");
        commandsList.add("AddMon Sol Earth Moon");
        commandsList.add("AddMoon Sol Saturn Encelad");
        commandsList.add("AddMoon Sol Mars Phobos");
        commandsList.add("AddMoon Sol Marss Phobos");
        commandsList.add("AddMoon Sol Mars Deimos");
        commandsList.add("PrintAllObjects");
        commandsList.add("PrintDetailedInfo Sol");
        commandsList.add("CountAllObjects");

        for (String list:commandsList){
            logger.info("Command: "+list);

            commandExecution.execute(list);
        }
    }
}

