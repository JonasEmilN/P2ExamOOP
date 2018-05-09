//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;

import players.Player;
import space.Galaxy;
import units.Dreadnought;
import units.Units;

import java.util.*;

public class PlanetControl {

    private static Formatter x;
    private List<Integer> playerID;
    private List<String> planetName;

    public PlanetControl(List<Integer> playerID, List<String> planetName) {
        this.playerID = playerID;
        this.planetName = planetName;
    }

    public static void openFile() {
        try {
            x = new Formatter("Player controlled planets.txt");
        } catch (Exception e) {
            System.out.println("Error Happen");
        }
    }

    public static void closeFile() {
        x.close();
    }

    static List<Integer> player = new ArrayList<>();
    static List<String> planet = new ArrayList<>();
    static PlanetControl test123 = new PlanetControl(player, planet);

    public static void planetControl() {


        List<PlanetControl> planetControls = new ArrayList<>();


        HashMap<Integer, String> test12 = new HashMap<>();

        GameSetup.problem7();

        Galaxy.getStarSystemInGalaxy().get(0).addUnit("5", new Dreadnought(1));
        Random random = new Random();
        List<String> keyList = new ArrayList<>();

        for (int g = 0; g < Galaxy.getStarSystemInGalaxy().size(); g++) {
            int notSame = 0;
            keyList.addAll(Galaxy.getStarSystemInGalaxy().get(1).getUnitsInSystem().keySet());
            String lel;
            if (keyList.size() != 0) {
                lel = keyList.get(random.nextInt(keyList.size()));
            } else {
                lel = "0";
            }


            for (Units u : Galaxy.getStarSystemInGalaxy().get(1).getUnitsInSystem().values()) {
                if (u.getPlayerId() != Galaxy.getStarSystemInGalaxy().get(1).getUnitsInSystem().get(lel).getPlayerId()) {
                    notSame++;
                }
            }

            if (notSame == 0) {
                for (int n = 0; n < Galaxy.getStarSystemInGalaxy().get(g).planetsInSystem.size(); n++) {

                    if (Galaxy.getStarSystemInGalaxy().get(g).getUnitsInSystem().get(lel) != null) {
                        player.add(Galaxy.getStarSystemInGalaxy().get(g).getUnitsInSystem().get(lel).getPlayerId());
                        planet.add(Galaxy.getStarSystemInGalaxy().get(g).planetsInSystem.get(n).name);
                    }
                }
            }
            keyList.clear();
        }
        planetControls.add(test123);
    }

    public static void makeFile() {
        x.format("%s%s\t%s", Player.getPlayers().get(test123.playerID.get(0)).getName(), ",", Player.getPlayers().get(test123.playerID.get(0)).getRace());

        int startFileLoop = test123.playerID.get(0);
        System.out.println(test123.playerID.size());
        for (int i = 0; i < test123.playerID.size(); i++) {

            if (test123.playerID.get(i).compareTo(startFileLoop) == 0) {
                x.format("\n\t%s", test123.planetName.get(i));
            } else {
                startFileLoop = i;
                x.format("\n\n%s%s\t%s", Player.getPlayers().get(test123.playerID.get(startFileLoop)).getName(), ",", Player.getPlayers().get(test123.playerID.get(startFileLoop)).getRace());
                x.format("\n\t%s", test123.planetName.get(i));
            }
        }
    }

    public static void problem11() {
        openFile();
        makeFile();
        closeFile();
    }
}
