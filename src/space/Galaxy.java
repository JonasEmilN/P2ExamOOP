package space;
//Jonas Emil Nielsen
//Jeni16@student.aau.dk

import units.Carrier;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {

    List<StarSystem> starSystemInGalaxy = new ArrayList<>();

    public List<StarSystem> randomGalaxy() {

        starSystemInGalaxy.add( new StarSystem("Center",1,6,2,3,
                4,5,6,7));

        starSystemInGalaxy.add( new StarSystem("North",2,3,0,0,
                3,1,7,0));

        starSystemInGalaxy.add( new StarSystem("North East",3,3,0,0,
                0,4,1,2));

        starSystemInGalaxy.add( new StarSystem("South East",4,3,3,0,
                0,0,5,1));

        starSystemInGalaxy.add( new StarSystem("South",5,3,1,4,
                0,0,0,6));

        starSystemInGalaxy.add( new StarSystem("South West",6,3,7,1,
                5,0,0,0));

        starSystemInGalaxy.add( new StarSystem("South West",7,3,0,2,
                1,6,0,0));

        return starSystemInGalaxy;
    }

    public void addUnit() {

    }


    @Override
    public String toString() {
        return "Galaxy{" + starSystemInGalaxy;
    }

    public List<StarSystem> getStarSystemInGalaxy() {
        return starSystemInGalaxy;
    }

    public static void main(String[] args){

        System.out.println("før test");

        StarSystem test1 = new StarSystem("",1,1,1,1,1,1,1,1);

        Carrier test2 = new Carrier(0,0);

        test1.unitsInSystem.add(0,test2);



        System.out.println(test1);
        System.out.println();
        System.out.println(test2);


    }


}
