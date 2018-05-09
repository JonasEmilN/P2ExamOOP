//Jonas Emil Nielsen
//Jeni16@student.aau.dk
import game.Battle;
import game.GameSetup;
import game.PlanetControl;
import space.Galaxy;


public class Main {

    public static void main(String[] args){

        GameSetup.problem7();
        Battle.battle(Galaxy.getStarSystemInGalaxy().get(0));


    }



}




