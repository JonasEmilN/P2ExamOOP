package game;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import space.Galaxy;
import space.Planet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LegalGalaxy {

    public static void LegalGalaxy() {

        Galaxy test01 = new Galaxy();
        GameSetup.problem7();

        int trueOrFalsh = 0;

        if (Galaxy.getStarSystemInGalaxy().get(0).planetsInSystem.size() == 1) {
            trueOrFalsh++;
        }

        if (Galaxy.getStarSystemInGalaxy().get(0).planetsInSystem.get(0).name.equals("Mecatol Rex")) {
            trueOrFalsh++;
        }

        //Check for Same planet
        Set<Planet> check = new HashSet<>();
       int control = 0;

        for (int i = 0; i < Galaxy.getStarSystemInGalaxy().size() ; i++) {
            for (int j = 0; j < Galaxy.getStarSystemInGalaxy().get(i).planetsInSystem.size() ; j++) {
                check.add(Galaxy.getStarSystemInGalaxy().get(i).planetsInSystem.get(j));
                control++;

            }

        }

        if (control == check.size()) {
            trueOrFalsh++;
        }

        //StarSystem max 3 Planets
        int c = 0;
        for (int i = 0; i < Galaxy.getStarSystemInGalaxy().size() ; i++) {
            if (Galaxy.getStarSystemInGalaxy().get(i).planetsInSystem.size() < 4) {
                c++;
            }
        }

        if (c == Galaxy.getStarSystemInGalaxy().size()) {
            trueOrFalsh++;
        }



        System.out.println(trueOrFalsh);





    }

}
