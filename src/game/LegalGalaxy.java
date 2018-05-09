//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;


import space.Galaxy;
import space.Planet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LegalGalaxy {

    public static boolean LegalGalaxy() {

        int trueOrFalsh = 0;

        //Numbers of planets in center StarSystem
        if (Galaxy.getStarSystemInGalaxy().get(0).planetsInSystem.size() == 1) {
            trueOrFalsh++;
        }

        //Name of Planet in Center StarSystem
        if (Galaxy.getStarSystemInGalaxy().get(0).planetsInSystem.get(0).name.equals("Mecatol Rex")) {
            trueOrFalsh++;
        }

        //Check for Same planet
        Set<Planet> check = new HashSet<>();
        int control = 0;

        for (int i = 0; i < Galaxy.getStarSystemInGalaxy().size(); i++) {
            for (int j = 0; j < Galaxy.getStarSystemInGalaxy().get(i).planetsInSystem.size(); j++) {
                check.add(Galaxy.getStarSystemInGalaxy().get(i).planetsInSystem.get(j));
                control++;
            }
        }

        if (control == check.size()) {
            trueOrFalsh++;
        }

        //StarSystem max 3 Planets
        control = 0;
        for (int i = 0; i < Galaxy.getStarSystemInGalaxy().size(); i++) {
            if (Galaxy.getStarSystemInGalaxy().get(i).planetsInSystem.size() < 4) {
                control++;
            }
        }

        if (control == Galaxy.getStarSystemInGalaxy().size()) {
            trueOrFalsh++;
        }

        //Are the map setup correct
        control = 0;

        //For loop for all StarSystems
        for (int k = 0; k < Galaxy.getStarSystemInGalaxy().size(); k++) {

            if (Galaxy.getStarSystemInGalaxy().get(k).north == Galaxy.getStarSystemInGalaxy().get(Galaxy.getStarSystemInGalaxy().get(k).north).placement) {
                control++;
            }

            if (Galaxy.getStarSystemInGalaxy().get(k).northEast == Galaxy.getStarSystemInGalaxy().get(Galaxy.getStarSystemInGalaxy().get(k).northEast).placement) {
                control++;
            }

            if (Galaxy.getStarSystemInGalaxy().get(k).southEast == Galaxy.getStarSystemInGalaxy().get(Galaxy.getStarSystemInGalaxy().get(k).southEast).placement) {
                control++;
            }

            if (Galaxy.getStarSystemInGalaxy().get(k).south == Galaxy.getStarSystemInGalaxy().get(Galaxy.getStarSystemInGalaxy().get(k).south).placement) {
                control++;
            }

            if (Galaxy.getStarSystemInGalaxy().get(k).southWest == Galaxy.getStarSystemInGalaxy().get(Galaxy.getStarSystemInGalaxy().get(k).southWest).placement) {
                control++;
            }
            if (Galaxy.getStarSystemInGalaxy().get(k).northWest == Galaxy.getStarSystemInGalaxy().get(Galaxy.getStarSystemInGalaxy().get(k).northWest).placement) {
                control++;
            }
        }

        if (control == Galaxy.getStarSystemInGalaxy().size() * 6) {
            trueOrFalsh++;
        }

        if (trueOrFalsh == 5) {
            return true;
        } else {
            return false;
        }
    }
}
