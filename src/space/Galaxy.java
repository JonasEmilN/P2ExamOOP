package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import units.Carrier;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    public ArrayList starSystem() {

        List<StarSystem> starSystemInGalaxy = new ArrayList<>();
        starSystemInGalaxy.add( new StarSystem(1,6,2,3,
                4,5,6,7));


        return (ArrayList) starSystemInGalaxy;
    }

    public Galaxy() {

        StarSystem center = new StarSystem(1,6,2,3,
                4,5,6,7);

        StarSystem north = new StarSystem(2,3,0,0,
                3,1,7,0);

        StarSystem northEast = new StarSystem(3,3,0,0,
                0,4,1,2);

        StarSystem southEast = new StarSystem(4,3,3,0,
                0,0,5,1);

        StarSystem south = new StarSystem(5,3,1,4,
                0,0,0,6);

        StarSystem southWest = new StarSystem(6,3,7,1,
                5,0,0,0);

        StarSystem northWest = new StarSystem(7,3,0,2,
                1,6,0,0);
    }

    public static void main(String[] args){

        System.out.println("før test");


        System.out.println();
        System.out.println("done");



    }
}
