package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import units.Carrier;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    List<StarSystem> starSystemInGalaxy = new ArrayList<>();

    public void randomGalaxy() {
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

        starSystemInGalaxy.add(new StarSystem("South West", 7, 3, 0,
                2, 1, 6, 0, 0, 4, "",
                7, "", 7, "", 7));


    }

    public void Galaxy() {
        randomGalaxy();
    }


    @Override
    public String toString() {
        return "Galaxy{" + starSystemInGalaxy;
    }
}
