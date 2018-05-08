package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import players.Player;
import units.Carrier;
import units.Cruiser;
import units.Destroyer;
import units.Dreadnought;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    static List<StarSystem> starSystemInGalaxy = new ArrayList<>();

    private void randomGalaxy() {
        starSystemInGalaxy.add(new StarSystem("Center", 1, 6, 2, 3,
                4, 5, 6, 7, 4, "", 7, "", 7, "", 7));

        starSystemInGalaxy.add(new StarSystem("North", 2, 3, 0, 0,
                3, 1, 7, 0, 4, "", 7, "", 7, "", 7));

        starSystemInGalaxy.add(new StarSystem("North East", 3, 3, 0, 0,
                0, 4, 1, 2, 4, "", 7, "", 7, "", 7));

        starSystemInGalaxy.add(new StarSystem("South East", 4, 3, 3, 0,
                0, 0, 5, 1, 4, "", 7, "", 7, "", 7));

        starSystemInGalaxy.add(new StarSystem("South", 5, 3, 1, 4,
                0, 0, 0, 6, 4, "", 7, "", 7, "", 7));

        starSystemInGalaxy.add(new StarSystem("South West", 6, 3, 7, 1,
                5, 0, 0, 0, 4, "", 7, "", 7, "", 7));

        starSystemInGalaxy.add(new StarSystem("North West", 7, 3, 0,
                2, 1, 6, 0, 0, 4, "",
                7, "", 7, "", 7));


    }

    public static void problem7() {

        //Players
        Player p1 = new Player(0,"Crassus","The Emirates of Hacan","Blue");
        Player p2 = new Player(1,"Pompey","the Federation of Sol","Red");

        //Galaxy
        starSystemInGalaxy.add(new StarSystem("Center", 1, 6, 2, 3,
                4, 5, 6, 7, 1, "Mecatol Rex",
                7, "", 0, "", 0));

        starSystemInGalaxy.add(new StarSystem("North", 2, 3, 0, 0,
                3, 1, 7, 0, 2, "Vega Minor",
                7, "Vega Major", 7, "", 0));

        starSystemInGalaxy.add(new StarSystem("North East", 3, 3, 0, 0,
                0, 4, 1, 2, 0, "", 0,
                "", 0, "", 0));

        starSystemInGalaxy.add(new StarSystem("South East", 4, 3, 3, 0,
                0, 0, 5, 1, 1, "Industrex",
                7, "", 0, "", 0));

        starSystemInGalaxy.add(new StarSystem("South", 5, 3, 1, 4,
                0, 0, 0, 6, 2, "Rigel I",
                7, "Rigel II", 7, "", 0));

        starSystemInGalaxy.add(new StarSystem("South West", 6, 3, 7, 1,
                5, 0, 0, 0, 0, "",
                0, "", 0, "", 0));

        starSystemInGalaxy.add(new StarSystem("North West", 7, 3, 0, 2,
                1, 6, 0, 0, 1, "Mirage",
                0, "", 0, "", 0));

        //Blue player units
        starSystemInGalaxy.get(0).addUnit("0",new Dreadnought(0));
        starSystemInGalaxy.get(0).addUnit("1",new Dreadnought(0));
        starSystemInGalaxy.get(0).addUnit("2",new Destroyer(0));

        //Red player units
        starSystemInGalaxy.get(1).addUnit("0",new Cruiser(0));
        starSystemInGalaxy.get(1).addUnit("1",new Cruiser(0));
        starSystemInGalaxy.get(1).addUnit("2",new Carrier(0,0));

    }

    public void Galaxy() {
        randomGalaxy();
    }


    @Override
    public String toString() {
        return "Galaxy{" + starSystemInGalaxy;
    }

    public static void main(String[] args){

        System.out.println("før test");

        Galaxy test1 = new Galaxy();

        test1.problem7();

        System.out.println(test1);
        System.out.println();
    }
}
