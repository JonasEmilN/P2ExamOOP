//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;

import space.Galaxy;
import units.Units;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class PlanetControl {

//A planet is said to be under the control of a player if he or she has
//a ship in the system that contains the planet, and moreover no other player has a ship in
//the same system

    List<Integer> playerID;
    List<String> planetName;

    public PlanetControl(List<Integer> playerID, List<String> planetName) {
        this.playerID = playerID;
        this.planetName = planetName;
    }

    public static void planetControl() {

        List<Integer> player = new ArrayList<>();
        List<String> planet = new ArrayList<>();

        HashMap<Integer, String> test12 = new HashMap<>();

        Galaxy test1 = new Galaxy();
        GameSetup.problem7();

        //Galaxy.getStarSystemInGalaxy().get(0).addUnit("5",new Dreadnought(1));
        Random random = new Random();

        for (int g = 0; g < Galaxy.getStarSystemInGalaxy().size(); g++) {

            int notSame = 0;
            List<String> keyList = new ArrayList<>();
            keyList.addAll(Galaxy.getStarSystemInGalaxy().get(0).getUnitsInSystem().keySet());
            String lel = keyList.get(random.nextInt(keyList.size()));

            for (Units u : Galaxy.getStarSystemInGalaxy().get(g).getUnitsInSystem().values()) {
                if (u.getPlayerId() != Galaxy.getStarSystemInGalaxy().get(g).getUnitsInSystem().get(lel).getPlayerId()) {
                    notSame++;
                }
            }

            if (notSame == 0) {
                for (int j = 0; j < Galaxy.getStarSystemInGalaxy().get(g).planetsInSystem.size(); j++) {
                    player.add(Galaxy.getStarSystemInGalaxy().get(g).getUnitsInSystem().get(lel).getPlayerId());
                    planet.add(Galaxy.getStarSystemInGalaxy().get(g).getUnitsInSystem().get(lel).getPlayerId(), Galaxy.getStarSystemInGalaxy().get(g).planetsInSystem.get(j).name);
                }

            }
            keyList.clear();
        }


        System.out.println(planet);
        System.out.println(player);

        List<PlanetControl> onwed = new ArrayList<>();
        PlanetControl test123 = new PlanetControl(player, planet);

        onwed.add(test123);

        System.out.println("før for loop " + onwed.size());
        for (int j = 0; j < 1; j++) {
            for (int k = 0; k < onwed.get(j).planetName.size(); k++) {
                System.out.println("Player " + onwed.get(j).playerID.get(k) + ", controls " + onwed.get(j).planetName.get(k));
            }
        }
    }
}
