//Jonas Emil Nielsen
//Jeni16@student.aau.dk
package game;

import players.Player;
import space.Galaxy;
import space.StarSystem;
import units.Carrier;
import units.Cruiser;
import units.Destroyer;
import units.Dreadnought;

public class GameSetup {

    public static void randomGalaxy() {
        Galaxy.getStarSystemInGalaxy().add(new StarSystem("Center", 1, 6, 2, 3,
                4, 5, 6, 7, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North", 2, 3, 0, 0,
                3, 1, 7, 0, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North East", 3, 3, 0, 0,
                0, 4, 1, 2, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South East", 4, 3, 3, 0,
                0, 0, 5, 1, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South", 5, 3, 1, 4,
                0, 0, 0, 6, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South West", 6, 3, 7, 1,
                5, 0, 0, 0, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North West", 7, 3, 0,
                2, 1, 6, 0, 0, 4, "",
                7, "", 7, "", 7));
    }

    public static void problem7() {

        //Players
        Player.addPlayer(new Player(0, "Crassus", "The Emirates of Hacan", "Blue"));
        Player.addPlayer(new Player(1, "Pompey", "the Federation of Sol", "Red"));

        //Galaxy
        Galaxy.getStarSystemInGalaxy().add(new StarSystem("Center", 0, 6, 1, 2,
                3, 4, 5, 6, 1, "Mecatol Rex",
                7, "", 0, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North", 1, 3, 0, 0,
                2, 0, 6, 0, 2, "Vega Minor",
                7, "Vega Major", 7, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North East", 2, 3, 0, 0,
                0, 3, 0, 1, 0, "", 0,
                "", 0, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South East", 3, 3, 2, 0,
                0, 0, 4, 0, 1, "Industrex",
                7, "", 0, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South", 4, 3, 0, 3,
                0, 0, 0, 5, 2, "Rigel I",
                7, "Rigel II", 7, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South West", 5, 3, 6, 0,
                4, 0, 0, 0, 0, "",
                0, "", 0, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North West", 6, 3, 0, 1,
                0, 5, 0, 0, 1, "Mirage",
                0, "", 0, "", 0));

        //Blue player units
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("0", new Dreadnought(0));
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("1", new Dreadnought(0));
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("2", new Destroyer(0));

        //Red player units
        Galaxy.getStarSystemInGalaxy().get(1).addUnit("0", new Cruiser(1));
        Galaxy.getStarSystemInGalaxy().get(1).addUnit("1", new Cruiser(1));
        Galaxy.getStarSystemInGalaxy().get(1).addUnit("2", new Carrier(1, 0));

    }

    public static void problem12() {

        //Players
        Player p1 = new Player(0, "Player1", "The Emirates of Hacan", "Blue");
        Player p2 = new Player(1, "Player2", "the Federation of Sol", "Red");

        //Galaxy
        Galaxy.getStarSystemInGalaxy().add(new StarSystem("Center", 0, 6, 1, 2,
                3, 4, 5, 6, 1, "Mecatol Rex",
                7, "", 0, "", 0));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North", 2, 3, 0, 0,
                3, 1, 7, 0, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North East", 3, 3, 0, 0,
                0, 4, 1, 2, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South East", 4, 3, 3, 0,
                0, 0, 5, 1, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South", 5, 3, 1, 4,
                0, 0, 0, 6, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("South West", 6, 3, 7, 1,
                5, 0, 0, 0, 4, "", 7, "", 7, "", 7));

        Galaxy.getStarSystemInGalaxy().add(new StarSystem("North West", 7, 3, 0,
                2, 1, 6, 0, 0, 4, "",
                7, "", 7, "", 7));

        //Blue player units
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("0", new Dreadnought(0));
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("1", new Dreadnought(0));
        Galaxy.getStarSystemInGalaxy().get(0).addUnit("2", new Destroyer(0));

        //Red player units
        Galaxy.getStarSystemInGalaxy().get(1).addUnit("0", new Cruiser(1));
        Galaxy.getStarSystemInGalaxy().get(1).addUnit("1", new Cruiser(1));
        Galaxy.getStarSystemInGalaxy().get(1).addUnit("2", new Carrier(1, 0));

    }

}
